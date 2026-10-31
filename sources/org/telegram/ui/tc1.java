package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public class tc1 extends org.telegram.ui.ActionBar.k2 {
    public kg.f0 D;
    public org.telegram.ui.ActionBar.g0 E;
    public boolean F;
    public int G;
    public boolean H;
    public AnimatorSet I;
    public final ArrayList J;
    public AnimatorSet K;
    public RadialProgressView L;
    public boolean M;
    public boolean N;
    public final int O;
    public String P;
    public String Q;
    public String R;
    public boolean S;
    public boolean T;
    public TL_account.Password U;
    public byte[] V;
    public long W;
    public byte[] X;
    public boolean Y;
    public boolean Z;
    public org.telegram.ui.Components.ei0 f41794a;
    public String f41795a0;
    public TextView f41796b;
    public li.k f41797b0;
    public TextView f41798c;
    public org.telegram.ui.Components.f10 f41799c0;
    public nh.p d;
    public org.telegram.ui.Components.v21 f41800d0;
    public TextView e;
    public org.telegram.ui.Components.lr f41801e0;
    public TextView f41802f;
    public org.telegram.ui.Components.bi0[] f41803f0;
    public kc1 f41804g0;
    public TextView h;
    public final Runnable f41805h0;
    public final Runnable f41806i0;
    public qa0 f41807j0;
    public EditTextBoldCursor f41808n;
    public EditTextBoldCursor f41809r;
    public org.telegram.ui.Components.ec0 f41810s;
    public org.telegram.ui.Components.ec0 f41811w;
    public uc0 f41812x;
    public sc1 f41813y;

    public tc1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f41805h0 = new kc1(this, 0);
        this.f41806i0 = new kc1(this, 1);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new mc1(this, 0), 10);
            }
        }
    }

    public static void Y(tc1 tc1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = tc1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = org.telegram.messenger.aw.d(tc1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] h12 = org.telegram.messenger.i0.h1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = tc1Var.U.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = h12;
                bArr = org.telegram.messenger.aw.c(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = h12;
                bArr = null;
            }
        } else {
            bArr = null;
            bArr2 = null;
        }
        ag.m1 m1Var = new ag.m1(tc1Var, z10, bArr, str, passwordinputsettings);
        if (!z10) {
            if (str != null && (bArr3 = tc1Var.X) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tc1Var.U.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(m10, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(m10, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(tc1Var.X, 0, bArr6, 0, 32);
                    Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = tc1Var.W;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = tc1Var.U.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] b10 = org.telegram.messenger.aw.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = b10;
                    if (b10 == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        m1Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(tLObject, m1Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            m1Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(tLObject, m1Var, 10);
    }

    public static void Z(tc1 tc1Var) {
        ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ag.c3(4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131746137, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.T = L0;
        x1Var.R = org.telegram.messenger.cd.L0(2131743956, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        tc1Var.showDialog(x1Var);
    }

    public static void a0(tc1 tc1Var, byte[] bArr) {
        ArrayList arrayList = tc1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.k2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = tc1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = tc1Var.U;
        if (bArr == null) {
            bArr = tc1Var.V;
        }
        twoStepVerificationActivity.z0(password2, bArr, tc1Var.W, tc1Var.X);
        twoStepVerificationActivity.X = tc1Var.G;
        tc1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19670q0, tc1Var.U);
        qa0 qa0Var = tc1Var.f41807j0;
        if (qa0Var != null) {
            org.telegram.messenger.i0.g3(qa0Var);
            tc1Var.f41807j0 = null;
        }
    }

    public static void b0(tc1 tc1Var) {
        ArrayList arrayList = tc1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.k2) arrayList.get(i10)).removeSelfFromStack();
        }
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(tc1Var.currentAccount);
        byte[] bArr = tc1Var.V;
        TL_account.Password password = tc1Var.U;
        f7.k(org.telegram.messenger.zs.f19665p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, tc1Var.R, tc1Var.Q, null, tc1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = tc1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.z0(password2, tc1Var.V, tc1Var.W, tc1Var.X);
        twoStepVerificationActivity.X = tc1Var.G;
        tc1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19670q0, tc1Var.U);
        qa0 qa0Var = tc1Var.f41807j0;
        if (qa0Var != null) {
            org.telegram.messenger.i0.g3(qa0Var);
            tc1Var.f41807j0 = null;
        }
    }

    public static void c0(tc1 tc1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = tc1Var.U.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.aw.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        ul0 ul0Var = new ul0(19, tc1Var, bArr2);
        TL_account.Password password = tc1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.aw.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                ul0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(getpasswordsettings, ul0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        ul0Var.run(null, tL_error2);
    }

    public static void d0(tc1 tc1Var, TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(new TL_account.getPassword(), new mc1(tc1Var, 4), 8);
            return;
        }
        tc1Var.A0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            tc1Var.d.setText(org.telegram.messenger.cd.L0(2131752157, null));
            org.telegram.ui.ActionBar.a7.V(tc1Var.d, org.telegram.ui.ActionBar.t6.f21153p7, null);
            tc1Var.D0(tc1Var.f41810s, tc1Var.f41808n, true);
            tc1Var.L0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
            }
            tc1Var.K0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
        } else {
            tc1Var.K0(org.telegram.messenger.cd.L0(2131689472, null), tL_error.text);
        }
    }

    public static void e0(tc1 tc1Var) {
        ArrayList arrayList = tc1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.k2) arrayList.get(i10)).removeSelfFromStack();
        }
        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19665p0, new Object[0]);
        tc1Var.finishFragment();
    }

    public static void f0(tc1 tc1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            tc1Var.U = password;
            if (!TwoStepVerificationActivity.m0(password, false)) {
                org.telegram.ui.Components.s4.w0(tc1Var.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, null), true);
                return;
            }
            tc1Var.T = !TextUtils.isEmpty(tc1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.q0(tc1Var.U);
            if (!tc1Var.S && tc1Var.Y) {
                TL_account.Password password2 = tc1Var.U;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    if (password2.has_recovery) {
                        str = "1";
                    } else {
                        str = null;
                    }
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!tc1Var.T && passwordKdfAlgo != null) {
                        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19665p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        tc1Var.finishFragment();
                    }
                }
            }
            if (tc1Var.N) {
                tc1Var.A0();
                tc1Var.G0();
            }
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19670q0, tc1Var.U);
        }
    }

    public static void g0(tc1 tc1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            tc1Var.U = password;
            TwoStepVerificationActivity.q0(password);
            tc1Var.I0(z10);
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19670q0, tc1Var.U);
        }
    }

    public static void h0(tc1 tc1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String G;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = tc1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(tc1Var.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.messenger.voip.u0(10, tc1Var, z10), 8);
            return;
        }
        tc1Var.A0();
        int i10 = org.telegram.messenger.zs.f19665p0;
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            tc1Var.getMessagesController().h4(0L, "VALIDATE_PASSWORD");
            int i11 = org.telegram.messenger.zs.f19670q0;
            if (z10) {
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((org.telegram.ui.ActionBar.k2) arrayList.get(i12)).removeSelfFromStack();
                }
                org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19677r0, new Object[0]);
                org.telegram.messenger.zs.f(tc1Var.currentAccount).k(i11, new Object[0]);
                tc1Var.finishFragment();
            } else if (tc1Var.getParentActivity() != null) {
                if (tc1Var.U.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new ep0(21, tc1Var, bArr));
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    if (str == null && (password = tc1Var.U) != null && password.has_password) {
                        x1Var.T = org.telegram.messenger.cd.L0(2131742838, null);
                    } else {
                        x1Var.T = org.telegram.messenger.cd.L0(2131742829, null);
                    }
                    x1Var.R = org.telegram.messenger.cd.L0(2131742823, null);
                    Dialog showDialog = tc1Var.showDialog(x1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((org.telegram.ui.ActionBar.k2) arrayList.get(i13)).removeSelfFromStack();
                }
                TL_account.Password password2 = tc1Var.U;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (tc1Var.Y) {
                    org.telegram.messenger.zs.f(tc1Var.currentAccount).k(i10, new Object[0]);
                }
                tc1 tc1Var2 = new tc1(7, tc1Var.U);
                tc1Var2.H = tc1Var.H;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = tc1Var.V;
                }
                tc1Var2.H0(bArr3, tc1Var.W, tc1Var.X, tc1Var.Z);
                tc1Var2.Y = tc1Var.Y;
                tc1Var2.G = tc1Var.G;
                tc1Var.presentFragment(tc1Var2, true);
                org.telegram.messenger.zs.f(tc1Var.currentAccount).k(i11, tc1Var.U);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    tc1Var.K0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.L0(2131747461, null));
                    return;
                } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    tc1Var.K0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.L0(2131751201, null));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.cd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.cd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    tc1Var.K0(org.telegram.messenger.cd.L0(2131689472, null), org.telegram.messenger.cd.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    tc1Var.K0(org.telegram.messenger.cd.L0(2131689472, null), tL_error.text);
                    return;
                }
            }
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(i10, new Object[0]);
            int size3 = arrayList.size();
            for (int i14 = 0; i14 < size3; i14++) {
                ((org.telegram.ui.ActionBar.k2) arrayList.get(i14)).removeSelfFromStack();
            }
            org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(tc1Var.currentAccount);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = tc1Var.U;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = tc1Var.R;
            f7.k(i10, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, tc1Var.Q, str2, tc1Var.P);
            TL_account.Password password4 = tc1Var.U;
            password4.email_unconfirmed_pattern = tc1Var.R;
            tc1 tc1Var3 = new tc1(5, password4);
            tc1Var3.H = tc1Var.H;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = tc1Var.V;
            }
            tc1Var3.H0(bArr2, tc1Var.W, tc1Var.X, tc1Var.Z);
            tc1Var3.Y = tc1Var.Y;
            tc1Var3.G = tc1Var.G;
            tc1Var.presentFragment(tc1Var3, true);
        }
    }

    public static void i0(tc1 tc1Var, TLRPC.TL_error tL_error) {
        tc1Var.A0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = tc1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.z0(password, tc1Var.V, tc1Var.W, tc1Var.X);
            twoStepVerificationActivity.X = tc1Var.G;
            tc1Var.presentFragment(twoStepVerificationActivity, true);
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19677r0, new Object[0]);
            qa0 qa0Var = tc1Var.f41807j0;
            if (qa0Var != null) {
                org.telegram.messenger.i0.g3(qa0Var);
                tc1Var.f41807j0 = null;
            }
        }
    }

    public static void j0(tc1 tc1Var) {
        ArrayList arrayList = tc1Var.J;
        if (tc1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new lc1(tc1Var, 4));
            boolean z10 = tc1Var.U.has_recovery;
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            if (z10) {
                x1Var.T = org.telegram.messenger.cd.L0(2131742839, null);
            } else {
                x1Var.T = org.telegram.messenger.cd.L0(2131742838, null);
            }
            x1Var.R = org.telegram.messenger.cd.L0(2131742823, null);
            Dialog showDialog = tc1Var.showDialog(x1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.k2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = tc1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        tc1 tc1Var2 = new tc1(7, password);
        tc1Var2.H = tc1Var.H;
        tc1Var2.H0(tc1Var.V, tc1Var.W, tc1Var.X, tc1Var.Z);
        tc1Var2.J.addAll(arrayList);
        tc1Var2.Y = tc1Var.Y;
        tc1Var2.G = tc1Var.G;
        tc1Var.presentFragment(tc1Var2, true);
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(tc1Var.currentAccount);
        byte[] bArr = tc1Var.V;
        TL_account.Password password2 = tc1Var.U;
        f7.k(org.telegram.messenger.zs.f19665p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, tc1Var.R, tc1Var.Q, null, tc1Var.P);
        org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19670q0, tc1Var.U);
    }

    public static void k0(tc1 tc1Var, String str) {
        tc1 tc1Var2 = new tc1(tc1Var.currentAccount, 0, tc1Var.U);
        tc1Var2.H = tc1Var.H;
        tc1Var2.J.addAll(tc1Var.J);
        tc1Var2.J.add(tc1Var);
        tc1Var2.f41795a0 = str;
        tc1Var2.G = tc1Var.G;
        tc1Var.presentFragment(tc1Var2, true);
    }

    public static void l0(tc1 tc1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            tc1Var.U = password;
            TwoStepVerificationActivity.q0(password);
            org.telegram.messenger.zs.f(tc1Var.currentAccount).k(org.telegram.messenger.zs.f19670q0, tc1Var.U);
            tc1Var.G0();
        }
    }

    public static org.telegram.ui.ActionBar.l n0(tc1 tc1Var) {
        return tc1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l o0(tc1 tc1Var) {
        return tc1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l x0(tc1 tc1Var) {
        return tc1Var.actionBar;
    }

    public final void A0() {
        this.f41799c0.f(false, true);
    }

    public final void B0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f41799c0.f(true, true);
        }
    }

    public final void C0() {
        bs[] bsVarArr;
        for (bs bsVar : this.f41812x.f44219f) {
            bsVar.setText("");
            bsVar.z(1.0f);
        }
        this.f41812x.f44219f[0].requestFocus();
        org.telegram.messenger.i0.F3(8.0f, this.f41812x, new kc1(this, 6));
    }

    public final void D0(org.telegram.ui.Components.ec0 ec0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z10) {
            editTextBoldCursor.setText("");
        }
        org.telegram.messenger.i0.F3(5.0f, ec0Var, null);
    }

    public final void E0() {
        TL_account.Password password = this.U;
        if (!password.has_recovery) {
            tc1 tc1Var = new tc1(this.currentAccount, 3, password);
            tc1Var.H = this.H;
            tc1Var.H0(this.V, this.W, this.X, this.Z);
            tc1Var.P = this.P;
            tc1Var.Q = this.Q;
            tc1Var.J.addAll(this.J);
            tc1Var.J.add(this);
            tc1Var.Y = this.Y;
            tc1Var.G = this.G;
            presentFragment(tc1Var);
            return;
        }
        this.R = "";
        I0(false);
    }

    public final void G0() {
        if (getParentActivity() != null) {
            int i10 = 2;
            switch (this.O) {
                case 0:
                case 1:
                    if (this.f41808n.length() == 0) {
                        D0(this.f41810s, this.f41808n, false);
                        return;
                    } else if (!this.f41808n.getText().toString().equals(this.P) && this.O == 1) {
                        org.telegram.messenger.i0.F3(5.0f, this.f41810s, null);
                        try {
                            this.f41810s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.cd.L0(2131747462, null), 0).show();
                            return;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    } else {
                        int i11 = this.currentAccount;
                        if (this.O == 0) {
                            i10 = 1;
                        }
                        tc1 tc1Var = new tc1(i11, i10, this.U);
                        tc1Var.H = this.H;
                        tc1Var.P = this.f41808n.getText().toString();
                        tc1Var.H0(this.V, this.W, this.X, this.Z);
                        tc1Var.f41795a0 = this.f41795a0;
                        tc1Var.J.addAll(this.J);
                        tc1Var.J.add(this);
                        tc1Var.Y = this.Y;
                        tc1Var.G = this.G;
                        presentFragment(tc1Var);
                        return;
                    }
                case 2:
                    String obj = this.f41808n.getText().toString();
                    this.Q = obj;
                    if (obj.equalsIgnoreCase(this.P)) {
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.cd.L0(2131747464, null), 0).show();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        D0(this.f41810s, this.f41808n, false);
                        return;
                    }
                    E0();
                    return;
                case 3:
                    if (!this.Z && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f41808n.getText().toString();
                    this.R = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            I0(false);
                            return;
                        }
                    }
                    D0(this.f41810s, this.f41808n, false);
                    return;
                case 4:
                    String code = this.f41812x.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new ul0(18, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f41812x.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new mc1(this, 2), 10);
                    B0();
                    return;
                case 6:
                    TL_account.Password password = this.U;
                    if (password == null) {
                        B0();
                        this.N = true;
                        return;
                    }
                    tc1 tc1Var2 = new tc1(this.currentAccount, 0, password);
                    tc1Var2.H = this.H;
                    tc1Var2.Y = this.Y;
                    tc1Var2.G = this.G;
                    presentFragment(tc1Var2, true);
                    return;
                case 7:
                    if (this.Y) {
                        finishFragment();
                        return;
                    } else if (this.H) {
                        Bundle g10 = a1.g.g("afterSignup", true);
                        pf0 pf0Var = new pf0();
                        pf0Var.q0(g10);
                        presentFragment(pf0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.z0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        qa0 qa0Var = this.f41807j0;
                        if (qa0Var != null) {
                            org.telegram.messenger.i0.g3(qa0Var);
                            this.f41807j0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.U == null) {
                        B0();
                        this.N = true;
                        return;
                    }
                    String obj3 = this.f41808n.getText().toString();
                    if (obj3.length() == 0) {
                        D0(this.f41810s, this.f41808n, false);
                        return;
                    }
                    byte[] h12 = org.telegram.messenger.i0.h1(obj3);
                    B0();
                    Utilities.e.c(new nc1(this, h12, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void H0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j10;
        this.Z = z10;
    }

    public final void I0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.T && this.U.has_password) {
            B0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new mc1(this, 3));
            return;
        }
        String str = this.P;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            org.telegram.messenger.d20.i(this.currentAccount).u();
            this.X = null;
            if (this.T) {
                passwordinputsettings.flags = 2;
                passwordinputsettings.email = "";
            } else {
                passwordinputsettings.flags = 3;
                passwordinputsettings.hint = "";
                passwordinputsettings.new_password_hash = new byte[0];
                passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
                passwordinputsettings.email = "";
            }
        } else {
            if (this.Q == null && (password = this.U) != null) {
                this.Q = password.hint;
            }
            if (this.Q == null) {
                this.Q = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.Q;
                passwordinputsettings.new_algo = this.U.new_algo;
            }
            if (this.R.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.R.trim();
            }
        }
        if (this.f41795a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f41795a0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.V;
            if (bArr == null || bArr.length == 0 || (z10 && this.T)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        B0();
        Utilities.e.c(new ag.n0(this, updatepasswordsettings3, z10, str, passwordinputsettings, 14));
    }

    public final void J0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tc1.J0(boolean):void");
    }

    public final void K0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = str;
        x1Var.T = str2;
        showDialog(x1Var);
    }

    public final void L0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f41796b.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.f41796b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.I = new AnimatorSet();
        if (z10) {
            this.f41796b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
            TextView textView2 = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f41796b, property, 1.0f), ObjectAnimator.ofFloat(this.f41796b, property2, 1.0f), ObjectAnimator.ofFloat(this.f41796b, property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.I;
            TextView textView5 = this.f41796b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f41796b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f41796b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.e, property4, 1.0f), ObjectAnimator.ofFloat(this.e, property5, 1.0f), ObjectAnimator.ofFloat(this.e, property6, 1.0f));
        }
        this.I.addListener(new org.telegram.ui.Components.ha0(27, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void M0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131742974, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.G(this.G, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743958, null), null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131750595, null), new lc1(this, 0));
        org.telegram.ui.ActionBar.a7.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.t6.f21170q7, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        ?? r12;
        ?? r92;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.m(lVar, 5, i14, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, i14, null);
        org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.f21244u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new rc1(this));
        int i15 = this.O;
        if (i15 == 5) {
            this.actionBar.p().a(0, 2131231245).f(1, org.telegram.messenger.cd.L0(2131754947, null));
        }
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(context, this.resourceProvider, false);
        this.f41799c0 = f10Var;
        this.f41797b0 = new li.k(f10Var);
        this.f41799c0.setOnClickListener(new View.OnClickListener(this) {
            public final tc1 f37891b;

            {
                this.f37891b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16 = r2;
                tc1 tc1Var = this.f37891b;
                switch (i16) {
                    case 0:
                        tc1Var.G0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                        String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                        tc1Var.showDialog(x1Var);
                        return;
                    case 2:
                        tc1.Z(tc1Var);
                        return;
                    case 3:
                        if (tc1Var.h.getAlpha() >= 0.5f) {
                            int i17 = tc1Var.O;
                            if (i17 == 0) {
                                tc1Var.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = tc1Var.f41795a0;
                                tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                x1Var2.T = L02;
                                x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                tc1Var.showDialog(x1Var2);
                                TextView textView = (TextView) x1Var2.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                tc1Var.E0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (tc1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = tc1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = tc1Var.G;
                            tc1Var.presentFragment(twoStepVerificationActivity, true);
                            qa0 qa0Var = tc1Var.f41807j0;
                            if (qa0Var != null) {
                                org.telegram.messenger.i0.g3(qa0Var);
                                tc1Var.f41807j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        tc1Var.G0();
                        return;
                    default:
                        int i18 = tc1Var.O;
                        tc1Var.M = true;
                        if (tc1Var.f41808n.getTransformationMethod() == null) {
                            tc1Var.f41808n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                tc1Var.f41803f0[3].P(-1);
                                org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.f41794a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var = tc1Var.f41803f0[3];
                                if (animatedDrawable != bi0Var) {
                                    tc1Var.f41794a.setAnimation(bi0Var);
                                    tc1Var.f41803f0[3].N(18, false, false);
                                }
                                tc1Var.f41794a.d();
                            }
                        } else {
                            tc1Var.f41808n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                tc1Var.f41803f0[3].P(18);
                                org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.f41794a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f41803f0[3];
                                if (animatedDrawable2 != bi0Var2) {
                                    tc1Var.f41794a.setAnimation(bi0Var2);
                                }
                                tc1Var.f41803f0[3].T(false, 0.0f);
                                tc1Var.f41794a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = tc1Var.f41808n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        tc1Var.M = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.v21 v21Var = new org.telegram.ui.Components.v21(context);
        this.f41800d0 = v21Var;
        v21Var.setTransformType(1);
        this.f41800d0.setProgress(0.0f);
        this.f41800d0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
        this.f41800d0.setDrawBackground(false);
        this.f41799c0.setContentDescription(org.telegram.messenger.cd.L0(2131748267, null));
        this.f41799c0.addView(this.f41800d0, w7.b6.e(56, 56, 17));
        this.f41799c0.a(this.f41800d0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21134o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        li.k.i(this.h);
        this.h.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final tc1 f37891b;

            {
                this.f37891b = this;
            }

            @Override
            public final void onClick(View view) {
                int i16 = r2;
                tc1 tc1Var = this.f37891b;
                switch (i16) {
                    case 0:
                        tc1Var.G0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                        String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                        tc1Var.showDialog(x1Var);
                        return;
                    case 2:
                        tc1.Z(tc1Var);
                        return;
                    case 3:
                        if (tc1Var.h.getAlpha() >= 0.5f) {
                            int i17 = tc1Var.O;
                            if (i17 == 0) {
                                tc1Var.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = tc1Var.f41795a0;
                                tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                x1Var2.T = L02;
                                x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                tc1Var.showDialog(x1Var2);
                                TextView textView2 = (TextView) x1Var2.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                tc1Var.E0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (tc1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = tc1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = tc1Var.G;
                            tc1Var.presentFragment(twoStepVerificationActivity, true);
                            qa0 qa0Var = tc1Var.f41807j0;
                            if (qa0Var != null) {
                                org.telegram.messenger.i0.g3(qa0Var);
                                tc1Var.f41807j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        tc1Var.G0();
                        return;
                    default:
                        int i18 = tc1Var.O;
                        tc1Var.M = true;
                        if (tc1Var.f41808n.getTransformationMethod() == null) {
                            tc1Var.f41808n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                tc1Var.f41803f0[3].P(-1);
                                org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.f41794a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var = tc1Var.f41803f0[3];
                                if (animatedDrawable != bi0Var) {
                                    tc1Var.f41794a.setAnimation(bi0Var);
                                    tc1Var.f41803f0[3].N(18, false, false);
                                }
                                tc1Var.f41794a.d();
                            }
                        } else {
                            tc1Var.f41808n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                tc1Var.f41803f0[3].P(18);
                                org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.f41794a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f41803f0[3];
                                if (animatedDrawable2 != bi0Var2) {
                                    tc1Var.f41794a.setAnimation(bi0Var2);
                                }
                                tc1Var.f41803f0[3].T(false, 0.0f);
                                tc1Var.f41794a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = tc1Var.f41808n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        tc1Var.M = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f41794a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i15 == 2 && org.telegram.messenger.i0.O1()) {
            this.f41794a.setVisibility(8);
        } else if (i15 != 6 && i15 != 9 && i15 != 7) {
            org.telegram.ui.Components.ei0 ei0Var = this.f41794a;
            Point point = org.telegram.messenger.i0.f16026q;
            if (point.x > point.y) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            ei0Var.setVisibility(i10);
        }
        TextView textView2 = new TextView(context);
        this.f41798c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i14, null);
        this.f41798c.setGravity(1);
        this.f41798c.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.f41798c.setTextSize(1, 24.0f);
        nh.p pVar = new nh.p(context);
        this.d = pVar;
        int i16 = org.telegram.ui.ActionBar.t6.D6;
        org.telegram.ui.ActionBar.a7.V(pVar, i16, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i16, null);
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
        this.e.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final tc1 f37891b;

            {
                this.f37891b = this;
            }

            @Override
            public final void onClick(View view) {
                int i162 = r2;
                tc1 tc1Var = this.f37891b;
                switch (i162) {
                    case 0:
                        tc1Var.G0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                        String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                        tc1Var.showDialog(x1Var);
                        return;
                    case 2:
                        tc1.Z(tc1Var);
                        return;
                    case 3:
                        if (tc1Var.h.getAlpha() >= 0.5f) {
                            int i17 = tc1Var.O;
                            if (i17 == 0) {
                                tc1Var.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = tc1Var.f41795a0;
                                tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                x1Var2.T = L02;
                                x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                tc1Var.showDialog(x1Var2);
                                TextView textView22 = (TextView) x1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                tc1Var.E0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (tc1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = tc1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = tc1Var.G;
                            tc1Var.presentFragment(twoStepVerificationActivity, true);
                            qa0 qa0Var = tc1Var.f41807j0;
                            if (qa0Var != null) {
                                org.telegram.messenger.i0.g3(qa0Var);
                                tc1Var.f41807j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        tc1Var.G0();
                        return;
                    default:
                        int i18 = tc1Var.O;
                        tc1Var.M = true;
                        if (tc1Var.f41808n.getTransformationMethod() == null) {
                            tc1Var.f41808n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                tc1Var.f41803f0[3].P(-1);
                                org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.f41794a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var = tc1Var.f41803f0[3];
                                if (animatedDrawable != bi0Var) {
                                    tc1Var.f41794a.setAnimation(bi0Var);
                                    tc1Var.f41803f0[3].N(18, false, false);
                                }
                                tc1Var.f41794a.d();
                            }
                        } else {
                            tc1Var.f41808n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                tc1Var.f41803f0[3].P(18);
                                org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.f41794a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f41803f0[3];
                                if (animatedDrawable2 != bi0Var2) {
                                    tc1Var.f41794a.setAnimation(bi0Var2);
                                }
                                tc1Var.f41803f0[3].T(false, 0.0f);
                                tc1Var.f41794a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = tc1Var.f41808n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        tc1Var.M = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f41796b = textView4;
        textView4.setMinWidth(org.telegram.messenger.i0.L(220.0f));
        this.f41796b.setPadding(org.telegram.messenger.i0.L(34.0f), 0, org.telegram.messenger.i0.L(34.0f), 0);
        this.f41796b.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(this.f41796b, org.telegram.ui.ActionBar.t6.Gi, null);
        this.f41796b.setTextSize(1, 15.0f);
        this.f41796b.setTypeface(org.telegram.messenger.i0.o());
        this.f41796b.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 24.0f));
        this.f41796b.setOnClickListener(new View.OnClickListener(this) {
            public final tc1 f37891b;

            {
                this.f37891b = this;
            }

            @Override
            public final void onClick(View view) {
                int i162 = r2;
                tc1 tc1Var = this.f37891b;
                switch (i162) {
                    case 0:
                        tc1Var.G0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                        String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                        tc1Var.showDialog(x1Var);
                        return;
                    case 2:
                        tc1.Z(tc1Var);
                        return;
                    case 3:
                        if (tc1Var.h.getAlpha() >= 0.5f) {
                            int i17 = tc1Var.O;
                            if (i17 == 0) {
                                tc1Var.B0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = tc1Var.f41795a0;
                                tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                x1Var2.T = L02;
                                x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                tc1Var.showDialog(x1Var2);
                                TextView textView22 = (TextView) x1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                tc1Var.E0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (tc1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = tc1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = tc1Var.G;
                            tc1Var.presentFragment(twoStepVerificationActivity, true);
                            qa0 qa0Var = tc1Var.f41807j0;
                            if (qa0Var != null) {
                                org.telegram.messenger.i0.g3(qa0Var);
                                tc1Var.f41807j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        tc1Var.G0();
                        return;
                    default:
                        int i18 = tc1Var.O;
                        tc1Var.M = true;
                        if (tc1Var.f41808n.getTransformationMethod() == null) {
                            tc1Var.f41808n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                tc1Var.f41803f0[3].P(-1);
                                org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.f41794a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var = tc1Var.f41803f0[3];
                                if (animatedDrawable != bi0Var) {
                                    tc1Var.f41794a.setAnimation(bi0Var);
                                    tc1Var.f41803f0[3].N(18, false, false);
                                }
                                tc1Var.f41794a.d();
                            }
                        } else {
                            tc1Var.f41808n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i18 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                tc1Var.f41803f0[3].P(18);
                                org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.f41794a.getAnimatedDrawable();
                                org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f41803f0[3];
                                if (animatedDrawable2 != bi0Var2) {
                                    tc1Var.f41794a.setAnimation(bi0Var2);
                                }
                                tc1Var.f41803f0[3].T(false, 0.0f);
                                tc1Var.f41794a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = tc1Var.f41808n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        tc1Var.M = false;
                        return;
                }
            }
        });
        if (i15 != 6 && i15 != 7 && i15 != 9) {
            this.f41798c.setTypeface(org.telegram.messenger.i0.o());
            this.f41798c.setTextSize(1, 18.0f);
        } else {
            this.f41798c.setTypeface(Typeface.DEFAULT);
            this.f41798c.setTextSize(1, 24.0f);
        }
        switch (i15) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                uc1 uc1Var = new uc1(this, context);
                oj0 oj0Var = new oj0(this, context, uc1Var, 1);
                oj0Var.addView(uc1Var);
                q9 q9Var = new q9(this, context, oj0Var);
                sc1 sc1Var = new sc1(this, context);
                this.f41813y = sc1Var;
                sc1Var.setVerticalScrollBarEnabled(false);
                uc1Var.addView(this.f41813y, w7.b6.c(-1.0f, -1));
                uc1Var.addView(this.h, w7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                uc1Var.addView(this.f41799c0, org.telegram.ui.Components.f10.b());
                q9Var.addView(oj0Var, w7.b6.c(-1.0f, -1));
                u71 u71Var = new u71(this, context, 17);
                u71Var.setOrientation(1);
                this.f41813y.addView(u71Var, w7.b6.x(-1, -1, 51));
                u71Var.addView(this.f41794a, w7.b6.t(-2, -2, 49, 0, 69, 0, 0));
                u71Var.addView(this.f41798c, w7.b6.t(-2, -2, 49, 0, 8, 0, 0));
                u71Var.addView(this.d, w7.b6.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(context, null);
                this.f41810s = ec0Var;
                ec0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f41808n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = org.telegram.messenger.i0.L(16.0f);
                this.f41808n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.f41808n;
                int i17 = org.telegram.ui.ActionBar.t6.f21076l6;
                org.telegram.ui.ActionBar.a7.w(editTextBoldCursor2, i17, null);
                org.telegram.ui.ActionBar.a7.V(this.f41808n, i14, null);
                this.f41808n.setBackground(null);
                this.f41808n.setMaxLines(1);
                this.f41808n.setLines(1);
                this.f41808n.setGravity(3);
                this.f41808n.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                this.f41808n.setSingleLine(true);
                this.f41808n.setCursorWidth(1.5f);
                this.f41808n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final tc1 f38240b;

                    {
                        this.f38240b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i18, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                tc1 tc1Var = this.f38240b;
                                tc1Var.getClass();
                                if (i18 != 5 && i18 != 6) {
                                    return false;
                                }
                                tc1Var.G0();
                                return true;
                            default:
                                tc1 tc1Var2 = this.f38240b;
                                tc1Var2.getClass();
                                if (i18 != 5 && i18 != 6) {
                                    return false;
                                }
                                if (tc1Var2.f41811w.getVisibility() == 0) {
                                    tc1Var2.f41809r.requestFocus();
                                } else {
                                    tc1Var2.G0();
                                }
                                return true;
                        }
                    }
                });
                this.f41810s.e(this.f41808n);
                this.f41808n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final tc1 f38493b;

                    {
                        this.f38493b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z12) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.ec0 ec0Var2 = this.f38493b.f41811w;
                                if (z12) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                ec0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                tc1 tc1Var = this.f38493b;
                                if (z12) {
                                    tc1Var.f41801e0.setEditText((EditText) view);
                                    tc1Var.f41801e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                tc1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.ec0 ec0Var3 = this.f38493b.f41810s;
                                if (z12) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                ec0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f41808n, w7.b6.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(this, context, 4);
                this.E = g0Var;
                g0Var.setImageResource(2131232223);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(org.telegram.messenger.cd.L0(2131743957, null));
                org.telegram.ui.ActionBar.g0 g0Var2 = this.E;
                int i18 = org.telegram.ui.ActionBar.t6.f21020i6;
                org.telegram.ui.ActionBar.a7.R(g0Var2, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i18, false), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i18), null);
                org.telegram.ui.ActionBar.a7.t(this.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                org.telegram.messenger.i0.Y3(this.E, false, 0.1f, true, false);
                this.E.setOnClickListener(new View.OnClickListener(this) {
                    public final tc1 f37891b;

                    {
                        this.f37891b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i162 = r2;
                        tc1 tc1Var = this.f37891b;
                        switch (i162) {
                            case 0:
                                tc1Var.G0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                                String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                x1Var.R = L0;
                                x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                                tc1Var.showDialog(x1Var);
                                return;
                            case 2:
                                tc1.Z(tc1Var);
                                return;
                            case 3:
                                if (tc1Var.h.getAlpha() >= 0.5f) {
                                    int i172 = tc1Var.O;
                                    if (i172 == 0) {
                                        tc1Var.B0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = tc1Var.f41795a0;
                                        tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                        String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                        x1Var2.T = L02;
                                        x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        tc1Var.showDialog(x1Var2);
                                        TextView textView22 = (TextView) x1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        tc1Var.E0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                if (tc1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = tc1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = tc1Var.G;
                                    tc1Var.presentFragment(twoStepVerificationActivity, true);
                                    qa0 qa0Var = tc1Var.f41807j0;
                                    if (qa0Var != null) {
                                        org.telegram.messenger.i0.g3(qa0Var);
                                        tc1Var.f41807j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                tc1Var.G0();
                                return;
                            default:
                                int i182 = tc1Var.O;
                                tc1Var.M = true;
                                if (tc1Var.f41808n.getTransformationMethod() == null) {
                                    tc1Var.f41808n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                        tc1Var.f41803f0[3].P(-1);
                                        org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.f41794a.getAnimatedDrawable();
                                        org.telegram.ui.Components.bi0 bi0Var = tc1Var.f41803f0[3];
                                        if (animatedDrawable != bi0Var) {
                                            tc1Var.f41794a.setAnimation(bi0Var);
                                            tc1Var.f41803f0[3].N(18, false, false);
                                        }
                                        tc1Var.f41794a.d();
                                    }
                                } else {
                                    tc1Var.f41808n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                        tc1Var.f41803f0[3].P(18);
                                        org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.f41794a.getAnimatedDrawable();
                                        org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f41803f0[3];
                                        if (animatedDrawable2 != bi0Var2) {
                                            tc1Var.f41794a.setAnimation(bi0Var2);
                                        }
                                        tc1Var.f41803f0[3].T(false, 0.0f);
                                        tc1Var.f41794a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = tc1Var.f41808n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                tc1Var.M = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.E, w7.b6.t(24, 24, 16, 0, 0, 16, 0));
                this.f41808n.addTextChangedListener(new qc1(this, 2));
                this.f41810s.addView(linearLayout, w7.b6.c(-2.0f, -1));
                u71Var.addView(this.f41810s, w7.b6.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.f41811w = new org.telegram.ui.Components.ec0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f41809r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = org.telegram.messenger.i0.L(16.0f);
                this.f41809r.setPadding(L2, L2, L2, L2);
                org.telegram.ui.ActionBar.a7.w(this.f41809r, i17, null);
                org.telegram.ui.ActionBar.a7.V(this.f41809r, i14, null);
                this.f41809r.setBackground(null);
                this.f41809r.setMaxLines(1);
                this.f41809r.setLines(1);
                this.f41809r.setGravity(3);
                this.f41809r.setCursorSize(org.telegram.messenger.i0.L(20.0f));
                this.f41809r.setSingleLine(true);
                this.f41809r.setCursorWidth(1.5f);
                this.f41809r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final tc1 f38240b;

                    {
                        this.f38240b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i182, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                tc1 tc1Var = this.f38240b;
                                tc1Var.getClass();
                                if (i182 != 5 && i182 != 6) {
                                    return false;
                                }
                                tc1Var.G0();
                                return true;
                            default:
                                tc1 tc1Var2 = this.f38240b;
                                tc1Var2.getClass();
                                if (i182 != 5 && i182 != 6) {
                                    return false;
                                }
                                if (tc1Var2.f41811w.getVisibility() == 0) {
                                    tc1Var2.f41809r.requestFocus();
                                } else {
                                    tc1Var2.G0();
                                }
                                return true;
                        }
                    }
                });
                this.f41811w.e(this.f41809r);
                this.f41809r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final tc1 f38493b;

                    {
                        this.f38493b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z12) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.ec0 ec0Var2 = this.f38493b.f41811w;
                                if (z12) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                ec0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                tc1 tc1Var = this.f38493b;
                                if (z12) {
                                    tc1Var.f41801e0.setEditText((EditText) view);
                                    tc1Var.f41801e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                tc1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.ec0 ec0Var3 = this.f38493b.f41810s;
                                if (z12) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                ec0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                this.f41811w.addView(this.f41809r, w7.b6.c(-2.0f, -1));
                u71Var.addView(this.f41811w, w7.b6.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.f41811w.setVisibility(8);
                org.telegram.ui.Components.lr lrVar = new org.telegram.ui.Components.lr(context);
                this.f41801e0 = lrVar;
                lrVar.setVisibility(8);
                oj0Var.addView(this.f41801e0);
                uc0 uc0Var = new uc0(this, context, 3);
                this.f41812x = uc0Var;
                final int i19 = 1;
                uc0Var.b(6, 1);
                bs[] bsVarArr = this.f41812x.f44219f;
                int length = bsVarArr.length;
                int i20 = 0;
                while (i20 < length) {
                    bs bsVar = bsVarArr[i20];
                    bsVar.setShowSoftInputOnFocusCompat(z0() ^ i19);
                    bsVar.addTextChangedListener(new qc1(this, 0));
                    bsVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final tc1 f38493b;

                        {
                            this.f38493b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z12) {
                            float f7;
                            float f10;
                            switch (i19) {
                                case 0:
                                    org.telegram.ui.Components.ec0 ec0Var2 = this.f38493b.f41811w;
                                    if (z12) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.0f;
                                    }
                                    ec0Var2.b(f7, f7, true);
                                    return;
                                case 1:
                                    tc1 tc1Var = this.f38493b;
                                    if (z12) {
                                        tc1Var.f41801e0.setEditText((EditText) view);
                                        tc1Var.f41801e0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    tc1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.ec0 ec0Var3 = this.f38493b.f41810s;
                                    if (z12) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    ec0Var3.b(f10, f10, true);
                                    return;
                            }
                        }
                    });
                    i20++;
                    i19 = 1;
                }
                this.f41812x.setVisibility(8);
                u71Var.addView(this.f41812x, w7.b6.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                u71Var.addView(frameLayout, w7.b6.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, w7.b6.e(-2, -2, 49));
                if (i15 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f41802f = textView5;
                    org.telegram.ui.ActionBar.a7.V(textView5, org.telegram.ui.ActionBar.t6.J6, null);
                    this.f41802f.setGravity(1);
                    this.f41802f.setTextSize(1, 14.0f);
                    this.f41802f.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    this.f41802f.setPadding(org.telegram.messenger.i0.L(32.0f), 0, org.telegram.messenger.i0.L(32.0f), 0);
                    this.f41802f.setText(org.telegram.messenger.cd.L0(2131746093, null));
                    u71Var.addView(this.f41802f, w7.b6.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f41802f.setOnClickListener(new View.OnClickListener(this) {
                        public final tc1 f37891b;

                        {
                            this.f37891b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i162 = r2;
                            tc1 tc1Var = this.f37891b;
                            switch (i162) {
                                case 0:
                                    tc1Var.G0();
                                    return;
                                case 1:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                                    String L0 = org.telegram.messenger.cd.L0(2131746110, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                    x1Var.R = L0;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                                    tc1Var.showDialog(x1Var);
                                    return;
                                case 2:
                                    tc1.Z(tc1Var);
                                    return;
                                case 3:
                                    if (tc1Var.h.getAlpha() >= 0.5f) {
                                        int i172 = tc1Var.O;
                                        if (i172 == 0) {
                                            tc1Var.B0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = tc1Var.f41795a0;
                                            tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, 1));
                                            return;
                                        } else if (i172 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                            String L02 = org.telegram.messenger.cd.L0(2131742840, null);
                                            org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                            x1Var2.T = L02;
                                            x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                            tc1Var.showDialog(x1Var2);
                                            TextView textView22 = (TextView) x1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                                return;
                                            }
                                            return;
                                        } else if (i172 == 2) {
                                            tc1Var.E0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    if (tc1Var.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = tc1Var.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = tc1Var.G;
                                        tc1Var.presentFragment(twoStepVerificationActivity, true);
                                        qa0 qa0Var = tc1Var.f41807j0;
                                        if (qa0Var != null) {
                                            org.telegram.messenger.i0.g3(qa0Var);
                                            tc1Var.f41807j0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    tc1Var.G0();
                                    return;
                                default:
                                    int i182 = tc1Var.O;
                                    tc1Var.M = true;
                                    if (tc1Var.f41808n.getTransformationMethod() == null) {
                                        tc1Var.f41808n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                            tc1Var.f41803f0[3].P(-1);
                                            org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.f41794a.getAnimatedDrawable();
                                            org.telegram.ui.Components.bi0 bi0Var = tc1Var.f41803f0[3];
                                            if (animatedDrawable != bi0Var) {
                                                tc1Var.f41794a.setAnimation(bi0Var);
                                                tc1Var.f41803f0[3].N(18, false, false);
                                            }
                                            tc1Var.f41794a.d();
                                        }
                                    } else {
                                        tc1Var.f41808n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                                        if (i182 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                            tc1Var.f41803f0[3].P(18);
                                            org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.f41794a.getAnimatedDrawable();
                                            org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f41803f0[3];
                                            if (animatedDrawable2 != bi0Var2) {
                                                tc1Var.f41794a.setAnimation(bi0Var2);
                                            }
                                            tc1Var.f41803f0[3].T(false, 0.0f);
                                            tc1Var.f41794a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = tc1Var.f41808n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    tc1Var.M = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = q9Var;
                kg.f0 f0Var = new kg.f0(this, context);
                this.D = f0Var;
                f0Var.setAlpha(0.0f);
                q9Var.addView(this.D);
                q9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(org.telegram.messenger.i0.L(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21076l6, false));
                uc1Var.addView(this.L, w7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                jf.g gVar = new jf.g(this, context, 4);
                gVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                gVar.addView(this.actionBar);
                gVar.addView(this.f41794a);
                gVar.addView(this.f41798c);
                gVar.addView(this.d);
                gVar.addView(this.f41796b);
                this.fragmentView = gVar;
                break;
        }
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, this.fragmentView, null);
        String str = "";
        switch (i15) {
            case 0:
            case 1:
                int i21 = 2131746428;
                if (this.U.has_password) {
                    this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747226, null));
                    this.f41798c.setText(org.telegram.messenger.cd.L0(2131747226, null));
                } else {
                    if (i15 == 0) {
                        i11 = 2131751706;
                    } else {
                        i11 = 2131746428;
                    }
                    String L0 = org.telegram.messenger.cd.L0(i11, null);
                    this.actionBar.setTitle(L0);
                    this.f41798c.setText(L0);
                }
                if (!TextUtils.isEmpty(this.f41795a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(org.telegram.messenger.cd.L0(2131742842, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.ec0 ec0Var2 = this.f41810s;
                if (i15 == 0) {
                    i12 = 2131751117;
                } else {
                    i12 = 2131746428;
                }
                ec0Var2.setText(org.telegram.messenger.cd.L0(i12, null));
                EditTextBoldCursor editTextBoldCursor4 = this.f41808n;
                if (i15 == 0) {
                    i21 = 2131751117;
                }
                editTextBoldCursor4.setContentDescription(org.telegram.messenger.cd.L0(i21, null));
                this.f41808n.setImeOptions(268435461);
                this.f41808n.setInputType(129);
                this.f41808n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f41808n.setTypeface(Typeface.DEFAULT);
                if (i15 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = z10;
                org.telegram.messenger.i0.Y3(this.E, false, 0.1f, true, false);
                org.telegram.ui.Components.bi0[] bi0VarArr = new org.telegram.ui.Components.bi0[7];
                this.f41803f0 = bi0VarArr;
                bi0VarArr[0] = new org.telegram.ui.Components.bi0(2131624307, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f41803f0[1] = new org.telegram.ui.Components.bi0(2131624308, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f41803f0[2] = new org.telegram.ui.Components.bi0(2131624300, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f41803f0[3] = new org.telegram.ui.Components.bi0(2131624309, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f41803f0[4] = new org.telegram.ui.Components.bi0(2131624306, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f41803f0[5] = new org.telegram.ui.Components.bi0(2131624305, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                this.f41803f0[6] = new org.telegram.ui.Components.bi0(2131624310, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(120.0f), true, null);
                org.telegram.ui.Components.bi0 bi0Var = this.f41803f0[6];
                bi0Var.h = true;
                bi0Var.P(19);
                this.f41803f0[2].S(97, this.f41806i0);
                J0(true);
                if (i15 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    kc1 kc1Var = this.f41804g0;
                    if (kc1Var != null) {
                        org.telegram.messenger.i0.r(kc1Var);
                    }
                    this.f41794a.setAnimation(this.f41803f0[6]);
                    this.f41794a.d();
                    i13 = 1;
                    break;
                } else {
                    EditTextBoldCursor editTextBoldCursor5 = this.f41808n;
                    ArrayList arrayList = editTextBoldCursor5.f23993f1;
                    int size = arrayList.size();
                    int i22 = 0;
                    while (i22 < size) {
                        Object obj = arrayList.get(i22);
                        i22++;
                        TextWatcher textWatcher = (TextWatcher) obj;
                        textWatcher.beforeTextChanged("", 0, editTextBoldCursor5.length(), editTextBoldCursor5.length());
                        textWatcher.onTextChanged(editTextBoldCursor5.getText(), 0, editTextBoldCursor5.length(), editTextBoldCursor5.length());
                        textWatcher.afterTextChanged(editTextBoldCursor5.getText());
                    }
                    i13 = 1;
                    J0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747460, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(org.telegram.messenger.cd.L0(2131742842, null));
                this.f41798c.setText(org.telegram.messenger.cd.L0(2131747460, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131747459, null));
                this.d.setVisibility(0);
                this.f41810s.setText(org.telegram.messenger.cd.L0(2131747458, null));
                this.f41808n.setContentDescription(org.telegram.messenger.cd.L0(2131747458, null));
                this.f41808n.setImeOptions(268435461);
                this.f41811w.setVisibility(8);
                this.f41794a.f(2131624302, 120, 120, null);
                this.f41794a.d();
                i13 = 1;
                break;
            case 3:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131746359, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.Z) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(org.telegram.messenger.cd.L0(2131742842, null));
                } else {
                    r12 = 0;
                }
                this.f41798c.setText(org.telegram.messenger.cd.L0(2131746359, r12));
                this.d.setText(org.telegram.messenger.cd.L0(2131746360, r12));
                this.d.setVisibility(0);
                this.f41810s.setText(org.telegram.messenger.cd.L0(2131747392, r12));
                this.f41808n.setContentDescription(org.telegram.messenger.cd.L0(2131747392, r12));
                this.f41808n.setImeOptions(268435461);
                this.f41808n.setInputType(33);
                this.f41811w.setVisibility(8);
                this.f41794a.f(2131624301, 120, 120, r12);
                this.f41794a.d();
                i13 = 1;
                break;
            case 4:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747453, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f41798c.setText(org.telegram.messenger.cd.L0(2131747453, null));
                this.f41801e0.setVisibility(0);
                this.f41810s.setVisibility(8);
                String str2 = this.U.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj2 = new Object();
                    obj2.f32850a |= 256;
                    obj2.f32851b = indexOf;
                    int i23 = lastIndexOf + 1;
                    obj2.f32852c = i23;
                    r92 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.zz0(obj2, 0), indexOf, i23, 0);
                } else {
                    r92 = 0;
                }
                nh.p pVar2 = this.d;
                String L02 = org.telegram.messenger.cd.L0(2131746097, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r92] = valueOf;
                pVar2.setText(org.telegram.messenger.i0.m0(L02, charSequenceArr));
                this.d.setVisibility(r92);
                this.f41799c0.e(r92, r92);
                this.f41812x.setVisibility(r92);
                this.f41794a.f(2131624304, 120, 120, null);
                this.f41794a.d();
                i13 = 1;
                break;
            case 5:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131743645, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f41798c.setText(org.telegram.messenger.cd.L0(2131743645, null));
                this.f41810s.setVisibility(8);
                this.f41801e0.setVisibility(0);
                nh.p pVar3 = this.d;
                String str3 = this.U.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                pVar3.setText(org.telegram.messenger.cd.a0("EmailPasswordConfirmText2", null, 2131751200, str));
                this.d.setVisibility(0);
                this.f41799c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(org.telegram.messenger.cd.L0(2131746138, null));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final tc1 f37891b;

                    {
                        this.f37891b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i162 = r2;
                        tc1 tc1Var = this.f37891b;
                        switch (i162) {
                            case 0:
                                tc1Var.G0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tc1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, null), new lc1(tc1Var, 1));
                                String L03 = org.telegram.messenger.cd.L0(2131746110, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                x1Var.R = L03;
                                x1Var.T = org.telegram.messenger.cd.L0(2131746091, null);
                                tc1Var.showDialog(x1Var);
                                return;
                            case 2:
                                tc1.Z(tc1Var);
                                return;
                            case 3:
                                if (tc1Var.h.getAlpha() >= 0.5f) {
                                    int i172 = tc1Var.O;
                                    if (i172 == 0) {
                                        tc1Var.B0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = tc1Var.f41795a0;
                                        tc1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new mc1(tc1Var, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(tc1Var.getParentActivity());
                                        String L022 = org.telegram.messenger.cd.L0(2131742840, null);
                                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                                        x1Var2.T = L022;
                                        x1Var2.R = org.telegram.messenger.cd.L0(2131742841, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131742842, null), new lc1(tc1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        tc1Var.showDialog(x1Var2);
                                        TextView textView22 = (TextView) x1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.a7.V(textView22, org.telegram.ui.ActionBar.t6.f21170q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        tc1Var.E0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                if (tc1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = tc1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = tc1Var.G;
                                    tc1Var.presentFragment(twoStepVerificationActivity, true);
                                    qa0 qa0Var = tc1Var.f41807j0;
                                    if (qa0Var != null) {
                                        org.telegram.messenger.i0.g3(qa0Var);
                                        tc1Var.f41807j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                tc1Var.G0();
                                return;
                            default:
                                int i182 = tc1Var.O;
                                tc1Var.M = true;
                                if (tc1Var.f41808n.getTransformationMethod() == null) {
                                    tc1Var.f41808n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                        tc1Var.f41803f0[3].P(-1);
                                        org.telegram.ui.Components.bi0 animatedDrawable = tc1Var.f41794a.getAnimatedDrawable();
                                        org.telegram.ui.Components.bi0 bi0Var2 = tc1Var.f41803f0[3];
                                        if (animatedDrawable != bi0Var2) {
                                            tc1Var.f41794a.setAnimation(bi0Var2);
                                            tc1Var.f41803f0[3].N(18, false, false);
                                        }
                                        tc1Var.f41794a.d();
                                    }
                                } else {
                                    tc1Var.f41808n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.a7.t(tc1Var.E, org.telegram.ui.ActionBar.t6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i182 == 0 && tc1Var.f41808n.length() > 0 && tc1Var.f41808n.hasFocus()) {
                                        tc1Var.f41803f0[3].P(18);
                                        org.telegram.ui.Components.bi0 animatedDrawable2 = tc1Var.f41794a.getAnimatedDrawable();
                                        org.telegram.ui.Components.bi0 bi0Var22 = tc1Var.f41803f0[3];
                                        if (animatedDrawable2 != bi0Var22) {
                                            tc1Var.f41794a.setAnimation(bi0Var22);
                                        }
                                        tc1Var.f41803f0[3].T(false, 0.0f);
                                        tc1Var.f41794a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = tc1Var.f41808n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                tc1Var.M = false;
                                return;
                        }
                    }
                });
                this.f41812x.setVisibility(0);
                this.f41794a.f(2131624304, 120, 120, null);
                this.f41794a.d();
                i13 = 1;
                break;
            case 6:
                this.f41798c.setText(org.telegram.messenger.cd.L0(2131743956, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131745565, null));
                this.f41796b.setText(org.telegram.messenger.cd.L0(2131743958, null));
                this.d.setVisibility(0);
                this.f41794a.f(2131624303, 140, 140, null);
                this.f41794a.d();
                i13 = 1;
                break;
            case 7:
                this.f41798c.setText(org.telegram.messenger.cd.L0(2131743960, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131743959, null));
                if (this.Y) {
                    this.f41796b.setText(org.telegram.messenger.cd.L0(2131743962, null));
                } else if (this.H) {
                    this.f41796b.setText(org.telegram.messenger.cd.L0(2131751771, null));
                } else {
                    this.f41796b.setText(org.telegram.messenger.cd.L0(2131743961, null));
                }
                this.d.setVisibility(0);
                this.f41794a.f(2131624351, 160, 160, null);
                this.f41794a.d();
                i13 = 1;
                break;
            case 8:
                this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131747232, null));
                this.f41798c.setText(org.telegram.messenger.cd.L0(2131747232, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131752160, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(org.telegram.messenger.cd.L0(2131750592, null));
                org.telegram.ui.ActionBar.a7.V(this.e, org.telegram.ui.ActionBar.t6.f21134o6, null);
                this.f41810s.setText(org.telegram.messenger.cd.L0(2131748737, null));
                this.f41808n.setContentDescription(org.telegram.messenger.cd.L0(2131748737, null));
                this.f41808n.setImeOptions(268435462);
                this.f41808n.setInputType(129);
                this.f41808n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f41808n.setTypeface(Typeface.DEFAULT);
                this.f41794a.f(2131624357, 120, 120, null);
                this.f41794a.d();
                i13 = 1;
                break;
            case 9:
                this.f41798c.setText(org.telegram.messenger.cd.L0(2131752159, null));
                this.d.setText(org.telegram.messenger.cd.L0(2131752158, null));
                this.f41796b.setText(org.telegram.messenger.cd.L0(2131752161, null));
                this.d.setVisibility(0);
                this.f41794a.f(2131624356, 140, 140, null);
                this.f41794a.d();
                i13 = 1;
                break;
            default:
                i13 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor6 = this.f41808n;
        if (editTextBoldCursor6 != null) {
            editTextBoldCursor6.addTextChangedListener(new qc1(this, i13));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.k2 k2Var : getParentLayout().getFragmentStack()) {
            if (k2Var != this && (k2Var instanceof tc1)) {
                ((org.telegram.ui.Components.h61) ((tc1) k2Var).f41797b0.f12100b).f26634b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20872a7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41798c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41808n, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41808n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f41808n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i10 = this.O;
        if (i10 != 7 && i10 != 9) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z10) {
                M0();
                return false;
            }
            return false;
        }
        if (z10) {
            finishFragment();
        }
        return true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        int i11 = 0;
        if (this.f41794a != null) {
            int i12 = this.O;
            if (i12 == 2 && org.telegram.messenger.i0.O1()) {
                this.f41794a.setVisibility(8);
            } else if (i12 != 6 && i12 != 9 && i12 != 7) {
                org.telegram.ui.Components.ei0 ei0Var = this.f41794a;
                Point point = org.telegram.messenger.i0.f16026q;
                if (point.x > point.y) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                ei0Var.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.lr lrVar = this.f41801e0;
        if (lrVar != null) {
            if (!z0()) {
                i11 = 8;
            }
            lrVar.setVisibility(i11);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        kc1 kc1Var = this.f41804g0;
        if (kc1Var != null) {
            org.telegram.messenger.i0.r(kc1Var);
            this.f41804g0 = null;
        }
        if (this.f41803f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.bi0[] bi0VarArr = this.f41803f0;
                if (i10 >= bi0VarArr.length) {
                    break;
                }
                bi0VarArr[i10].C(false);
                i10++;
            }
            this.f41803f0 = null;
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
        if (z0()) {
            org.telegram.messenger.i0.C2(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.S = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.S = false;
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        if (z0()) {
            org.telegram.messenger.i0.a3(getParentActivity(), this.classGuid);
            org.telegram.messenger.i0.v1(this.fragmentView);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.v21 v21Var = this.f41800d0;
            if (v21Var != null) {
                v21Var.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.O9, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21076l6, false);
            RadialProgressView radialProgressView = this.L;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.f41808n != null && !z0()) {
                org.telegram.messenger.i0.h3(new kc1(this, 2), 200L);
            }
            uc0 uc0Var = this.f41812x;
            if (uc0Var != null && uc0Var.getVisibility() == 0) {
                org.telegram.messenger.i0.h3(new kc1(this, 3), 200L);
            }
        }
    }

    public final void y0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            uc0 uc0Var = this.f41812x;
            bs[] bsVarArr = uc0Var.f44219f;
            if (i10 < bsVarArr.length) {
                bs bsVar = bsVarArr[i10];
                bsVar.postDelayed(new nj0(bsVar, 1), i10 * 75);
                i10++;
            } else {
                uc0Var.postDelayed(new t11(19, this, runnable), (bsVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean z0() {
        int i10 = this.O;
        if ((i10 == 5 || i10 == 4) && !org.telegram.messenger.i0.Q1()) {
            Point point = org.telegram.messenger.i0.f16026q;
            if (point.x < point.y && !org.telegram.messenger.i0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle g10 = a1.g.g("afterSignup", true);
            pf0 pf0Var = new pf0();
            pf0Var.q0(g10);
            presentFragment(pf0Var, true);
            return;
        }
        super.finishFragment();
    }

    public tc1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f41805h0 = new kc1(this, 0);
        this.f41806i0 = new kc1(this, 1);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new mc1(this, 0), 10);
            return;
        }
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void F0() {
    }
}
