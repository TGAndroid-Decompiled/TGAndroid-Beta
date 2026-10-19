package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
public class vf1 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.ActionBar.j0 E;
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
    public org.telegram.ui.Components.xj0 f42225a;
    public String f42226a0;
    public TextView f42227b;
    public m.g3 f42228b0;
    public TextView f42229c;
    public org.telegram.ui.Components.h20 f42230c0;
    public wh.n d;
    public org.telegram.ui.Components.a41 f42231d0;
    public TextView e;
    public org.telegram.ui.Components.fs f42232e0;
    public TextView f42233f;
    public org.telegram.ui.Components.uj0[] f42234f0;
    public mf1 f42235g0;
    public TextView h;
    public final Runnable f42236h0;
    public final Runnable f42237i0;
    public eb0 f42238j0;
    public EditTextBoldCursor f42239n;
    public EditTextBoldCursor f42240r;
    public org.telegram.ui.Components.sd0 f42241s;
    public org.telegram.ui.Components.sd0 v;
    public id0 f42242w;
    public uf1 f42243x;
    public ei.g6 f42244y;

    public vf1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f42236h0 = new mf1(this, 2);
        this.f42237i0 = new mf1(this, 3);
        this.currentAccount = i10;
        this.O = i11;
        this.U = password;
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.U == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new nf1(this, 0), 10);
            }
        }
    }

    public static void U(vf1 vf1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = vf1Var.U;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = SRPHelper.startCheck(vf1Var.V, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z10 && str != null) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = vf1Var.U.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
                bArr2 = stringBytes;
            } else {
                bArr2 = stringBytes;
                bArr = null;
            }
        } else {
            bArr = null;
            bArr2 = null;
        }
        ig.o0 o0Var = new ig.o0(vf1Var, bArr, str, passwordinputsettings, z10, 4);
        if (!z10) {
            if (str != null && (bArr3 = vf1Var.X) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = vf1Var.U.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(vf1Var.X, 0, bArr6, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = vf1Var.W;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = vf1Var.U.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] vBytes = SRPHelper.getVBytes(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = vBytes;
                    if (vBytes == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        o0Var.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            o0Var.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(tLObject, o0Var, 10);
    }

    public static void V(vf1 vf1Var) {
        ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new ci.e6(8));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
        alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        vf1Var.showDialog(alertDialog$Builder.f20604a);
    }

    public static void W(vf1 vf1Var, byte[] bArr) {
        ArrayList arrayList = vf1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = vf1Var.U;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = vf1Var.U;
        if (bArr == null) {
            bArr = vf1Var.V;
        }
        twoStepVerificationActivity.v0(password2, bArr, vf1Var.W, vf1Var.X);
        twoStepVerificationActivity.X = vf1Var.G;
        vf1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
        eb0 eb0Var = vf1Var.f42238j0;
        if (eb0Var != null) {
            AndroidUtilities.runOnUIThread(eb0Var);
            vf1Var.f42238j0 = null;
        }
    }

    public static void X(vf1 vf1Var) {
        ArrayList arrayList = vf1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(vf1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = vf1Var.V;
        TL_account.Password password = vf1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, vf1Var.R, vf1Var.Q, null, vf1Var.P);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = vf1Var.U;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, vf1Var.V, vf1Var.W, vf1Var.X);
        twoStepVerificationActivity.X = vf1Var.G;
        vf1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
        eb0 eb0Var = vf1Var.f42238j0;
        if (eb0Var != null) {
            AndroidUtilities.runOnUIThread(eb0Var);
            vf1Var.f42238j0 = null;
        }
    }

    public static void Y(vf1 vf1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = vf1Var.U.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        m71 m71Var = new m71(6, vf1Var, bArr2);
        TL_account.Password password = vf1Var.U;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                m71Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(getpasswordsettings, m71Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        m71Var.run(null, tL_error2);
    }

    public static void Z(vf1 vf1Var, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(new TL_account.getPassword(), new nf1(vf1Var, 4), 8);
            return;
        }
        vf1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            vf1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            vf1Var.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21210p7, false));
            vf1Var.z0(vf1Var.f42241s, vf1Var.f42239n, true);
            vf1Var.H0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            vf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            vf1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void a0(vf1 vf1Var) {
        ArrayList arrayList = vf1Var.J;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        vf1Var.finishFragment();
    }

    public static void b0(vf1 vf1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            vf1Var.U = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.f5.w0(vf1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            vf1Var.T = !TextUtils.isEmpty(vf1Var.U.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(vf1Var.U);
            if (!vf1Var.S && vf1Var.Y) {
                TL_account.Password password2 = vf1Var.U;
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
                    if (!vf1Var.T && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        vf1Var.finishFragment();
                    }
                }
            }
            if (vf1Var.N) {
                vf1Var.w0();
                vf1Var.C0();
            }
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
        }
    }

    public static void c0(vf1 vf1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            vf1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            vf1Var.E0(z10);
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
        }
    }

    public static void d0(vf1 vf1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String formatPluralString;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = vf1Var.J;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(vf1Var.currentAccount).sendRequest(new TL_account.getPassword(), new ei.o3(12, vf1Var, z10), 8);
            return;
        }
        vf1Var.w0();
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            vf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            if (z10) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
                NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                vf1Var.finishFragment();
            } else if (vf1Var.getParentActivity() != null) {
                if (vf1Var.U.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new en0(23, vf1Var, bArr));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                    if (str == null && (password = vf1Var.U) != null && password.has_password) {
                        b2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
                    } else {
                        b2Var.T = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    b2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
                    Dialog showDialog = vf1Var.showDialog(b2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((org.telegram.ui.ActionBar.n2) arrayList.get(i11)).removeSelfFromStack();
                }
                TL_account.Password password2 = vf1Var.U;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (vf1Var.Y) {
                    NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                }
                vf1 vf1Var2 = new vf1(7, vf1Var.U);
                vf1Var2.H = vf1Var.H;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = vf1Var.V;
                }
                vf1Var2.D0(bArr3, vf1Var.W, vf1Var.X, vf1Var.Z);
                vf1Var2.Y = vf1Var.Y;
                vf1Var2.G = vf1Var.G;
                vf1Var.presentFragment(vf1Var2, true);
                NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    vf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if ("EMAIL_NOT_ALLOWED".equals(tL_error.text)) {
                    vf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.EmailNotAllowed));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    vf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    vf1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((org.telegram.ui.ActionBar.n2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(vf1Var.currentAccount);
            int i13 = NotificationCenter.twoStepPasswordChanged;
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = vf1Var.U;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = vf1Var.R;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, vf1Var.Q, str2, vf1Var.P);
            TL_account.Password password4 = vf1Var.U;
            password4.email_unconfirmed_pattern = vf1Var.R;
            vf1 vf1Var3 = new vf1(5, password4);
            vf1Var3.H = vf1Var.H;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = vf1Var.V;
            }
            vf1Var3.D0(bArr2, vf1Var.W, vf1Var.X, vf1Var.Z);
            vf1Var3.Y = vf1Var.Y;
            vf1Var3.G = vf1Var.G;
            vf1Var.presentFragment(vf1Var3, true);
        }
    }

    public static void e0(vf1 vf1Var, TLRPC.TL_error tL_error) {
        vf1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = vf1Var.U;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, vf1Var.V, vf1Var.W, vf1Var.X);
            twoStepVerificationActivity.X = vf1Var.G;
            vf1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            eb0 eb0Var = vf1Var.f42238j0;
            if (eb0Var != null) {
                AndroidUtilities.runOnUIThread(eb0Var);
                vf1Var.f42238j0 = null;
            }
        }
    }

    public static void f0(vf1 vf1Var) {
        ArrayList arrayList = vf1Var.J;
        if (vf1Var.U.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new lf1(vf1Var, 4));
            boolean z10 = vf1Var.U.has_recovery;
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
            if (z10) {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                b2Var.T = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            b2Var.R = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = vf1Var.showDialog(b2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = vf1Var.U;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        vf1 vf1Var2 = new vf1(7, password);
        vf1Var2.H = vf1Var.H;
        vf1Var2.D0(vf1Var.V, vf1Var.W, vf1Var.X, vf1Var.Z);
        vf1Var2.J.addAll(arrayList);
        vf1Var2.Y = vf1Var.Y;
        vf1Var2.G = vf1Var.G;
        vf1Var.presentFragment(vf1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(vf1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = vf1Var.V;
        TL_account.Password password2 = vf1Var.U;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, vf1Var.R, vf1Var.Q, null, vf1Var.P);
        NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
    }

    public static void g0(vf1 vf1Var, String str) {
        vf1 vf1Var2 = new vf1(vf1Var.currentAccount, 0, vf1Var.U);
        vf1Var2.H = vf1Var.H;
        vf1Var2.J.addAll(vf1Var.J);
        vf1Var2.J.add(vf1Var);
        vf1Var2.f42226a0 = str;
        vf1Var2.G = vf1Var.G;
        vf1Var.presentFragment(vf1Var2, true);
    }

    public static void h0(vf1 vf1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            vf1Var.U = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(vf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, vf1Var.U);
            vf1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.U;
        if (!password.has_recovery) {
            vf1 vf1Var = new vf1(this.currentAccount, 3, password);
            vf1Var.H = this.H;
            vf1Var.D0(this.V, this.W, this.X, this.Z);
            vf1Var.P = this.P;
            vf1Var.Q = this.Q;
            vf1Var.J.addAll(this.J);
            vf1Var.J.add(this);
            vf1Var.Y = this.Y;
            vf1Var.G = this.G;
            presentFragment(vf1Var);
            return;
        }
        this.R = "";
        E0(false);
    }

    public final void C0() {
        if (getParentActivity() != null) {
            int i10 = 1;
            switch (this.O) {
                case 0:
                case 1:
                    if (this.f42239n.length() == 0) {
                        z0(this.f42241s, this.f42239n, false);
                        return;
                    } else if (!this.f42239n.getText().toString().equals(this.P) && this.O == 1) {
                        AndroidUtilities.shakeViewSpring(this.f42241s, 5.0f);
                        try {
                            this.f42241s.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    } else {
                        int i11 = this.currentAccount;
                        if (this.O != 0) {
                            i10 = 2;
                        }
                        vf1 vf1Var = new vf1(i11, i10, this.U);
                        vf1Var.H = this.H;
                        vf1Var.P = this.f42239n.getText().toString();
                        vf1Var.D0(this.V, this.W, this.X, this.Z);
                        vf1Var.f42226a0 = this.f42226a0;
                        vf1Var.J.addAll(this.J);
                        vf1Var.J.add(this);
                        vf1Var.Y = this.Y;
                        vf1Var.G = this.G;
                        presentFragment(vf1Var);
                        return;
                    }
                case 2:
                    String obj = this.f42239n.getText().toString();
                    this.Q = obj;
                    if (obj.equalsIgnoreCase(this.P)) {
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                        } catch (Exception e7) {
                            FileLog.e(e7);
                        }
                        z0(this.f42241s, this.f42239n, false);
                        return;
                    }
                    A0();
                    return;
                case 3:
                    if (!this.Z && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f42239n.getText().toString();
                    this.R = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            E0(false);
                            return;
                        }
                    }
                    z0(this.f42241s, this.f42239n, false);
                    return;
                case 4:
                    String code = this.f42242w.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new m71(5, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f42242w.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new nf1(this, 2), 10);
                    x0();
                    return;
                case 6:
                    TL_account.Password password = this.U;
                    if (password == null) {
                        x0();
                        this.N = true;
                        return;
                    }
                    vf1 vf1Var2 = new vf1(this.currentAccount, 0, password);
                    vf1Var2.H = this.H;
                    vf1Var2.Y = this.Y;
                    vf1Var2.G = this.G;
                    presentFragment(vf1Var2, true);
                    return;
                case 7:
                    if (this.Y) {
                        finishFragment();
                        return;
                    } else if (this.H) {
                        Bundle h = a1.g.h("afterSignup", true);
                        mg0 mg0Var = new mg0();
                        mg0Var.l0(h);
                        presentFragment(mg0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.U, this.V, this.W, this.X);
                        twoStepVerificationActivity.X = this.G;
                        presentFragment(twoStepVerificationActivity, true);
                        eb0 eb0Var = this.f42238j0;
                        if (eb0Var != null) {
                            AndroidUtilities.runOnUIThread(eb0Var);
                            this.f42238j0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.U == null) {
                        x0();
                        this.N = true;
                        return;
                    }
                    String obj3 = this.f42239n.getText().toString();
                    if (obj3.length() == 0) {
                        z0(this.f42241s, this.f42239n, false);
                        return;
                    }
                    byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                    x0();
                    Utilities.globalQueue.postRunnable(new of1(this, stringBytes, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void D0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.V = bArr;
        this.X = bArr2;
        this.W = j10;
        this.Z = z10;
    }

    public final void E0(boolean z10) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z10 && this.T && this.U.has_password) {
            x0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new nf1(this, 3));
            return;
        }
        String str = this.P;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
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
        if (this.f42226a0 != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.f42226a0;
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
        x0();
        Utilities.globalQueue.postRunnable(new ei.s1(this, updatepasswordsettings3, z10, str, passwordinputsettings));
    }

    public final void F0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vf1.F0(boolean):void");
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
        b2Var.R = str;
        b2Var.T = str2;
        showDialog(b2Var);
    }

    public final void H0(boolean z10) {
        boolean z11;
        Integer num;
        if (this.f42227b.getTag() != null) {
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
        TextView textView = this.f42227b;
        if (z10) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.I = new AnimatorSet();
        if (z10) {
            this.f42227b.setVisibility(0);
            AnimatorSet animatorSet2 = this.I;
            TextView textView2 = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f42227b, property, 1.0f), ObjectAnimator.ofFloat(this.f42227b, property2, 1.0f), ObjectAnimator.ofFloat(this.f42227b, property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.I;
            TextView textView5 = this.f42227b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f42227b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f42227b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.e, property4, 1.0f), ObjectAnimator.ofFloat(this.e, property5, 1.0f), ObjectAnimator.ofFloat(this.e, property6, 1.0f));
        }
        this.I.addListener(new l40(12, this, z10));
        this.I.setDuration(150L);
        this.I.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f20604a.T = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.G, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new lf1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        ?? r82;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.actionBar.C(org.telegram.ui.ActionBar.h6.x0(null, i15, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21307u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new sf1(this));
        int i16 = this.O;
        if (i16 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.h20 h20Var = new org.telegram.ui.Components.h20(context, this.resourceProvider, false);
        this.f42230c0 = h20Var;
        this.f42228b0 = new m.g3(h20Var);
        this.f42230c0.setOnClickListener(new View.OnClickListener(this) {
            public final vf1 f37985b;

            {
                this.f37985b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37985b.C0();
                        return;
                    case 1:
                        vf1 vf1Var = this.f37985b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                        alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                        b2Var.T = string;
                        vf1Var.showDialog(b2Var);
                        return;
                    case 2:
                        vf1.V(this.f37985b);
                        return;
                    case 3:
                        vf1 vf1Var2 = this.f37985b;
                        if (vf1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = vf1Var2.O;
                            if (i17 == 0) {
                                vf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = vf1Var2.f42226a0;
                                vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                alertDialog$Builder2.f20604a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20604a;
                                vf1Var2.showDialog(b2Var2);
                                TextView textView = (TextView) b2Var2.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                vf1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        vf1 vf1Var3 = this.f37985b;
                        if (vf1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = vf1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = vf1Var3.G;
                            vf1Var3.presentFragment(twoStepVerificationActivity, true);
                            eb0 eb0Var = vf1Var3.f42238j0;
                            if (eb0Var != null) {
                                AndroidUtilities.runOnUIThread(eb0Var);
                                vf1Var3.f42238j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f37985b.C0();
                        return;
                    default:
                        vf1 vf1Var4 = this.f37985b;
                        int i18 = vf1Var4.O;
                        vf1Var4.M = true;
                        if (vf1Var4.f42239n.getTransformationMethod() == null) {
                            vf1Var4.f42239n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                vf1Var4.f42234f0[3].P(-1);
                                org.telegram.ui.Components.uj0 animatedDrawable = vf1Var4.f42225a.getAnimatedDrawable();
                                org.telegram.ui.Components.uj0 uj0Var = vf1Var4.f42234f0[3];
                                if (animatedDrawable != uj0Var) {
                                    vf1Var4.f42225a.setAnimation(uj0Var);
                                    vf1Var4.f42234f0[3].N(18, false, false);
                                }
                                vf1Var4.f42225a.d();
                            }
                        } else {
                            vf1Var4.f42239n.setTransformationMethod(null);
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                vf1Var4.f42234f0[3].P(18);
                                org.telegram.ui.Components.uj0 animatedDrawable2 = vf1Var4.f42225a.getAnimatedDrawable();
                                org.telegram.ui.Components.uj0 uj0Var2 = vf1Var4.f42234f0[3];
                                if (animatedDrawable2 != uj0Var2) {
                                    vf1Var4.f42225a.setAnimation(uj0Var2);
                                }
                                vf1Var4.f42234f0[3].T(0.0f, false);
                                vf1Var4.f42225a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = vf1Var4.f42239n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        vf1Var4.M = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.a41 a41Var = new org.telegram.ui.Components.a41(context);
        this.f42231d0 = a41Var;
        a41Var.setTransformType(1);
        this.f42231d0.setProgress(0.0f);
        this.f42231d0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.O9, false));
        this.f42231d0.setDrawBackground(false);
        this.f42230c0.setContentDescription(LocaleController.getString(R.string.Next));
        this.f42230c0.addView(this.f42231d0, w7.z5.e(56, 56, 17));
        this.f42230c0.a(this.f42231d0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21192o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        m.g3.p(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final vf1 f37985b;

            {
                this.f37985b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37985b.C0();
                        return;
                    case 1:
                        vf1 vf1Var = this.f37985b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                        alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                        b2Var.T = string;
                        vf1Var.showDialog(b2Var);
                        return;
                    case 2:
                        vf1.V(this.f37985b);
                        return;
                    case 3:
                        vf1 vf1Var2 = this.f37985b;
                        if (vf1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = vf1Var2.O;
                            if (i17 == 0) {
                                vf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = vf1Var2.f42226a0;
                                vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                alertDialog$Builder2.f20604a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20604a;
                                vf1Var2.showDialog(b2Var2);
                                TextView textView2 = (TextView) b2Var2.d(-1);
                                if (textView2 != null) {
                                    textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                vf1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        vf1 vf1Var3 = this.f37985b;
                        if (vf1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = vf1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = vf1Var3.G;
                            vf1Var3.presentFragment(twoStepVerificationActivity, true);
                            eb0 eb0Var = vf1Var3.f42238j0;
                            if (eb0Var != null) {
                                AndroidUtilities.runOnUIThread(eb0Var);
                                vf1Var3.f42238j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f37985b.C0();
                        return;
                    default:
                        vf1 vf1Var4 = this.f37985b;
                        int i18 = vf1Var4.O;
                        vf1Var4.M = true;
                        if (vf1Var4.f42239n.getTransformationMethod() == null) {
                            vf1Var4.f42239n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                vf1Var4.f42234f0[3].P(-1);
                                org.telegram.ui.Components.uj0 animatedDrawable = vf1Var4.f42225a.getAnimatedDrawable();
                                org.telegram.ui.Components.uj0 uj0Var = vf1Var4.f42234f0[3];
                                if (animatedDrawable != uj0Var) {
                                    vf1Var4.f42225a.setAnimation(uj0Var);
                                    vf1Var4.f42234f0[3].N(18, false, false);
                                }
                                vf1Var4.f42225a.d();
                            }
                        } else {
                            vf1Var4.f42239n.setTransformationMethod(null);
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                vf1Var4.f42234f0[3].P(18);
                                org.telegram.ui.Components.uj0 animatedDrawable2 = vf1Var4.f42225a.getAnimatedDrawable();
                                org.telegram.ui.Components.uj0 uj0Var2 = vf1Var4.f42234f0[3];
                                if (animatedDrawable2 != uj0Var2) {
                                    vf1Var4.f42225a.setAnimation(uj0Var2);
                                }
                                vf1Var4.f42234f0[3].T(0.0f, false);
                                vf1Var4.f42225a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = vf1Var4.f42239n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        vf1Var4.M = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f42225a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i16 == 2 && AndroidUtilities.isSmallScreen()) {
            this.f42225a.setVisibility(8);
        } else if (i16 != 6 && i16 != 9 && i16 != 7) {
            org.telegram.ui.Components.xj0 xj0Var = this.f42225a;
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            xj0Var.setVisibility(i10);
        }
        TextView textView2 = new TextView(context);
        this.f42229c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
        this.f42229c.setGravity(1);
        this.f42229c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f42229c.setTextSize(1, 24.0f);
        wh.n nVar = new wh.n(context);
        this.d = nVar;
        int i17 = org.telegram.ui.ActionBar.h6.D6;
        nVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i17, false));
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final vf1 f37985b;

            {
                this.f37985b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37985b.C0();
                        return;
                    case 1:
                        vf1 vf1Var = this.f37985b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                        alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                        b2Var.T = string;
                        vf1Var.showDialog(b2Var);
                        return;
                    case 2:
                        vf1.V(this.f37985b);
                        return;
                    case 3:
                        vf1 vf1Var2 = this.f37985b;
                        if (vf1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = vf1Var2.O;
                            if (i172 == 0) {
                                vf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = vf1Var2.f42226a0;
                                vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                alertDialog$Builder2.f20604a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20604a;
                                vf1Var2.showDialog(b2Var2);
                                TextView textView22 = (TextView) b2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                vf1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        vf1 vf1Var3 = this.f37985b;
                        if (vf1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = vf1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = vf1Var3.G;
                            vf1Var3.presentFragment(twoStepVerificationActivity, true);
                            eb0 eb0Var = vf1Var3.f42238j0;
                            if (eb0Var != null) {
                                AndroidUtilities.runOnUIThread(eb0Var);
                                vf1Var3.f42238j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f37985b.C0();
                        return;
                    default:
                        vf1 vf1Var4 = this.f37985b;
                        int i18 = vf1Var4.O;
                        vf1Var4.M = true;
                        if (vf1Var4.f42239n.getTransformationMethod() == null) {
                            vf1Var4.f42239n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                vf1Var4.f42234f0[3].P(-1);
                                org.telegram.ui.Components.uj0 animatedDrawable = vf1Var4.f42225a.getAnimatedDrawable();
                                org.telegram.ui.Components.uj0 uj0Var = vf1Var4.f42234f0[3];
                                if (animatedDrawable != uj0Var) {
                                    vf1Var4.f42225a.setAnimation(uj0Var);
                                    vf1Var4.f42234f0[3].N(18, false, false);
                                }
                                vf1Var4.f42225a.d();
                            }
                        } else {
                            vf1Var4.f42239n.setTransformationMethod(null);
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                vf1Var4.f42234f0[3].P(18);
                                org.telegram.ui.Components.uj0 animatedDrawable2 = vf1Var4.f42225a.getAnimatedDrawable();
                                org.telegram.ui.Components.uj0 uj0Var2 = vf1Var4.f42234f0[3];
                                if (animatedDrawable2 != uj0Var2) {
                                    vf1Var4.f42225a.setAnimation(uj0Var2);
                                }
                                vf1Var4.f42234f0[3].T(0.0f, false);
                                vf1Var4.f42225a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = vf1Var4.f42239n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        vf1Var4.M = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f42227b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.f42227b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f42227b.setGravity(17);
        this.f42227b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        this.f42227b.setTextSize(1, 15.0f);
        this.f42227b.setTypeface(AndroidUtilities.bold());
        this.f42227b.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{24.0f}, org.telegram.ui.ActionBar.h6.Oh));
        this.f42227b.setOnClickListener(new View.OnClickListener(this) {
            public final vf1 f37985b;

            {
                this.f37985b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f37985b.C0();
                        return;
                    case 1:
                        vf1 vf1Var = this.f37985b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                        alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                        b2Var.T = string;
                        vf1Var.showDialog(b2Var);
                        return;
                    case 2:
                        vf1.V(this.f37985b);
                        return;
                    case 3:
                        vf1 vf1Var2 = this.f37985b;
                        if (vf1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = vf1Var2.O;
                            if (i172 == 0) {
                                vf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = vf1Var2.f42226a0;
                                vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                alertDialog$Builder2.f20604a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20604a;
                                vf1Var2.showDialog(b2Var2);
                                TextView textView22 = (TextView) b2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                vf1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        vf1 vf1Var3 = this.f37985b;
                        if (vf1Var3.O == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.W = true;
                            twoStepVerificationActivity.I = vf1Var3.U;
                            twoStepVerificationActivity.J = false;
                            twoStepVerificationActivity.X = vf1Var3.G;
                            vf1Var3.presentFragment(twoStepVerificationActivity, true);
                            eb0 eb0Var = vf1Var3.f42238j0;
                            if (eb0Var != null) {
                                AndroidUtilities.runOnUIThread(eb0Var);
                                vf1Var3.f42238j0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f37985b.C0();
                        return;
                    default:
                        vf1 vf1Var4 = this.f37985b;
                        int i18 = vf1Var4.O;
                        vf1Var4.M = true;
                        if (vf1Var4.f42239n.getTransformationMethod() == null) {
                            vf1Var4.f42239n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                vf1Var4.f42234f0[3].P(-1);
                                org.telegram.ui.Components.uj0 animatedDrawable = vf1Var4.f42225a.getAnimatedDrawable();
                                org.telegram.ui.Components.uj0 uj0Var = vf1Var4.f42234f0[3];
                                if (animatedDrawable != uj0Var) {
                                    vf1Var4.f42225a.setAnimation(uj0Var);
                                    vf1Var4.f42234f0[3].N(18, false, false);
                                }
                                vf1Var4.f42225a.d();
                            }
                        } else {
                            vf1Var4.f42239n.setTransformationMethod(null);
                            vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                vf1Var4.f42234f0[3].P(18);
                                org.telegram.ui.Components.uj0 animatedDrawable2 = vf1Var4.f42225a.getAnimatedDrawable();
                                org.telegram.ui.Components.uj0 uj0Var2 = vf1Var4.f42234f0[3];
                                if (animatedDrawable2 != uj0Var2) {
                                    vf1Var4.f42225a.setAnimation(uj0Var2);
                                }
                                vf1Var4.f42234f0[3].T(0.0f, false);
                                vf1Var4.f42225a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = vf1Var4.f42239n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        vf1Var4.M = false;
                        return;
                }
            }
        });
        if (i16 != 6 && i16 != 7 && i16 != 9) {
            this.f42229c.setTypeface(AndroidUtilities.bold());
            this.f42229c.setTextSize(1, 18.0f);
        } else {
            this.f42229c.setTypeface(Typeface.DEFAULT);
            this.f42229c.setTextSize(1, 24.0f);
        }
        switch (i16) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                m0 m0Var = new m0(this, context, 26);
                org.telegram.ui.Components.qa0 qa0Var = new org.telegram.ui.Components.qa0(this, context, m0Var, 2);
                qa0Var.addView(m0Var);
                t9 t9Var = new t9(this, context, qa0Var);
                uf1 uf1Var = new uf1(this, context);
                this.f42243x = uf1Var;
                uf1Var.setVerticalScrollBarEnabled(false);
                m0Var.addView(this.f42243x, w7.z5.c(-1.0f, -1));
                m0Var.addView(this.h, w7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                m0Var.addView(this.f42230c0, org.telegram.ui.Components.h20.b());
                t9Var.addView(qa0Var, w7.z5.c(-1.0f, -1));
                qa1 qa1Var = new qa1(this, context, 17);
                qa1Var.setOrientation(1);
                this.f42243x.addView(qa1Var, w7.z5.x(-1, -1, 51));
                qa1Var.addView(this.f42225a, w7.z5.t(-2, -2, 49, 0, 69, 0, 0));
                qa1Var.addView(this.f42229c, w7.z5.t(-2, -2, 49, 0, 8, 0, 0));
                qa1Var.addView(this.d, w7.z5.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(context, null);
                this.f42241s = sd0Var;
                sd0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f42239n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.f42239n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.f42239n;
                int i18 = org.telegram.ui.ActionBar.h6.f21133l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                this.f42239n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                this.f42239n.setBackground(null);
                this.f42239n.setMaxLines(1);
                this.f42239n.setLines(1);
                this.f42239n.setGravity(3);
                this.f42239n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f42239n.setSingleLine(true);
                this.f42239n.setCursorWidth(1.5f);
                this.f42239n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final vf1 f38243b;

                    {
                        this.f38243b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                vf1 vf1Var = this.f38243b;
                                vf1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                vf1Var.C0();
                                return true;
                            default:
                                vf1 vf1Var2 = this.f38243b;
                                vf1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (vf1Var2.v.getVisibility() == 0) {
                                    vf1Var2.f42240r.requestFocus();
                                } else {
                                    vf1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.f42241s.e(this.f42239n);
                this.f42239n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final vf1 f38590b;

                    {
                        this.f38590b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.sd0 sd0Var2 = this.f38590b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                sd0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                vf1 vf1Var = this.f38590b;
                                if (z11) {
                                    vf1Var.f42232e0.setEditText((EditText) view);
                                    vf1Var.f42232e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                vf1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.sd0 sd0Var3 = this.f38590b.f42241s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                sd0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f42239n, w7.z5.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.j0 j0Var = new org.telegram.ui.ActionBar.j0(this, context, 3);
                this.E = j0Var;
                j0Var.setImageResource(R.drawable.msg_message);
                this.E.setScaleType(scaleType);
                this.E.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.E.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21078i6, false), 1, -1));
                this.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                this.E.setOnClickListener(new View.OnClickListener(this) {
                    public final vf1 f37985b;

                    {
                        this.f37985b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f37985b.C0();
                                return;
                            case 1:
                                vf1 vf1Var = this.f37985b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                                b2Var.T = string;
                                vf1Var.showDialog(b2Var);
                                return;
                            case 2:
                                vf1.V(this.f37985b);
                                return;
                            case 3:
                                vf1 vf1Var2 = this.f37985b;
                                if (vf1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = vf1Var2.O;
                                    if (i172 == 0) {
                                        vf1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = vf1Var2.f42226a0;
                                        vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                        alertDialog$Builder2.f20604a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20604a;
                                        vf1Var2.showDialog(b2Var2);
                                        TextView textView22 = (TextView) b2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        vf1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                vf1 vf1Var3 = this.f37985b;
                                if (vf1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = vf1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = vf1Var3.G;
                                    vf1Var3.presentFragment(twoStepVerificationActivity, true);
                                    eb0 eb0Var = vf1Var3.f42238j0;
                                    if (eb0Var != null) {
                                        AndroidUtilities.runOnUIThread(eb0Var);
                                        vf1Var3.f42238j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f37985b.C0();
                                return;
                            default:
                                vf1 vf1Var4 = this.f37985b;
                                int i182 = vf1Var4.O;
                                vf1Var4.M = true;
                                if (vf1Var4.f42239n.getTransformationMethod() == null) {
                                    vf1Var4.f42239n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                        vf1Var4.f42234f0[3].P(-1);
                                        org.telegram.ui.Components.uj0 animatedDrawable = vf1Var4.f42225a.getAnimatedDrawable();
                                        org.telegram.ui.Components.uj0 uj0Var = vf1Var4.f42234f0[3];
                                        if (animatedDrawable != uj0Var) {
                                            vf1Var4.f42225a.setAnimation(uj0Var);
                                            vf1Var4.f42234f0[3].N(18, false, false);
                                        }
                                        vf1Var4.f42225a.d();
                                    }
                                } else {
                                    vf1Var4.f42239n.setTransformationMethod(null);
                                    vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                        vf1Var4.f42234f0[3].P(18);
                                        org.telegram.ui.Components.uj0 animatedDrawable2 = vf1Var4.f42225a.getAnimatedDrawable();
                                        org.telegram.ui.Components.uj0 uj0Var2 = vf1Var4.f42234f0[3];
                                        if (animatedDrawable2 != uj0Var2) {
                                            vf1Var4.f42225a.setAnimation(uj0Var2);
                                        }
                                        vf1Var4.f42234f0[3].T(0.0f, false);
                                        vf1Var4.f42225a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = vf1Var4.f42239n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                vf1Var4.M = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.E, w7.z5.t(24, 24, 16, 0, 0, 16, 0));
                this.f42239n.addTextChangedListener(new rf1(this, 2));
                this.f42241s.addView(linearLayout, w7.z5.c(-2.0f, -1));
                qa1Var.addView(this.f42241s, w7.z5.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.sd0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f42240r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.f42240r.setPadding(dp2, dp2, dp2, dp2);
                this.f42240r.setCursorColor(org.telegram.ui.ActionBar.h6.x0(null, i18, false));
                this.f42240r.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
                this.f42240r.setBackground(null);
                this.f42240r.setMaxLines(1);
                this.f42240r.setLines(1);
                this.f42240r.setGravity(3);
                this.f42240r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f42240r.setSingleLine(true);
                this.f42240r.setCursorWidth(1.5f);
                this.f42240r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final vf1 f38243b;

                    {
                        this.f38243b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                vf1 vf1Var = this.f38243b;
                                vf1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                vf1Var.C0();
                                return true;
                            default:
                                vf1 vf1Var2 = this.f38243b;
                                vf1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (vf1Var2.v.getVisibility() == 0) {
                                    vf1Var2.f42240r.requestFocus();
                                } else {
                                    vf1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.f42240r);
                this.f42240r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final vf1 f38590b;

                    {
                        this.f38590b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z11) {
                        float f7;
                        float f10;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.sd0 sd0Var2 = this.f38590b.v;
                                if (z11) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.0f;
                                }
                                sd0Var2.b(f7, f7, true);
                                return;
                            case 1:
                                vf1 vf1Var = this.f38590b;
                                if (z11) {
                                    vf1Var.f42232e0.setEditText((EditText) view);
                                    vf1Var.f42232e0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                vf1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.sd0 sd0Var3 = this.f38590b.f42241s;
                                if (z11) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                sd0Var3.b(f10, f10, true);
                                return;
                        }
                    }
                });
                this.v.addView(this.f42240r, w7.z5.c(-2.0f, -1));
                qa1Var.addView(this.v, w7.z5.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs(context);
                this.f42232e0 = fsVar;
                fsVar.setVisibility(8);
                qa0Var.addView(this.f42232e0);
                id0 id0Var = new id0(this, context, 3);
                this.f42242w = id0Var;
                final int i19 = 1;
                id0Var.b(6, 1);
                tr[] trVarArr = this.f42242w.f40961f;
                int length = trVarArr.length;
                int i20 = 0;
                while (i20 < length) {
                    tr trVar = trVarArr[i20];
                    trVar.setShowSoftInputOnFocusCompat(v0() ^ i19);
                    trVar.addTextChangedListener(new rf1(this, 0));
                    trVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final vf1 f38590b;

                        {
                            this.f38590b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z11) {
                            float f7;
                            float f10;
                            switch (i19) {
                                case 0:
                                    org.telegram.ui.Components.sd0 sd0Var2 = this.f38590b.v;
                                    if (z11) {
                                        f7 = 1.0f;
                                    } else {
                                        f7 = 0.0f;
                                    }
                                    sd0Var2.b(f7, f7, true);
                                    return;
                                case 1:
                                    vf1 vf1Var = this.f38590b;
                                    if (z11) {
                                        vf1Var.f42232e0.setEditText((EditText) view);
                                        vf1Var.f42232e0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    vf1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.sd0 sd0Var3 = this.f38590b.f42241s;
                                    if (z11) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    sd0Var3.b(f10, f10, true);
                                    return;
                            }
                        }
                    });
                    i20++;
                    i19 = 1;
                }
                this.f42242w.setVisibility(8);
                qa1Var.addView(this.f42242w, w7.z5.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                qa1Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, w7.z5.e(-2, -2, 49));
                if (i16 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f42233f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
                    this.f42233f.setGravity(1);
                    this.f42233f.setTextSize(1, 14.0f);
                    this.f42233f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f42233f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f42233f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    qa1Var.addView(this.f42233f, w7.z5.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f42233f.setOnClickListener(new View.OnClickListener(this) {
                        public final vf1 f37985b;

                        {
                            this.f37985b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f37985b.C0();
                                    return;
                                case 1:
                                    vf1 vf1Var = this.f37985b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                                    alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                                    b2Var.T = string;
                                    vf1Var.showDialog(b2Var);
                                    return;
                                case 2:
                                    vf1.V(this.f37985b);
                                    return;
                                case 3:
                                    vf1 vf1Var2 = this.f37985b;
                                    if (vf1Var2.h.getAlpha() >= 0.5f) {
                                        int i172 = vf1Var2.O;
                                        if (i172 == 0) {
                                            vf1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = vf1Var2.f42226a0;
                                            vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                            return;
                                        } else if (i172 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                            alertDialog$Builder2.f20604a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20604a;
                                            vf1Var2.showDialog(b2Var2);
                                            TextView textView22 = (TextView) b2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                                                return;
                                            }
                                            return;
                                        } else if (i172 == 2) {
                                            vf1Var2.A0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    vf1 vf1Var3 = this.f37985b;
                                    if (vf1Var3.O == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.W = true;
                                        twoStepVerificationActivity.I = vf1Var3.U;
                                        twoStepVerificationActivity.J = false;
                                        twoStepVerificationActivity.X = vf1Var3.G;
                                        vf1Var3.presentFragment(twoStepVerificationActivity, true);
                                        eb0 eb0Var = vf1Var3.f42238j0;
                                        if (eb0Var != null) {
                                            AndroidUtilities.runOnUIThread(eb0Var);
                                            vf1Var3.f42238j0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    this.f37985b.C0();
                                    return;
                                default:
                                    vf1 vf1Var4 = this.f37985b;
                                    int i182 = vf1Var4.O;
                                    vf1Var4.M = true;
                                    if (vf1Var4.f42239n.getTransformationMethod() == null) {
                                        vf1Var4.f42239n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                            vf1Var4.f42234f0[3].P(-1);
                                            org.telegram.ui.Components.uj0 animatedDrawable = vf1Var4.f42225a.getAnimatedDrawable();
                                            org.telegram.ui.Components.uj0 uj0Var = vf1Var4.f42234f0[3];
                                            if (animatedDrawable != uj0Var) {
                                                vf1Var4.f42225a.setAnimation(uj0Var);
                                                vf1Var4.f42234f0[3].N(18, false, false);
                                            }
                                            vf1Var4.f42225a.d();
                                        }
                                    } else {
                                        vf1Var4.f42239n.setTransformationMethod(null);
                                        vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                            vf1Var4.f42234f0[3].P(18);
                                            org.telegram.ui.Components.uj0 animatedDrawable2 = vf1Var4.f42225a.getAnimatedDrawable();
                                            org.telegram.ui.Components.uj0 uj0Var2 = vf1Var4.f42234f0[3];
                                            if (animatedDrawable2 != uj0Var2) {
                                                vf1Var4.f42225a.setAnimation(uj0Var2);
                                            }
                                            vf1Var4.f42234f0[3].T(0.0f, false);
                                            vf1Var4.f42225a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = vf1Var4.f42239n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    vf1Var4.M = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = t9Var;
                ei.g6 g6Var = new ei.g6(this, context);
                this.f42244y = g6Var;
                g6Var.setAlpha(0.0f);
                t9Var.addView(this.f42244y);
                t9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.L = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.L.setAlpha(0.0f);
                this.L.setScaleX(0.1f);
                this.L.setScaleY(0.1f);
                this.L.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21133l6, false));
                m0Var.addView(this.L, w7.z5.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                f fVar = new f(this, context, 3);
                fVar.setOnTouchListener(new di.d(2));
                fVar.addView(this.actionBar);
                fVar.addView(this.f42225a);
                fVar.addView(this.f42229c);
                fVar.addView(this.d);
                fVar.addView(this.f42227b);
                this.fragmentView = fVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
        String str = "";
        switch (i16) {
            case 0:
            case 1:
                if (this.U.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.f42229c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    if (i16 == 0) {
                        i11 = R.string.CreatePassword;
                    } else {
                        i11 = R.string.ReEnterPassword;
                    }
                    String string = LocaleController.getString(i11);
                    this.actionBar.setTitle(string);
                    this.f42229c.setText(string);
                }
                if (!TextUtils.isEmpty(this.f42226a0)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.sd0 sd0Var2 = this.f42241s;
                if (i16 == 0) {
                    i12 = R.string.EnterPassword;
                } else {
                    i12 = R.string.ReEnterPassword;
                }
                sd0Var2.setText(LocaleController.getString(i12));
                EditTextBoldCursor editTextBoldCursor4 = this.f42239n;
                if (i16 == 0) {
                    i13 = R.string.EnterPassword;
                } else {
                    i13 = R.string.ReEnterPassword;
                }
                editTextBoldCursor4.setContentDescription(LocaleController.getString(i13));
                this.f42239n.setImeOptions(268435461);
                this.f42239n.setInputType(129);
                this.f42239n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f42239n.setTypeface(Typeface.DEFAULT);
                if (i16 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.F = z10;
                AndroidUtilities.updateViewVisibilityAnimated(this.E, false, 0.1f, false);
                org.telegram.ui.Components.uj0[] uj0VarArr = new org.telegram.ui.Components.uj0[7];
                this.f42234f0 = uj0VarArr;
                uj0VarArr[0] = new org.telegram.ui.Components.uj0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f42234f0[1] = new org.telegram.ui.Components.uj0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f42234f0[2] = new org.telegram.ui.Components.uj0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f42234f0[3] = new org.telegram.ui.Components.uj0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f42234f0[4] = new org.telegram.ui.Components.uj0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f42234f0[5] = new org.telegram.ui.Components.uj0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f42234f0[6] = new org.telegram.ui.Components.uj0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.uj0 uj0Var = this.f42234f0[6];
                uj0Var.h = true;
                uj0Var.P(19);
                this.f42234f0[2].S(97, this.f42237i0);
                F0(true);
                if (i16 == 1) {
                    mf1 mf1Var = this.f42235g0;
                    if (mf1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(mf1Var);
                    }
                    this.f42225a.setAnimation(this.f42234f0[6]);
                    this.f42225a.d();
                    i14 = 1;
                    break;
                } else {
                    this.f42239n.dispatchTextWatchersTextChanged();
                    i14 = 1;
                    F0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.f42229c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.f42241s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f42239n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f42239n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.f42225a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.f42225a.d();
                i14 = 1;
                break;
            case 3:
                this.actionBar.setTitle(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.Z) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.f42229c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.f42241s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f42239n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f42239n.setImeOptions(268435461);
                this.f42239n.setInputType(33);
                this.v.setVisibility(8);
                this.f42225a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.f42225a.d();
                i14 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f42229c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.f42232e0.setVisibility(0);
                this.f42241s.setVisibility(8);
                String str2 = this.U.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28359a |= 256;
                    obj.f28360b = indexOf;
                    int i21 = lastIndexOf + 1;
                    obj.f28361c = i21;
                    r82 = 0;
                    valueOf.setSpan(new org.telegram.ui.Components.n11(obj, 0), indexOf, i21, 0);
                } else {
                    r82 = 0;
                }
                wh.n nVar2 = this.d;
                String string2 = LocaleController.getString(R.string.RestoreEmailSent);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r82] = valueOf;
                nVar2.setText(AndroidUtilities.formatSpannable(string2, charSequenceArr));
                this.d.setVisibility(r82);
                this.f42230c0.e(r82, r82);
                this.f42242w.setVisibility(r82);
                this.f42225a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f42225a.d();
                i14 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f42229c.setText(LocaleController.getString(R.string.VerificationCode));
                this.f42241s.setVisibility(8);
                this.f42232e0.setVisibility(0);
                wh.n nVar3 = this.d;
                int i22 = R.string.EmailPasswordConfirmText2;
                String str3 = this.U.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                nVar3.setText(LocaleController.formatString("EmailPasswordConfirmText2", i22, str));
                this.d.setVisibility(0);
                this.f42230c0.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final vf1 f37985b;

                    {
                        this.f37985b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f37985b.C0();
                                return;
                            case 1:
                                vf1 vf1Var = this.f37985b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vf1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new lf1(vf1Var, 1));
                                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.ResetPassword);
                                String string3 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                                b2Var.T = string3;
                                vf1Var.showDialog(b2Var);
                                return;
                            case 2:
                                vf1.V(this.f37985b);
                                return;
                            case 3:
                                vf1 vf1Var2 = this.f37985b;
                                if (vf1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = vf1Var2.O;
                                    if (i172 == 0) {
                                        vf1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = vf1Var2.f42226a0;
                                        vf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new nf1(vf1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(vf1Var2.getParentActivity());
                                        alertDialog$Builder2.f20604a.T = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f20604a.R = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new lf1(vf1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20604a;
                                        vf1Var2.showDialog(b2Var2);
                                        TextView textView22 = (TextView) b2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21227q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        vf1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                vf1 vf1Var3 = this.f37985b;
                                if (vf1Var3.O == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.W = true;
                                    twoStepVerificationActivity.I = vf1Var3.U;
                                    twoStepVerificationActivity.J = false;
                                    twoStepVerificationActivity.X = vf1Var3.G;
                                    vf1Var3.presentFragment(twoStepVerificationActivity, true);
                                    eb0 eb0Var = vf1Var3.f42238j0;
                                    if (eb0Var != null) {
                                        AndroidUtilities.runOnUIThread(eb0Var);
                                        vf1Var3.f42238j0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f37985b.C0();
                                return;
                            default:
                                vf1 vf1Var4 = this.f37985b;
                                int i182 = vf1Var4.O;
                                vf1Var4.M = true;
                                if (vf1Var4.f42239n.getTransformationMethod() == null) {
                                    vf1Var4.f42239n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                        vf1Var4.f42234f0[3].P(-1);
                                        org.telegram.ui.Components.uj0 animatedDrawable = vf1Var4.f42225a.getAnimatedDrawable();
                                        org.telegram.ui.Components.uj0 uj0Var2 = vf1Var4.f42234f0[3];
                                        if (animatedDrawable != uj0Var2) {
                                            vf1Var4.f42225a.setAnimation(uj0Var2);
                                            vf1Var4.f42234f0[3].N(18, false, false);
                                        }
                                        vf1Var4.f42225a.d();
                                    }
                                } else {
                                    vf1Var4.f42239n.setTransformationMethod(null);
                                    vf1Var4.E.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && vf1Var4.f42239n.length() > 0 && vf1Var4.f42239n.hasFocus()) {
                                        vf1Var4.f42234f0[3].P(18);
                                        org.telegram.ui.Components.uj0 animatedDrawable2 = vf1Var4.f42225a.getAnimatedDrawable();
                                        org.telegram.ui.Components.uj0 uj0Var22 = vf1Var4.f42234f0[3];
                                        if (animatedDrawable2 != uj0Var22) {
                                            vf1Var4.f42225a.setAnimation(uj0Var22);
                                        }
                                        vf1Var4.f42234f0[3].T(0.0f, false);
                                        vf1Var4.f42225a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = vf1Var4.f42239n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                vf1Var4.M = false;
                                return;
                        }
                    }
                });
                this.f42242w.setVisibility(0);
                this.f42225a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f42225a.d();
                i14 = 1;
                break;
            case 6:
                this.f42229c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.f42227b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.f42225a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.f42225a.d();
                i14 = 1;
                break;
            case 7:
                this.f42229c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.Y) {
                    this.f42227b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.H) {
                    this.f42227b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.f42227b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.f42225a.f(R.raw.wallet_allset, 160, 160, null);
                this.f42225a.d();
                i14 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.f42229c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.e.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21192o6, false));
                this.f42241s.setText(LocaleController.getString(R.string.LoginPassword));
                this.f42239n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.f42239n.setImeOptions(268435462);
                this.f42239n.setInputType(129);
                this.f42239n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f42239n.setTypeface(Typeface.DEFAULT);
                this.f42225a.f(R.raw.wallet_science, 120, 120, null);
                this.f42225a.d();
                i14 = 1;
                break;
            case 9:
                this.f42229c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.f42227b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.f42225a.f(R.raw.wallet_perfect, 140, 140, null);
                this.f42225a.d();
                i14 = 1;
                break;
            default:
                i14 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.f42239n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new rf1(this, i14));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
            if (n2Var != this && (n2Var instanceof vf1)) {
                ((org.telegram.ui.Components.n71) ((vf1) n2Var).f42228b0.f16204b).f28691b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f20989d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.f20931a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f21268s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21324v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21287t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42229c, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42239n, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42239n, 8388608, null, null, null, null, org.telegram.ui.ActionBar.h6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42239n, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.f21116k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f42239n, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.f21133l6));
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
        if (i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, true)) > 0.699999988079071d) {
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
                I0();
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
        if (this.f42225a != null) {
            int i12 = this.O;
            if (i12 == 2 && AndroidUtilities.isSmallScreen()) {
                this.f42225a.setVisibility(8);
            } else if (i12 != 6 && i12 != 9 && i12 != 7) {
                org.telegram.ui.Components.xj0 xj0Var = this.f42225a;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                xj0Var.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.fs fsVar = this.f42232e0;
        if (fsVar != null) {
            if (!v0()) {
                i11 = 8;
            }
            fsVar.setVisibility(i11);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.N = false;
        mf1 mf1Var = this.f42235g0;
        if (mf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(mf1Var);
            this.f42235g0 = null;
        }
        if (this.f42234f0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.uj0[] uj0VarArr = this.f42234f0;
                if (i10 >= uj0VarArr.length) {
                    break;
                }
                uj0VarArr[i10].C(false);
                i10++;
            }
            this.f42234f0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
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
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.f42239n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new mf1(this, 0), 200L);
            }
            id0 id0Var = this.f42242w;
            if (id0Var != null && id0Var.getVisibility() == 0) {
                AndroidUtilities.runOnUIThread(new mf1(this, 1), 200L);
            }
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            id0 id0Var = this.f42242w;
            tr[] trVarArr = id0Var.f40961f;
            if (i10 < trVarArr.length) {
                tr trVar = trVarArr[i10];
                trVar.postDelayed(new yk0(trVar, 1), i10 * 75);
                i10++;
            } else {
                id0Var.postDelayed(new k71(19, this, runnable), (trVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean v0() {
        int i10 = this.O;
        if ((i10 == 5 || i10 == 4) && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w0() {
        this.f42230c0.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.f42230c0.f(true, true);
        }
    }

    public final void y0() {
        tr[] trVarArr;
        for (tr trVar : this.f42242w.f40961f) {
            trVar.setText("");
            trVar.i(1.0f);
        }
        this.f42242w.f40961f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.f42242w, 8.0f, new mf1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.sd0 sd0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(sd0Var, 5.0f);
    }

    @Override
    public final void finishFragment() {
        if (this.G >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle h = a1.g.h("afterSignup", true);
            mg0 mg0Var = new mg0();
            mg0Var.l0(h);
            presentFragment(mg0Var, true);
            return;
        }
        super.finishFragment();
    }

    public vf1(int i10, TL_account.Password password) {
        super(null);
        this.F = false;
        this.G = -1;
        this.J = new ArrayList();
        this.V = new byte[0];
        this.f42236h0 = new mf1(this, 2);
        this.f42237i0 = new mf1(this, 3);
        this.O = i10;
        this.U = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new nf1(this, 0), 10);
            return;
        }
        this.T = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void B0() {
    }
}
