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
public class xa1 extends org.telegram.ui.ActionBar.e2 {
    public hi.n5 E;
    public org.telegram.ui.ActionBar.f0 F;
    public boolean G;
    public int H;
    public boolean I;
    public AnimatorSet J;
    public final ArrayList K;
    public AnimatorSet L;
    public RadialProgressView M;
    public boolean N;
    public boolean O;
    public final int P;
    public String Q;
    public String R;
    public String S;
    public boolean T;
    public boolean U;
    public TL_account.Password V;
    public byte[] W;
    public long X;
    public byte[] Y;
    public boolean Z;
    public org.telegram.ui.Components.fh0 f53138a;
    public boolean f53139a0;
    public TextView f53140b;
    public String f53141b0;
    public TextView f53142c;
    public h6.m f53143c0;
    public xh.l d;
    public org.telegram.ui.Components.t00 f53144d0;
    public TextView f53145e;
    public org.telegram.ui.Components.y11 f53146e0;
    public TextView f53147f;
    public org.telegram.ui.Components.ir f53148f0;
    public org.telegram.ui.Components.ch0[] f53149g0;
    public TextView h;
    public oa1 f53150h0;
    public final Runnable f53151i0;
    public final Runnable f53152j0;
    public m90 f53153k0;
    public EditTextBoldCursor f53154n;
    public EditTextBoldCursor f53155r;
    public org.telegram.ui.Components.mb0 f53156s;
    public org.telegram.ui.Components.mb0 f53157w;
    public lb0 f53158x;
    public wa1 f53159y;

    public xa1(int i7, int i10, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.f53151i0 = new oa1(this, 0);
        this.f53152j0 = new oa1(this, 1);
        this.currentAccount = i7;
        this.P = i10;
        this.V = password;
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.V == null) {
            if (i10 == 6 || i10 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new qa1(this, 0), 10);
            }
        }
    }

    public static void Z(xa1 xa1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = xa1Var.V;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = org.telegram.messenger.nv.d(xa1Var.W, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] h12 = org.telegram.messenger.g0.h1(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = xa1Var.V.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr2 = h12;
                bArr = org.telegram.messenger.nv.c(h12, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            } else {
                bArr2 = h12;
                bArr = null;
            }
        } else {
            bArr = null;
            bArr2 = null;
        }
        kg.l0 l0Var = new kg.l0(xa1Var, z10, bArr, str, passwordinputsettings);
        if (!z10) {
            if (str != null && (bArr3 = xa1Var.Y) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = xa1Var.V.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] m10 = Utilities.m(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(m10, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(m10, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(xa1Var.Y, 0, bArr6, 0, 32);
                    Utilities.b(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = xa1Var.X;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = xa1Var.V.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] b10 = org.telegram.messenger.nv.b(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = b10;
                    if (b10 == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        l0Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(xa1Var.currentAccount).sendRequest(tLObject, l0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            l0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(xa1Var.currentAccount).sendRequest(tLObject, l0Var, 10);
    }

    public static void a0(xa1 xa1Var) {
        ConnectionsManager.getInstance(xa1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new fi.m5(9));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131746120, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.U = M0;
        t1Var.S = org.telegram.messenger.hd.M0(2131743931, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
        xa1Var.showDialog(t1Var);
    }

    public static void b0(xa1 xa1Var, byte[] bArr) {
        ArrayList arrayList = xa1Var.K;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.e2) arrayList.get(i7)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = xa1Var.V;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = xa1Var.V;
        if (bArr == null) {
            bArr = xa1Var.W;
        }
        twoStepVerificationActivity.A0(password2, bArr, xa1Var.X, xa1Var.Y);
        twoStepVerificationActivity.Y = xa1Var.H;
        xa1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25554q0, xa1Var.V);
        m90 m90Var = xa1Var.f53153k0;
        if (m90Var != null) {
            org.telegram.messenger.g0.h3(m90Var);
            xa1Var.f53153k0 = null;
        }
    }

    public static void c0(xa1 xa1Var) {
        ArrayList arrayList = xa1Var.K;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.e2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(xa1Var.currentAccount);
        byte[] bArr = xa1Var.W;
        TL_account.Password password = xa1Var.V;
        f10.k(org.telegram.messenger.ns.f25548p0, bArr, password.new_algo, password.new_secure_algo, password.secure_random, xa1Var.S, xa1Var.R, null, xa1Var.Q);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = xa1Var.V;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.A0(password2, xa1Var.W, xa1Var.X, xa1Var.Y);
        twoStepVerificationActivity.Y = xa1Var.H;
        xa1Var.presentFragment(twoStepVerificationActivity, true);
        org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25554q0, xa1Var.V);
        m90 m90Var = xa1Var.f53153k0;
        if (m90Var != null) {
            org.telegram.messenger.g0.h3(m90Var);
            xa1Var.f53153k0 = null;
        }
    }

    public static void d0(xa1 xa1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = xa1Var.V.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = org.telegram.messenger.nv.c(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        a31 a31Var = new a31(7, xa1Var, bArr2);
        TL_account.Password password = xa1Var.V;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP d = org.telegram.messenger.nv.d(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = d;
            if (d == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                a31Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(xa1Var.currentAccount).sendRequest(getpasswordsettings, a31Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        a31Var.run(null, tL_error2);
    }

    public static void e0(xa1 xa1Var, TLRPC.TL_error tL_error) {
        String G;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(xa1Var.currentAccount).sendRequest(new TL_account.getPassword(), new qa1(xa1Var, 4), 8);
            return;
        }
        xa1Var.B0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            xa1Var.d.setText(org.telegram.messenger.hd.M0(2131752157, null));
            org.telegram.ui.ActionBar.q6.U(xa1Var.d, org.telegram.ui.ActionBar.j6.f29070p7, null);
            xa1Var.E0(xa1Var.f53156s, xa1Var.f53154n, true);
            xa1Var.M0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.z(tL_error.text).intValue();
            if (intValue < 60) {
                G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
            } else {
                G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
            }
            xa1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G));
        } else {
            xa1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), tL_error.text);
        }
    }

    public static void f0(xa1 xa1Var) {
        ArrayList arrayList = xa1Var.K;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.e2) arrayList.get(i7)).removeSelfFromStack();
        }
        org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25548p0, new Object[0]);
        xa1Var.finishFragment();
    }

    public static void g0(xa1 xa1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            xa1Var.V = password;
            if (!TwoStepVerificationActivity.n0(password, false)) {
                org.telegram.ui.Components.t4.u0(xa1Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, null), true);
                return;
            }
            xa1Var.U = !TextUtils.isEmpty(xa1Var.V.email_unconfirmed_pattern);
            TwoStepVerificationActivity.r0(xa1Var.V);
            if (!xa1Var.T && xa1Var.Z) {
                TL_account.Password password2 = xa1Var.V;
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
                    if (!xa1Var.U && passwordKdfAlgo != null) {
                        org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25548p0, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        xa1Var.finishFragment();
                    }
                }
            }
            if (xa1Var.O) {
                xa1Var.B0();
                xa1Var.H0();
            }
            org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25554q0, xa1Var.V);
        }
    }

    public static void h0(xa1 xa1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            xa1Var.V = password;
            TwoStepVerificationActivity.r0(password);
            xa1Var.J0(z10);
            org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25554q0, xa1Var.V);
        }
    }

    public static void i0(xa1 xa1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String G;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = xa1Var.K;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(xa1Var.currentAccount).sendRequest(new TL_account.getPassword(), new hi.b3(11, xa1Var, z10), 8);
            return;
        }
        xa1Var.B0();
        int i7 = org.telegram.messenger.ns.f25548p0;
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            xa1Var.getMessagesController().k4(0L, "VALIDATE_PASSWORD");
            int i10 = org.telegram.messenger.ns.f25554q0;
            if (z10) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((org.telegram.ui.ActionBar.e2) arrayList.get(i11)).removeSelfFromStack();
                }
                org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25561r0, new Object[0]);
                org.telegram.messenger.ns.f(xa1Var.currentAccount).k(i10, new Object[0]);
                xa1Var.finishFragment();
            } else if (xa1Var.getParentActivity() != null) {
                if (xa1Var.V.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new xi0(26, xa1Var, bArr));
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    if (str == null && (password = xa1Var.V) != null && password.has_password) {
                        t1Var.U = org.telegram.messenger.hd.M0(2131742813, null);
                    } else {
                        t1Var.U = org.telegram.messenger.hd.M0(2131742804, null);
                    }
                    t1Var.S = org.telegram.messenger.hd.M0(2131742798, null);
                    Dialog showDialog = xa1Var.showDialog(t1Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    ((org.telegram.ui.ActionBar.e2) arrayList.get(i12)).removeSelfFromStack();
                }
                TL_account.Password password2 = xa1Var.V;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (xa1Var.Z) {
                    org.telegram.messenger.ns.f(xa1Var.currentAccount).k(i7, new Object[0]);
                }
                xa1 xa1Var2 = new xa1(7, xa1Var.V);
                xa1Var2.I = xa1Var.I;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = xa1Var.W;
                }
                xa1Var2.I0(bArr3, xa1Var.X, xa1Var.Y, xa1Var.f53139a0);
                xa1Var2.Z = xa1Var.Z;
                xa1Var2.H = xa1Var.H;
                xa1Var.presentFragment(xa1Var2, true);
                org.telegram.messenger.ns.f(xa1Var.currentAccount).k(i10, xa1Var.V);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.M0(2131747445, null));
                    return;
                } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.M0(2131751200, null));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.z(tL_error.text).intValue();
                    if (intValue < 60) {
                        G = org.telegram.messenger.hd.G(intValue, "Seconds", new Object[0]);
                    } else {
                        G = org.telegram.messenger.hd.G(intValue / 60, "Minutes", new Object[0]);
                    }
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), org.telegram.messenger.hd.a0("FloodWaitTime", null, 2131750686, G));
                    return;
                } else {
                    xa1Var.L0(org.telegram.messenger.hd.M0(2131689472, null), tL_error.text);
                    return;
                }
            }
            org.telegram.messenger.ns.f(xa1Var.currentAccount).k(i7, new Object[0]);
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((org.telegram.ui.ActionBar.e2) arrayList.get(i13)).removeSelfFromStack();
            }
            org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(xa1Var.currentAccount);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = xa1Var.V;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = xa1Var.S;
            f10.k(i7, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, xa1Var.R, str2, xa1Var.Q);
            TL_account.Password password4 = xa1Var.V;
            password4.email_unconfirmed_pattern = xa1Var.S;
            xa1 xa1Var3 = new xa1(5, password4);
            xa1Var3.I = xa1Var.I;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = xa1Var.W;
            }
            xa1Var3.I0(bArr2, xa1Var.X, xa1Var.Y, xa1Var.f53139a0);
            xa1Var3.Z = xa1Var.Z;
            xa1Var3.H = xa1Var.H;
            xa1Var.presentFragment(xa1Var3, true);
        }
    }

    public static void j0(xa1 xa1Var, TLRPC.TL_error tL_error) {
        xa1Var.B0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = xa1Var.V;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.A0(password, xa1Var.W, xa1Var.X, xa1Var.Y);
            twoStepVerificationActivity.Y = xa1Var.H;
            xa1Var.presentFragment(twoStepVerificationActivity, true);
            org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25561r0, new Object[0]);
            m90 m90Var = xa1Var.f53153k0;
            if (m90Var != null) {
                org.telegram.messenger.g0.h3(m90Var);
                xa1Var.f53153k0 = null;
            }
        }
    }

    public static void k0(xa1 xa1Var) {
        ArrayList arrayList = xa1Var.K;
        if (xa1Var.V.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new pa1(xa1Var, 4));
            boolean z10 = xa1Var.V.has_recovery;
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            if (z10) {
                t1Var.U = org.telegram.messenger.hd.M0(2131742814, null);
            } else {
                t1Var.U = org.telegram.messenger.hd.M0(2131742813, null);
            }
            t1Var.S = org.telegram.messenger.hd.M0(2131742798, null);
            Dialog showDialog = xa1Var.showDialog(t1Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((org.telegram.ui.ActionBar.e2) arrayList.get(i7)).removeSelfFromStack();
        }
        TL_account.Password password = xa1Var.V;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        xa1 xa1Var2 = new xa1(7, password);
        xa1Var2.I = xa1Var.I;
        xa1Var2.I0(xa1Var.W, xa1Var.X, xa1Var.Y, xa1Var.f53139a0);
        xa1Var2.K.addAll(arrayList);
        xa1Var2.Z = xa1Var.Z;
        xa1Var2.H = xa1Var.H;
        xa1Var.presentFragment(xa1Var2, true);
        org.telegram.messenger.ns f10 = org.telegram.messenger.ns.f(xa1Var.currentAccount);
        byte[] bArr = xa1Var.W;
        TL_account.Password password2 = xa1Var.V;
        f10.k(org.telegram.messenger.ns.f25548p0, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, xa1Var.S, xa1Var.R, null, xa1Var.Q);
        org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25554q0, xa1Var.V);
    }

    public static void l0(xa1 xa1Var, String str) {
        xa1 xa1Var2 = new xa1(xa1Var.currentAccount, 0, xa1Var.V);
        xa1Var2.I = xa1Var.I;
        xa1Var2.K.addAll(xa1Var.K);
        xa1Var2.K.add(xa1Var);
        xa1Var2.f53141b0 = str;
        xa1Var2.H = xa1Var.H;
        xa1Var.presentFragment(xa1Var2, true);
    }

    public static void m0(xa1 xa1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            xa1Var.V = password;
            TwoStepVerificationActivity.r0(password);
            org.telegram.messenger.ns.f(xa1Var.currentAccount).k(org.telegram.messenger.ns.f25554q0, xa1Var.V);
            xa1Var.H0();
        }
    }

    public static org.telegram.ui.ActionBar.k o0(xa1 xa1Var) {
        return xa1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k p0(xa1 xa1Var) {
        return xa1Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k y0(xa1 xa1Var) {
        return xa1Var.actionBar;
    }

    public final boolean A0() {
        int i7 = this.P;
        if ((i7 == 5 || i7 == 4) && !org.telegram.messenger.g0.Q1()) {
            Point point = org.telegram.messenger.g0.f23611q;
            if (point.x < point.y && !org.telegram.messenger.g0.C1()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void B0() {
        this.f53144d0.f(false, true);
    }

    public final void C0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f53144d0.f(true, true);
        }
    }

    public final void D0() {
        dr[] drVarArr;
        for (dr drVar : this.f53158x.f45485f) {
            drVar.setText("");
            drVar.A(1.0f);
        }
        this.f53158x.f45485f[0].requestFocus();
        org.telegram.messenger.g0.F3(8.0f, this.f53158x, new oa1(this, 6));
    }

    public final void E0(org.telegram.ui.Components.mb0 mb0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        org.telegram.messenger.g0.F3(5.0f, mb0Var, null);
    }

    public final void F0() {
        TL_account.Password password = this.V;
        if (!password.has_recovery) {
            xa1 xa1Var = new xa1(this.currentAccount, 3, password);
            xa1Var.I = this.I;
            xa1Var.I0(this.W, this.X, this.Y, this.f53139a0);
            xa1Var.Q = this.Q;
            xa1Var.R = this.R;
            xa1Var.K.addAll(this.K);
            xa1Var.K.add(this);
            xa1Var.Z = this.Z;
            xa1Var.H = this.H;
            presentFragment(xa1Var);
            return;
        }
        this.S = "";
        J0(false);
    }

    public final void H0() {
        if (getParentActivity() != null) {
            int i7 = 2;
            switch (this.P) {
                case 0:
                case 1:
                    if (this.f53154n.length() == 0) {
                        E0(this.f53156s, this.f53154n, false);
                        return;
                    } else if (!this.f53154n.getText().toString().equals(this.Q) && this.P == 1) {
                        org.telegram.messenger.g0.F3(5.0f, this.f53156s, null);
                        try {
                            this.f53156s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.hd.M0(2131747446, null), 0).show();
                            return;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    } else {
                        int i10 = this.currentAccount;
                        if (this.P == 0) {
                            i7 = 1;
                        }
                        xa1 xa1Var = new xa1(i10, i7, this.V);
                        xa1Var.I = this.I;
                        xa1Var.Q = this.f53154n.getText().toString();
                        xa1Var.I0(this.W, this.X, this.Y, this.f53139a0);
                        xa1Var.f53141b0 = this.f53141b0;
                        xa1Var.K.addAll(this.K);
                        xa1Var.K.add(this);
                        xa1Var.Z = this.Z;
                        xa1Var.H = this.H;
                        presentFragment(xa1Var);
                        return;
                    }
                case 2:
                    String obj = this.f53154n.getText().toString();
                    this.R = obj;
                    if (obj.equalsIgnoreCase(this.Q)) {
                        try {
                            Toast.makeText(getParentActivity(), org.telegram.messenger.hd.M0(2131747448, null), 0).show();
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                        }
                        E0(this.f53156s, this.f53154n, false);
                        return;
                    }
                    F0();
                    return;
                case 3:
                    if (!this.f53139a0 && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f53154n.getText().toString();
                    this.S = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            J0(false);
                            return;
                        }
                    }
                    E0(this.f53156s, this.f53154n, false);
                    return;
                case 4:
                    String code = this.f53158x.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new a31(6, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f53158x.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new qa1(this, 2), 10);
                    C0();
                    return;
                case 6:
                    TL_account.Password password = this.V;
                    if (password == null) {
                        C0();
                        this.O = true;
                        return;
                    }
                    xa1 xa1Var2 = new xa1(this.currentAccount, 0, password);
                    xa1Var2.I = this.I;
                    xa1Var2.Z = this.Z;
                    xa1Var2.H = this.H;
                    presentFragment(xa1Var2, true);
                    return;
                case 7:
                    if (this.Z) {
                        finishFragment();
                        return;
                    } else if (this.I) {
                        Bundle k10 = a8.p0.k("afterSignup", true);
                        je0 je0Var = new je0();
                        je0Var.r0(k10);
                        presentFragment(je0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.A0(this.V, this.W, this.X, this.Y);
                        twoStepVerificationActivity.Y = this.H;
                        presentFragment(twoStepVerificationActivity, true);
                        m90 m90Var = this.f53153k0;
                        if (m90Var != null) {
                            org.telegram.messenger.g0.h3(m90Var);
                            this.f53153k0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.V == null) {
                        C0();
                        this.O = true;
                        return;
                    }
                    String obj3 = this.f53154n.getText().toString();
                    if (obj3.length() == 0) {
                        E0(this.f53156s, this.f53154n, false);
                        return;
                    }
                    byte[] h12 = org.telegram.messenger.g0.h1(obj3);
                    C0();
                    Utilities.f22416e.c(new ra1(this, h12, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void I0(byte[] bArr, long j3, byte[] bArr2, boolean z10) {
        this.W = bArr;
        this.Y = bArr2;
        this.X = j3;
        this.f53139a0 = z10;
    }

    public final void J0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.U && this.V.has_password) {
            C0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new qa1(this, 3));
            return;
        }
        String str = this.Q;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            org.telegram.messenger.m10.i(this.currentAccount).u();
            this.Y = null;
            if (this.U) {
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
            if (this.R == null && (password = this.V) != null) {
                this.R = password.hint;
            }
            if (this.R == null) {
                this.R = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.R;
                passwordinputsettings.new_algo = this.V.new_algo;
            }
            if (this.S.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.S.trim();
            }
        }
        if (this.f53141b0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f53141b0;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.W;
            if (bArr == null || bArr.length == 0 || (z10 && this.U)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        C0();
        Utilities.f22416e.c(new ai.j(this, updatepasswordsettings3, z10, str, passwordinputsettings, 15));
    }

    public final void K0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xa1.K0(boolean):void");
    }

    public final void L0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = str;
        t1Var.U = str2;
        showDialog(t1Var);
    }

    public final void M0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f53140b.getTag() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 == z11) {
            return;
        }
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.f53140b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.J = new AnimatorSet();
        if (z10) {
            this.f53140b.setVisibility(0);
            AnimatorSet animatorSet2 = this.J;
            TextView textView2 = this.f53145e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.f53145e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.f53145e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f53140b, property, 1.0f), ObjectAnimator.ofFloat(this.f53140b, property2, 1.0f), ObjectAnimator.ofFloat(this.f53140b, property3, 1.0f));
        } else {
            this.f53145e.setVisibility(0);
            AnimatorSet animatorSet3 = this.J;
            TextView textView5 = this.f53140b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f53140b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f53140b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.f53145e, property4, 1.0f), ObjectAnimator.ofFloat(this.f53145e, property5, 1.0f), ObjectAnimator.ofFloat(this.f53145e, property6, 1.0f));
        }
        this.J.addListener(new z20(12, this, z10));
        this.J.setDuration(150L);
        this.J.start();
    }

    public final void N0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131742948, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.G(this.H, "ForceSetPasswordAlertMessageShort", new Object[0]);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131743933, null), null);
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131750594, null), new pa1(this, 0));
        org.telegram.ui.ActionBar.q6.U((TextView) alertDialog$Builder.p().d(-2), org.telegram.ui.ActionBar.j6.f29090q7, null);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        int i7;
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        ?? r12;
        ?? r92;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.l(kVar, 5, i13, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 1, i13, null);
        org.telegram.ui.ActionBar.q6.l(this.actionBar, 3, org.telegram.ui.ActionBar.j6.f29167u8, null);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new va1(this));
        int i14 = this.P;
        if (i14 == 5) {
            this.actionBar.s().a(0, 2131231244).g(1, org.telegram.messenger.hd.M0(2131754947, null));
        }
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, this.resourceProvider, false);
        this.f53144d0 = t00Var;
        this.f53143c0 = new h6.m(t00Var);
        this.f53144d0.setOnClickListener(new View.OnClickListener(this) {
            public final xa1 f48924b;

            {
                this.f48924b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15 = r2;
                xa1 xa1Var = this.f48924b;
                switch (i15) {
                    case 0:
                        xa1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new pa1(xa1Var, 1));
                        String M0 = org.telegram.messenger.hd.M0(2131746093, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131746074, null);
                        xa1Var.showDialog(t1Var);
                        return;
                    case 2:
                        xa1.a0(xa1Var);
                        return;
                    case 3:
                        if (xa1Var.h.getAlpha() >= 0.5f) {
                            int i16 = xa1Var.P;
                            if (i16 == 0) {
                                xa1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = xa1Var.f53141b0;
                                xa1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new qa1(xa1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xa1Var.getParentActivity());
                                String M02 = org.telegram.messenger.hd.M0(2131742815, null);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                t1Var2.U = M02;
                                t1Var2.S = org.telegram.messenger.hd.M0(2131742816, null);
                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131742817, null), new pa1(xa1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                xa1Var.showDialog(t1Var2);
                                TextView textView = (TextView) t1Var2.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                xa1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (xa1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = xa1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = xa1Var.H;
                            xa1Var.presentFragment(twoStepVerificationActivity, true);
                            m90 m90Var = xa1Var.f53153k0;
                            if (m90Var != null) {
                                org.telegram.messenger.g0.h3(m90Var);
                                xa1Var.f53153k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        xa1Var.H0();
                        return;
                    default:
                        int i17 = xa1Var.P;
                        xa1Var.N = true;
                        if (xa1Var.f53154n.getTransformationMethod() == null) {
                            xa1Var.f53154n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                xa1Var.f53149g0[3].P(-1);
                                org.telegram.ui.Components.ch0 animatedDrawable = xa1Var.f53138a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var = xa1Var.f53149g0[3];
                                if (animatedDrawable != ch0Var) {
                                    xa1Var.f53138a.setAnimation(ch0Var);
                                    xa1Var.f53149g0[3].N(18, false, false);
                                }
                                xa1Var.f53138a.d();
                            }
                        } else {
                            xa1Var.f53154n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                xa1Var.f53149g0[3].P(18);
                                org.telegram.ui.Components.ch0 animatedDrawable2 = xa1Var.f53138a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var2 = xa1Var.f53149g0[3];
                                if (animatedDrawable2 != ch0Var2) {
                                    xa1Var.f53138a.setAnimation(ch0Var2);
                                }
                                xa1Var.f53149g0[3].T(false, 0.0f);
                                xa1Var.f53138a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = xa1Var.f53154n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        xa1Var.N = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.y11 y11Var = new org.telegram.ui.Components.y11(context);
        this.f53146e0 = y11Var;
        y11Var.setTransformType(1);
        this.f53146e0.setProgress(0.0f);
        this.f53146e0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O9, false));
        this.f53146e0.setDrawBackground(false);
        this.f53144d0.setContentDescription(org.telegram.messenger.hd.M0(2131748250, null));
        this.f53144d0.addView(this.f53146e0, c8.ja.e(56, 56, 17));
        this.f53144d0.a(this.f53146e0);
        TextView textView = new TextView(context);
        this.h = textView;
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29049o6, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        h6.m.g(this.h);
        this.h.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final xa1 f48924b;

            {
                this.f48924b = this;
            }

            @Override
            public final void onClick(View view) {
                int i15 = r2;
                xa1 xa1Var = this.f48924b;
                switch (i15) {
                    case 0:
                        xa1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new pa1(xa1Var, 1));
                        String M0 = org.telegram.messenger.hd.M0(2131746093, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131746074, null);
                        xa1Var.showDialog(t1Var);
                        return;
                    case 2:
                        xa1.a0(xa1Var);
                        return;
                    case 3:
                        if (xa1Var.h.getAlpha() >= 0.5f) {
                            int i16 = xa1Var.P;
                            if (i16 == 0) {
                                xa1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = xa1Var.f53141b0;
                                xa1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new qa1(xa1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xa1Var.getParentActivity());
                                String M02 = org.telegram.messenger.hd.M0(2131742815, null);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                t1Var2.U = M02;
                                t1Var2.S = org.telegram.messenger.hd.M0(2131742816, null);
                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131742817, null), new pa1(xa1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                xa1Var.showDialog(t1Var2);
                                TextView textView2 = (TextView) t1Var2.d(-1);
                                if (textView2 != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                xa1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (xa1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = xa1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = xa1Var.H;
                            xa1Var.presentFragment(twoStepVerificationActivity, true);
                            m90 m90Var = xa1Var.f53153k0;
                            if (m90Var != null) {
                                org.telegram.messenger.g0.h3(m90Var);
                                xa1Var.f53153k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        xa1Var.H0();
                        return;
                    default:
                        int i17 = xa1Var.P;
                        xa1Var.N = true;
                        if (xa1Var.f53154n.getTransformationMethod() == null) {
                            xa1Var.f53154n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                xa1Var.f53149g0[3].P(-1);
                                org.telegram.ui.Components.ch0 animatedDrawable = xa1Var.f53138a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var = xa1Var.f53149g0[3];
                                if (animatedDrawable != ch0Var) {
                                    xa1Var.f53138a.setAnimation(ch0Var);
                                    xa1Var.f53149g0[3].N(18, false, false);
                                }
                                xa1Var.f53138a.d();
                            }
                        } else {
                            xa1Var.f53154n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                xa1Var.f53149g0[3].P(18);
                                org.telegram.ui.Components.ch0 animatedDrawable2 = xa1Var.f53138a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var2 = xa1Var.f53149g0[3];
                                if (animatedDrawable2 != ch0Var2) {
                                    xa1Var.f53138a.setAnimation(ch0Var2);
                                }
                                xa1Var.f53149g0[3].T(false, 0.0f);
                                xa1Var.f53138a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = xa1Var.f53154n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        xa1Var.N = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f53138a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i14 == 2 && org.telegram.messenger.g0.O1()) {
            this.f53138a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.fh0 fh0Var = this.f53138a;
            Point point = org.telegram.messenger.g0.f23611q;
            if (point.x > point.y) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            fh0Var.setVisibility(i7);
        }
        TextView textView2 = new TextView(context);
        this.f53142c = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, i13, null);
        this.f53142c.setGravity(1);
        this.f53142c.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f53142c.setTextSize(1, 24.0f);
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        int i15 = org.telegram.ui.ActionBar.j6.D6;
        org.telegram.ui.ActionBar.q6.U(lVar, i15, null);
        this.d.setGravity(1);
        this.d.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.f53145e = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, i15, null);
        this.f53145e.setGravity(1);
        this.f53145e.setTextSize(1, 14.0f);
        this.f53145e.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        this.f53145e.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
        this.f53145e.setVisibility(8);
        this.f53145e.setOnClickListener(new View.OnClickListener(this) {
            public final xa1 f48924b;

            {
                this.f48924b = this;
            }

            @Override
            public final void onClick(View view) {
                int i152 = r2;
                xa1 xa1Var = this.f48924b;
                switch (i152) {
                    case 0:
                        xa1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new pa1(xa1Var, 1));
                        String M0 = org.telegram.messenger.hd.M0(2131746093, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131746074, null);
                        xa1Var.showDialog(t1Var);
                        return;
                    case 2:
                        xa1.a0(xa1Var);
                        return;
                    case 3:
                        if (xa1Var.h.getAlpha() >= 0.5f) {
                            int i16 = xa1Var.P;
                            if (i16 == 0) {
                                xa1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = xa1Var.f53141b0;
                                xa1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new qa1(xa1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xa1Var.getParentActivity());
                                String M02 = org.telegram.messenger.hd.M0(2131742815, null);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                t1Var2.U = M02;
                                t1Var2.S = org.telegram.messenger.hd.M0(2131742816, null);
                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131742817, null), new pa1(xa1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                xa1Var.showDialog(t1Var2);
                                TextView textView22 = (TextView) t1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView22, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                xa1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (xa1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = xa1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = xa1Var.H;
                            xa1Var.presentFragment(twoStepVerificationActivity, true);
                            m90 m90Var = xa1Var.f53153k0;
                            if (m90Var != null) {
                                org.telegram.messenger.g0.h3(m90Var);
                                xa1Var.f53153k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        xa1Var.H0();
                        return;
                    default:
                        int i17 = xa1Var.P;
                        xa1Var.N = true;
                        if (xa1Var.f53154n.getTransformationMethod() == null) {
                            xa1Var.f53154n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                xa1Var.f53149g0[3].P(-1);
                                org.telegram.ui.Components.ch0 animatedDrawable = xa1Var.f53138a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var = xa1Var.f53149g0[3];
                                if (animatedDrawable != ch0Var) {
                                    xa1Var.f53138a.setAnimation(ch0Var);
                                    xa1Var.f53149g0[3].N(18, false, false);
                                }
                                xa1Var.f53138a.d();
                            }
                        } else {
                            xa1Var.f53154n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                xa1Var.f53149g0[3].P(18);
                                org.telegram.ui.Components.ch0 animatedDrawable2 = xa1Var.f53138a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var2 = xa1Var.f53149g0[3];
                                if (animatedDrawable2 != ch0Var2) {
                                    xa1Var.f53138a.setAnimation(ch0Var2);
                                }
                                xa1Var.f53149g0[3].T(false, 0.0f);
                                xa1Var.f53138a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = xa1Var.f53154n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        xa1Var.N = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f53140b = textView4;
        textView4.setMinWidth(org.telegram.messenger.g0.L(220.0f));
        this.f53140b.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        this.f53140b.setGravity(17);
        org.telegram.ui.ActionBar.q6.U(this.f53140b, org.telegram.ui.ActionBar.j6.Ji, null);
        this.f53140b.setTextSize(1, 15.0f);
        this.f53140b.setTypeface(org.telegram.messenger.g0.o());
        this.f53140b.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 24.0f));
        this.f53140b.setOnClickListener(new View.OnClickListener(this) {
            public final xa1 f48924b;

            {
                this.f48924b = this;
            }

            @Override
            public final void onClick(View view) {
                int i152 = r2;
                xa1 xa1Var = this.f48924b;
                switch (i152) {
                    case 0:
                        xa1Var.H0();
                        return;
                    case 1:
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new pa1(xa1Var, 1));
                        String M0 = org.telegram.messenger.hd.M0(2131746093, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        t1Var.U = org.telegram.messenger.hd.M0(2131746074, null);
                        xa1Var.showDialog(t1Var);
                        return;
                    case 2:
                        xa1.a0(xa1Var);
                        return;
                    case 3:
                        if (xa1Var.h.getAlpha() >= 0.5f) {
                            int i16 = xa1Var.P;
                            if (i16 == 0) {
                                xa1Var.C0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = xa1Var.f53141b0;
                                xa1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new qa1(xa1Var, 1));
                                return;
                            } else if (i16 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xa1Var.getParentActivity());
                                String M02 = org.telegram.messenger.hd.M0(2131742815, null);
                                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                t1Var2.U = M02;
                                t1Var2.S = org.telegram.messenger.hd.M0(2131742816, null);
                                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131742817, null), new pa1(xa1Var, 2));
                                alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                xa1Var.showDialog(t1Var2);
                                TextView textView22 = (TextView) t1Var2.d(-1);
                                if (textView22 != null) {
                                    org.telegram.ui.ActionBar.q6.U(textView22, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                    return;
                                }
                                return;
                            } else if (i16 == 2) {
                                xa1Var.F0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        if (xa1Var.P == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.X = true;
                            twoStepVerificationActivity.J = xa1Var.V;
                            twoStepVerificationActivity.K = false;
                            twoStepVerificationActivity.Y = xa1Var.H;
                            xa1Var.presentFragment(twoStepVerificationActivity, true);
                            m90 m90Var = xa1Var.f53153k0;
                            if (m90Var != null) {
                                org.telegram.messenger.g0.h3(m90Var);
                                xa1Var.f53153k0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        xa1Var.H0();
                        return;
                    default:
                        int i17 = xa1Var.P;
                        xa1Var.N = true;
                        if (xa1Var.f53154n.getTransformationMethod() == null) {
                            xa1Var.f53154n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Oe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                xa1Var.f53149g0[3].P(-1);
                                org.telegram.ui.Components.ch0 animatedDrawable = xa1Var.f53138a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var = xa1Var.f53149g0[3];
                                if (animatedDrawable != ch0Var) {
                                    xa1Var.f53138a.setAnimation(ch0Var);
                                    xa1Var.f53149g0[3].N(18, false, false);
                                }
                                xa1Var.f53138a.d();
                            }
                        } else {
                            xa1Var.f53154n.setTransformationMethod(null);
                            org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Pe, null, PorterDuff.Mode.MULTIPLY);
                            if (i17 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                xa1Var.f53149g0[3].P(18);
                                org.telegram.ui.Components.ch0 animatedDrawable2 = xa1Var.f53138a.getAnimatedDrawable();
                                org.telegram.ui.Components.ch0 ch0Var2 = xa1Var.f53149g0[3];
                                if (animatedDrawable2 != ch0Var2) {
                                    xa1Var.f53138a.setAnimation(ch0Var2);
                                }
                                xa1Var.f53149g0[3].T(false, 0.0f);
                                xa1Var.f53138a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = xa1Var.f53154n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        xa1Var.N = false;
                        return;
                }
            }
        });
        if (i14 != 6 && i14 != 7 && i14 != 9) {
            this.f53142c.setTypeface(org.telegram.messenger.g0.o());
            this.f53142c.setTextSize(1, 18.0f);
        } else {
            this.f53142c.setTypeface(Typeface.DEFAULT);
            this.f53142c.setTextSize(1, 24.0f);
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
                ii0 ii0Var = new ii0(this, context, k0Var, 1);
                ii0Var.addView(k0Var);
                q9 q9Var = new q9(this, context, ii0Var);
                wa1 wa1Var = new wa1(this, context);
                this.f53159y = wa1Var;
                wa1Var.setVerticalScrollBarEnabled(false);
                k0Var.addView(this.f53159y, c8.ja.c(-1.0f, -1));
                k0Var.addView(this.h, c8.ja.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                k0Var.addView(this.f53144d0, org.telegram.ui.Components.t00.b());
                q9Var.addView(ii0Var, c8.ja.c(-1.0f, -1));
                z51 z51Var = new z51(23, context, this);
                z51Var.setOrientation(1);
                this.f53159y.addView(z51Var, c8.ja.x(-1, -1, 51));
                z51Var.addView(this.f53138a, c8.ja.t(-2, -2, 49, 0, 69, 0, 0));
                z51Var.addView(this.f53142c, c8.ja.t(-2, -2, 49, 0, 8, 0, 0));
                z51Var.addView(this.d, c8.ja.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.mb0 mb0Var = new org.telegram.ui.Components.mb0(context, null);
                this.f53156s = mb0Var;
                mb0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f53154n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int L = org.telegram.messenger.g0.L(16.0f);
                this.f53154n.setPadding(L, L, L, L);
                EditTextBoldCursor editTextBoldCursor2 = this.f53154n;
                int i16 = org.telegram.ui.ActionBar.j6.f28996l6;
                org.telegram.ui.ActionBar.q6.v(editTextBoldCursor2, i16, null);
                org.telegram.ui.ActionBar.q6.U(this.f53154n, i13, null);
                this.f53154n.setBackground(null);
                this.f53154n.setMaxLines(1);
                this.f53154n.setLines(1);
                this.f53154n.setGravity(3);
                this.f53154n.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.f53154n.setSingleLine(true);
                this.f53154n.setCursorWidth(1.5f);
                this.f53154n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final xa1 f49192b;

                    {
                        this.f49192b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i17, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                xa1 xa1Var = this.f49192b;
                                xa1Var.getClass();
                                if (i17 != 5 && i17 != 6) {
                                    return false;
                                }
                                xa1Var.H0();
                                return true;
                            default:
                                xa1 xa1Var2 = this.f49192b;
                                xa1Var2.getClass();
                                if (i17 != 5 && i17 != 6) {
                                    return false;
                                }
                                if (xa1Var2.f53157w.getVisibility() == 0) {
                                    xa1Var2.f53155r.requestFocus();
                                } else {
                                    xa1Var2.H0();
                                }
                                return true;
                        }
                    }
                });
                this.f53156s.e(this.f53154n);
                this.f53154n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final xa1 f49532b;

                    {
                        this.f49532b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z12) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.mb0 mb0Var2 = this.f49532b.f53157w;
                                if (z12) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                mb0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                xa1 xa1Var = this.f49532b;
                                if (z12) {
                                    xa1Var.f53148f0.setEditText((EditText) view);
                                    xa1Var.f53148f0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                xa1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.mb0 mb0Var3 = this.f49532b.f53156s;
                                if (z12) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                mb0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f53154n, c8.ja.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(4, context, this);
                this.F = f0Var;
                f0Var.setImageResource(2131232225);
                this.F.setScaleType(scaleType);
                this.F.setContentDescription(org.telegram.messenger.hd.M0(2131743932, null));
                org.telegram.ui.ActionBar.f0 f0Var2 = this.F;
                int i17 = org.telegram.ui.ActionBar.j6.f28941i6;
                org.telegram.ui.ActionBar.q6.Q(f0Var2, org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i17, false), 1, -1), null, org.telegram.ui.ActionBar.q6.M(i17), null);
                org.telegram.ui.ActionBar.q6.s(this.F, org.telegram.ui.ActionBar.j6.Oe, null, PorterDuff.Mode.MULTIPLY);
                org.telegram.messenger.g0.Y3(this.F, false, 0.1f, true, false);
                this.F.setOnClickListener(new View.OnClickListener(this) {
                    public final xa1 f48924b;

                    {
                        this.f48924b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i152 = r2;
                        xa1 xa1Var = this.f48924b;
                        switch (i152) {
                            case 0:
                                xa1Var.H0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new pa1(xa1Var, 1));
                                String M0 = org.telegram.messenger.hd.M0(2131746093, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                t1Var.S = M0;
                                t1Var.U = org.telegram.messenger.hd.M0(2131746074, null);
                                xa1Var.showDialog(t1Var);
                                return;
                            case 2:
                                xa1.a0(xa1Var);
                                return;
                            case 3:
                                if (xa1Var.h.getAlpha() >= 0.5f) {
                                    int i162 = xa1Var.P;
                                    if (i162 == 0) {
                                        xa1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = xa1Var.f53141b0;
                                        xa1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new qa1(xa1Var, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xa1Var.getParentActivity());
                                        String M02 = org.telegram.messenger.hd.M0(2131742815, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                        t1Var2.U = M02;
                                        t1Var2.S = org.telegram.messenger.hd.M0(2131742816, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131742817, null), new pa1(xa1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        xa1Var.showDialog(t1Var2);
                                        TextView textView22 = (TextView) t1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.q6.U(textView22, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i162 == 2) {
                                        xa1Var.F0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                if (xa1Var.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = xa1Var.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = xa1Var.H;
                                    xa1Var.presentFragment(twoStepVerificationActivity, true);
                                    m90 m90Var = xa1Var.f53153k0;
                                    if (m90Var != null) {
                                        org.telegram.messenger.g0.h3(m90Var);
                                        xa1Var.f53153k0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                xa1Var.H0();
                                return;
                            default:
                                int i172 = xa1Var.P;
                                xa1Var.N = true;
                                if (xa1Var.f53154n.getTransformationMethod() == null) {
                                    xa1Var.f53154n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                        xa1Var.f53149g0[3].P(-1);
                                        org.telegram.ui.Components.ch0 animatedDrawable = xa1Var.f53138a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ch0 ch0Var = xa1Var.f53149g0[3];
                                        if (animatedDrawable != ch0Var) {
                                            xa1Var.f53138a.setAnimation(ch0Var);
                                            xa1Var.f53149g0[3].N(18, false, false);
                                        }
                                        xa1Var.f53138a.d();
                                    }
                                } else {
                                    xa1Var.f53154n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Pe, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                        xa1Var.f53149g0[3].P(18);
                                        org.telegram.ui.Components.ch0 animatedDrawable2 = xa1Var.f53138a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ch0 ch0Var2 = xa1Var.f53149g0[3];
                                        if (animatedDrawable2 != ch0Var2) {
                                            xa1Var.f53138a.setAnimation(ch0Var2);
                                        }
                                        xa1Var.f53149g0[3].T(false, 0.0f);
                                        xa1Var.f53138a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = xa1Var.f53154n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                xa1Var.N = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.F, c8.ja.t(24, 24, 16, 0, 0, 16, 0));
                this.f53154n.addTextChangedListener(new ua1(this, 2));
                this.f53156s.addView(linearLayout, c8.ja.c(-2.0f, -1));
                z51Var.addView(this.f53156s, c8.ja.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.f53157w = new org.telegram.ui.Components.mb0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f53155r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int L2 = org.telegram.messenger.g0.L(16.0f);
                this.f53155r.setPadding(L2, L2, L2, L2);
                org.telegram.ui.ActionBar.q6.v(this.f53155r, i16, null);
                org.telegram.ui.ActionBar.q6.U(this.f53155r, i13, null);
                this.f53155r.setBackground(null);
                this.f53155r.setMaxLines(1);
                this.f53155r.setLines(1);
                this.f53155r.setGravity(3);
                this.f53155r.setCursorSize(org.telegram.messenger.g0.L(20.0f));
                this.f53155r.setSingleLine(true);
                this.f53155r.setCursorWidth(1.5f);
                this.f53155r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final xa1 f49192b;

                    {
                        this.f49192b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i172, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                xa1 xa1Var = this.f49192b;
                                xa1Var.getClass();
                                if (i172 != 5 && i172 != 6) {
                                    return false;
                                }
                                xa1Var.H0();
                                return true;
                            default:
                                xa1 xa1Var2 = this.f49192b;
                                xa1Var2.getClass();
                                if (i172 != 5 && i172 != 6) {
                                    return false;
                                }
                                if (xa1Var2.f53157w.getVisibility() == 0) {
                                    xa1Var2.f53155r.requestFocus();
                                } else {
                                    xa1Var2.H0();
                                }
                                return true;
                        }
                    }
                });
                this.f53157w.e(this.f53155r);
                this.f53155r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final xa1 f49532b;

                    {
                        this.f49532b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z12) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.mb0 mb0Var2 = this.f49532b.f53157w;
                                if (z12) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                mb0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                xa1 xa1Var = this.f49532b;
                                if (z12) {
                                    xa1Var.f53148f0.setEditText((EditText) view);
                                    xa1Var.f53148f0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                xa1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.mb0 mb0Var3 = this.f49532b.f53156s;
                                if (z12) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                mb0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                this.f53157w.addView(this.f53155r, c8.ja.c(-2.0f, -1));
                z51Var.addView(this.f53157w, c8.ja.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.f53157w.setVisibility(8);
                org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(context);
                this.f53148f0 = irVar;
                irVar.setVisibility(8);
                ii0Var.addView(this.f53148f0);
                lb0 lb0Var = new lb0(3, context, this);
                this.f53158x = lb0Var;
                final int i18 = 1;
                lb0Var.b(6, 1);
                dr[] drVarArr = this.f53158x.f45485f;
                int length = drVarArr.length;
                int i19 = 0;
                while (i19 < length) {
                    dr drVar = drVarArr[i19];
                    drVar.setShowSoftInputOnFocusCompat(A0() ^ i18);
                    drVar.addTextChangedListener(new ua1(this, 0));
                    drVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final xa1 f49532b;

                        {
                            this.f49532b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z12) {
                            float f10;
                            float f11;
                            switch (i18) {
                                case 0:
                                    org.telegram.ui.Components.mb0 mb0Var2 = this.f49532b.f53157w;
                                    if (z12) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    mb0Var2.b(f10, f10, true);
                                    return;
                                case 1:
                                    xa1 xa1Var = this.f49532b;
                                    if (z12) {
                                        xa1Var.f53148f0.setEditText((EditText) view);
                                        xa1Var.f53148f0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    xa1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.mb0 mb0Var3 = this.f49532b.f53156s;
                                    if (z12) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    mb0Var3.b(f11, f11, true);
                                    return;
                            }
                        }
                    });
                    i19++;
                    i18 = 1;
                }
                this.f53158x.setVisibility(8);
                z51Var.addView(this.f53158x, c8.ja.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                z51Var.addView(frameLayout, c8.ja.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.f53145e, c8.ja.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f53147f = textView5;
                    org.telegram.ui.ActionBar.q6.U(textView5, org.telegram.ui.ActionBar.j6.J6, null);
                    this.f53147f.setGravity(1);
                    this.f53147f.setTextSize(1, 14.0f);
                    this.f53147f.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                    this.f53147f.setPadding(org.telegram.messenger.g0.L(32.0f), 0, org.telegram.messenger.g0.L(32.0f), 0);
                    this.f53147f.setText(org.telegram.messenger.hd.M0(2131746076, null));
                    z51Var.addView(this.f53147f, c8.ja.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f53147f.setOnClickListener(new View.OnClickListener(this) {
                        public final xa1 f48924b;

                        {
                            this.f48924b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            int i152 = r2;
                            xa1 xa1Var = this.f48924b;
                            switch (i152) {
                                case 0:
                                    xa1Var.H0();
                                    return;
                                case 1:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new pa1(xa1Var, 1));
                                    String M0 = org.telegram.messenger.hd.M0(2131746093, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                    t1Var.S = M0;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131746074, null);
                                    xa1Var.showDialog(t1Var);
                                    return;
                                case 2:
                                    xa1.a0(xa1Var);
                                    return;
                                case 3:
                                    if (xa1Var.h.getAlpha() >= 0.5f) {
                                        int i162 = xa1Var.P;
                                        if (i162 == 0) {
                                            xa1Var.C0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = xa1Var.f53141b0;
                                            xa1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new qa1(xa1Var, 1));
                                            return;
                                        } else if (i162 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xa1Var.getParentActivity());
                                            String M02 = org.telegram.messenger.hd.M0(2131742815, null);
                                            org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                            t1Var2.U = M02;
                                            t1Var2.S = org.telegram.messenger.hd.M0(2131742816, null);
                                            alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131742817, null), new pa1(xa1Var, 2));
                                            alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                            xa1Var.showDialog(t1Var2);
                                            TextView textView22 = (TextView) t1Var2.d(-1);
                                            if (textView22 != null) {
                                                org.telegram.ui.ActionBar.q6.U(textView22, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                                return;
                                            }
                                            return;
                                        } else if (i162 == 2) {
                                            xa1Var.F0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    if (xa1Var.P == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.X = true;
                                        twoStepVerificationActivity.J = xa1Var.V;
                                        twoStepVerificationActivity.K = false;
                                        twoStepVerificationActivity.Y = xa1Var.H;
                                        xa1Var.presentFragment(twoStepVerificationActivity, true);
                                        m90 m90Var = xa1Var.f53153k0;
                                        if (m90Var != null) {
                                            org.telegram.messenger.g0.h3(m90Var);
                                            xa1Var.f53153k0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    xa1Var.H0();
                                    return;
                                default:
                                    int i172 = xa1Var.P;
                                    xa1Var.N = true;
                                    if (xa1Var.f53154n.getTransformationMethod() == null) {
                                        xa1Var.f53154n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Oe, null, PorterDuff.Mode.MULTIPLY);
                                        if (i172 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                            xa1Var.f53149g0[3].P(-1);
                                            org.telegram.ui.Components.ch0 animatedDrawable = xa1Var.f53138a.getAnimatedDrawable();
                                            org.telegram.ui.Components.ch0 ch0Var = xa1Var.f53149g0[3];
                                            if (animatedDrawable != ch0Var) {
                                                xa1Var.f53138a.setAnimation(ch0Var);
                                                xa1Var.f53149g0[3].N(18, false, false);
                                            }
                                            xa1Var.f53138a.d();
                                        }
                                    } else {
                                        xa1Var.f53154n.setTransformationMethod(null);
                                        org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Pe, null, PorterDuff.Mode.MULTIPLY);
                                        if (i172 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                            xa1Var.f53149g0[3].P(18);
                                            org.telegram.ui.Components.ch0 animatedDrawable2 = xa1Var.f53138a.getAnimatedDrawable();
                                            org.telegram.ui.Components.ch0 ch0Var2 = xa1Var.f53149g0[3];
                                            if (animatedDrawable2 != ch0Var2) {
                                                xa1Var.f53138a.setAnimation(ch0Var2);
                                            }
                                            xa1Var.f53149g0[3].T(false, 0.0f);
                                            xa1Var.f53138a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = xa1Var.f53154n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    xa1Var.N = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = q9Var;
                hi.n5 n5Var = new hi.n5(this, context);
                this.E = n5Var;
                n5Var.setAlpha(0.0f);
                q9Var.addView(this.E);
                q9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.M = radialProgressView;
                radialProgressView.setSize(org.telegram.messenger.g0.L(20.0f));
                this.M.setAlpha(0.0f);
                this.M.setScaleX(0.1f);
                this.M.setScaleY(0.1f);
                this.M.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28996l6, false));
                k0Var.addView(this.M, c8.ja.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                e eVar = new e(1, context, this);
                eVar.setOnTouchListener(new gi.a(2));
                eVar.addView(this.actionBar);
                eVar.addView(this.f53138a);
                eVar.addView(this.f53142c);
                eVar.addView(this.d);
                eVar.addView(this.f53140b);
                this.fragmentView = eVar;
                break;
        }
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, this.fragmentView, null);
        String str = "";
        switch (i14) {
            case 0:
            case 1:
                int i20 = 2131746413;
                if (this.V.has_password) {
                    this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747211, null));
                    this.f53142c.setText(org.telegram.messenger.hd.M0(2131747211, null));
                } else {
                    if (i14 == 0) {
                        i10 = 2131751705;
                    } else {
                        i10 = 2131746413;
                    }
                    String M0 = org.telegram.messenger.hd.M0(i10, null);
                    this.actionBar.setTitle(M0);
                    this.f53142c.setText(M0);
                }
                if (!TextUtils.isEmpty(this.f53141b0)) {
                    this.h.setVisibility(0);
                    this.h.setText(org.telegram.messenger.hd.M0(2131742817, null));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.mb0 mb0Var2 = this.f53156s;
                if (i14 == 0) {
                    i11 = 2131751116;
                } else {
                    i11 = 2131746413;
                }
                mb0Var2.setText(org.telegram.messenger.hd.M0(i11, null));
                EditTextBoldCursor editTextBoldCursor4 = this.f53154n;
                if (i14 == 0) {
                    i20 = 2131751116;
                }
                editTextBoldCursor4.setContentDescription(org.telegram.messenger.hd.M0(i20, null));
                this.f53154n.setImeOptions(268435461);
                this.f53154n.setInputType(129);
                this.f53154n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f53154n.setTypeface(Typeface.DEFAULT);
                if (i14 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.G = z10;
                org.telegram.messenger.g0.Y3(this.F, false, 0.1f, true, false);
                org.telegram.ui.Components.ch0[] ch0VarArr = new org.telegram.ui.Components.ch0[7];
                this.f53149g0 = ch0VarArr;
                ch0VarArr[0] = new org.telegram.ui.Components.ch0(2131624310, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f53149g0[1] = new org.telegram.ui.Components.ch0(2131624311, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f53149g0[2] = new org.telegram.ui.Components.ch0(2131624303, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f53149g0[3] = new org.telegram.ui.Components.ch0(2131624312, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f53149g0[4] = new org.telegram.ui.Components.ch0(2131624309, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f53149g0[5] = new org.telegram.ui.Components.ch0(2131624308, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                this.f53149g0[6] = new org.telegram.ui.Components.ch0(2131624313, org.telegram.messenger.g0.L(120.0f), org.telegram.messenger.g0.L(120.0f), true, null);
                org.telegram.ui.Components.ch0 ch0Var = this.f53149g0[6];
                ch0Var.h = true;
                ch0Var.P(19);
                this.f53149g0[2].S(97, this.f53152j0);
                K0(true);
                if (i14 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    oa1 oa1Var = this.f53150h0;
                    if (oa1Var != null) {
                        org.telegram.messenger.g0.r(oa1Var);
                    }
                    this.f53138a.setAnimation(this.f53149g0[6]);
                    this.f53138a.d();
                    i12 = 1;
                    break;
                } else {
                    EditTextBoldCursor editTextBoldCursor5 = this.f53154n;
                    ArrayList arrayList = editTextBoldCursor5.f32519g1;
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
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747444, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(org.telegram.messenger.hd.M0(2131742817, null));
                this.f53142c.setText(org.telegram.messenger.hd.M0(2131747444, null));
                this.d.setText(org.telegram.messenger.hd.M0(2131747443, null));
                this.d.setVisibility(0);
                this.f53156s.setText(org.telegram.messenger.hd.M0(2131747442, null));
                this.f53154n.setContentDescription(org.telegram.messenger.hd.M0(2131747442, null));
                this.f53154n.setImeOptions(268435461);
                this.f53157w.setVisibility(8);
                this.f53138a.f(2131624305, 120, 120, null);
                this.f53138a.d();
                i12 = 1;
                break;
            case 3:
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131746344, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.f53139a0) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    r12 = 0;
                    this.h.setText(org.telegram.messenger.hd.M0(2131742817, null));
                } else {
                    r12 = 0;
                }
                this.f53142c.setText(org.telegram.messenger.hd.M0(2131746344, r12));
                this.d.setText(org.telegram.messenger.hd.M0(2131746345, r12));
                this.d.setVisibility(0);
                this.f53156s.setText(org.telegram.messenger.hd.M0(2131747376, r12));
                this.f53154n.setContentDescription(org.telegram.messenger.hd.M0(2131747376, r12));
                this.f53154n.setImeOptions(268435461);
                this.f53154n.setInputType(33);
                this.f53157w.setVisibility(8);
                this.f53138a.f(2131624304, 120, 120, r12);
                this.f53138a.d();
                i12 = 1;
                break;
            case 4:
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747437, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f53142c.setText(org.telegram.messenger.hd.M0(2131747437, null));
                this.f53148f0.setVisibility(0);
                this.f53156s.setVisibility(8);
                String str2 = this.V.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj2 = new Object();
                    obj2.f41487a |= 256;
                    obj2.f41488b = indexOf;
                    int i22 = lastIndexOf + 1;
                    obj2.f41489c = i22;
                    r92 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.xy0(obj2, 0), indexOf, i22, 0);
                } else {
                    r92 = 0;
                }
                xh.l lVar2 = this.d;
                String M02 = org.telegram.messenger.hd.M0(2131746080, null);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r92] = valueOf;
                lVar2.setText(org.telegram.messenger.g0.m0(M02, charSequenceArr));
                this.d.setVisibility(r92);
                this.f53144d0.e(r92, r92);
                this.f53158x.setVisibility(r92);
                this.f53138a.f(2131624307, 120, 120, null);
                this.f53138a.d();
                i12 = 1;
                break;
            case 5:
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131743619, null));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f53142c.setText(org.telegram.messenger.hd.M0(2131743619, null));
                this.f53156s.setVisibility(8);
                this.f53148f0.setVisibility(0);
                xh.l lVar3 = this.d;
                String str3 = this.V.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                lVar3.setText(org.telegram.messenger.hd.a0("EmailPasswordConfirmText2", null, 2131751199, str));
                this.d.setVisibility(0);
                this.f53144d0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(org.telegram.messenger.hd.M0(2131746121, null));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final xa1 f48924b;

                    {
                        this.f48924b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        int i152 = r2;
                        xa1 xa1Var = this.f48924b;
                        switch (i152) {
                            case 0:
                                xa1Var.H0();
                                return;
                            case 1:
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xa1Var.getParentActivity());
                                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746118, null), new pa1(xa1Var, 1));
                                String M03 = org.telegram.messenger.hd.M0(2131746093, null);
                                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                t1Var.S = M03;
                                t1Var.U = org.telegram.messenger.hd.M0(2131746074, null);
                                xa1Var.showDialog(t1Var);
                                return;
                            case 2:
                                xa1.a0(xa1Var);
                                return;
                            case 3:
                                if (xa1Var.h.getAlpha() >= 0.5f) {
                                    int i162 = xa1Var.P;
                                    if (i162 == 0) {
                                        xa1Var.C0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = xa1Var.f53141b0;
                                        xa1Var.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new qa1(xa1Var, 1));
                                        return;
                                    } else if (i162 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xa1Var.getParentActivity());
                                        String M022 = org.telegram.messenger.hd.M0(2131742815, null);
                                        org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                                        t1Var2.U = M022;
                                        t1Var2.S = org.telegram.messenger.hd.M0(2131742816, null);
                                        alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131742817, null), new pa1(xa1Var, 2));
                                        alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                        xa1Var.showDialog(t1Var2);
                                        TextView textView22 = (TextView) t1Var2.d(-1);
                                        if (textView22 != null) {
                                            org.telegram.ui.ActionBar.q6.U(textView22, org.telegram.ui.ActionBar.j6.f29090q7, null);
                                            return;
                                        }
                                        return;
                                    } else if (i162 == 2) {
                                        xa1Var.F0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                if (xa1Var.P == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.X = true;
                                    twoStepVerificationActivity.J = xa1Var.V;
                                    twoStepVerificationActivity.K = false;
                                    twoStepVerificationActivity.Y = xa1Var.H;
                                    xa1Var.presentFragment(twoStepVerificationActivity, true);
                                    m90 m90Var = xa1Var.f53153k0;
                                    if (m90Var != null) {
                                        org.telegram.messenger.g0.h3(m90Var);
                                        xa1Var.f53153k0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                xa1Var.H0();
                                return;
                            default:
                                int i172 = xa1Var.P;
                                xa1Var.N = true;
                                if (xa1Var.f53154n.getTransformationMethod() == null) {
                                    xa1Var.f53154n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Oe, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                        xa1Var.f53149g0[3].P(-1);
                                        org.telegram.ui.Components.ch0 animatedDrawable = xa1Var.f53138a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ch0 ch0Var2 = xa1Var.f53149g0[3];
                                        if (animatedDrawable != ch0Var2) {
                                            xa1Var.f53138a.setAnimation(ch0Var2);
                                            xa1Var.f53149g0[3].N(18, false, false);
                                        }
                                        xa1Var.f53138a.d();
                                    }
                                } else {
                                    xa1Var.f53154n.setTransformationMethod(null);
                                    org.telegram.ui.ActionBar.q6.s(xa1Var.F, org.telegram.ui.ActionBar.j6.Pe, null, PorterDuff.Mode.MULTIPLY);
                                    if (i172 == 0 && xa1Var.f53154n.length() > 0 && xa1Var.f53154n.hasFocus()) {
                                        xa1Var.f53149g0[3].P(18);
                                        org.telegram.ui.Components.ch0 animatedDrawable2 = xa1Var.f53138a.getAnimatedDrawable();
                                        org.telegram.ui.Components.ch0 ch0Var22 = xa1Var.f53149g0[3];
                                        if (animatedDrawable2 != ch0Var22) {
                                            xa1Var.f53138a.setAnimation(ch0Var22);
                                        }
                                        xa1Var.f53149g0[3].T(false, 0.0f);
                                        xa1Var.f53138a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = xa1Var.f53154n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                xa1Var.N = false;
                                return;
                        }
                    }
                });
                this.f53158x.setVisibility(0);
                this.f53138a.f(2131624307, 120, 120, null);
                this.f53138a.d();
                i12 = 1;
                break;
            case 6:
                this.f53142c.setText(org.telegram.messenger.hd.M0(2131743931, null));
                this.d.setText(org.telegram.messenger.hd.M0(2131745548, null));
                this.f53140b.setText(org.telegram.messenger.hd.M0(2131743933, null));
                this.d.setVisibility(0);
                this.f53138a.f(2131624306, 140, 140, null);
                this.f53138a.d();
                i12 = 1;
                break;
            case 7:
                this.f53142c.setText(org.telegram.messenger.hd.M0(2131743935, null));
                this.d.setText(org.telegram.messenger.hd.M0(2131743934, null));
                if (this.Z) {
                    this.f53140b.setText(org.telegram.messenger.hd.M0(2131743937, null));
                } else if (this.I) {
                    this.f53140b.setText(org.telegram.messenger.hd.M0(2131751771, null));
                } else {
                    this.f53140b.setText(org.telegram.messenger.hd.M0(2131743936, null));
                }
                this.d.setVisibility(0);
                this.f53138a.f(2131624354, 160, 160, null);
                this.f53138a.d();
                i12 = 1;
                break;
            case 8:
                this.actionBar.setTitle(org.telegram.messenger.hd.M0(2131747217, null));
                this.f53142c.setText(org.telegram.messenger.hd.M0(2131747217, null));
                this.d.setText(org.telegram.messenger.hd.M0(2131752160, null));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f53145e.setText(org.telegram.messenger.hd.M0(2131750591, null));
                org.telegram.ui.ActionBar.q6.U(this.f53145e, org.telegram.ui.ActionBar.j6.f29049o6, null);
                this.f53156s.setText(org.telegram.messenger.hd.M0(2131748726, null));
                this.f53154n.setContentDescription(org.telegram.messenger.hd.M0(2131748726, null));
                this.f53154n.setImeOptions(268435462);
                this.f53154n.setInputType(129);
                this.f53154n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f53154n.setTypeface(Typeface.DEFAULT);
                this.f53138a.f(2131624360, 120, 120, null);
                this.f53138a.d();
                i12 = 1;
                break;
            case 9:
                this.f53142c.setText(org.telegram.messenger.hd.M0(2131752159, null));
                this.d.setText(org.telegram.messenger.hd.M0(2131752158, null));
                this.f53140b.setText(org.telegram.messenger.hd.M0(2131752161, null));
                this.d.setVisibility(0);
                this.f53138a.f(2131624359, 140, 140, null);
                this.f53138a.d();
                i12 = 1;
                break;
            default:
                i12 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor6 = this.f53154n;
        if (editTextBoldCursor6 != null) {
            editTextBoldCursor6.addTextChangedListener(new ua1(this, i12));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.e2 e2Var : getParentLayout().getFragmentStack()) {
            if (e2Var != this && (e2Var instanceof xa1)) {
                ((org.telegram.ui.Components.h51) ((xa1) e2Var).f53143c0.f13624b).f35171b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.fragmentView, 262145, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28792a7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53142c, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53154n, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53154n, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28978k6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f53154n, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28996l6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i7 = this.P;
        if (i7 != 7 && i7 != 9) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z10) {
                N0();
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
        int i7;
        super.onConfigurationChanged(configuration);
        int i10 = 0;
        if (this.f53138a != null) {
            int i11 = this.P;
            if (i11 == 2 && org.telegram.messenger.g0.O1()) {
                this.f53138a.setVisibility(8);
            } else if (i11 != 6 && i11 != 9 && i11 != 7) {
                org.telegram.ui.Components.fh0 fh0Var = this.f53138a;
                Point point = org.telegram.messenger.g0.f23611q;
                if (point.x > point.y) {
                    i7 = 8;
                } else {
                    i7 = 0;
                }
                fh0Var.setVisibility(i7);
            }
        }
        org.telegram.ui.Components.ir irVar = this.f53148f0;
        if (irVar != null) {
            if (!A0()) {
                i10 = 8;
            }
            irVar.setVisibility(i10);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.O = false;
        oa1 oa1Var = this.f53150h0;
        if (oa1Var != null) {
            org.telegram.messenger.g0.r(oa1Var);
            this.f53150h0 = null;
        }
        if (this.f53149g0 != null) {
            int i7 = 0;
            while (true) {
                org.telegram.ui.Components.ch0[] ch0VarArr = this.f53149g0;
                if (i7 >= ch0VarArr.length) {
                    break;
                }
                ch0VarArr[i7].C(false);
                i7++;
            }
            this.f53149g0 = null;
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
        if (A0()) {
            org.telegram.messenger.g0.C2(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.T = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.T = false;
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
            org.telegram.ui.Components.y11 y11Var = this.f53146e0;
            if (y11Var != null) {
                y11Var.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.O9, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28996l6, false);
            RadialProgressView radialProgressView = this.M;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(x02);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.f53154n != null && !A0()) {
                org.telegram.messenger.g0.i3(new oa1(this, 2), 200L);
            }
            lb0 lb0Var = this.f53158x;
            if (lb0Var != null && lb0Var.getVisibility() == 0) {
                org.telegram.messenger.g0.i3(new oa1(this, 3), 200L);
            }
        }
    }

    public final void z0(Runnable runnable) {
        int i7 = 0;
        while (true) {
            lb0 lb0Var = this.f53158x;
            dr[] drVarArr = lb0Var.f45485f;
            if (i7 < drVarArr.length) {
                dr drVar = drVarArr[i7];
                drVar.postDelayed(new hi0(drVar, 1), i7 * 75);
                i7++;
            } else {
                lb0Var.postDelayed(new fy0(23, this, runnable), (drVarArr.length * 75) + 350);
                return;
            }
        }
    }

    @Override
    public final void finishFragment() {
        if (this.H >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle k10 = a8.p0.k("afterSignup", true);
            je0 je0Var = new je0();
            je0Var.r0(k10);
            presentFragment(je0Var, true);
            return;
        }
        super.finishFragment();
    }

    public xa1(int i7, TL_account.Password password) {
        super(null);
        this.G = false;
        this.H = -1;
        this.K = new ArrayList();
        this.W = new byte[0];
        this.f53151i0 = new oa1(this, 0);
        this.f53152j0 = new oa1(this, 1);
        this.P = i7;
        this.V = password;
        if (password == null && (i7 == 6 || i7 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new qa1(this, 0), 10);
            return;
        }
        this.U = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void G0() {
    }
}
