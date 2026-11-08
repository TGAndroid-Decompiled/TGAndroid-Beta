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
public class za1 extends org.telegram.ui.ActionBar.f2 {
    public fi.p5 D;
    public org.telegram.ui.ActionBar.f0 E;
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
    public org.telegram.ui.Components.ch0 f52496a;
    public String f52497a0;
    public TextView f52498b;
    public h6.m f52499b0;
    public TextView f52500c;
    public org.telegram.ui.Components.q00 f52501c0;
    public xh.l d;
    public org.telegram.ui.Components.t11 f52502d0;
    public TextView f52503e;
    public org.telegram.ui.Components.br f52504e0;
    public TextView f52505f;
    public org.telegram.ui.Components.zg0[] f52506f0;
    public qa1 f52507g0;
    public TextView h;
    public final Runnable f52508h0;
    public final Runnable f52509i0;
    public l90 f52510j0;
    public EditTextBoldCursor f52511n;
    public EditTextBoldCursor f52512r;
    public org.telegram.ui.Components.lb0 f52513s;
    public org.telegram.ui.Components.lb0 f52514w;
    public lb0 f52515x;
    public ya1 f52516y;

    public za1(int i7, int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f52508h0 = new qa1(this, 0);
        this.f52509i0 = new qa1(this, 1);
        this.currentAccount = i7;
        this.O = i10;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i10 == 6 || i10 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new sa1(this, 0), 10);
            }
        }
    }

    public static void Z(za1 za1Var, TLObject tLObject, boolean z9, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = za1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = org.telegram.messenger.pv.d(za1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z9 && str != null) {
            byte[] h12 = org.telegram.messenger.g0.h1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = za1Var.U.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = h12;
                bArr = org.telegram.messenger.pv.c(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = h12;
                bArr = null;
            }
        } else {
            bArr = null;
            bArr2 = null;
        }
        kg.l0 l0Var = new kg.l0(za1Var, z9, bArr, str, passwordinputsettings);
        if (!z9) {
            if (str != null && (bArr3 = za1Var.X) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = za1Var.U.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(m10, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(m10, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(za1Var.X, 0, bArr6, 0, 32);
                    Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = za1Var.W;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = za1Var.U.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] b10 = org.telegram.messenger.pv.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = b10;
                    if (b10 == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        l0Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(tLObject, l0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            l0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(tLObject, l0Var, 10);
    }

    public static void a0(za1 za1Var) {
        ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new di.u5(9));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131746123, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.id.M0(2131743934, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
        za1Var.showDialog(u1Var);
    }

    public static void b0(za1 za1Var, byte[] bArr) {
        ArrayList arrayList = za1Var.J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = za1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = za1Var.U;
        if (bArr == null) {
            bArr = za1Var.V;
        }
        twoStepVerificationActivity.A0(password2, bArr, za1Var.W, za1Var.X);
        twoStepVerificationActivity.X = za1Var.G;
        za1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, za1Var.U);
        l90 l90Var = za1Var.f52510j0;
        if (l90Var != null) {
            org.telegram.messenger.g0.h3(l90Var);
            za1Var.f52510j0 = null;
        }
    }

    public static void c0(za1 za1Var) {
        ArrayList arrayList = za1Var.J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(za1Var.currentAccount);
        byte[] bArr = za1Var.V;
        TL_account.Password password = za1Var.U;
        f10.k(org.telegram.messenger.qs.f25051p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, za1Var.R, za1Var.Q, null, za1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = za1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.A0(password2, za1Var.V, za1Var.W, za1Var.X);
        twoStepVerificationActivity.X = za1Var.G;
        za1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, za1Var.U);
        l90 l90Var = za1Var.f52510j0;
        if (l90Var != null) {
            org.telegram.messenger.g0.h3(l90Var);
            za1Var.f52510j0 = null;
        }
    }

    public static void d0(za1 za1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = za1Var.U.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.pv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        n41 n41Var = new n41(5, za1Var, bArr2);
        TL_account.Password password = za1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.pv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                n41Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(getpasswordsettings, n41Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        n41Var.run(null, tL_error2);
    }

    public static void e0(za1 za1Var, TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(new TL_account.getPassword(), new sa1(za1Var, 4), 8);
            return;
        }
        za1Var.B0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            za1Var.d.setText(org.telegram.messenger.id.M0(2131752157, null));
            org.telegram.ui.ActionBar.r6.V(za1Var.d, org.telegram.ui.ActionBar.k6.f28073p7, null);
            za1Var.E0(za1Var.f52513s, za1Var.f52511n, true);
            za1Var.M0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
            }
            za1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, G));
        } else {
            za1Var.L0(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
        }
    }

    public static void f0(za1 za1Var) {
        ArrayList arrayList = za1Var.J;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25051p0, new Object[0]);
        za1Var.finishFragment();
    }

    public static void g0(za1 za1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            za1Var.U = password;
            if (!TwoStepVerificationActivity.n0(password, false)) {
                org.telegram.ui.Components.v4.u0(za1Var.getParentActivity(), org.telegram.messenger.id.M0(2131743823, null), true);
                return;
            }
            za1Var.T = !TextUtils.isEmpty(za1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.r0(za1Var.U);
            if (!za1Var.S && za1Var.Y) {
                TL_account.Password password2 = za1Var.U;
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
                    if (!za1Var.T && passwordKdfAlgo != null) {
                        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25051p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        za1Var.finishFragment();
                    }
                }
            }
            if (za1Var.N) {
                za1Var.B0();
                za1Var.H0();
            }
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, za1Var.U);
        }
    }

    public static void h0(za1 za1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z9) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            za1Var.U = password;
            TwoStepVerificationActivity.r0(password);
            za1Var.J0(z9);
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, za1Var.U);
        }
    }

    public static void i0(za1 za1Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String G;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = za1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(za1Var.currentAccount).sendRequest(new TL_account.getPassword(), new fi.d3(11, za1Var, z9), 8);
            return;
        }
        za1Var.B0();
        int i7 = org.telegram.messenger.qs.f25051p0;
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            za1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
            int i10 = org.telegram.messenger.qs.f25057q0;
            if (z9) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.f2) arrayList.get(i11)).removeSelfFromStack();
                }
                org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25064r0, new Object[0]);
                org.telegram.messenger.qs.f(za1Var.currentAccount).k(i10, new Object[0]);
                za1Var.finishFragment();
            } else if (za1Var.getParentActivity() != null) {
                if (za1Var.U.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), new lk0(22, za1Var, bArr));
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    if (str == null && (password = za1Var.U) != null && password.has_password) {
                        u1Var.T = org.telegram.messenger.id.M0(2131742816, null);
                    } else {
                        u1Var.T = org.telegram.messenger.id.M0(2131742807, null);
                    }
                    u1Var.R = org.telegram.messenger.id.M0(2131742801, null);
                    Dialog showDialog = za1Var.showDialog(u1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((org.telegram.ui.ActionBar.f2) arrayList.get(i12)).removeSelfFromStack();
                }
                TL_account.Password password2 = za1Var.U;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (za1Var.Y) {
                    org.telegram.messenger.qs.f(za1Var.currentAccount).k(i7, new Object[0]);
                }
                za1 za1Var2 = new za1(7, za1Var.U);
                za1Var2.H = za1Var.H;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = za1Var.V;
                }
                za1Var2.I0(bArr3, za1Var.W, za1Var.X, za1Var.Z);
                za1Var2.Y = za1Var.Y;
                za1Var2.G = za1Var.G;
                za1Var.presentFragment(za1Var2, true);
                org.telegram.messenger.qs.f(za1Var.currentAccount).k(i10, za1Var.U);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    za1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.M0(2131747446, null));
                    return;
                } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    za1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.M0(2131751201, null));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    za1Var.L0(org.telegram.messenger.id.M0(2131689472, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, G));
                    return;
                } else {
                    za1Var.L0(org.telegram.messenger.id.M0(2131689472, null), tL_error.text);
                    return;
                }
            }
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(i7, new Object[0]);
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((org.telegram.ui.ActionBar.f2) arrayList.get(i13)).removeSelfFromStack();
            }
            org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(za1Var.currentAccount);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = za1Var.U;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = za1Var.R;
            f10.k(i7, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, za1Var.Q, str2, za1Var.P);
            TL_account.Password password4 = za1Var.U;
            password4.email_unconfirmed_pattern = za1Var.R;
            za1 za1Var3 = new za1(5, password4);
            za1Var3.H = za1Var.H;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = za1Var.V;
            }
            za1Var3.I0(bArr2, za1Var.W, za1Var.X, za1Var.Z);
            za1Var3.Y = za1Var.Y;
            za1Var3.G = za1Var.G;
            za1Var.presentFragment(za1Var3, true);
        }
    }

    public static void j0(za1 za1Var, TLRPC.TL_error tL_error) {
        za1Var.B0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = za1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.A0(password, za1Var.V, za1Var.W, za1Var.X);
            twoStepVerificationActivity.X = za1Var.G;
            za1Var.presentFragment(twoStepVerificationActivity, true);
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25064r0, new Object[0]);
            l90 l90Var = za1Var.f52510j0;
            if (l90Var != null) {
                org.telegram.messenger.g0.h3(l90Var);
                za1Var.f52510j0 = null;
            }
        }
    }

    public static void k0(za1 za1Var) {
        ArrayList arrayList = za1Var.J;
        if (za1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), new ra1(za1Var, 4));
            boolean z9 = za1Var.U.has_recovery;
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            if (z9) {
                u1Var.T = org.telegram.messenger.id.M0(2131742817, null);
            } else {
                u1Var.T = org.telegram.messenger.id.M0(2131742816, null);
            }
            u1Var.R = org.telegram.messenger.id.M0(2131742801, null);
            Dialog showDialog = za1Var.showDialog(u1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.f2) arrayList.get(i7)).removeSelfFromStack();
        }
        TL_account.Password password = za1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        za1 za1Var2 = new za1(7, password);
        za1Var2.H = za1Var.H;
        za1Var2.I0(za1Var.V, za1Var.W, za1Var.X, za1Var.Z);
        za1Var2.J.addAll(arrayList);
        za1Var2.Y = za1Var.Y;
        za1Var2.G = za1Var.G;
        za1Var.presentFragment(za1Var2, true);
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(za1Var.currentAccount);
        byte[] bArr = za1Var.V;
        TL_account.Password password2 = za1Var.U;
        f10.k(org.telegram.messenger.qs.f25051p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, za1Var.R, za1Var.Q, null, za1Var.P);
        org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, za1Var.U);
    }

    public static void l0(za1 za1Var, String str) {
        za1 za1Var2 = new za1(za1Var.currentAccount, 0, za1Var.U);
        za1Var2.H = za1Var.H;
        za1Var2.J.addAll(za1Var.J);
        za1Var2.J.add(za1Var);
        za1Var2.f52497a0 = str;
        za1Var2.G = za1Var.G;
        za1Var.presentFragment(za1Var2, true);
    }

    public static void m0(za1 za1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            za1Var.U = password;
            TwoStepVerificationActivity.r0(password);
            org.telegram.messenger.qs.f(za1Var.currentAccount).k(org.telegram.messenger.qs.f25057q0, za1Var.U);
            za1Var.H0();
        }
    }

    public static org.telegram.ui.ActionBar.k o0(za1 za1Var) {
        return za1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k p0(za1 za1Var) {
        return za1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k y0(za1 za1Var) {
        return za1Var.actionBar;
    }

    public final boolean A0() {
        int i7 = this.O;
        if ((i7 == 5 || i7 == 4) && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0() {
        this.f52501c0.f(false, true);
    }

    public final void C0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f52501c0.f(true, true);
        }
    }

    public final void D0() {
        br[] brVarArr;
        for (br brVar : this.f52515x.f52289f) {
            brVar.setText("");
            brVar.z(1.0f);
        }
        this.f52515x.f52289f[0].requestFocus();
        org.telegram.messenger.g0.G3(8.0f, this.f52515x, new qa1(this, 6));
    }

    public final void E0(org.telegram.ui.Components.lb0 lb0Var, EditTextBoldCursor editTextBoldCursor, boolean z9) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z9) {
            editTextBoldCursor.setText("");
        }
        org.telegram.messenger.g0.G3(5.0f, lb0Var, null);
    }

    public final void F0() {
        TL_account.Password password = this.U;
        if (!password.has_recovery) {
            za1 za1Var = new za1(this.currentAccount, 3, password);
            za1Var.H = this.H;
            za1Var.I0(this.V, this.W, this.X, this.Z);
            za1Var.P = this.P;
            za1Var.Q = this.Q;
            za1Var.J.addAll(this.J);
            za1Var.J.add(this);
            za1Var.Y = this.Y;
            za1Var.G = this.G;
            presentFragment(za1Var);
            return;
        }
        this.R = "";
        J0(false);
    }

    public final void H0() {
        if (getParentActivity() != null) {
            int i7 = 2;
            switch (this.O) {
                case 0:
                case 1:
                    if (this.f52511n.length() == 0) {
                        E0(this.f52513s, this.f52511n, false);
                        return;
                    } else if (!this.f52511n.getText().toString().equals(this.P) && this.O == 1) {
                        org.telegram.messenger.g0.G3(5.0f, this.f52513s, null);
                        try {
                            this.f52513s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.id.M0(2131747447, null), 0).show();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else {
                        int i10 = this.currentAccount;
                        if (this.O == 0) {
                            i7 = 1;
                        }
                        za1 za1Var = new za1(i10, i7, this.U);
                        za1Var.H = this.H;
                        za1Var.P = this.f52511n.getText().toString();
                        za1Var.I0(this.V, this.W, this.X, this.Z);
                        za1Var.f52497a0 = this.f52497a0;
                        za1Var.J.addAll(this.J);
                        za1Var.J.add(this);
                        za1Var.Y = this.Y;
                        za1Var.G = this.G;
                        presentFragment(za1Var);
                        return;
                    }
                case 2:
                    String obj = this.f52511n.getText().toString();
                    this.Q = obj;
                    if (obj.equalsIgnoreCase(this.P)) {
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.id.M0(2131747449, null), 0).show();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        E0(this.f52513s, this.f52511n, false);
                        return;
                    }
                    F0();
                    return;
                case 3:
                    if (!this.Z && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f52511n.getText().toString();
                    this.R = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            J0(false);
                            return;
                        }
                    }
                    E0(this.f52513s, this.f52511n, false);
                    return;
                case 4:
                    String code = this.f52515x.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new n41(4, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f52515x.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new sa1(this, 2), 10);
                    C0();
                    return;
                case 6:
                    TL_account.Password password = this.U;
                    if (password == null) {
                        C0();
                        this.N = true;
                        return;
                    }
                    za1 za1Var2 = new za1(this.currentAccount, 0, password);
                    za1Var2.H = this.H;
                    za1Var2.Y = this.Y;
                    za1Var2.G = this.G;
                    presentFragment(za1Var2, true);
                    return;
                case 7:
                    if (this.Y) {
                        finishFragment();
                        return;
                    } else if (this.H) {
                        Bundle k10 = a8.p0.k("afterSignup", true);
                        je0 je0Var = new je0();
                        je0Var.r0(k10);
                        presentFragment(je0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.A0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        l90 l90Var = this.f52510j0;
                        if (l90Var != null) {
                            org.telegram.messenger.g0.h3(l90Var);
                            this.f52510j0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.U == null) {
                        C0();
                        this.N = true;
                        return;
                    }
                    String obj3 = this.f52511n.getText().toString();
                    if (obj3.length() == 0) {
                        E0(this.f52513s, this.f52511n, false);
                        return;
                    }
                    byte[] h12 = org.telegram.messenger.g0.h1(obj3);
                    C0();
                    Utilities.f21336e.c(new ta1(this, h12, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void I0(byte[] bArr, long j3, byte[] bArr2, boolean z9) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j3;
        this.Z = z9;
    }

    public final void J0(boolean z9) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z9 && this.T && this.U.has_password) {
            C0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new sa1(this, 3));
            return;
        }
        String str = this.P;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z9) {
            org.telegram.messenger.p10.i(this.currentAccount).u();
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
        if (this.f52497a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f52497a0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.V;
            if (bArr == null || bArr.length == 0 || (z9 && this.T)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        C0();
        Utilities.f21336e.c(new fi.q1(this, updatepasswordsettings3, z9, str, passwordinputsettings));
    }

    public final void K0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.za1.K0(boolean):void");
    }

    public final void L0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = str;
        u1Var.T = str2;
        showDialog(u1Var);
    }

    public final void M0(boolean z9) {
        boolean z10;
        Integer num;
        if (this.f52498b.getTag() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 == z10) {
            return;
        }
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.f52498b;
        if (z9) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.I = new AnimatorSet();
        if (z9) {
            this.f52498b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
            TextView textView2 = this.f52503e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.f52503e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.f52503e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f52498b, property, 1.0f), ObjectAnimator.ofFloat(this.f52498b, property2, 1.0f), ObjectAnimator.ofFloat(this.f52498b, property3, 1.0f));
        } else {
            this.f52503e.setVisibility(0);
            AnimatorSet animatorSet3 = this.I;
            TextView textView5 = this.f52498b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f52498b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f52498b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.f52503e, property4, 1.0f), ObjectAnimator.ofFloat(this.f52503e, property5, 1.0f), ObjectAnimator.ofFloat(this.f52503e, property6, 1.0f));
        }
        this.I.addListener(new z40(11, this, z9));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void N0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131742951, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.G(this.G, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131743936, null), null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131750595, null), new ra1(this, 0));
        org.telegram.ui.ActionBar.r6.V((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.k6.f28093q7, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        int i12;
        ?? r12;
        ?? r92;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.m(kVar, 5, i13, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, i13, null);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 3, org.telegram.ui.ActionBar.k6.f28170u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new xa1(this));
        int i14 = this.O;
        if (i14 == 5) {
            this.actionBar.q().a(0, 2131231244).f(1, org.telegram.messenger.id.M0(2131754947, null));
        }
        org.telegram.ui.Components.q00 q00Var = new org.telegram.ui.Components.q00(context, this.resourceProvider, false);
        this.f52501c0 = q00Var;
        this.f52499b0 = new h6.m(q00Var);
        this.f52501c0.setOnClickListener(new View.OnClickListener(this) {
            public final za1 f48013b;

            {
                this.f48013b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15 = r2;
                za1 za1Var = this.f48013b;
                switch (i15) {
                    case 0:
                        za1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746096, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                        za1Var.showDialog(u1Var);
                        return;
                    case 2:
                        za1.a0(za1Var);
                        return;
                    case 3:
                        if (za1Var.h.getAlpha() >= 0.5f) {
                            int i16 = za1Var.O;
                            if (i16 == 0) {
                                za1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = za1Var.f52497a0;
                                za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                u1Var2.T = M02;
                                u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                za1Var.showDialog(u1Var2);
                                TextView textView = (TextView) u1Var2.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28093q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                za1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (za1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = za1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = za1Var.G;
                            za1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = za1Var.f52510j0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.h3(l90Var);
                                za1Var.f52510j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        za1Var.H0();
                        return;
                    default:
                        int i17 = za1Var.O;
                        za1Var.M = true;
                        if (za1Var.f52511n.getTransformationMethod() == null) {
                            za1Var.f52511n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                za1Var.f52506f0[3].P(-1);
                                org.telegram.ui.Components.zg0 animatedDrawable = za1Var.f52496a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var = za1Var.f52506f0[3];
                                if (animatedDrawable != zg0Var) {
                                    za1Var.f52496a.setAnimation(zg0Var);
                                    za1Var.f52506f0[3].N(18, false, false);
                                }
                                za1Var.f52496a.d();
                            }
                        } else {
                            za1Var.f52511n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                za1Var.f52506f0[3].P(18);
                                org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.f52496a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f52506f0[3];
                                if (animatedDrawable2 != zg0Var2) {
                                    za1Var.f52496a.setAnimation(zg0Var2);
                                }
                                za1Var.f52506f0[3].T(false, 0.0f);
                                za1Var.f52496a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = za1Var.f52511n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        za1Var.M = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.t11 t11Var = new org.telegram.ui.Components.t11(context);
        this.f52502d0 = t11Var;
        t11Var.setTransformType(1);
        this.f52502d0.setProgress(0.0f);
        this.f52502d0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
        this.f52502d0.setDrawBackground(false);
        this.f52501c0.setContentDescription(org.telegram.messenger.id.M0(2131748251, null));
        this.f52501c0.addView(this.f52502d0, c8.ha.e(56, 56, 17));
        this.f52501c0.a(this.f52502d0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28052o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        h6.m.g(this.h);
        this.h.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final za1 f48013b;

            {
                this.f48013b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15 = r2;
                za1 za1Var = this.f48013b;
                switch (i15) {
                    case 0:
                        za1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746096, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                        za1Var.showDialog(u1Var);
                        return;
                    case 2:
                        za1.a0(za1Var);
                        return;
                    case 3:
                        if (za1Var.h.getAlpha() >= 0.5f) {
                            int i16 = za1Var.O;
                            if (i16 == 0) {
                                za1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = za1Var.f52497a0;
                                za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                u1Var2.T = M02;
                                u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                za1Var.showDialog(u1Var2);
                                TextView textView2 = (TextView) u1Var2.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28093q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                za1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (za1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = za1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = za1Var.G;
                            za1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = za1Var.f52510j0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.h3(l90Var);
                                za1Var.f52510j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        za1Var.H0();
                        return;
                    default:
                        int i17 = za1Var.O;
                        za1Var.M = true;
                        if (za1Var.f52511n.getTransformationMethod() == null) {
                            za1Var.f52511n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                za1Var.f52506f0[3].P(-1);
                                org.telegram.ui.Components.zg0 animatedDrawable = za1Var.f52496a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var = za1Var.f52506f0[3];
                                if (animatedDrawable != zg0Var) {
                                    za1Var.f52496a.setAnimation(zg0Var);
                                    za1Var.f52506f0[3].N(18, false, false);
                                }
                                za1Var.f52496a.d();
                            }
                        } else {
                            za1Var.f52511n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                za1Var.f52506f0[3].P(18);
                                org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.f52496a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f52506f0[3];
                                if (animatedDrawable2 != zg0Var2) {
                                    za1Var.f52496a.setAnimation(zg0Var2);
                                }
                                za1Var.f52506f0[3].T(false, 0.0f);
                                za1Var.f52496a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = za1Var.f52511n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        za1Var.M = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f52496a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i14 == 2 && org.telegram.messenger.g0.O1()) {
            this.f52496a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.ch0 ch0Var = this.f52496a;
            Point point = org.telegram.messenger.g0.f22563q;
            if (point.x > point.y) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            ch0Var.setVisibility(i7);
        }
        TextView textView2 = new TextView(context);
        this.f52500c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i13, null);
        this.f52500c.setGravity(1);
        this.f52500c.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f52500c.setTextSize(1, 24.0f);
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        int i15 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.r6.V(lVar, i15, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.f52503e = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i15, null);
        this.f52503e.setGravity(1);
        this.f52503e.setTextSize(1, 14.0f);
        this.f52503e.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.f52503e.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f52503e.setVisibility(8);
        this.f52503e.setOnClickListener(new View.OnClickListener(this) {
            public final za1 f48013b;

            {
                this.f48013b = this;
            }

            @Override
            public final void onClick(View view) {
                int i152 = r2;
                za1 za1Var = this.f48013b;
                switch (i152) {
                    case 0:
                        za1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746096, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                        za1Var.showDialog(u1Var);
                        return;
                    case 2:
                        za1.a0(za1Var);
                        return;
                    case 3:
                        if (za1Var.h.getAlpha() >= 0.5f) {
                            int i16 = za1Var.O;
                            if (i16 == 0) {
                                za1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = za1Var.f52497a0;
                                za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                u1Var2.T = M02;
                                u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                za1Var.showDialog(u1Var2);
                                TextView textView22 = (TextView) u1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.f28093q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                za1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (za1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = za1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = za1Var.G;
                            za1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = za1Var.f52510j0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.h3(l90Var);
                                za1Var.f52510j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        za1Var.H0();
                        return;
                    default:
                        int i17 = za1Var.O;
                        za1Var.M = true;
                        if (za1Var.f52511n.getTransformationMethod() == null) {
                            za1Var.f52511n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                za1Var.f52506f0[3].P(-1);
                                org.telegram.ui.Components.zg0 animatedDrawable = za1Var.f52496a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var = za1Var.f52506f0[3];
                                if (animatedDrawable != zg0Var) {
                                    za1Var.f52496a.setAnimation(zg0Var);
                                    za1Var.f52506f0[3].N(18, false, false);
                                }
                                za1Var.f52496a.d();
                            }
                        } else {
                            za1Var.f52511n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                za1Var.f52506f0[3].P(18);
                                org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.f52496a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f52506f0[3];
                                if (animatedDrawable2 != zg0Var2) {
                                    za1Var.f52496a.setAnimation(zg0Var2);
                                }
                                za1Var.f52506f0[3].T(false, 0.0f);
                                za1Var.f52496a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = za1Var.f52511n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        za1Var.M = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f52498b = textView4;
        textView4.setMinWidth(org.telegram.messenger.g0.L(220.0f));
        this.f52498b.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f52498b.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(this.f52498b, org.telegram.ui.ActionBar.k6.Gi, null);
        this.f52498b.setTextSize(1, 15.0f);
        this.f52498b.setTypeface(org.telegram.messenger.g0.o());
        this.f52498b.setBackground(org.telegram.ui.ActionBar.z5.f(org.telegram.ui.ActionBar.k6.Ci, 24.0f));
        this.f52498b.setOnClickListener(new View.OnClickListener(this) {
            public final za1 f48013b;

            {
                this.f48013b = this;
            }

            @Override
            public final void onClick(View view) {
                int i152 = r2;
                za1 za1Var = this.f48013b;
                switch (i152) {
                    case 0:
                        za1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                        String M0 = org.telegram.messenger.id.M0(2131746096, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                        za1Var.showDialog(u1Var);
                        return;
                    case 2:
                        za1.a0(za1Var);
                        return;
                    case 3:
                        if (za1Var.h.getAlpha() >= 0.5f) {
                            int i16 = za1Var.O;
                            if (i16 == 0) {
                                za1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = za1Var.f52497a0;
                                za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                u1Var2.T = M02;
                                u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                za1Var.showDialog(u1Var2);
                                TextView textView22 = (TextView) u1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.f28093q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                za1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (za1Var.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = za1Var.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = za1Var.G;
                            za1Var.presentFragment(twoStepVerificationActivity, true);
                            l90 l90Var = za1Var.f52510j0;
                            if (l90Var != null) {
                                org.telegram.messenger.g0.h3(l90Var);
                                za1Var.f52510j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        za1Var.H0();
                        return;
                    default:
                        int i17 = za1Var.O;
                        za1Var.M = true;
                        if (za1Var.f52511n.getTransformationMethod() == null) {
                            za1Var.f52511n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                za1Var.f52506f0[3].P(-1);
                                org.telegram.ui.Components.zg0 animatedDrawable = za1Var.f52496a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var = za1Var.f52506f0[3];
                                if (animatedDrawable != zg0Var) {
                                    za1Var.f52496a.setAnimation(zg0Var);
                                    za1Var.f52506f0[3].N(18, false, false);
                                }
                                za1Var.f52496a.d();
                            }
                        } else {
                            za1Var.f52511n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                za1Var.f52506f0[3].P(18);
                                org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.f52496a.getAnimatedDrawable();
                                org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f52506f0[3];
                                if (animatedDrawable2 != zg0Var2) {
                                    za1Var.f52496a.setAnimation(zg0Var2);
                                }
                                za1Var.f52506f0[3].T(false, 0.0f);
                                za1Var.f52496a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = za1Var.f52511n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        za1Var.M = false;
                        return;
                }
            }
        });
        if (i14 != 6 && i14 != 7 && i14 != 9) {
            this.f52500c.setTypeface(org.telegram.messenger.g0.o());
            this.f52500c.setTextSize(1, 18.0f);
        } else {
            this.f52500c.setTypeface(Typeface.DEFAULT);
            this.f52500c.setTextSize(1, 24.0f);
        }
        switch (i14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                k0 k0Var = new k0(28, context, this);
                gi0 gi0Var = new gi0(this, context, k0Var, 1);
                gi0Var.addView(k0Var);
                p9 p9Var = new p9(this, context, gi0Var);
                ya1 ya1Var = new ya1(this, context);
                this.f52516y = ya1Var;
                ya1Var.setVerticalScrollBarEnabled(false);
                k0Var.addView(this.f52516y, c8.ha.c(-1.0f, -1));
                k0Var.addView(this.h, c8.ha.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                k0Var.addView(this.f52501c0, org.telegram.ui.Components.q00.b());
                p9Var.addView(gi0Var, c8.ha.c(-1.0f, -1));
                c61 c61Var = new c61(21, context, this);
                c61Var.setOrientation(1);
                this.f52516y.addView(c61Var, c8.ha.x(-1, -1, 51));
                c61Var.addView(this.f52496a, c8.ha.t(-2, -2, 49, 0, 69, 0, 0));
                c61Var.addView(this.f52500c, c8.ha.t(-2, -2, 49, 0, 8, 0, 0));
                c61Var.addView(this.d, c8.ha.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.lb0 lb0Var = new org.telegram.ui.Components.lb0(context, null);
                this.f52513s = lb0Var;
                lb0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f52511n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = org.telegram.messenger.g0.L(16.0f);
                this.f52511n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.f52511n;
                int i16 = org.telegram.ui.ActionBar.k6.f27999l6;
                org.telegram.ui.ActionBar.r6.w(editTextBoldCursor2, i16, null);
                org.telegram.ui.ActionBar.r6.V(this.f52511n, i13, null);
                this.f52511n.setBackground(null);
                this.f52511n.setMaxLines(1);
                this.f52511n.setLines(1);
                this.f52511n.setGravity(3);
                this.f52511n.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.f52511n.setSingleLine(true);
                this.f52511n.setCursorWidth(1.5f);
                this.f52511n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final za1 f48345b;

                    {
                        this.f48345b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i17, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                za1 za1Var = this.f48345b;
                                za1Var.getClass();
                                if (i17 != 5 && i17 != 6) {
                                    return false;
                                }
                                za1Var.H0();
                                return true;
                            default:
                                za1 za1Var2 = this.f48345b;
                                za1Var2.getClass();
                                if (i17 != 5 && i17 != 6) {
                                    return false;
                                }
                                if (za1Var2.f52514w.getVisibility() == 0) {
                                    za1Var2.f52512r.requestFocus();
                                } else {
                                    za1Var2.H0();
                                }
                                return true;
                        }
                    }
                });
                this.f52513s.e(this.f52511n);
                this.f52511n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final za1 f48760b;

                    {
                        this.f48760b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.lb0 lb0Var2 = this.f48760b.f52514w;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                lb0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                za1 za1Var = this.f48760b;
                                if (z11) {
                                    za1Var.f52504e0.setEditText((EditText) view);
                                    za1Var.f52504e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                za1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.lb0 lb0Var3 = this.f48760b.f52513s;
                                if (z11) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                lb0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f52511n, c8.ha.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(4, context, this);
                this.E = f0Var;
                f0Var.setImageResource(2131232224);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(org.telegram.messenger.id.M0(2131743935, null));
                org.telegram.ui.ActionBar.f0 f0Var2 = this.E;
                int i17 = org.telegram.ui.ActionBar.k6.f27944i6;
                org.telegram.ui.ActionBar.r6.R(f0Var2, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i17, false), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i17), null);
                org.telegram.ui.ActionBar.r6.t(this.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                org.telegram.messenger.g0.Z3(this.E, false, 0.1f, true, false);
                this.E.setOnClickListener(new View.OnClickListener(this) {
                    public final za1 f48013b;

                    {
                        this.f48013b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i152 = r2;
                        za1 za1Var = this.f48013b;
                        switch (i152) {
                            case 0:
                                za1Var.H0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                                String M0 = org.telegram.messenger.id.M0(2131746096, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                u1Var.R = M0;
                                u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                                za1Var.showDialog(u1Var);
                                return;
                            case 2:
                                za1.a0(za1Var);
                                return;
                            case 3:
                                if (za1Var.h.getAlpha() >= 0.5f) {
                                    int i162 = za1Var.O;
                                    if (i162 == 0) {
                                        za1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = za1Var.f52497a0;
                                        za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                        String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                        u1Var2.T = M02;
                                        u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        za1Var.showDialog(u1Var2);
                                        TextView textView22 = (TextView) u1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.f28093q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i162 == 2) {
                                        za1Var.F0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                if (za1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = za1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = za1Var.G;
                                    za1Var.presentFragment(twoStepVerificationActivity, true);
                                    l90 l90Var = za1Var.f52510j0;
                                    if (l90Var != null) {
                                        org.telegram.messenger.g0.h3(l90Var);
                                        za1Var.f52510j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                za1Var.H0();
                                return;
                            default:
                                int i172 = za1Var.O;
                                za1Var.M = true;
                                if (za1Var.f52511n.getTransformationMethod() == null) {
                                    za1Var.f52511n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                        za1Var.f52506f0[3].P(-1);
                                        org.telegram.ui.Components.zg0 animatedDrawable = za1Var.f52496a.getAnimatedDrawable();
                                        org.telegram.ui.Components.zg0 zg0Var = za1Var.f52506f0[3];
                                        if (animatedDrawable != zg0Var) {
                                            za1Var.f52496a.setAnimation(zg0Var);
                                            za1Var.f52506f0[3].N(18, false, false);
                                        }
                                        za1Var.f52496a.d();
                                    }
                                } else {
                                    za1Var.f52511n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                        za1Var.f52506f0[3].P(18);
                                        org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.f52496a.getAnimatedDrawable();
                                        org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f52506f0[3];
                                        if (animatedDrawable2 != zg0Var2) {
                                            za1Var.f52496a.setAnimation(zg0Var2);
                                        }
                                        za1Var.f52506f0[3].T(false, 0.0f);
                                        za1Var.f52496a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = za1Var.f52511n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                za1Var.M = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.E, c8.ha.t(24, 24, 16, 0, 0, 16, 0));
                this.f52511n.addTextChangedListener(new wa1(this, 2));
                this.f52513s.addView(linearLayout, c8.ha.c(-2.0f, -1));
                c61Var.addView(this.f52513s, c8.ha.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.f52514w = new org.telegram.ui.Components.lb0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f52512r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                this.f52512r.setPadding(L2, L2, L2, L2);
                org.telegram.ui.ActionBar.r6.w(this.f52512r, i16, null);
                org.telegram.ui.ActionBar.r6.V(this.f52512r, i13, null);
                this.f52512r.setBackground(null);
                this.f52512r.setMaxLines(1);
                this.f52512r.setLines(1);
                this.f52512r.setGravity(3);
                this.f52512r.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.f52512r.setSingleLine(true);
                this.f52512r.setCursorWidth(1.5f);
                this.f52512r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final za1 f48345b;

                    {
                        this.f48345b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i172, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                za1 za1Var = this.f48345b;
                                za1Var.getClass();
                                if (i172 != 5 && i172 != 6) {
                                    return false;
                                }
                                za1Var.H0();
                                return true;
                            default:
                                za1 za1Var2 = this.f48345b;
                                za1Var2.getClass();
                                if (i172 != 5 && i172 != 6) {
                                    return false;
                                }
                                if (za1Var2.f52514w.getVisibility() == 0) {
                                    za1Var2.f52512r.requestFocus();
                                } else {
                                    za1Var2.H0();
                                }
                                return true;
                        }
                    }
                });
                this.f52514w.e(this.f52512r);
                this.f52512r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final za1 f48760b;

                    {
                        this.f48760b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.lb0 lb0Var2 = this.f48760b.f52514w;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                lb0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                za1 za1Var = this.f48760b;
                                if (z11) {
                                    za1Var.f52504e0.setEditText((EditText) view);
                                    za1Var.f52504e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                za1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.lb0 lb0Var3 = this.f48760b.f52513s;
                                if (z11) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                lb0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                this.f52514w.addView(this.f52512r, c8.ha.c(-2.0f, -1));
                c61Var.addView(this.f52514w, c8.ha.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.f52514w.setVisibility(8);
                org.telegram.ui.Components.br brVar = new org.telegram.ui.Components.br(context);
                this.f52504e0 = brVar;
                brVar.setVisibility(8);
                gi0Var.addView(this.f52504e0);
                lb0 lb0Var2 = new lb0(3, context, this);
                this.f52515x = lb0Var2;
                final int i18 = 1;
                lb0Var2.b(6, 1);
                br[] brVarArr = this.f52515x.f52289f;
                int length = brVarArr.length;
                int i19 = 0;
                while (i19 < length) {
                    br brVar2 = brVarArr[i19];
                    brVar2.setShowSoftInputOnFocusCompat(A0() ^ i18);
                    brVar2.addTextChangedListener(new wa1(this, 0));
                    brVar2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final za1 f48760b;

                        {
                            this.f48760b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z11) {
                            float f10;
                            float f11;
                            switch (i18) {
                                case 0:
                                    org.telegram.ui.Components.lb0 lb0Var22 = this.f48760b.f52514w;
                                    if (z11) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    lb0Var22.b(f10, f10, true);
                                    return;
                                case 1:
                                    za1 za1Var = this.f48760b;
                                    if (z11) {
                                        za1Var.f52504e0.setEditText((EditText) view);
                                        za1Var.f52504e0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    za1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.lb0 lb0Var3 = this.f48760b.f52513s;
                                    if (z11) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    lb0Var3.b(f11, f11, true);
                                    return;
                            }
                        }
                    });
                    i19++;
                    i18 = 1;
                }
                this.f52515x.setVisibility(8);
                c61Var.addView(this.f52515x, c8.ha.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                c61Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.f52503e, c8.ha.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f52505f = textView5;
                    org.telegram.ui.ActionBar.r6.V(textView5, org.telegram.ui.ActionBar.k6.J6, null);
                    this.f52505f.setGravity(1);
                    this.f52505f.setTextSize(1, 14.0f);
                    this.f52505f.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.f52505f.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                    this.f52505f.setText(org.telegram.messenger.id.M0(2131746079, null));
                    c61Var.addView(this.f52505f, c8.ha.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f52505f.setOnClickListener(new View.OnClickListener(this) {
                        public final za1 f48013b;

                        {
                            this.f48013b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i152 = r2;
                            za1 za1Var = this.f48013b;
                            switch (i152) {
                                case 0:
                                    za1Var.H0();
                                    return;
                                case 1:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                                    String M0 = org.telegram.messenger.id.M0(2131746096, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                                    za1Var.showDialog(u1Var);
                                    return;
                                case 2:
                                    za1.a0(za1Var);
                                    return;
                                case 3:
                                    if (za1Var.h.getAlpha() >= 0.5f) {
                                        int i162 = za1Var.O;
                                        if (i162 == 0) {
                                            za1Var.C0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = za1Var.f52497a0;
                                            za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, 1));
                                            return;
                                        } else if (i162 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                            String M02 = org.telegram.messenger.id.M0(2131742818, null);
                                            org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                            u1Var2.T = M02;
                                            u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                            za1Var.showDialog(u1Var2);
                                            TextView textView22 = (TextView) u1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.f28093q7, null);
                                                return;
                                            }
                                            return;
                                        } else if (i162 == 2) {
                                            za1Var.F0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    if (za1Var.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = za1Var.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = za1Var.G;
                                        za1Var.presentFragment(twoStepVerificationActivity, true);
                                        l90 l90Var = za1Var.f52510j0;
                                        if (l90Var != null) {
                                            org.telegram.messenger.g0.h3(l90Var);
                                            za1Var.f52510j0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    za1Var.H0();
                                    return;
                                default:
                                    int i172 = za1Var.O;
                                    za1Var.M = true;
                                    if (za1Var.f52511n.getTransformationMethod() == null) {
                                        za1Var.f52511n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                                        if (i172 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                            za1Var.f52506f0[3].P(-1);
                                            org.telegram.ui.Components.zg0 animatedDrawable = za1Var.f52496a.getAnimatedDrawable();
                                            org.telegram.ui.Components.zg0 zg0Var = za1Var.f52506f0[3];
                                            if (animatedDrawable != zg0Var) {
                                                za1Var.f52496a.setAnimation(zg0Var);
                                                za1Var.f52506f0[3].N(18, false, false);
                                            }
                                            za1Var.f52496a.d();
                                        }
                                    } else {
                                        za1Var.f52511n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                                        if (i172 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                            za1Var.f52506f0[3].P(18);
                                            org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.f52496a.getAnimatedDrawable();
                                            org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f52506f0[3];
                                            if (animatedDrawable2 != zg0Var2) {
                                                za1Var.f52496a.setAnimation(zg0Var2);
                                            }
                                            za1Var.f52506f0[3].T(false, 0.0f);
                                            za1Var.f52496a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = za1Var.f52511n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    za1Var.M = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = p9Var;
                fi.p5 p5Var = new fi.p5(this, context);
                this.D = p5Var;
                p5Var.setAlpha(0.0f);
                p9Var.addView(this.D);
                p9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27999l6, false));
                k0Var.addView(this.L, c8.ha.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                e eVar = new e(1, context, this);
                eVar.setOnTouchListener(new ei.b(2));
                eVar.addView(this.actionBar);
                eVar.addView(this.f52496a);
                eVar.addView(this.f52500c);
                eVar.addView(this.d);
                eVar.addView(this.f52498b);
                this.fragmentView = eVar;
                break;
        }
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, this.fragmentView, null);
        String str = "";
        switch (i14) {
            case 0:
            case 1:
                int i20 = 2131746414;
                if (this.U.has_password) {
                    this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747212, null));
                    this.f52500c.setText(org.telegram.messenger.id.M0(2131747212, null));
                } else {
                    if (i14 == 0) {
                        i10 = 2131751706;
                    } else {
                        i10 = 2131746414;
                    }
                    String M0 = org.telegram.messenger.id.M0(i10, null);
                    this.actionBar.setTitle(M0);
                    this.f52500c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.f52497a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(org.telegram.messenger.id.M0(2131742820, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.lb0 lb0Var3 = this.f52513s;
                if (i14 == 0) {
                    i11 = 2131751117;
                } else {
                    i11 = 2131746414;
                }
                lb0Var3.setText(org.telegram.messenger.id.M0(i11, null));
                EditTextBoldCursor editTextBoldCursor4 = this.f52511n;
                if (i14 == 0) {
                    i20 = 2131751117;
                }
                editTextBoldCursor4.setContentDescription(org.telegram.messenger.id.M0(i20, null));
                this.f52511n.setImeOptions(268435461);
                this.f52511n.setInputType(129);
                this.f52511n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f52511n.setTypeface(Typeface.DEFAULT);
                if (i14 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.F = z9;
                org.telegram.messenger.g0.Z3(this.E, false, 0.1f, true, false);
                org.telegram.ui.Components.zg0[] zg0VarArr = new org.telegram.ui.Components.zg0[7];
                this.f52506f0 = zg0VarArr;
                zg0VarArr[0] = new org.telegram.ui.Components.zg0(2131624309, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f52506f0[1] = new org.telegram.ui.Components.zg0(2131624310, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f52506f0[2] = new org.telegram.ui.Components.zg0(2131624302, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f52506f0[3] = new org.telegram.ui.Components.zg0(2131624311, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f52506f0[4] = new org.telegram.ui.Components.zg0(2131624308, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f52506f0[5] = new org.telegram.ui.Components.zg0(2131624307, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f52506f0[6] = new org.telegram.ui.Components.zg0(2131624312, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                org.telegram.ui.Components.zg0 zg0Var = this.f52506f0[6];
                zg0Var.h = true;
                zg0Var.P(19);
                this.f52506f0[2].S(97, this.f52509i0);
                K0(true);
                if (i14 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    qa1 qa1Var = this.f52507g0;
                    if (qa1Var != null) {
                        org.telegram.messenger.g0.r(qa1Var);
                    }
                    this.f52496a.setAnimation(this.f52506f0[6]);
                    this.f52496a.d();
                    i12 = 1;
                    break;
                } else {
                    EditTextBoldCursor editTextBoldCursor5 = this.f52511n;
                    ArrayList arrayList = editTextBoldCursor5.f31341f1;
                    int size = arrayList.size();
                    int i21 = 0;
                    while (i21 < size) {
                        Object obj = arrayList.get(i21);
                        i21++;
                        TextWatcher textWatcher = (TextWatcher) obj;
                        textWatcher.beforeTextChanged("", 0, editTextBoldCursor5.length(), editTextBoldCursor5.length());
                        textWatcher.onTextChanged(editTextBoldCursor5.getText(), 0, editTextBoldCursor5.length(), editTextBoldCursor5.length());
                        textWatcher.afterTextChanged(editTextBoldCursor5.getText());
                    }
                    i12 = 1;
                    K0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747445, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(org.telegram.messenger.id.M0(2131742820, null));
                this.f52500c.setText(org.telegram.messenger.id.M0(2131747445, null));
                this.d.setText(org.telegram.messenger.id.M0(2131747444, null));
                this.d.setVisibility(0);
                this.f52513s.setText(org.telegram.messenger.id.M0(2131747443, null));
                this.f52511n.setContentDescription(org.telegram.messenger.id.M0(2131747443, null));
                this.f52511n.setImeOptions(268435461);
                this.f52514w.setVisibility(8);
                this.f52496a.f(2131624304, 120, 120, null);
                this.f52496a.d();
                i12 = 1;
                break;
            case 3:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131746345, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.Z) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(org.telegram.messenger.id.M0(2131742820, null));
                } else {
                    r12 = 0;
                }
                this.f52500c.setText(org.telegram.messenger.id.M0(2131746345, r12));
                this.d.setText(org.telegram.messenger.id.M0(2131746346, r12));
                this.d.setVisibility(0);
                this.f52513s.setText(org.telegram.messenger.id.M0(2131747377, r12));
                this.f52511n.setContentDescription(org.telegram.messenger.id.M0(2131747377, r12));
                this.f52511n.setImeOptions(268435461);
                this.f52511n.setInputType(33);
                this.f52514w.setVisibility(8);
                this.f52496a.f(2131624303, 120, 120, r12);
                this.f52496a.d();
                i12 = 1;
                break;
            case 4:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747438, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f52500c.setText(org.telegram.messenger.id.M0(2131747438, null));
                this.f52504e0.setVisibility(0);
                this.f52513s.setVisibility(8);
                String str2 = this.U.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj2 = new Object();
                    obj2.f38779a |= 256;
                    obj2.f38780b = indexOf;
                    int i22 = lastIndexOf + 1;
                    obj2.f38781c = i22;
                    r92 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.vy0(obj2, 0), indexOf, i22, 0);
                } else {
                    r92 = 0;
                }
                xh.l lVar2 = this.d;
                String M02 = org.telegram.messenger.id.M0(2131746083, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r92] = valueOf;
                lVar2.setText(org.telegram.messenger.g0.m0(M02, charSequenceArr));
                this.d.setVisibility(r92);
                this.f52501c0.e(r92, r92);
                this.f52515x.setVisibility(r92);
                this.f52496a.f(2131624306, 120, 120, null);
                this.f52496a.d();
                i12 = 1;
                break;
            case 5:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131743622, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f52500c.setText(org.telegram.messenger.id.M0(2131743622, null));
                this.f52513s.setVisibility(8);
                this.f52504e0.setVisibility(0);
                xh.l lVar3 = this.d;
                String str3 = this.U.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                lVar3.setText(org.telegram.messenger.id.a0("EmailPasswordConfirmText2", null, 2131751200, str));
                this.d.setVisibility(0);
                this.f52501c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(org.telegram.messenger.id.M0(2131746124, null));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final za1 f48013b;

                    {
                        this.f48013b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i152 = r2;
                        za1 za1Var = this.f48013b;
                        switch (i152) {
                            case 0:
                                za1Var.H0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(za1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746121, null), new ra1(za1Var, 1));
                                String M03 = org.telegram.messenger.id.M0(2131746096, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                                u1Var.R = M03;
                                u1Var.T = org.telegram.messenger.id.M0(2131746077, null);
                                za1Var.showDialog(u1Var);
                                return;
                            case 2:
                                za1.a0(za1Var);
                                return;
                            case 3:
                                if (za1Var.h.getAlpha() >= 0.5f) {
                                    int i162 = za1Var.O;
                                    if (i162 == 0) {
                                        za1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = za1Var.f52497a0;
                                        za1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sa1(za1Var, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(za1Var.getParentActivity());
                                        String M022 = org.telegram.messenger.id.M0(2131742818, null);
                                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.f27296a;
                                        u1Var2.T = M022;
                                        u1Var2.R = org.telegram.messenger.id.M0(2131742819, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131742820, null), new ra1(za1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                        za1Var.showDialog(u1Var2);
                                        TextView textView22 = (TextView) u1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.r6.V(textView22, org.telegram.ui.ActionBar.k6.f28093q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i162 == 2) {
                                        za1Var.F0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                if (za1Var.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = za1Var.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = za1Var.G;
                                    za1Var.presentFragment(twoStepVerificationActivity, true);
                                    l90 l90Var = za1Var.f52510j0;
                                    if (l90Var != null) {
                                        org.telegram.messenger.g0.h3(l90Var);
                                        za1Var.f52510j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                za1Var.H0();
                                return;
                            default:
                                int i172 = za1Var.O;
                                za1Var.M = true;
                                if (za1Var.f52511n.getTransformationMethod() == null) {
                                    za1Var.f52511n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Le, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                        za1Var.f52506f0[3].P(-1);
                                        org.telegram.ui.Components.zg0 animatedDrawable = za1Var.f52496a.getAnimatedDrawable();
                                        org.telegram.ui.Components.zg0 zg0Var2 = za1Var.f52506f0[3];
                                        if (animatedDrawable != zg0Var2) {
                                            za1Var.f52496a.setAnimation(zg0Var2);
                                            za1Var.f52506f0[3].N(18, false, false);
                                        }
                                        za1Var.f52496a.d();
                                    }
                                } else {
                                    za1Var.f52511n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.r6.t(za1Var.E, org.telegram.ui.ActionBar.k6.Me, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && za1Var.f52511n.length() > 0 && za1Var.f52511n.hasFocus()) {
                                        za1Var.f52506f0[3].P(18);
                                        org.telegram.ui.Components.zg0 animatedDrawable2 = za1Var.f52496a.getAnimatedDrawable();
                                        org.telegram.ui.Components.zg0 zg0Var22 = za1Var.f52506f0[3];
                                        if (animatedDrawable2 != zg0Var22) {
                                            za1Var.f52496a.setAnimation(zg0Var22);
                                        }
                                        za1Var.f52506f0[3].T(false, 0.0f);
                                        za1Var.f52496a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = za1Var.f52511n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                za1Var.M = false;
                                return;
                        }
                    }
                });
                this.f52515x.setVisibility(0);
                this.f52496a.f(2131624306, 120, 120, null);
                this.f52496a.d();
                i12 = 1;
                break;
            case 6:
                this.f52500c.setText(org.telegram.messenger.id.M0(2131743934, null));
                this.d.setText(org.telegram.messenger.id.M0(2131745551, null));
                this.f52498b.setText(org.telegram.messenger.id.M0(2131743936, null));
                this.d.setVisibility(0);
                this.f52496a.f(2131624305, 140, 140, null);
                this.f52496a.d();
                i12 = 1;
                break;
            case 7:
                this.f52500c.setText(org.telegram.messenger.id.M0(2131743938, null));
                this.d.setText(org.telegram.messenger.id.M0(2131743937, null));
                if (this.Y) {
                    this.f52498b.setText(org.telegram.messenger.id.M0(2131743940, null));
                } else if (this.H) {
                    this.f52498b.setText(org.telegram.messenger.id.M0(2131751771, null));
                } else {
                    this.f52498b.setText(org.telegram.messenger.id.M0(2131743939, null));
                }
                this.d.setVisibility(0);
                this.f52496a.f(2131624353, 160, 160, null);
                this.f52496a.d();
                i12 = 1;
                break;
            case 8:
                this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747218, null));
                this.f52500c.setText(org.telegram.messenger.id.M0(2131747218, null));
                this.d.setText(org.telegram.messenger.id.M0(2131752160, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f52503e.setText(org.telegram.messenger.id.M0(2131750592, null));
                org.telegram.ui.ActionBar.r6.V(this.f52503e, org.telegram.ui.ActionBar.k6.f28052o6, null);
                this.f52513s.setText(org.telegram.messenger.id.M0(2131748727, null));
                this.f52511n.setContentDescription(org.telegram.messenger.id.M0(2131748727, null));
                this.f52511n.setImeOptions(268435462);
                this.f52511n.setInputType(129);
                this.f52511n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f52511n.setTypeface(Typeface.DEFAULT);
                this.f52496a.f(2131624359, 120, 120, null);
                this.f52496a.d();
                i12 = 1;
                break;
            case 9:
                this.f52500c.setText(org.telegram.messenger.id.M0(2131752159, null));
                this.d.setText(org.telegram.messenger.id.M0(2131752158, null));
                this.f52498b.setText(org.telegram.messenger.id.M0(2131752161, null));
                this.d.setVisibility(0);
                this.f52496a.f(2131624358, 140, 140, null);
                this.f52496a.d();
                i12 = 1;
                break;
            default:
                i12 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor6 = this.f52511n;
        if (editTextBoldCursor6 != null) {
            editTextBoldCursor6.addTextChangedListener(new wa1(this, i12));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z9) {
        for (org.telegram.ui.ActionBar.f2 f2Var : getParentLayout().getFragmentStack()) {
            if (f2Var != this && (f2Var instanceof za1)) {
                ((org.telegram.ui.Components.e51) ((za1) f2Var).f52499b0.f14264b).f33205b = true;
            }
        }
        return super.finishFragment(z9);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27796a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52500c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52511n, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52511n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27981k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f52511n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27999l6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i7 = this.O;
        if (i7 != 7 && i7 != 9) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, true)) > 0.699999988079071d) {
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
    public final boolean onBackPressed(boolean z9) {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z9) {
                N0();
                return false;
            }
            return false;
        }
        if (z9) {
            finishFragment();
        }
        return true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        if (this.f52496a != null) {
            int i11 = this.O;
            if (i11 == 2 && org.telegram.messenger.g0.O1()) {
                this.f52496a.setVisibility(8);
            } else if (i11 != 6 && i11 != 9 && i11 != 7) {
                org.telegram.ui.Components.ch0 ch0Var = this.f52496a;
                Point point = org.telegram.messenger.g0.f22563q;
                if (point.x > point.y) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                ch0Var.setVisibility(i7);
            }
        }
        org.telegram.ui.Components.br brVar = this.f52504e0;
        if (brVar != null) {
            if (!A0()) {
                i10 = 8;
            }
            brVar.setVisibility(i10);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        qa1 qa1Var = this.f52507g0;
        if (qa1Var != null) {
            org.telegram.messenger.g0.r(qa1Var);
            this.f52507g0 = null;
        }
        if (this.f52506f0 != null) {
            int i7 = 0;
            while (true) {
                org.telegram.ui.Components.zg0[] zg0VarArr = this.f52506f0;
                if (i7 >= zg0VarArr.length) {
                    break;
                }
                zg0VarArr[i7].C(false);
                i7++;
            }
            this.f52506f0 = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
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
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.b3(getParentActivity(), this.classGuid);
            org.telegram.messenger.g0.v1(this.fragmentView);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.t11 t11Var = this.f52502d0;
            if (t11Var != null) {
                t11Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.O9, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27999l6, false);
            RadialProgressView radialProgressView = this.L;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            if (this.f52511n != null && !A0()) {
                org.telegram.messenger.g0.i3(new qa1(this, 2), 200L);
            }
            lb0 lb0Var = this.f52515x;
            if (lb0Var != null && lb0Var.getVisibility() == 0) {
                org.telegram.messenger.g0.i3(new qa1(this, 3), 200L);
            }
        }
    }

    public final void z0(Runnable runnable) {
        int i7 = 0;
        while (true) {
            lb0 lb0Var = this.f52515x;
            br[] brVarArr = lb0Var.f52289f;
            if (i7 < brVarArr.length) {
                br brVar = brVarArr[i7];
                brVar.postDelayed(new fi0(brVar, 1), i7 * 75);
                i7++;
            } else {
                lb0Var.postDelayed(new by0(26, this, runnable), (brVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle k10 = a8.p0.k("afterSignup", true);
            je0 je0Var = new je0();
            je0Var.r0(k10);
            presentFragment(je0Var, true);
            return;
        }
        super.finishFragment();
    }

    public za1(int i7, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f52508h0 = new qa1(this, 0);
        this.f52509i0 = new qa1(this, 1);
        this.O = i7;
        this.U = password;
        if (password == null && (i7 == 6 || i7 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new sa1(this, 0), 10);
            return;
        }
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void G0() {
    }
}
