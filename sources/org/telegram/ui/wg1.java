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
public class wg1 extends org.telegram.ui.ActionBar.p2 {
    public org.telegram.ui.ActionBar.l0 B;
    public boolean C;
    public int D;
    public boolean E;
    public AnimatorSet F;
    public final ArrayList G;
    public AnimatorSet H;
    public RadialProgressView I;
    public boolean J;
    public boolean K;
    public final int L;
    public String M;
    public String N;
    public String O;
    public boolean P;
    public boolean Q;
    public TL_account.Password R;
    public byte[] S;
    public long T;
    public byte[] U;
    public boolean V;
    public boolean W;
    public String X;
    public n7.qa Y;
    public org.telegram.ui.Components.a20 Z;
    public org.telegram.ui.Components.jj0 f39681a;
    public org.telegram.ui.Components.e31 f39682a0;
    public TextView f39683b;
    public org.telegram.ui.Components.rr f39684b0;
    public TextView f39685c;
    public org.telegram.ui.Components.gj0[] f39686c0;
    public ih.s d;
    public ng1 f39687d0;
    public TextView e;
    public final Runnable f39688e0;
    public TextView f39689f;
    public final Runnable f39690f0;
    public sb0 f39691g0;
    public TextView h;
    public EditTextBoldCursor f39692n;
    public EditTextBoldCursor f39693r;
    public org.telegram.ui.Components.bd0 f39694s;
    public org.telegram.ui.Components.bd0 v;
    public xd0 f39695w;
    public vg1 f39696x;
    public eg.i0 f39697y;

    public wg1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.C = false;
        this.D = -1;
        this.G = new ArrayList();
        this.S = new byte[0];
        this.f39688e0 = new ng1(this, 2);
        this.f39690f0 = new ng1(this, 3);
        this.currentAccount = i10;
        this.L = i11;
        this.R = password;
        this.Q = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.R == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new og1(this, 0), 10);
            }
        }
    }

    public static void U(wg1 wg1Var, TLObject tLObject, boolean z4, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = wg1Var.R;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                    tL_inputCheckPasswordSRP = SRPHelper.startCheck(wg1Var.S, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                } else {
                    tL_inputCheckPasswordSRP = null;
                }
                updatepasswordsettings.password = tL_inputCheckPasswordSRP;
            }
        }
        if (!z4 && str != null) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = wg1Var.R.new_algo;
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
        jh.g gVar = new jh.g(wg1Var, bArr, str, passwordinputsettings, z4, 4);
        if (!z4) {
            if (str != null && (bArr3 = wg1Var.U) != null && bArr3.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = wg1Var.R.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(wg1Var.U, 0, bArr6, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr6;
                    tL_secureSecretSettings.secure_secret_id = wg1Var.T;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = wg1Var.R.new_algo;
            if (passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] vBytes = SRPHelper.getVBytes(bArr2, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
                    passwordinputsettings.new_password_hash = vBytes;
                    if (vBytes == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        gVar.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(tLObject, gVar, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            gVar.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(tLObject, gVar, 10);
    }

    public static void V(wg1 wg1Var) {
        ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new nh.p5(4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
        alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        wg1Var.showDialog(alertDialog$Builder.f19478a);
    }

    public static void W(wg1 wg1Var, byte[] bArr) {
        ArrayList arrayList = wg1Var.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.p2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = wg1Var.R;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = wg1Var.R;
        if (bArr == null) {
            bArr = wg1Var.S;
        }
        twoStepVerificationActivity.v0(password2, bArr, wg1Var.T, wg1Var.U);
        twoStepVerificationActivity.U = wg1Var.D;
        wg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
        sb0 sb0Var = wg1Var.f39691g0;
        if (sb0Var != null) {
            AndroidUtilities.runOnUIThread(sb0Var);
            wg1Var.f39691g0 = null;
        }
    }

    public static void X(wg1 wg1Var) {
        ArrayList arrayList = wg1Var.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.p2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(wg1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = wg1Var.S;
        TL_account.Password password = wg1Var.R;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, wg1Var.O, wg1Var.N, null, wg1Var.M);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = wg1Var.R;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, wg1Var.S, wg1Var.T, wg1Var.U);
        twoStepVerificationActivity.U = wg1Var.D;
        wg1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
        sb0 sb0Var = wg1Var.f39691g0;
        if (sb0Var != null) {
            AndroidUtilities.runOnUIThread(sb0Var);
            wg1Var.f39691g0 = null;
        }
    }

    public static void Y(wg1 wg1Var, byte[] bArr) {
        byte[] bArr2;
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = wg1Var.R.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            bArr2 = SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        } else {
            bArr2 = null;
        }
        ub0 ub0Var = new ub0(29, wg1Var, bArr2);
        TL_account.Password password = wg1Var.R;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(bArr2, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = startCheck;
            if (startCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                ub0Var.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(getpasswordsettings, ub0Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        ub0Var.run(null, tL_error2);
    }

    public static void Z(wg1 wg1Var, TLRPC.TL_error tL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new og1(wg1Var, 4), 8);
            return;
        }
        wg1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            wg1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            wg1Var.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false));
            wg1Var.z0(wg1Var.f39694s, wg1Var.f39692n, true);
            wg1Var.H0(false);
        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            wg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
        } else {
            wg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void a0(wg1 wg1Var) {
        ArrayList arrayList = wg1Var.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.p2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        wg1Var.finishFragment();
    }

    public static void b0(wg1 wg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        String str;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            wg1Var.R = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.z4.x0(wg1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            wg1Var.Q = !TextUtils.isEmpty(wg1Var.R.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(wg1Var.R);
            if (!wg1Var.P && wg1Var.V) {
                TL_account.Password password2 = wg1Var.R;
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
                    if (!wg1Var.Q && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        wg1Var.finishFragment();
                    }
                }
            }
            if (wg1Var.K) {
                wg1Var.w0();
                wg1Var.C0();
            }
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
        }
    }

    public static void c0(wg1 wg1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z4) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            wg1Var.R = password;
            TwoStepVerificationActivity.m0(password);
            wg1Var.E0(z4);
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
        }
    }

    public static void d0(wg1 wg1Var, TLRPC.TL_error tL_error, boolean z4, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] bArr2;
        String formatPluralString;
        byte[] bArr3;
        TL_account.Password password;
        ArrayList arrayList = wg1Var.G;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(wg1Var.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.messenger.zd(11, wg1Var, z4), 8);
            return;
        }
        wg1Var.w0();
        if (tL_error == null && ((tLObject instanceof TLRPC.TL_boolTrue) || (tLObject instanceof TLRPC.auth_Authorization))) {
            wg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            if (z4) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.p2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
                NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
                wg1Var.finishFragment();
            } else if (wg1Var.getParentActivity() != null) {
                if (wg1Var.R.has_password) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new vl0(26, wg1Var, bArr));
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                    if (str == null && (password = wg1Var.R) != null && password.has_password) {
                        d2Var.Q = LocaleController.getString(R.string.YourEmailSuccessText);
                    } else {
                        d2Var.Q = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
                    }
                    d2Var.O = LocaleController.getString(R.string.YourPasswordSuccess);
                    Dialog showDialog = wg1Var.showDialog(d2Var);
                    if (showDialog != null) {
                        showDialog.setCanceledOnTouchOutside(false);
                        showDialog.setCancelable(false);
                        return;
                    }
                    return;
                }
                int size2 = arrayList.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((org.telegram.ui.ActionBar.p2) arrayList.get(i11)).removeSelfFromStack();
                }
                TL_account.Password password2 = wg1Var.R;
                password2.has_password = true;
                if (!password2.has_recovery) {
                    password2.has_recovery = !TextUtils.isEmpty(password2.email_unconfirmed_pattern);
                }
                if (wg1Var.V) {
                    NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                }
                wg1 wg1Var2 = new wg1(7, wg1Var.R);
                wg1Var2.E = wg1Var.E;
                if (bArr != null) {
                    bArr3 = bArr;
                } else {
                    bArr3 = wg1Var.S;
                }
                wg1Var2.D0(bArr3, wg1Var.T, wg1Var.U, wg1Var.W);
                wg1Var2.V = wg1Var.V;
                wg1Var2.D = wg1Var.D;
                wg1Var.presentFragment(wg1Var2, true);
                NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
            }
        } else if (tL_error != null) {
            if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    wg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    wg1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    wg1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                }
            }
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
            int size3 = arrayList.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((org.telegram.ui.ActionBar.p2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(wg1Var.currentAccount);
            int i13 = NotificationCenter.twoStepPasswordChanged;
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
            TL_account.Password password3 = wg1Var.R;
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password3.new_secure_algo;
            byte[] bArr4 = password3.secure_random;
            String str2 = wg1Var.O;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i13, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr4, str2, wg1Var.N, str2, wg1Var.M);
            TL_account.Password password4 = wg1Var.R;
            password4.email_unconfirmed_pattern = wg1Var.O;
            wg1 wg1Var3 = new wg1(5, password4);
            wg1Var3.E = wg1Var.E;
            if (bArr != null) {
                bArr2 = bArr;
            } else {
                bArr2 = wg1Var.S;
            }
            wg1Var3.D0(bArr2, wg1Var.T, wg1Var.U, wg1Var.W);
            wg1Var3.V = wg1Var.V;
            wg1Var3.D = wg1Var.D;
            wg1Var.presentFragment(wg1Var3, true);
        }
    }

    public static void e0(wg1 wg1Var, TLRPC.TL_error tL_error) {
        wg1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = wg1Var.R;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, wg1Var.S, wg1Var.T, wg1Var.U);
            twoStepVerificationActivity.U = wg1Var.D;
            wg1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            sb0 sb0Var = wg1Var.f39691g0;
            if (sb0Var != null) {
                AndroidUtilities.runOnUIThread(sb0Var);
                wg1Var.f39691g0 = null;
            }
        }
    }

    public static void f0(wg1 wg1Var) {
        ArrayList arrayList = wg1Var.G;
        if (wg1Var.R.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new mg1(wg1Var, 4));
            boolean z4 = wg1Var.R.has_recovery;
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
            if (z4) {
                d2Var.Q = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                d2Var.Q = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            d2Var.O = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog showDialog = wg1Var.showDialog(d2Var);
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.p2) arrayList.get(i10)).removeSelfFromStack();
        }
        TL_account.Password password = wg1Var.R;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        wg1 wg1Var2 = new wg1(7, password);
        wg1Var2.E = wg1Var.E;
        wg1Var2.D0(wg1Var.S, wg1Var.T, wg1Var.U, wg1Var.W);
        wg1Var2.G.addAll(arrayList);
        wg1Var2.V = wg1Var.V;
        wg1Var2.D = wg1Var.D;
        wg1Var.presentFragment(wg1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(wg1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = wg1Var.S;
        TL_account.Password password2 = wg1Var.R;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, wg1Var.O, wg1Var.N, null, wg1Var.M);
        NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
    }

    public static void g0(wg1 wg1Var, String str) {
        wg1 wg1Var2 = new wg1(wg1Var.currentAccount, 0, wg1Var.R);
        wg1Var2.E = wg1Var.E;
        wg1Var2.G.addAll(wg1Var.G);
        wg1Var2.G.add(wg1Var);
        wg1Var2.X = str;
        wg1Var2.D = wg1Var.D;
        wg1Var.presentFragment(wg1Var2, true);
    }

    public static void h0(wg1 wg1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            wg1Var.R = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(wg1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, wg1Var.R);
            wg1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.R;
        if (!password.has_recovery) {
            wg1 wg1Var = new wg1(this.currentAccount, 3, password);
            wg1Var.E = this.E;
            wg1Var.D0(this.S, this.T, this.U, this.W);
            wg1Var.M = this.M;
            wg1Var.N = this.N;
            wg1Var.G.addAll(this.G);
            wg1Var.G.add(this);
            wg1Var.V = this.V;
            wg1Var.D = this.D;
            presentFragment(wg1Var);
            return;
        }
        this.O = "";
        E0(false);
    }

    public final void C0() {
        if (getParentActivity() != null) {
            int i10 = 1;
            switch (this.L) {
                case 0:
                case 1:
                    if (this.f39692n.length() == 0) {
                        z0(this.f39694s, this.f39692n, false);
                        return;
                    } else if (!this.f39692n.getText().toString().equals(this.M) && this.L == 1) {
                        AndroidUtilities.shakeViewSpring(this.f39694s, 5.0f);
                        try {
                            this.f39694s.performHapticFeedback(3, 2);
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
                        if (this.L != 0) {
                            i10 = 2;
                        }
                        wg1 wg1Var = new wg1(i11, i10, this.R);
                        wg1Var.E = this.E;
                        wg1Var.M = this.f39692n.getText().toString();
                        wg1Var.D0(this.S, this.T, this.U, this.W);
                        wg1Var.X = this.X;
                        wg1Var.G.addAll(this.G);
                        wg1Var.G.add(this);
                        wg1Var.V = this.V;
                        wg1Var.D = this.D;
                        presentFragment(wg1Var);
                        return;
                    }
                case 2:
                    String obj = this.f39692n.getText().toString();
                    this.N = obj;
                    if (obj.equalsIgnoreCase(this.M)) {
                        try {
                            Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        z0(this.f39694s, this.f39692n, false);
                        return;
                    }
                    A0();
                    return;
                case 3:
                    if (!this.W && this.h.getAlpha() < 1.0f) {
                        this.h.animate().cancel();
                        this.h.animate().alpha(1.0f).start();
                    }
                    String obj2 = this.f39692n.getText().toString();
                    this.O = obj2;
                    if (obj2 != null && obj2.length() >= 3) {
                        int lastIndexOf = obj2.lastIndexOf(46);
                        int lastIndexOf2 = obj2.lastIndexOf(64);
                        if (lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2) {
                            E0(false);
                            return;
                        }
                    }
                    z0(this.f39694s, this.f39692n, false);
                    return;
                case 4:
                    String code = this.f39695w.getCode();
                    TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                    tL_auth_checkRecoveryPassword.code = code;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new ub0(28, this, code), 10);
                    return;
                case 5:
                    TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                    confirmpasswordemail.code = this.f39695w.getCode();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new og1(this, 2), 10);
                    x0();
                    return;
                case 6:
                    TL_account.Password password = this.R;
                    if (password == null) {
                        x0();
                        this.K = true;
                        return;
                    }
                    wg1 wg1Var2 = new wg1(this.currentAccount, 0, password);
                    wg1Var2.E = this.E;
                    wg1Var2.V = this.V;
                    wg1Var2.D = this.D;
                    presentFragment(wg1Var2, true);
                    return;
                case 7:
                    if (this.V) {
                        finishFragment();
                        return;
                    } else if (this.E) {
                        Bundle i12 = android.support.v4.media.a.i("afterSignup", true);
                        xg0 xg0Var = new xg0();
                        xg0Var.l0(i12);
                        presentFragment(xg0Var, true);
                        return;
                    } else {
                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                        twoStepVerificationActivity.v0(this.R, this.S, this.T, this.U);
                        twoStepVerificationActivity.U = this.D;
                        presentFragment(twoStepVerificationActivity, true);
                        sb0 sb0Var = this.f39691g0;
                        if (sb0Var != null) {
                            AndroidUtilities.runOnUIThread(sb0Var);
                            this.f39691g0 = null;
                            return;
                        }
                        return;
                    }
                case 8:
                    if (this.R == null) {
                        x0();
                        this.K = true;
                        return;
                    }
                    String obj3 = this.f39692n.getText().toString();
                    if (obj3.length() == 0) {
                        z0(this.f39694s, this.f39692n, false);
                        return;
                    }
                    byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                    x0();
                    Utilities.globalQueue.postRunnable(new pg1(this, stringBytes, 0));
                    return;
                case 9:
                    finishFragment();
                    return;
                default:
                    return;
            }
        }
    }

    public final void D0(byte[] bArr, long j10, byte[] bArr2, boolean z4) {
        this.S = bArr;
        this.U = bArr2;
        this.T = j10;
        this.W = z4;
    }

    public final void E0(boolean z4) {
        TL_account.Password password;
        TL_account.updatePasswordSettings updatepasswordsettings;
        if (z4 && this.Q && this.R.has_password) {
            x0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new og1(this, 3));
            return;
        }
        String str = this.M;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z4) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
            this.U = null;
            if (this.Q) {
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
            if (this.N == null && (password = this.R) != null) {
                this.N = password.hint;
            }
            if (this.N == null) {
                this.N = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.N;
                passwordinputsettings.new_algo = this.R.new_algo;
            }
            if (this.O.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.O.trim();
            }
        }
        if (this.X != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.X;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            updatepasswordsettings = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings2 = new TL_account.updatePasswordSettings();
            byte[] bArr = this.S;
            if (bArr == null || bArr.length == 0 || (z4 && this.Q)) {
                updatepasswordsettings2.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings2.new_settings = passwordinputsettings;
            updatepasswordsettings = updatepasswordsettings2;
        }
        TL_account.updatePasswordSettings updatepasswordsettings3 = updatepasswordsettings;
        x0();
        Utilities.globalQueue.postRunnable(new gg.j(this, updatepasswordsettings3, z4, str, passwordinputsettings));
    }

    public final void F0(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wg1.F0(boolean):void");
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = str;
        d2Var.Q = str2;
        showDialog(d2Var);
    }

    public final void H0(boolean z4) {
        boolean z10;
        Integer num;
        if (this.f39683b.getTag() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 == z10) {
            return;
        }
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = this.f39683b;
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        textView.setTag(num);
        this.F = new AnimatorSet();
        if (z4) {
            this.f39683b.setVisibility(0);
            AnimatorSet animatorSet2 = this.F;
            TextView textView2 = this.e;
            Property property = View.SCALE_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, property, 0.9f);
            TextView textView3 = this.e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, property2, 0.9f);
            TextView textView4 = this.e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(textView4, property3, 0.0f), ObjectAnimator.ofFloat(this.f39683b, property, 1.0f), ObjectAnimator.ofFloat(this.f39683b, property2, 1.0f), ObjectAnimator.ofFloat(this.f39683b, property3, 1.0f));
        } else {
            this.e.setVisibility(0);
            AnimatorSet animatorSet3 = this.F;
            TextView textView5 = this.f39683b;
            Property property4 = View.SCALE_X;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView5, property4, 0.9f);
            TextView textView6 = this.f39683b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textView6, property5, 0.9f);
            TextView textView7 = this.f39683b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textView7, property6, 0.0f), ObjectAnimator.ofFloat(this.e, property4, 1.0f), ObjectAnimator.ofFloat(this.e, property5, 1.0f), ObjectAnimator.ofFloat(this.e, property6, 1.0f));
        }
        this.F.addListener(new s61(3, this, z4));
        this.F.setDuration(150L);
        this.F.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f19478a.Q = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.D, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new mg1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        int i14;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i15, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20184u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ug1(this));
        int i16 = this.L;
        if (i16 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.a20 a20Var = new org.telegram.ui.Components.a20(context, this.resourceProvider, false);
        this.Z = a20Var;
        this.Y = new n7.qa(a20Var);
        this.Z.setOnClickListener(new View.OnClickListener(this) {
            public final wg1 f35276b;

            {
                this.f35276b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35276b.C0();
                        return;
                    case 1:
                        wg1 wg1Var = this.f35276b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.Q = string;
                        wg1Var.showDialog(d2Var);
                        return;
                    case 2:
                        wg1.V(this.f35276b);
                        return;
                    case 3:
                        wg1 wg1Var2 = this.f35276b;
                        if (wg1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = wg1Var2.L;
                            if (i17 == 0) {
                                wg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = wg1Var2.X;
                                wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                                wg1Var2.showDialog(d2Var2);
                                TextView textView = (TextView) d2Var2.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                wg1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        wg1 wg1Var3 = this.f35276b;
                        if (wg1Var3.L == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.T = true;
                            twoStepVerificationActivity.F = wg1Var3.R;
                            twoStepVerificationActivity.G = false;
                            twoStepVerificationActivity.U = wg1Var3.D;
                            wg1Var3.presentFragment(twoStepVerificationActivity, true);
                            sb0 sb0Var = wg1Var3.f39691g0;
                            if (sb0Var != null) {
                                AndroidUtilities.runOnUIThread(sb0Var);
                                wg1Var3.f39691g0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f35276b.C0();
                        return;
                    default:
                        wg1 wg1Var4 = this.f35276b;
                        int i18 = wg1Var4.L;
                        wg1Var4.J = true;
                        if (wg1Var4.f39692n.getTransformationMethod() == null) {
                            wg1Var4.f39692n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                wg1Var4.f39686c0[3].N(-1);
                                org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.f39681a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var = wg1Var4.f39686c0[3];
                                if (animatedDrawable != gj0Var) {
                                    wg1Var4.f39681a.setAnimation(gj0Var);
                                    wg1Var4.f39686c0[3].L(18, false, false);
                                }
                                wg1Var4.f39681a.d();
                            }
                        } else {
                            wg1Var4.f39692n.setTransformationMethod(null);
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                wg1Var4.f39686c0[3].N(18);
                                org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.f39681a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.f39686c0[3];
                                if (animatedDrawable2 != gj0Var2) {
                                    wg1Var4.f39681a.setAnimation(gj0Var2);
                                }
                                wg1Var4.f39686c0[3].Q(0.0f, false);
                                wg1Var4.f39681a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = wg1Var4.f39692n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        wg1Var4.J = false;
                        return;
                }
            }
        });
        org.telegram.ui.Components.e31 e31Var = new org.telegram.ui.Components.e31(context);
        this.f39682a0 = e31Var;
        e31Var.setTransformType(1);
        this.f39682a0.setProgress(0.0f);
        this.f39682a0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false));
        this.f39682a0.setDrawBackground(false);
        this.Z.setContentDescription(LocaleController.getString(R.string.Next));
        this.Z.addView(this.f39682a0, k7.b6.e(56, 56, 17));
        this.Z.a(this.f39682a0);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20078o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        n7.qa.V(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final wg1 f35276b;

            {
                this.f35276b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35276b.C0();
                        return;
                    case 1:
                        wg1 wg1Var = this.f35276b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.Q = string;
                        wg1Var.showDialog(d2Var);
                        return;
                    case 2:
                        wg1.V(this.f35276b);
                        return;
                    case 3:
                        wg1 wg1Var2 = this.f35276b;
                        if (wg1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = wg1Var2.L;
                            if (i17 == 0) {
                                wg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = wg1Var2.X;
                                wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                return;
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                                wg1Var2.showDialog(d2Var2);
                                TextView textView2 = (TextView) d2Var2.d(-1);
                                if (textView2 != null) {
                                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                                    return;
                                }
                                return;
                            } else if (i17 == 2) {
                                wg1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        wg1 wg1Var3 = this.f35276b;
                        if (wg1Var3.L == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.T = true;
                            twoStepVerificationActivity.F = wg1Var3.R;
                            twoStepVerificationActivity.G = false;
                            twoStepVerificationActivity.U = wg1Var3.D;
                            wg1Var3.presentFragment(twoStepVerificationActivity, true);
                            sb0 sb0Var = wg1Var3.f39691g0;
                            if (sb0Var != null) {
                                AndroidUtilities.runOnUIThread(sb0Var);
                                wg1Var3.f39691g0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f35276b.C0();
                        return;
                    default:
                        wg1 wg1Var4 = this.f35276b;
                        int i18 = wg1Var4.L;
                        wg1Var4.J = true;
                        if (wg1Var4.f39692n.getTransformationMethod() == null) {
                            wg1Var4.f39692n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                wg1Var4.f39686c0[3].N(-1);
                                org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.f39681a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var = wg1Var4.f39686c0[3];
                                if (animatedDrawable != gj0Var) {
                                    wg1Var4.f39681a.setAnimation(gj0Var);
                                    wg1Var4.f39686c0[3].L(18, false, false);
                                }
                                wg1Var4.f39681a.d();
                            }
                        } else {
                            wg1Var4.f39692n.setTransformationMethod(null);
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                wg1Var4.f39686c0[3].N(18);
                                org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.f39681a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.f39686c0[3];
                                if (animatedDrawable2 != gj0Var2) {
                                    wg1Var4.f39681a.setAnimation(gj0Var2);
                                }
                                wg1Var4.f39686c0[3].Q(0.0f, false);
                                wg1Var4.f39681a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = wg1Var4.f39692n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        wg1Var4.J = false;
                        return;
                }
            }
        });
        ?? imageView = new ImageView(context);
        this.f39681a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        if (i16 == 2 && AndroidUtilities.isSmallScreen()) {
            this.f39681a.setVisibility(8);
        } else if (i16 != 6 && i16 != 9 && i16 != 7) {
            org.telegram.ui.Components.jj0 jj0Var = this.f39681a;
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            jj0Var.setVisibility(i10);
        }
        TextView textView2 = new TextView(context);
        this.f39685c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        this.f39685c.setGravity(1);
        this.f39685c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f39685c.setTextSize(1, 24.0f);
        ih.s sVar = new ih.s(context);
        this.d = sVar;
        int i17 = org.telegram.ui.ActionBar.j6.D6;
        sVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.e.setGravity(1);
        this.e.setTextSize(1, 14.0f);
        this.e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.e.setVisibility(8);
        this.e.setOnClickListener(new View.OnClickListener(this) {
            public final wg1 f35276b;

            {
                this.f35276b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35276b.C0();
                        return;
                    case 1:
                        wg1 wg1Var = this.f35276b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.Q = string;
                        wg1Var.showDialog(d2Var);
                        return;
                    case 2:
                        wg1.V(this.f35276b);
                        return;
                    case 3:
                        wg1 wg1Var2 = this.f35276b;
                        if (wg1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = wg1Var2.L;
                            if (i172 == 0) {
                                wg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = wg1Var2.X;
                                wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                                wg1Var2.showDialog(d2Var2);
                                TextView textView22 = (TextView) d2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                wg1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        wg1 wg1Var3 = this.f35276b;
                        if (wg1Var3.L == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.T = true;
                            twoStepVerificationActivity.F = wg1Var3.R;
                            twoStepVerificationActivity.G = false;
                            twoStepVerificationActivity.U = wg1Var3.D;
                            wg1Var3.presentFragment(twoStepVerificationActivity, true);
                            sb0 sb0Var = wg1Var3.f39691g0;
                            if (sb0Var != null) {
                                AndroidUtilities.runOnUIThread(sb0Var);
                                wg1Var3.f39691g0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f35276b.C0();
                        return;
                    default:
                        wg1 wg1Var4 = this.f35276b;
                        int i18 = wg1Var4.L;
                        wg1Var4.J = true;
                        if (wg1Var4.f39692n.getTransformationMethod() == null) {
                            wg1Var4.f39692n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                wg1Var4.f39686c0[3].N(-1);
                                org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.f39681a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var = wg1Var4.f39686c0[3];
                                if (animatedDrawable != gj0Var) {
                                    wg1Var4.f39681a.setAnimation(gj0Var);
                                    wg1Var4.f39686c0[3].L(18, false, false);
                                }
                                wg1Var4.f39681a.d();
                            }
                        } else {
                            wg1Var4.f39692n.setTransformationMethod(null);
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                wg1Var4.f39686c0[3].N(18);
                                org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.f39681a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.f39686c0[3];
                                if (animatedDrawable2 != gj0Var2) {
                                    wg1Var4.f39681a.setAnimation(gj0Var2);
                                }
                                wg1Var4.f39686c0[3].Q(0.0f, false);
                                wg1Var4.f39681a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = wg1Var4.f39692n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        wg1Var4.J = false;
                        return;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f39683b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.f39683b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f39683b.setGravity(17);
        this.f39683b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        this.f39683b.setTextSize(1, 15.0f);
        this.f39683b.setTypeface(AndroidUtilities.bold());
        this.f39683b.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.j6.Oh));
        this.f39683b.setOnClickListener(new View.OnClickListener(this) {
            public final wg1 f35276b;

            {
                this.f35276b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35276b.C0();
                        return;
                    case 1:
                        wg1 wg1Var = this.f35276b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                        alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                        d2Var.Q = string;
                        wg1Var.showDialog(d2Var);
                        return;
                    case 2:
                        wg1.V(this.f35276b);
                        return;
                    case 3:
                        wg1 wg1Var2 = this.f35276b;
                        if (wg1Var2.h.getAlpha() >= 0.5f) {
                            int i172 = wg1Var2.L;
                            if (i172 == 0) {
                                wg1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = wg1Var2.X;
                                wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                return;
                            } else if (i172 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                                wg1Var2.showDialog(d2Var2);
                                TextView textView22 = (TextView) d2Var2.d(-1);
                                if (textView22 != null) {
                                    textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                                    return;
                                }
                                return;
                            } else if (i172 == 2) {
                                wg1Var2.A0();
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    case 4:
                        wg1 wg1Var3 = this.f35276b;
                        if (wg1Var3.L == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.T = true;
                            twoStepVerificationActivity.F = wg1Var3.R;
                            twoStepVerificationActivity.G = false;
                            twoStepVerificationActivity.U = wg1Var3.D;
                            wg1Var3.presentFragment(twoStepVerificationActivity, true);
                            sb0 sb0Var = wg1Var3.f39691g0;
                            if (sb0Var != null) {
                                AndroidUtilities.runOnUIThread(sb0Var);
                                wg1Var3.f39691g0 = null;
                                return;
                            }
                            return;
                        }
                        return;
                    case 5:
                        this.f35276b.C0();
                        return;
                    default:
                        wg1 wg1Var4 = this.f35276b;
                        int i18 = wg1Var4.L;
                        wg1Var4.J = true;
                        if (wg1Var4.f39692n.getTransformationMethod() == null) {
                            wg1Var4.f39692n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                wg1Var4.f39686c0[3].N(-1);
                                org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.f39681a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var = wg1Var4.f39686c0[3];
                                if (animatedDrawable != gj0Var) {
                                    wg1Var4.f39681a.setAnimation(gj0Var);
                                    wg1Var4.f39686c0[3].L(18, false, false);
                                }
                                wg1Var4.f39681a.d();
                            }
                        } else {
                            wg1Var4.f39692n.setTransformationMethod(null);
                            wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                wg1Var4.f39686c0[3].N(18);
                                org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.f39681a.getAnimatedDrawable();
                                org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.f39686c0[3];
                                if (animatedDrawable2 != gj0Var2) {
                                    wg1Var4.f39681a.setAnimation(gj0Var2);
                                }
                                wg1Var4.f39686c0[3].Q(0.0f, false);
                                wg1Var4.f39681a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = wg1Var4.f39692n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        wg1Var4.J = false;
                        return;
                }
            }
        });
        if (i16 != 6 && i16 != 7 && i16 != 9) {
            this.f39685c.setTypeface(AndroidUtilities.bold());
            this.f39685c.setTextSize(1, 18.0f);
        } else {
            this.f39685c.setTypeface(Typeface.DEFAULT);
            this.f39685c.setTextSize(1, 24.0f);
        }
        switch (i16) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                n0 n0Var = new n0(this, context, 26);
                org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(this, context, n0Var, 2);
                y90Var.addView(n0Var);
                u9 u9Var = new u9(this, context, y90Var);
                vg1 vg1Var = new vg1(this, context);
                this.f39696x = vg1Var;
                vg1Var.setVerticalScrollBarEnabled(false);
                n0Var.addView(this.f39696x, k7.b6.c(-1.0f, -1));
                n0Var.addView(this.h, k7.b6.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                n0Var.addView(this.Z, org.telegram.ui.Components.a20.b());
                u9Var.addView(y90Var, k7.b6.c(-1.0f, -1));
                pb1 pb1Var = new pb1(this, context, 16);
                pb1Var.setOrientation(1);
                this.f39696x.addView(pb1Var, k7.b6.x(-1, -1, 51));
                pb1Var.addView(this.f39681a, k7.b6.t(-2, -2, 49, 0, 69, 0, 0));
                pb1Var.addView(this.f39685c, k7.b6.t(-2, -2, 49, 0, 8, 0, 0));
                pb1Var.addView(this.d, k7.b6.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.bd0 bd0Var = new org.telegram.ui.Components.bd0(context, null);
                this.f39694s = bd0Var;
                bd0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f39692n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int dp = AndroidUtilities.dp(16.0f);
                this.f39692n.setPadding(dp, dp, dp, dp);
                EditTextBoldCursor editTextBoldCursor2 = this.f39692n;
                int i18 = org.telegram.ui.ActionBar.j6.f20024l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                this.f39692n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                this.f39692n.setBackground(null);
                this.f39692n.setMaxLines(1);
                this.f39692n.setLines(1);
                this.f39692n.setGravity(3);
                this.f39692n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f39692n.setSingleLine(true);
                this.f39692n.setCursorWidth(1.5f);
                this.f39692n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final wg1 f35537b;

                    {
                        this.f35537b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                wg1 wg1Var = this.f35537b;
                                wg1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                wg1Var.C0();
                                return true;
                            default:
                                wg1 wg1Var2 = this.f35537b;
                                wg1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (wg1Var2.v.getVisibility() == 0) {
                                    wg1Var2.f39693r.requestFocus();
                                } else {
                                    wg1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.f39694s.e(this.f39692n);
                this.f39692n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final wg1 f35763b;

                    {
                        this.f35763b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z10) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.bd0 bd0Var2 = this.f35763b.v;
                                if (z10) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                bd0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                wg1 wg1Var = this.f35763b;
                                if (z10) {
                                    wg1Var.f39684b0.setEditText((EditText) view);
                                    wg1Var.f39684b0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                wg1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.bd0 bd0Var3 = this.f35763b.f39694s;
                                if (z10) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                bd0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f39692n, k7.b6.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, context, 3);
                this.B = l0Var;
                l0Var.setImageResource(R.drawable.msg_message);
                this.B.setScaleType(scaleType);
                this.B.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.B.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19971i6, false), 1, -1));
                this.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.B, false, 0.1f, false);
                this.B.setOnClickListener(new View.OnClickListener(this) {
                    public final wg1 f35276b;

                    {
                        this.f35276b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f35276b.C0();
                                return;
                            case 1:
                                wg1 wg1Var = this.f35276b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                                d2Var.Q = string;
                                wg1Var.showDialog(d2Var);
                                return;
                            case 2:
                                wg1.V(this.f35276b);
                                return;
                            case 3:
                                wg1 wg1Var2 = this.f35276b;
                                if (wg1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = wg1Var2.L;
                                    if (i172 == 0) {
                                        wg1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = wg1Var2.X;
                                        wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                        alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                                        wg1Var2.showDialog(d2Var2);
                                        TextView textView22 = (TextView) d2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        wg1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                wg1 wg1Var3 = this.f35276b;
                                if (wg1Var3.L == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.T = true;
                                    twoStepVerificationActivity.F = wg1Var3.R;
                                    twoStepVerificationActivity.G = false;
                                    twoStepVerificationActivity.U = wg1Var3.D;
                                    wg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    sb0 sb0Var = wg1Var3.f39691g0;
                                    if (sb0Var != null) {
                                        AndroidUtilities.runOnUIThread(sb0Var);
                                        wg1Var3.f39691g0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f35276b.C0();
                                return;
                            default:
                                wg1 wg1Var4 = this.f35276b;
                                int i182 = wg1Var4.L;
                                wg1Var4.J = true;
                                if (wg1Var4.f39692n.getTransformationMethod() == null) {
                                    wg1Var4.f39692n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                        wg1Var4.f39686c0[3].N(-1);
                                        org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.f39681a.getAnimatedDrawable();
                                        org.telegram.ui.Components.gj0 gj0Var = wg1Var4.f39686c0[3];
                                        if (animatedDrawable != gj0Var) {
                                            wg1Var4.f39681a.setAnimation(gj0Var);
                                            wg1Var4.f39686c0[3].L(18, false, false);
                                        }
                                        wg1Var4.f39681a.d();
                                    }
                                } else {
                                    wg1Var4.f39692n.setTransformationMethod(null);
                                    wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                        wg1Var4.f39686c0[3].N(18);
                                        org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.f39681a.getAnimatedDrawable();
                                        org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.f39686c0[3];
                                        if (animatedDrawable2 != gj0Var2) {
                                            wg1Var4.f39681a.setAnimation(gj0Var2);
                                        }
                                        wg1Var4.f39686c0[3].Q(0.0f, false);
                                        wg1Var4.f39681a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = wg1Var4.f39692n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                wg1Var4.J = false;
                                return;
                        }
                    }
                });
                linearLayout.addView(this.B, k7.b6.t(24, 24, 16, 0, 0, 16, 0));
                this.f39692n.addTextChangedListener(new tg1(this, 2));
                this.f39694s.addView(linearLayout, k7.b6.c(-2.0f, -1));
                pb1Var.addView(this.f39694s, k7.b6.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.bd0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f39693r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int dp2 = AndroidUtilities.dp(16.0f);
                this.f39693r.setPadding(dp2, dp2, dp2, dp2);
                this.f39693r.setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i18, false));
                this.f39693r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
                this.f39693r.setBackground(null);
                this.f39693r.setMaxLines(1);
                this.f39693r.setLines(1);
                this.f39693r.setGravity(3);
                this.f39693r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f39693r.setSingleLine(true);
                this.f39693r.setCursorWidth(1.5f);
                this.f39693r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final wg1 f35537b;

                    {
                        this.f35537b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i19, KeyEvent keyEvent) {
                        switch (r2) {
                            case 0:
                                wg1 wg1Var = this.f35537b;
                                wg1Var.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                wg1Var.C0();
                                return true;
                            default:
                                wg1 wg1Var2 = this.f35537b;
                                wg1Var2.getClass();
                                if (i19 != 5 && i19 != 6) {
                                    return false;
                                }
                                if (wg1Var2.v.getVisibility() == 0) {
                                    wg1Var2.f39693r.requestFocus();
                                } else {
                                    wg1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.f39693r);
                this.f39693r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                    public final wg1 f35763b;

                    {
                        this.f35763b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z10) {
                        float f10;
                        float f11;
                        switch (r2) {
                            case 0:
                                org.telegram.ui.Components.bd0 bd0Var2 = this.f35763b.v;
                                if (z10) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.0f;
                                }
                                bd0Var2.b(f10, f10, true);
                                return;
                            case 1:
                                wg1 wg1Var = this.f35763b;
                                if (z10) {
                                    wg1Var.f39684b0.setEditText((EditText) view);
                                    wg1Var.f39684b0.setDispatchBackWhenEmpty(true);
                                    return;
                                }
                                wg1Var.getClass();
                                return;
                            default:
                                org.telegram.ui.Components.bd0 bd0Var3 = this.f35763b.f39694s;
                                if (z10) {
                                    f11 = 1.0f;
                                } else {
                                    f11 = 0.0f;
                                }
                                bd0Var3.b(f11, f11, true);
                                return;
                        }
                    }
                });
                this.v.addView(this.f39693r, k7.b6.c(-2.0f, -1));
                pb1Var.addView(this.v, k7.b6.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.rr rrVar = new org.telegram.ui.Components.rr(context);
                this.f39684b0 = rrVar;
                rrVar.setVisibility(8);
                y90Var.addView(this.f39684b0);
                xd0 xd0Var = new xd0(this, context, 3);
                this.f39695w = xd0Var;
                final int i19 = 1;
                xd0Var.b(6, 1);
                ds[] dsVarArr = this.f39695w.f32635f;
                int length = dsVarArr.length;
                int i20 = 0;
                while (i20 < length) {
                    ds dsVar = dsVarArr[i20];
                    dsVar.setShowSoftInputOnFocusCompat(v0() ^ i19);
                    dsVar.addTextChangedListener(new tg1(this, 0));
                    dsVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                        public final wg1 f35763b;

                        {
                            this.f35763b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z10) {
                            float f10;
                            float f11;
                            switch (i19) {
                                case 0:
                                    org.telegram.ui.Components.bd0 bd0Var2 = this.f35763b.v;
                                    if (z10) {
                                        f10 = 1.0f;
                                    } else {
                                        f10 = 0.0f;
                                    }
                                    bd0Var2.b(f10, f10, true);
                                    return;
                                case 1:
                                    wg1 wg1Var = this.f35763b;
                                    if (z10) {
                                        wg1Var.f39684b0.setEditText((EditText) view);
                                        wg1Var.f39684b0.setDispatchBackWhenEmpty(true);
                                        return;
                                    }
                                    wg1Var.getClass();
                                    return;
                                default:
                                    org.telegram.ui.Components.bd0 bd0Var3 = this.f35763b.f39694s;
                                    if (z10) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = 0.0f;
                                    }
                                    bd0Var3.b(f11, f11, true);
                                    return;
                            }
                        }
                    });
                    i20++;
                    i19 = 1;
                }
                this.f39695w.setVisibility(8);
                pb1Var.addView(this.f39695w, k7.b6.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                pb1Var.addView(frameLayout, k7.b6.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.e, k7.b6.e(-2, -2, 49));
                if (i16 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f39689f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
                    this.f39689f.setGravity(1);
                    this.f39689f.setTextSize(1, 14.0f);
                    this.f39689f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f39689f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f39689f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    pb1Var.addView(this.f39689f, k7.b6.t(-2, -2, 49, 0, 0, 0, 25));
                    this.f39689f.setOnClickListener(new View.OnClickListener(this) {
                        public final wg1 f35276b;

                        {
                            this.f35276b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    this.f35276b.C0();
                                    return;
                                case 1:
                                    wg1 wg1Var = this.f35276b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                                    d2Var.Q = string;
                                    wg1Var.showDialog(d2Var);
                                    return;
                                case 2:
                                    wg1.V(this.f35276b);
                                    return;
                                case 3:
                                    wg1 wg1Var2 = this.f35276b;
                                    if (wg1Var2.h.getAlpha() >= 0.5f) {
                                        int i172 = wg1Var2.L;
                                        if (i172 == 0) {
                                            wg1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = wg1Var2.X;
                                            wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                            return;
                                        } else if (i172 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                            alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                                            wg1Var2.showDialog(d2Var2);
                                            TextView textView22 = (TextView) d2Var2.d(-1);
                                            if (textView22 != null) {
                                                textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                                                return;
                                            }
                                            return;
                                        } else if (i172 == 2) {
                                            wg1Var2.A0();
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                case 4:
                                    wg1 wg1Var3 = this.f35276b;
                                    if (wg1Var3.L == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.T = true;
                                        twoStepVerificationActivity.F = wg1Var3.R;
                                        twoStepVerificationActivity.G = false;
                                        twoStepVerificationActivity.U = wg1Var3.D;
                                        wg1Var3.presentFragment(twoStepVerificationActivity, true);
                                        sb0 sb0Var = wg1Var3.f39691g0;
                                        if (sb0Var != null) {
                                            AndroidUtilities.runOnUIThread(sb0Var);
                                            wg1Var3.f39691g0 = null;
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                case 5:
                                    this.f35276b.C0();
                                    return;
                                default:
                                    wg1 wg1Var4 = this.f35276b;
                                    int i182 = wg1Var4.L;
                                    wg1Var4.J = true;
                                    if (wg1Var4.f39692n.getTransformationMethod() == null) {
                                        wg1Var4.f39692n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                            wg1Var4.f39686c0[3].N(-1);
                                            org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.f39681a.getAnimatedDrawable();
                                            org.telegram.ui.Components.gj0 gj0Var = wg1Var4.f39686c0[3];
                                            if (animatedDrawable != gj0Var) {
                                                wg1Var4.f39681a.setAnimation(gj0Var);
                                                wg1Var4.f39686c0[3].L(18, false, false);
                                            }
                                            wg1Var4.f39681a.d();
                                        }
                                    } else {
                                        wg1Var4.f39692n.setTransformationMethod(null);
                                        wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i182 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                            wg1Var4.f39686c0[3].N(18);
                                            org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.f39681a.getAnimatedDrawable();
                                            org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.f39686c0[3];
                                            if (animatedDrawable2 != gj0Var2) {
                                                wg1Var4.f39681a.setAnimation(gj0Var2);
                                            }
                                            wg1Var4.f39686c0[3].Q(0.0f, false);
                                            wg1Var4.f39681a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor32 = wg1Var4.f39692n;
                                    editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                    wg1Var4.J = false;
                                    return;
                            }
                        }
                    });
                }
                this.fragmentView = u9Var;
                eg.i0 i0Var = new eg.i0(this, context);
                this.f39697y = i0Var;
                i0Var.setAlpha(0.0f);
                u9Var.addView(this.f39697y);
                u9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.I = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.I.setAlpha(0.0f);
                this.I.setScaleX(0.1f);
                this.I.setScaleY(0.1f);
                this.I.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20024l6, false));
                n0Var.addView(this.I, k7.b6.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                g gVar = new g(this, context, 3);
                gVar.setOnTouchListener(new oh.d(2));
                gVar.addView(this.actionBar);
                gVar.addView(this.f39681a);
                gVar.addView(this.f39685c);
                gVar.addView(this.d);
                gVar.addView(this.f39683b);
                this.fragmentView = gVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
        String str = "";
        switch (i16) {
            case 0:
            case 1:
                if (this.R.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.f39685c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    if (i16 == 0) {
                        i11 = R.string.CreatePassword;
                    } else {
                        i11 = R.string.ReEnterPassword;
                    }
                    String string = LocaleController.getString(i11);
                    this.actionBar.setTitle(string);
                    this.f39685c.setText(string);
                }
                if (!TextUtils.isEmpty(this.X)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                org.telegram.ui.Components.bd0 bd0Var2 = this.f39694s;
                if (i16 == 0) {
                    i12 = R.string.EnterPassword;
                } else {
                    i12 = R.string.ReEnterPassword;
                }
                bd0Var2.setText(LocaleController.getString(i12));
                EditTextBoldCursor editTextBoldCursor4 = this.f39692n;
                if (i16 == 0) {
                    i13 = R.string.EnterPassword;
                } else {
                    i13 = R.string.ReEnterPassword;
                }
                editTextBoldCursor4.setContentDescription(LocaleController.getString(i13));
                this.f39692n.setImeOptions(268435461);
                this.f39692n.setInputType(129);
                this.f39692n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f39692n.setTypeface(Typeface.DEFAULT);
                if (i16 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.C = z4;
                AndroidUtilities.updateViewVisibilityAnimated(this.B, false, 0.1f, false);
                org.telegram.ui.Components.gj0[] gj0VarArr = new org.telegram.ui.Components.gj0[7];
                this.f39686c0 = gj0VarArr;
                gj0VarArr[0] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39686c0[1] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39686c0[2] = new org.telegram.ui.Components.gj0(R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39686c0[3] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39686c0[4] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39686c0[5] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f39686c0[6] = new org.telegram.ui.Components.gj0(R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.gj0 gj0Var = this.f39686c0[6];
                gj0Var.h = true;
                gj0Var.N(19);
                this.f39686c0[2].P(97, this.f39690f0);
                F0(true);
                if (i16 == 1) {
                    ng1 ng1Var = this.f39687d0;
                    if (ng1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(ng1Var);
                    }
                    this.f39681a.setAnimation(this.f39686c0[6]);
                    this.f39681a.d();
                    i14 = 1;
                    break;
                } else {
                    this.f39692n.dispatchTextWatchersTextChanged();
                    i14 = 1;
                    F0(true);
                    break;
                }
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.f39685c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.f39694s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f39692n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f39692n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.f39681a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.f39681a.d();
                i14 = 1;
                break;
            case 3:
                this.actionBar.setTitle(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.W) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.f39685c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.f39694s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f39692n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f39692n.setImeOptions(268435461);
                this.f39692n.setInputType(33);
                this.v.setVisibility(8);
                this.f39681a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.f39681a.d();
                i14 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f39685c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.f39684b0.setVisibility(0);
                this.f39694s.setVisibility(8);
                String str2 = this.R.email_unconfirmed_pattern;
                if (str2 != null) {
                    str = str2;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                int indexOf = str.indexOf(42);
                int lastIndexOf = str.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    ?? obj = new Object();
                    obj.f28632a |= 256;
                    obj.f28633b = indexOf;
                    int i21 = lastIndexOf + 1;
                    obj.f28634c = i21;
                    valueOf.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i21, 0);
                }
                this.d.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), valueOf));
                this.d.setVisibility(0);
                this.Z.e(false, false);
                this.f39695w.setVisibility(0);
                this.f39681a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f39681a.d();
                i14 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f39685c.setText(LocaleController.getString(R.string.VerificationCode));
                this.f39694s.setVisibility(8);
                this.f39684b0.setVisibility(0);
                ih.s sVar2 = this.d;
                int i22 = R.string.EmailPasswordConfirmText2;
                String str3 = this.R.email_unconfirmed_pattern;
                if (str3 != null) {
                    str = str3;
                }
                sVar2.setText(LocaleController.formatString("EmailPasswordConfirmText2", i22, str));
                this.d.setVisibility(0);
                this.Z.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                this.h.setOnClickListener(new View.OnClickListener(this) {
                    public final wg1 f35276b;

                    {
                        this.f35276b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                this.f35276b.C0();
                                return;
                            case 1:
                                wg1 wg1Var = this.f35276b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new mg1(wg1Var, 1));
                                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ResetPassword);
                                String string2 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
                                d2Var.Q = string2;
                                wg1Var.showDialog(d2Var);
                                return;
                            case 2:
                                wg1.V(this.f35276b);
                                return;
                            case 3:
                                wg1 wg1Var2 = this.f35276b;
                                if (wg1Var2.h.getAlpha() >= 0.5f) {
                                    int i172 = wg1Var2.L;
                                    if (i172 == 0) {
                                        wg1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = wg1Var2.X;
                                        wg1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new og1(wg1Var2, 1));
                                        return;
                                    } else if (i172 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg1Var2.getParentActivity());
                                        alertDialog$Builder2.f19478a.Q = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f19478a.O = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new mg1(wg1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f19478a;
                                        wg1Var2.showDialog(d2Var2);
                                        TextView textView22 = (TextView) d2Var2.d(-1);
                                        if (textView22 != null) {
                                            textView22.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20116q7, false));
                                            return;
                                        }
                                        return;
                                    } else if (i172 == 2) {
                                        wg1Var2.A0();
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            case 4:
                                wg1 wg1Var3 = this.f35276b;
                                if (wg1Var3.L == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.T = true;
                                    twoStepVerificationActivity.F = wg1Var3.R;
                                    twoStepVerificationActivity.G = false;
                                    twoStepVerificationActivity.U = wg1Var3.D;
                                    wg1Var3.presentFragment(twoStepVerificationActivity, true);
                                    sb0 sb0Var = wg1Var3.f39691g0;
                                    if (sb0Var != null) {
                                        AndroidUtilities.runOnUIThread(sb0Var);
                                        wg1Var3.f39691g0 = null;
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 5:
                                this.f35276b.C0();
                                return;
                            default:
                                wg1 wg1Var4 = this.f35276b;
                                int i182 = wg1Var4.L;
                                wg1Var4.J = true;
                                if (wg1Var4.f39692n.getTransformationMethod() == null) {
                                    wg1Var4.f39692n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                        wg1Var4.f39686c0[3].N(-1);
                                        org.telegram.ui.Components.gj0 animatedDrawable = wg1Var4.f39681a.getAnimatedDrawable();
                                        org.telegram.ui.Components.gj0 gj0Var2 = wg1Var4.f39686c0[3];
                                        if (animatedDrawable != gj0Var2) {
                                            wg1Var4.f39681a.setAnimation(gj0Var2);
                                            wg1Var4.f39686c0[3].L(18, false, false);
                                        }
                                        wg1Var4.f39681a.d();
                                    }
                                } else {
                                    wg1Var4.f39692n.setTransformationMethod(null);
                                    wg1Var4.B.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i182 == 0 && wg1Var4.f39692n.length() > 0 && wg1Var4.f39692n.hasFocus()) {
                                        wg1Var4.f39686c0[3].N(18);
                                        org.telegram.ui.Components.gj0 animatedDrawable2 = wg1Var4.f39681a.getAnimatedDrawable();
                                        org.telegram.ui.Components.gj0 gj0Var22 = wg1Var4.f39686c0[3];
                                        if (animatedDrawable2 != gj0Var22) {
                                            wg1Var4.f39681a.setAnimation(gj0Var22);
                                        }
                                        wg1Var4.f39686c0[3].Q(0.0f, false);
                                        wg1Var4.f39681a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor32 = wg1Var4.f39692n;
                                editTextBoldCursor32.setSelection(editTextBoldCursor32.length());
                                wg1Var4.J = false;
                                return;
                        }
                    }
                });
                this.f39695w.setVisibility(0);
                this.f39681a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f39681a.d();
                i14 = 1;
                break;
            case 6:
                this.f39685c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.f39683b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.f39681a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.f39681a.d();
                i14 = 1;
                break;
            case 7:
                this.f39685c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.V) {
                    this.f39683b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.E) {
                    this.f39683b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.f39683b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.f39681a.f(R.raw.wallet_allset, 160, 160, null);
                this.f39681a.d();
                i14 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.f39685c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.e.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20078o6, false));
                this.f39694s.setText(LocaleController.getString(R.string.LoginPassword));
                this.f39692n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.f39692n.setImeOptions(268435462);
                this.f39692n.setInputType(129);
                this.f39692n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f39692n.setTypeface(Typeface.DEFAULT);
                this.f39681a.f(R.raw.wallet_science, 120, 120, null);
                this.f39681a.d();
                i14 = 1;
                break;
            case 9:
                this.f39685c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.f39683b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.f39681a.f(R.raw.wallet_perfect, 140, 140, null);
                this.f39681a.d();
                i14 = 1;
                break;
            default:
                i14 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor5 = this.f39692n;
        if (editTextBoldCursor5 != null) {
            editTextBoldCursor5.addTextChangedListener(new tg1(this, i14));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z4) {
        for (org.telegram.ui.ActionBar.p2 p2Var : getParentLayout().getFragmentStack()) {
            if (p2Var != this && (p2Var instanceof wg1)) {
                ((org.telegram.ui.Components.t61) ((wg1) p2Var).Y.f14687b).f28925b = true;
            }
        }
        return super.finishFragment(z4);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20151s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39685c, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39692n, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39692n, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39692n, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f20006k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39692n, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f20024l6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i10 = this.L;
        if (i10 != 7 && i10 != 9) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, true)) > 0.699999988079071d) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.D >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            return false;
        }
        return super.isSwipeBackEnabled(motionEvent);
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (this.D >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            if (z4) {
                I0();
                return false;
            }
            return false;
        }
        if (z4) {
            finishFragment();
        }
        return true;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        int i11 = 0;
        if (this.f39681a != null) {
            int i12 = this.L;
            if (i12 == 2 && AndroidUtilities.isSmallScreen()) {
                this.f39681a.setVisibility(8);
            } else if (i12 != 6 && i12 != 9 && i12 != 7) {
                org.telegram.ui.Components.jj0 jj0Var = this.f39681a;
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
                jj0Var.setVisibility(i10);
            }
        }
        org.telegram.ui.Components.rr rrVar = this.f39684b0;
        if (rrVar != null) {
            if (!v0()) {
                i11 = 8;
            }
            rrVar.setVisibility(i11);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.K = false;
        ng1 ng1Var = this.f39687d0;
        if (ng1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ng1Var);
            this.f39687d0 = null;
        }
        if (this.f39686c0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.gj0[] gj0VarArr = this.f39686c0;
                if (i10 >= gj0VarArr.length) {
                    break;
                }
                gj0VarArr[i10].A(false);
                i10++;
            }
            this.f39686c0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.P = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.P = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            if (this.f39692n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new ng1(this, 0), 200L);
            }
            xd0 xd0Var = this.f39695w;
            if (xd0Var != null && xd0Var.getVisibility() == 0) {
                AndroidUtilities.runOnUIThread(new ng1(this, 1), 200L);
            }
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            xd0 xd0Var = this.f39695w;
            ds[] dsVarArr = xd0Var.f32635f;
            if (i10 < dsVarArr.length) {
                ds dsVar = dsVarArr[i10];
                dsVar.postDelayed(new dl0(dsVar, 1), i10 * 75);
                i10++;
            } else {
                xd0Var.postDelayed(new sg1(0, this, runnable), (dsVarArr.length * 75) + 350);
                return;
            }
        }
    }

    public final boolean v0() {
        int i10 = this.L;
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
        this.Z.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() != null && !getParentActivity().isFinishing()) {
            this.Z.f(true, true);
        }
    }

    public final void y0() {
        ds[] dsVarArr;
        for (ds dsVar : this.f39695w.f32635f) {
            dsVar.setText("");
            dsVar.i(1.0f);
        }
        this.f39695w.f32635f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.f39695w, 8.0f, new ng1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.bd0 bd0Var, EditTextBoldCursor editTextBoldCursor, boolean z4) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            editTextBoldCursor.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z4) {
            editTextBoldCursor.setText("");
        }
        AndroidUtilities.shakeViewSpring(bd0Var, 5.0f);
    }

    @Override
    public final void finishFragment() {
        if (this.D >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle i10 = android.support.v4.media.a.i("afterSignup", true);
            xg0 xg0Var = new xg0();
            xg0Var.l0(i10);
            presentFragment(xg0Var, true);
            return;
        }
        super.finishFragment();
    }

    public wg1(int i10, TL_account.Password password) {
        super(null);
        this.C = false;
        this.D = -1;
        this.G = new ArrayList();
        this.S = new byte[0];
        this.f39688e0 = new ng1(this, 2);
        this.f39690f0 = new ng1(this, 3);
        this.L = i10;
        this.R = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new og1(this, 0), 10);
            return;
        }
        this.Q = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
    }

    public void B0() {
    }
}
