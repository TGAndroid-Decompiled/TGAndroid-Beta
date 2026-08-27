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

public class zf1 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.ActionBar.l0 A;
    public boolean B;
    public int C;
    public boolean D;
    public AnimatorSet E;
    public final ArrayList F;
    public AnimatorSet G;
    public RadialProgressView H;
    public boolean I;
    public boolean J;
    public final int K;
    public String L;
    public String M;
    public String N;
    public boolean O;
    public boolean P;
    public TL_account.Password Q;
    public byte[] R;
    public long S;
    public byte[] T;
    public boolean U;
    public boolean V;
    public String W;
    public i6 X;
    public org.telegram.ui.Components.m10 Y;
    public org.telegram.ui.Components.l21 Z;

    public org.telegram.ui.Components.ri0 f45161a;

    public org.telegram.ui.Components.ir f45162a0;

    public TextView f45163b;

    public org.telegram.ui.Components.oi0[] f45164b0;

    public TextView f45165c;

    public rf1 f45166c0;
    public eh.s d;

    public final Runnable f45167d0;

    public TextView f45168e;

    public final Runnable f45169e0;

    public TextView f45170f;

    public jb0 f45171f0;
    public TextView h;

    public EditTextBoldCursor f45172n;

    public EditTextBoldCursor f45173r;

    public org.telegram.ui.Components.jc0 f45174s;
    public org.telegram.ui.Components.jc0 v;

    public od0 f45175w;

    public yf1 f45176x;

    public ag.t0 f45177y;

    public zf1(int i10, int i11, TL_account.Password password) {
        super(null);
        this.B = false;
        this.C = -1;
        this.F = new ArrayList();
        this.R = new byte[0];
        this.f45167d0 = new rf1(this, 2);
        this.f45169e0 = new rf1(this, 3);
        this.currentAccount = i10;
        this.K = i11;
        this.Q = password;
        this.P = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        if (this.Q == null) {
            if (i11 == 6 || i11 == 8) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new sf1(this, 0), 10);
            }
        }
    }

    public static void U(zf1 zf1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        byte[] x8;
        byte[] bArr;
        byte[] bArr2;
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                TL_account.Password password = zf1Var.Q;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
                updatepasswordsettings.password = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.startCheck(zf1Var.R, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            }
        }
        if (z10 || str == null) {
            x8 = null;
            bArr = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = zf1Var.Q.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                x8 = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
                bArr = stringBytes;
            } else {
                bArr = stringBytes;
                x8 = null;
            }
        }
        fh.g gVar = new fh.g(zf1Var, x8, str, passwordinputsettings, z10, 4);
        if (z10) {
            ConnectionsManager.getInstance(zf1Var.currentAccount).sendRequest(tLObject, gVar, 10);
            return;
        }
        if (str != null && (bArr2 = zf1Var.T) != null && bArr2.length == 32) {
            TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = zf1Var.Q.new_secure_algo;
            if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                byte[] bArrComputePBKDF2 = Utilities.computePBKDF2(bArr, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                byte[] bArr3 = new byte[32];
                System.arraycopy(bArrComputePBKDF2, 0, bArr3, 0, 32);
                byte[] bArr4 = new byte[16];
                System.arraycopy(bArrComputePBKDF2, 32, bArr4, 0, 16);
                byte[] bArr5 = new byte[32];
                System.arraycopy(zf1Var.T, 0, bArr5, 0, 32);
                Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 1);
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                tL_secureSecretSettings.secure_secret = bArr5;
                tL_secureSecretSettings.secure_secret_id = zf1Var.S;
                passwordinputsettings.flags |= 4;
            }
        }
        TLRPC.PasswordKdfAlgo passwordKdfAlgo3 = zf1Var.Q.new_algo;
        if (!(passwordKdfAlgo3 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            gVar.run(null, tL_error);
            return;
        }
        if (str != null) {
            byte[] vBytes = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo3);
            passwordinputsettings.new_password_hash = vBytes;
            if (vBytes == null) {
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "ALGO_INVALID";
                gVar.run(null, tL_error2);
            }
        }
        ConnectionsManager.getInstance(zf1Var.currentAccount).sendRequest(tLObject, gVar, 10);
    }

    public static void V(zf1 zf1Var) {
        ConnectionsManager.getInstance(zf1Var.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new jh.m5(5));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ResendCodeInfo);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.TwoStepVerificationTitle);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        zf1Var.showDialog(alertDialog$Builder.f22702a);
    }

    public static void W(zf1 zf1Var, byte[] bArr) {
        ArrayList arrayList = zf1Var.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = zf1Var.Q;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = zf1Var.Q;
        if (bArr == null) {
            bArr = zf1Var.R;
        }
        twoStepVerificationActivity.v0(password2, bArr, zf1Var.S, zf1Var.T);
        twoStepVerificationActivity.T = zf1Var.C;
        zf1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, zf1Var.Q);
        jb0 jb0Var = zf1Var.f45171f0;
        if (jb0Var != null) {
            AndroidUtilities.runOnUIThread(jb0Var);
            zf1Var.f45171f0 = null;
        }
    }

    public static void X(zf1 zf1Var) {
        ArrayList arrayList = zf1Var.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(zf1Var.currentAccount);
        int i11 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = zf1Var.R;
        TL_account.Password password = zf1Var.Q;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, password.new_algo, password.new_secure_algo, password.secure_random, zf1Var.N, zf1Var.M, null, zf1Var.L);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = zf1Var.Q;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.v0(password2, zf1Var.R, zf1Var.S, zf1Var.T);
        twoStepVerificationActivity.T = zf1Var.C;
        zf1Var.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, zf1Var.Q);
        jb0 jb0Var = zf1Var.f45171f0;
        if (jb0Var != null) {
            AndroidUtilities.runOnUIThread(jb0Var);
            zf1Var.f45171f0 = null;
        }
    }

    public static void Y(zf1 zf1Var, byte[] bArr) {
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = zf1Var.Q.current_algo;
        byte[] x8 = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        rc1 rc1Var = new rc1(3, zf1Var, x8);
        TL_account.Password password = zf1Var.Q;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            rc1Var.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x8, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck != null) {
            ConnectionsManager.getInstance(zf1Var.currentAccount).sendRequest(getpasswordsettings, rc1Var, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        rc1Var.run(null, tL_error2);
    }

    public static void Z(zf1 zf1Var, TLRPC.TL_error tL_error) {
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(zf1Var.currentAccount).sendRequest(new TL_account.getPassword(), new sf1(zf1Var, 4), 8);
            return;
        }
        zf1Var.w0();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            zf1Var.d.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            zf1Var.d.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23269p7, false));
            zf1Var.z0(zf1Var.f45174s, zf1Var.f45172n, true);
            zf1Var.H0(false);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            zf1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            zf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
        }
    }

    public static void a0(zf1 zf1Var) {
        ArrayList arrayList = zf1Var.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        zf1Var.finishFragment();
    }

    public static void b0(zf1 zf1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            zf1Var.Q = password;
            if (!TwoStepVerificationActivity.i0(password, false)) {
                org.telegram.ui.Components.y4.x0(zf1Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            zf1Var.P = !TextUtils.isEmpty(zf1Var.Q.email_unconfirmed_pattern);
            TwoStepVerificationActivity.m0(zf1Var.Q);
            if (!zf1Var.O && zf1Var.U) {
                TL_account.Password password2 = zf1Var.Q;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!zf1Var.P && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        zf1Var.finishFragment();
                    }
                }
            }
            if (zf1Var.J) {
                zf1Var.w0();
                zf1Var.C0();
            }
            NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, zf1Var.Q);
        }
    }

    public static void c0(zf1 zf1Var, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            zf1Var.Q = password;
            TwoStepVerificationActivity.m0(password);
            zf1Var.E0(z10);
            NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, zf1Var.Q);
        }
    }

    public static void d0(zf1 zf1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        TL_account.Password password;
        ArrayList arrayList = zf1Var.F;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(zf1Var.currentAccount).sendRequest(new TL_account.getPassword(), new lh.n3(12, zf1Var, z10), 8);
            return;
        }
        zf1Var.w0();
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if (!"EMAIL_UNCONFIRMED".equals(tL_error.text) && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    if ("EMAIL_INVALID".equals(tL_error.text)) {
                        zf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                        return;
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        zf1Var.G0(LocaleController.getString(R.string.AppName), tL_error.text);
                        return;
                    } else {
                        int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        zf1Var.G0(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                        return;
                    }
                }
                NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((org.telegram.ui.ActionBar.n2) arrayList.get(i10)).removeSelfFromStack();
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(zf1Var.currentAccount);
                int i11 = NotificationCenter.twoStepPasswordChanged;
                TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                TL_account.Password password2 = zf1Var.Q;
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                byte[] bArr2 = password2.secure_random;
                String str2 = zf1Var.N;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, zf1Var.M, str2, zf1Var.L);
                TL_account.Password password3 = zf1Var.Q;
                password3.email_unconfirmed_pattern = zf1Var.N;
                zf1 zf1Var2 = new zf1(5, password3);
                zf1Var2.D = zf1Var.D;
                zf1Var2.D0(bArr != null ? bArr : zf1Var.R, zf1Var.S, zf1Var.T, zf1Var.V);
                zf1Var2.U = zf1Var.U;
                zf1Var2.C = zf1Var.C;
                zf1Var.presentFragment(zf1Var2, true);
                return;
            }
            return;
        }
        zf1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z10) {
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((org.telegram.ui.ActionBar.n2) arrayList.get(i12)).removeSelfFromStack();
            }
            NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            zf1Var.finishFragment();
            return;
        }
        if (zf1Var.getParentActivity() == null) {
            return;
        }
        if (zf1Var.Q.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(27, zf1Var, bArr));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            if (str == null && (password = zf1Var.Q) != null && password.has_password) {
                b2Var.P = LocaleController.getString(R.string.YourEmailSuccessText);
            } else {
                b2Var.P = LocaleController.getString(R.string.YourPasswordChangedSuccessText);
            }
            b2Var.N = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog dialogShowDialog = zf1Var.showDialog(b2Var);
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i13 = 0; i13 < size3; i13++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i13)).removeSelfFromStack();
        }
        TL_account.Password password4 = zf1Var.Q;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (zf1Var.U) {
            NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        }
        zf1 zf1Var3 = new zf1(7, zf1Var.Q);
        zf1Var3.D = zf1Var.D;
        zf1Var3.D0(bArr != null ? bArr : zf1Var.R, zf1Var.S, zf1Var.T, zf1Var.V);
        zf1Var3.U = zf1Var.U;
        zf1Var3.C = zf1Var.C;
        zf1Var.presentFragment(zf1Var3, true);
        NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, zf1Var.Q);
    }

    public static void e0(zf1 zf1Var, TLRPC.TL_error tL_error) {
        zf1Var.w0();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = zf1Var.Q;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.v0(password, zf1Var.R, zf1Var.S, zf1Var.T);
            twoStepVerificationActivity.T = zf1Var.C;
            zf1Var.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            jb0 jb0Var = zf1Var.f45171f0;
            if (jb0Var != null) {
                AndroidUtilities.runOnUIThread(jb0Var);
                zf1Var.f45171f0 = null;
            }
        }
    }

    public static void f0(zf1 zf1Var) {
        ArrayList arrayList = zf1Var.F;
        int i10 = 4;
        if (zf1Var.Q.has_password) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qf1(zf1Var, i10));
            boolean z10 = zf1Var.Q.has_recovery;
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            if (z10) {
                b2Var.P = LocaleController.getString(R.string.YourEmailSuccessChangedText);
            } else {
                b2Var.P = LocaleController.getString(R.string.YourEmailSuccessText);
            }
            b2Var.N = LocaleController.getString(R.string.YourPasswordSuccess);
            Dialog dialogShowDialog = zf1Var.showDialog(b2Var);
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((org.telegram.ui.ActionBar.n2) arrayList.get(i11)).removeSelfFromStack();
        }
        TL_account.Password password = zf1Var.Q;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        zf1 zf1Var2 = new zf1(7, password);
        zf1Var2.D = zf1Var.D;
        zf1Var2.D0(zf1Var.R, zf1Var.S, zf1Var.T, zf1Var.V);
        zf1Var2.F.addAll(arrayList);
        zf1Var2.U = zf1Var.U;
        zf1Var2.C = zf1Var.C;
        zf1Var.presentFragment(zf1Var2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(zf1Var.currentAccount);
        int i12 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = zf1Var.R;
        TL_account.Password password2 = zf1Var.Q;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i12, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, zf1Var.N, zf1Var.M, null, zf1Var.L);
        NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, zf1Var.Q);
    }

    public static void g0(zf1 zf1Var, String str) {
        zf1 zf1Var2 = new zf1(zf1Var.currentAccount, 0, zf1Var.Q);
        zf1Var2.D = zf1Var.D;
        zf1Var2.F.addAll(zf1Var.F);
        zf1Var2.F.add(zf1Var);
        zf1Var2.W = str;
        zf1Var2.C = zf1Var.C;
        zf1Var.presentFragment(zf1Var2, true);
    }

    public static void h0(zf1 zf1Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            zf1Var.Q = password;
            TwoStepVerificationActivity.m0(password);
            NotificationCenter.getInstance(zf1Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetOrRemoveTwoStepPassword, zf1Var.Q);
            zf1Var.C0();
        }
    }

    public final void A0() {
        TL_account.Password password = this.Q;
        if (password.has_recovery) {
            this.N = "";
            E0(false);
            return;
        }
        zf1 zf1Var = new zf1(this.currentAccount, 3, password);
        zf1Var.D = this.D;
        zf1Var.D0(this.R, this.S, this.T, this.V);
        zf1Var.L = this.L;
        zf1Var.M = this.M;
        zf1Var.F.addAll(this.F);
        zf1Var.F.add(this);
        zf1Var.U = this.U;
        zf1Var.C = this.C;
        presentFragment(zf1Var);
    }

    public final void C0() {
        if (getParentActivity() == null) {
            return;
        }
        switch (this.K) {
            case 0:
            case 1:
                if (this.f45172n.length() == 0) {
                    z0(this.f45174s, this.f45172n, false);
                } else if (this.f45172n.getText().toString().equals(this.L) || this.K != 1) {
                    zf1 zf1Var = new zf1(this.currentAccount, this.K != 0 ? 2 : 1, this.Q);
                    zf1Var.D = this.D;
                    zf1Var.L = this.f45172n.getText().toString();
                    zf1Var.D0(this.R, this.S, this.T, this.V);
                    zf1Var.W = this.W;
                    zf1Var.F.addAll(this.F);
                    zf1Var.F.add(this);
                    zf1Var.U = this.U;
                    zf1Var.C = this.C;
                    presentFragment(zf1Var);
                } else {
                    AndroidUtilities.shakeViewSpring(this.f45174s, 5.0f);
                    try {
                        this.f45174s.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                break;
            case 2:
                String string = this.f45172n.getText().toString();
                this.M = string;
                if (!string.equalsIgnoreCase(this.L)) {
                    A0();
                } else {
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                    z0(this.f45174s, this.f45172n, false);
                }
                break;
            case 3:
                if (!this.V && this.h.getAlpha() < 1.0f) {
                    this.h.animate().cancel();
                    this.h.animate().alpha(1.0f).start();
                }
                String string2 = this.f45172n.getText().toString();
                this.N = string2;
                if (string2 != null && string2.length() >= 3) {
                    int iLastIndexOf = string2.lastIndexOf(46);
                    int iLastIndexOf2 = string2.lastIndexOf(64);
                    if (iLastIndexOf2 >= 0 && iLastIndexOf >= iLastIndexOf2) {
                        E0(false);
                    }
                }
                z0(this.f45174s, this.f45172n, false);
                break;
            case 4:
                String code = this.f45175w.getCode();
                TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                tL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new rc1(2, this, code), 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.f45175w.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new sf1(this, 2), 10);
                x0();
                break;
            case 6:
                TL_account.Password password = this.Q;
                if (password != null) {
                    zf1 zf1Var2 = new zf1(this.currentAccount, 0, password);
                    zf1Var2.D = this.D;
                    zf1Var2.U = this.U;
                    zf1Var2.C = this.C;
                    presentFragment(zf1Var2, true);
                } else {
                    x0();
                    this.J = true;
                }
                break;
            case 7:
                if (this.U) {
                    finishFragment();
                } else if (!this.D) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    twoStepVerificationActivity.v0(this.Q, this.R, this.S, this.T);
                    twoStepVerificationActivity.T = this.C;
                    presentFragment(twoStepVerificationActivity, true);
                    jb0 jb0Var = this.f45171f0;
                    if (jb0Var != null) {
                        AndroidUtilities.runOnUIThread(jb0Var);
                        this.f45171f0 = null;
                    }
                } else {
                    Bundle bundleH = a9.p.h("afterSignup", true);
                    qg0 qg0Var = new qg0();
                    qg0Var.l0(bundleH);
                    presentFragment(qg0Var, true);
                }
                break;
            case 8:
                if (this.Q != null) {
                    String string3 = this.f45172n.getText().toString();
                    if (string3.length() != 0) {
                        byte[] stringBytes = AndroidUtilities.getStringBytes(string3);
                        x0();
                        Utilities.globalQueue.postRunnable(new tf1(this, stringBytes, 0));
                    } else {
                        z0(this.f45174s, this.f45172n, false);
                    }
                } else {
                    x0();
                    this.J = true;
                }
                break;
            case 9:
                finishFragment();
                break;
        }
    }

    public final void D0(byte[] bArr, long j10, byte[] bArr2, boolean z10) {
        this.R = bArr;
        this.T = bArr2;
        this.S = j10;
        this.V = z10;
    }

    public final void E0(boolean z10) {
        TL_account.Password password;
        TLObject tLObject;
        if (z10 && this.P && this.Q.has_password) {
            x0();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new sf1(this, 3));
            return;
        }
        String str = this.L;
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z10) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
            this.T = null;
            if (this.P) {
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
            if (this.M == null && (password = this.Q) != null) {
                this.M = password.hint;
            }
            if (this.M == null) {
                this.M = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.M;
                passwordinputsettings.new_algo = this.Q.new_algo;
            }
            if (this.N.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.N.trim();
            }
        }
        if (this.W != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.W;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            tLObject = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
            byte[] bArr = this.R;
            if (bArr == null || bArr.length == 0 || (z10 && this.P)) {
                updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings.new_settings = passwordinputsettings;
            tLObject = updatepasswordsettings;
        }
        TLObject tLObject2 = tLObject;
        x0();
        Utilities.globalQueue.postRunnable(new cg.j(this, tLObject2, z10, str, passwordinputsettings));
    }

    public final void F0(boolean z10) {
        if (this.K != 0) {
            return;
        }
        rf1 rf1Var = this.f45166c0;
        if (rf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rf1Var);
        }
        org.telegram.ui.Components.oi0 animatedDrawable = this.f45161a.getAnimatedDrawable();
        if (z10) {
            if (Utilities.random.nextInt() % 2 == 0) {
                this.f45161a.setAnimation(this.f45164b0[0]);
                this.f45164b0[0].Q(0.0f, true);
            } else {
                this.f45161a.setAnimation(this.f45164b0[1]);
                this.f45164b0[1].Q(0.0f, true);
            }
            if (!z10) {
                this.f45161a.d();
            }
        } else {
            org.telegram.ui.Components.oi0[] oi0VarArr = this.f45164b0;
            if (animatedDrawable == oi0VarArr[0] || animatedDrawable == oi0VarArr[1] || (this.f45172n.length() == 0 && (animatedDrawable == null || !animatedDrawable.f31317h0))) {
                if (Utilities.random.nextInt() % 2 == 0) {
                    this.f45161a.setAnimation(this.f45164b0[0]);
                    this.f45164b0[0].Q(0.0f, true);
                } else {
                    this.f45161a.setAnimation(this.f45164b0[1]);
                    this.f45164b0[1].Q(0.0f, true);
                }
                if (!z10) {
                    this.f45161a.d();
                }
            }
        }
        rf1 rf1Var2 = new rf1(this, 4);
        this.f45166c0 = rf1Var2;
        AndroidUtilities.runOnUIThread(rf1Var2, Utilities.random.nextInt(2000) + 5000);
    }

    public final void G0(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = str;
        b2Var.P = str2;
        showDialog(b2Var);
    }

    public final void H0(boolean z10) {
        if (z10 == (this.f45163b.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f45163b.setTag(z10 ? 1 : null);
        this.E = new AnimatorSet();
        if (z10) {
            this.f45163b.setVisibility(0);
            AnimatorSet animatorSet2 = this.E;
            TextView textView = this.f45168e;
            Property property = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.9f);
            TextView textView2 = this.f45168e;
            Property property2 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.9f);
            TextView textView3 = this.f45168e;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.f45163b, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f45163b, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.f45163b, (Property<TextView, Float>) property3, 1.0f));
        } else {
            this.f45168e.setVisibility(0);
            AnimatorSet animatorSet3 = this.E;
            TextView textView4 = this.f45163b;
            Property property4 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, 0.9f);
            TextView textView5 = this.f45163b;
            Property property5 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, 0.9f);
            TextView textView6 = this.f45163b;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.f45168e, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.f45168e, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.f45168e, (Property<TextView, Float>) property6, 1.0f));
        }
        this.E.addListener(new n40(12, this, z10));
        this.E.setDuration(150L);
        this.E.start();
    }

    public final void I0() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Warning);
        alertDialog$Builder.f22702a.P = LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.C, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        alertDialog$Builder.h(LocaleController.getString(R.string.ForceSetPasswordCancel), new qf1(this, 0));
        ((TextView) alertDialog$Builder.o().d(-2)).setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        ?? r10;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i11 = 0;
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.g6.G6;
        kVar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, i12, false), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23359u8, false), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new xf1(this));
        final int i13 = 1;
        int i14 = this.K;
        if (i14 == 5) {
            this.actionBar.n().a(0, R.drawable.ic_ab_other).g(1, LocaleController.getString(R.string.AbortPasswordMenu));
        }
        org.telegram.ui.Components.m10 m10Var = new org.telegram.ui.Components.m10(context, this.resourceProvider, false);
        this.Y = m10Var;
        this.X = new i6(m10Var);
        this.Y.setOnClickListener(new View.OnClickListener(this) {

            public final zf1 f40824b;

            {
                this.f40824b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f40824b.C0();
                        break;
                    case 1:
                        zf1 zf1Var = this.f40824b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new qf1(zf1Var, 1));
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.P = string;
                        zf1Var.showDialog(b2Var);
                        break;
                    case 2:
                        zf1.V(this.f40824b);
                        break;
                    case 3:
                        zf1 zf1Var2 = this.f40824b;
                        if (zf1Var2.h.getAlpha() >= 0.5f) {
                            int i15 = zf1Var2.K;
                            if (i15 == 0) {
                                zf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = zf1Var2.W;
                                zf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sf1(zf1Var2, 1));
                            } else if (i15 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zf1Var2.getParentActivity());
                                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new qf1(zf1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                                zf1Var2.showDialog(b2Var2);
                                TextView textView = (TextView) b2Var2.d(-1);
                                if (textView != null) {
                                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                }
                            } else if (i15 == 2) {
                                zf1Var2.A0();
                            }
                            break;
                        }
                        break;
                    case 4:
                        zf1 zf1Var3 = this.f40824b;
                        if (zf1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = zf1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = zf1Var3.C;
                            zf1Var3.presentFragment(twoStepVerificationActivity, true);
                            jb0 jb0Var = zf1Var3.f45171f0;
                            if (jb0Var != null) {
                                AndroidUtilities.runOnUIThread(jb0Var);
                                zf1Var3.f45171f0 = null;
                            }
                        }
                        break;
                    case 5:
                        this.f40824b.C0();
                        break;
                    default:
                        zf1 zf1Var4 = this.f40824b;
                        int i16 = zf1Var4.K;
                        zf1Var4.I = true;
                        if (zf1Var4.f45172n.getTransformationMethod() == null) {
                            zf1Var4.f45172n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                zf1Var4.f45164b0[3].N(-1);
                                org.telegram.ui.Components.oi0 animatedDrawable = zf1Var4.f45161a.getAnimatedDrawable();
                                org.telegram.ui.Components.oi0 oi0Var = zf1Var4.f45164b0[3];
                                if (animatedDrawable != oi0Var) {
                                    zf1Var4.f45161a.setAnimation(oi0Var);
                                    zf1Var4.f45164b0[3].L(18, false, false);
                                }
                                zf1Var4.f45161a.d();
                            }
                        } else {
                            zf1Var4.f45172n.setTransformationMethod(null);
                            zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i16 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                zf1Var4.f45164b0[3].N(18);
                                org.telegram.ui.Components.oi0 animatedDrawable2 = zf1Var4.f45161a.getAnimatedDrawable();
                                org.telegram.ui.Components.oi0 oi0Var2 = zf1Var4.f45164b0[3];
                                if (animatedDrawable2 != oi0Var2) {
                                    zf1Var4.f45161a.setAnimation(oi0Var2);
                                }
                                zf1Var4.f45164b0[3].Q(0.0f, false);
                                zf1Var4.f45161a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = zf1Var4.f45172n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        zf1Var4.I = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.l21 l21Var = new org.telegram.ui.Components.l21(context);
        this.Z = l21Var;
        l21Var.setTransformType(1);
        this.Z.setProgress(0.0f);
        this.Z.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false));
        this.Z.setDrawBackground(false);
        this.Y.setContentDescription(LocaleController.getString(R.string.Next));
        int i15 = 17;
        this.Y.addView(this.Z, h7.z5.e(56, 56, 17));
        this.Y.a(this.Z);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251o6, false));
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(19);
        this.h.setVisibility(8);
        i6.q2(this.h);
        this.h.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        final int i16 = 3;
        this.h.setOnClickListener(new View.OnClickListener(this) {

            public final zf1 f40824b;

            {
                this.f40824b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.f40824b.C0();
                        break;
                    case 1:
                        zf1 zf1Var = this.f40824b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new qf1(zf1Var, 1));
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.P = string;
                        zf1Var.showDialog(b2Var);
                        break;
                    case 2:
                        zf1.V(this.f40824b);
                        break;
                    case 3:
                        zf1 zf1Var2 = this.f40824b;
                        if (zf1Var2.h.getAlpha() >= 0.5f) {
                            int i17 = zf1Var2.K;
                            if (i17 == 0) {
                                zf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = zf1Var2.W;
                                zf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sf1(zf1Var2, 1));
                            } else if (i17 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zf1Var2.getParentActivity());
                                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new qf1(zf1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                                zf1Var2.showDialog(b2Var2);
                                TextView textView2 = (TextView) b2Var2.d(-1);
                                if (textView2 != null) {
                                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                }
                            } else if (i17 == 2) {
                                zf1Var2.A0();
                            }
                            break;
                        }
                        break;
                    case 4:
                        zf1 zf1Var3 = this.f40824b;
                        if (zf1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = zf1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = zf1Var3.C;
                            zf1Var3.presentFragment(twoStepVerificationActivity, true);
                            jb0 jb0Var = zf1Var3.f45171f0;
                            if (jb0Var != null) {
                                AndroidUtilities.runOnUIThread(jb0Var);
                                zf1Var3.f45171f0 = null;
                            }
                        }
                        break;
                    case 5:
                        this.f40824b.C0();
                        break;
                    default:
                        zf1 zf1Var4 = this.f40824b;
                        int i18 = zf1Var4.K;
                        zf1Var4.I = true;
                        if (zf1Var4.f45172n.getTransformationMethod() == null) {
                            zf1Var4.f45172n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                zf1Var4.f45164b0[3].N(-1);
                                org.telegram.ui.Components.oi0 animatedDrawable = zf1Var4.f45161a.getAnimatedDrawable();
                                org.telegram.ui.Components.oi0 oi0Var = zf1Var4.f45164b0[3];
                                if (animatedDrawable != oi0Var) {
                                    zf1Var4.f45161a.setAnimation(oi0Var);
                                    zf1Var4.f45164b0[3].L(18, false, false);
                                }
                                zf1Var4.f45161a.d();
                            }
                        } else {
                            zf1Var4.f45172n.setTransformationMethod(null);
                            zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i18 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                zf1Var4.f45164b0[3].N(18);
                                org.telegram.ui.Components.oi0 animatedDrawable2 = zf1Var4.f45161a.getAnimatedDrawable();
                                org.telegram.ui.Components.oi0 oi0Var2 = zf1Var4.f45164b0[3];
                                if (animatedDrawable2 != oi0Var2) {
                                    zf1Var4.f45161a.setAnimation(oi0Var2);
                                }
                                zf1Var4.f45164b0[3].Q(0.0f, false);
                                zf1Var4.f45161a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = zf1Var4.f45172n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        zf1Var4.I = false;
                        break;
                }
            }
        });
        org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
        this.f45161a = ri0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ri0Var.setScaleType(scaleType);
        if (i14 == 2 && AndroidUtilities.isSmallScreen()) {
            this.f45161a.setVisibility(8);
        } else if (i14 != 6 && i14 != 9 && i14 != 7) {
            org.telegram.ui.Components.ri0 ri0Var2 = this.f45161a;
            Point point = AndroidUtilities.displaySize;
            ri0Var2.setVisibility(point.x > point.y ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.f45165c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
        this.f45165c.setGravity(1);
        this.f45165c.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f45165c.setTextSize(1, 24.0f);
        eh.s sVar = new eh.s(context);
        this.d = sVar;
        int i17 = org.telegram.ui.ActionBar.g6.D6;
        sVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.d.setGravity(1);
        this.d.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.d.setTextSize(1, 15.0f);
        this.d.setVisibility(8);
        this.d.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.f45168e = textView3;
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
        this.f45168e.setGravity(1);
        this.f45168e.setTextSize(1, 14.0f);
        this.f45168e.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.f45168e.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.f45168e.setVisibility(8);
        final int i18 = 4;
        this.f45168e.setOnClickListener(new View.OnClickListener(this) {

            public final zf1 f40824b;

            {
                this.f40824b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.f40824b.C0();
                        break;
                    case 1:
                        zf1 zf1Var = this.f40824b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new qf1(zf1Var, 1));
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.P = string;
                        zf1Var.showDialog(b2Var);
                        break;
                    case 2:
                        zf1.V(this.f40824b);
                        break;
                    case 3:
                        zf1 zf1Var2 = this.f40824b;
                        if (zf1Var2.h.getAlpha() >= 0.5f) {
                            int i19 = zf1Var2.K;
                            if (i19 == 0) {
                                zf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = zf1Var2.W;
                                zf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sf1(zf1Var2, 1));
                            } else if (i19 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zf1Var2.getParentActivity());
                                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new qf1(zf1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                                zf1Var2.showDialog(b2Var2);
                                TextView textView4 = (TextView) b2Var2.d(-1);
                                if (textView4 != null) {
                                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                }
                            } else if (i19 == 2) {
                                zf1Var2.A0();
                            }
                            break;
                        }
                        break;
                    case 4:
                        zf1 zf1Var3 = this.f40824b;
                        if (zf1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = zf1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = zf1Var3.C;
                            zf1Var3.presentFragment(twoStepVerificationActivity, true);
                            jb0 jb0Var = zf1Var3.f45171f0;
                            if (jb0Var != null) {
                                AndroidUtilities.runOnUIThread(jb0Var);
                                zf1Var3.f45171f0 = null;
                            }
                        }
                        break;
                    case 5:
                        this.f40824b.C0();
                        break;
                    default:
                        zf1 zf1Var4 = this.f40824b;
                        int i110 = zf1Var4.K;
                        zf1Var4.I = true;
                        if (zf1Var4.f45172n.getTransformationMethod() == null) {
                            zf1Var4.f45172n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i110 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                zf1Var4.f45164b0[3].N(-1);
                                org.telegram.ui.Components.oi0 animatedDrawable = zf1Var4.f45161a.getAnimatedDrawable();
                                org.telegram.ui.Components.oi0 oi0Var = zf1Var4.f45164b0[3];
                                if (animatedDrawable != oi0Var) {
                                    zf1Var4.f45161a.setAnimation(oi0Var);
                                    zf1Var4.f45164b0[3].L(18, false, false);
                                }
                                zf1Var4.f45161a.d();
                            }
                        } else {
                            zf1Var4.f45172n.setTransformationMethod(null);
                            zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i110 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                zf1Var4.f45164b0[3].N(18);
                                org.telegram.ui.Components.oi0 animatedDrawable2 = zf1Var4.f45161a.getAnimatedDrawable();
                                org.telegram.ui.Components.oi0 oi0Var2 = zf1Var4.f45164b0[3];
                                if (animatedDrawable2 != oi0Var2) {
                                    zf1Var4.f45161a.setAnimation(oi0Var2);
                                }
                                zf1Var4.f45164b0[3].Q(0.0f, false);
                                zf1Var4.f45161a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = zf1Var4.f45172n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        zf1Var4.I = false;
                        break;
                }
            }
        });
        TextView textView4 = new TextView(context);
        this.f45163b = textView4;
        textView4.setMinWidth(AndroidUtilities.dp(220.0f));
        this.f45163b.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.f45163b.setGravity(17);
        this.f45163b.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        this.f45163b.setTextSize(1, 15.0f);
        this.f45163b.setTypeface(AndroidUtilities.bold());
        this.f45163b.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{6.0f}, org.telegram.ui.ActionBar.g6.Oh));
        final int i19 = 5;
        this.f45163b.setOnClickListener(new View.OnClickListener(this) {

            public final zf1 f40824b;

            {
                this.f40824b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        this.f40824b.C0();
                        break;
                    case 1:
                        zf1 zf1Var = this.f40824b;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new qf1(zf1Var, 1));
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                        String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                        b2Var.P = string;
                        zf1Var.showDialog(b2Var);
                        break;
                    case 2:
                        zf1.V(this.f40824b);
                        break;
                    case 3:
                        zf1 zf1Var2 = this.f40824b;
                        if (zf1Var2.h.getAlpha() >= 0.5f) {
                            int i110 = zf1Var2.K;
                            if (i110 == 0) {
                                zf1Var2.x0();
                                TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                tL_auth_recoverPassword.code = zf1Var2.W;
                                zf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sf1(zf1Var2, 1));
                            } else if (i110 == 3) {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zf1Var2.getParentActivity());
                                alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new qf1(zf1Var2, 2));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                                zf1Var2.showDialog(b2Var2);
                                TextView textView5 = (TextView) b2Var2.d(-1);
                                if (textView5 != null) {
                                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                }
                            } else if (i110 == 2) {
                                zf1Var2.A0();
                            }
                            break;
                        }
                        break;
                    case 4:
                        zf1 zf1Var3 = this.f40824b;
                        if (zf1Var3.K == 8) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            twoStepVerificationActivity.S = true;
                            twoStepVerificationActivity.E = zf1Var3.Q;
                            twoStepVerificationActivity.F = false;
                            twoStepVerificationActivity.T = zf1Var3.C;
                            zf1Var3.presentFragment(twoStepVerificationActivity, true);
                            jb0 jb0Var = zf1Var3.f45171f0;
                            if (jb0Var != null) {
                                AndroidUtilities.runOnUIThread(jb0Var);
                                zf1Var3.f45171f0 = null;
                            }
                        }
                        break;
                    case 5:
                        this.f40824b.C0();
                        break;
                    default:
                        zf1 zf1Var4 = this.f40824b;
                        int i111 = zf1Var4.K;
                        zf1Var4.I = true;
                        if (zf1Var4.f45172n.getTransformationMethod() == null) {
                            zf1Var4.f45172n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                            if (i111 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                zf1Var4.f45164b0[3].N(-1);
                                org.telegram.ui.Components.oi0 animatedDrawable = zf1Var4.f45161a.getAnimatedDrawable();
                                org.telegram.ui.Components.oi0 oi0Var = zf1Var4.f45164b0[3];
                                if (animatedDrawable != oi0Var) {
                                    zf1Var4.f45161a.setAnimation(oi0Var);
                                    zf1Var4.f45164b0[3].L(18, false, false);
                                }
                                zf1Var4.f45161a.d();
                            }
                        } else {
                            zf1Var4.f45172n.setTransformationMethod(null);
                            zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                            if (i111 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                zf1Var4.f45164b0[3].N(18);
                                org.telegram.ui.Components.oi0 animatedDrawable2 = zf1Var4.f45161a.getAnimatedDrawable();
                                org.telegram.ui.Components.oi0 oi0Var2 = zf1Var4.f45164b0[3];
                                if (animatedDrawable2 != oi0Var2) {
                                    zf1Var4.f45161a.setAnimation(oi0Var2);
                                }
                                zf1Var4.f45164b0[3].Q(0.0f, false);
                                zf1Var4.f45161a.d();
                            }
                        }
                        EditTextBoldCursor editTextBoldCursor = zf1Var4.f45172n;
                        editTextBoldCursor.setSelection(editTextBoldCursor.length());
                        zf1Var4.I = false;
                        break;
                }
            }
        });
        if (i14 == 6 || i14 == 7 || i14 == 9) {
            this.f45165c.setTypeface(Typeface.DEFAULT);
            this.f45165c.setTextSize(1, 24.0f);
        } else {
            this.f45165c.setTypeface(AndroidUtilities.bold());
            this.f45165c.setTextSize(1, 18.0f);
        }
        switch (i14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                n0 n0Var = new n0(this, context, 26);
                org.telegram.ui.Components.i90 i90Var = new org.telegram.ui.Components.i90(this, context, n0Var, 2);
                i90Var.addView(n0Var);
                q9 q9Var = new q9(this, context, i90Var);
                yf1 yf1Var = new yf1(this, context);
                this.f45176x = yf1Var;
                yf1Var.setVerticalScrollBarEnabled(false);
                n0Var.addView(this.f45176x, h7.z5.c(-1.0f, -1));
                n0Var.addView(this.h, h7.z5.d(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                n0Var.addView(this.Y, org.telegram.ui.Components.m10.b());
                q9Var.addView(i90Var, h7.z5.c(-1.0f, -1));
                ra1 ra1Var = new ra1(this, context, i15);
                ra1Var.setOrientation(1);
                this.f45176x.addView(ra1Var, h7.z5.x(-1, -1, 51));
                ra1Var.addView(this.f45161a, h7.z5.t(-2, -2, 49, 0, 69, 0, 0));
                ra1Var.addView(this.f45165c, h7.z5.t(-2, -2, 49, 0, 8, 0, 0));
                ra1Var.addView(this.d, h7.z5.t(-2, -2, 49, 0, 9, 0, 0));
                org.telegram.ui.Components.jc0 jc0Var = new org.telegram.ui.Components.jc0(context, null);
                this.f45174s = jc0Var;
                jc0Var.b(1.0f, 1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.f45172n = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int iDp = AndroidUtilities.dp(16.0f);
                this.f45172n.setPadding(iDp, iDp, iDp, iDp);
                EditTextBoldCursor editTextBoldCursor2 = this.f45172n;
                int i20 = org.telegram.ui.ActionBar.g6.f23198l6;
                editTextBoldCursor2.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                this.f45172n.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                this.f45172n.setBackground(null);
                this.f45172n.setMaxLines(1);
                this.f45172n.setLines(1);
                this.f45172n.setGravity(3);
                this.f45172n.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f45172n.setSingleLine(true);
                this.f45172n.setCursorWidth(1.5f);
                this.f45172n.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                    public final zf1 f41084b;

                    {
                        this.f41084b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i21, KeyEvent keyEvent) {
                        switch (i13) {
                            case 0:
                                zf1 zf1Var = this.f41084b;
                                zf1Var.getClass();
                                if (i21 != 5 && i21 != 6) {
                                    return false;
                                }
                                zf1Var.C0();
                                return true;
                            default:
                                zf1 zf1Var2 = this.f41084b;
                                zf1Var2.getClass();
                                if (i21 != 5 && i21 != 6) {
                                    return false;
                                }
                                if (zf1Var2.v.getVisibility() == 0) {
                                    zf1Var2.f45173r.requestFocus();
                                } else {
                                    zf1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.f45174s.e(this.f45172n);
                final int i21 = 2;
                this.f45172n.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {

                    public final zf1 f41345b;

                    {
                        this.f41345b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i21) {
                            case 0:
                                org.telegram.ui.Components.jc0 jc0Var2 = this.f41345b.v;
                                float f10 = z10 ? 1.0f : 0.0f;
                                jc0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                zf1 zf1Var = this.f41345b;
                                if (!z10) {
                                    zf1Var.getClass();
                                } else {
                                    zf1Var.f45162a0.setEditText((EditText) view);
                                    zf1Var.f45162a0.setDispatchBackWhenEmpty(true);
                                }
                                break;
                            default:
                                org.telegram.ui.Components.jc0 jc0Var3 = this.f41345b.f45174s;
                                float f11 = z10 ? 1.0f : 0.0f;
                                jc0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                linearLayout.addView(this.f45172n, h7.z5.l(1.0f, 0, -2));
                org.telegram.ui.ActionBar.l0 l0Var = new org.telegram.ui.ActionBar.l0(this, context, 3);
                this.A = l0Var;
                l0Var.setImageResource(R.drawable.msg_message);
                this.A.setScaleType(scaleType);
                this.A.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.A.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 1, -1));
                this.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.A, false, 0.1f, false);
                final int i22 = 6;
                this.A.setOnClickListener(new View.OnClickListener(this) {

                    public final zf1 f40824b;

                    {
                        this.f40824b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                this.f40824b.C0();
                                break;
                            case 1:
                                zf1 zf1Var = this.f40824b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new qf1(zf1Var, 1));
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                                String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                b2Var.P = string;
                                zf1Var.showDialog(b2Var);
                                break;
                            case 2:
                                zf1.V(this.f40824b);
                                break;
                            case 3:
                                zf1 zf1Var2 = this.f40824b;
                                if (zf1Var2.h.getAlpha() >= 0.5f) {
                                    int i110 = zf1Var2.K;
                                    if (i110 == 0) {
                                        zf1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = zf1Var2.W;
                                        zf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sf1(zf1Var2, 1));
                                    } else if (i110 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zf1Var2.getParentActivity());
                                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new qf1(zf1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                                        zf1Var2.showDialog(b2Var2);
                                        TextView textView5 = (TextView) b2Var2.d(-1);
                                        if (textView5 != null) {
                                            textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                        }
                                    } else if (i110 == 2) {
                                        zf1Var2.A0();
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                zf1 zf1Var3 = this.f40824b;
                                if (zf1Var3.K == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.S = true;
                                    twoStepVerificationActivity.E = zf1Var3.Q;
                                    twoStepVerificationActivity.F = false;
                                    twoStepVerificationActivity.T = zf1Var3.C;
                                    zf1Var3.presentFragment(twoStepVerificationActivity, true);
                                    jb0 jb0Var = zf1Var3.f45171f0;
                                    if (jb0Var != null) {
                                        AndroidUtilities.runOnUIThread(jb0Var);
                                        zf1Var3.f45171f0 = null;
                                    }
                                }
                                break;
                            case 5:
                                this.f40824b.C0();
                                break;
                            default:
                                zf1 zf1Var4 = this.f40824b;
                                int i111 = zf1Var4.K;
                                zf1Var4.I = true;
                                if (zf1Var4.f45172n.getTransformationMethod() == null) {
                                    zf1Var4.f45172n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i111 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                        zf1Var4.f45164b0[3].N(-1);
                                        org.telegram.ui.Components.oi0 animatedDrawable = zf1Var4.f45161a.getAnimatedDrawable();
                                        org.telegram.ui.Components.oi0 oi0Var = zf1Var4.f45164b0[3];
                                        if (animatedDrawable != oi0Var) {
                                            zf1Var4.f45161a.setAnimation(oi0Var);
                                            zf1Var4.f45164b0[3].L(18, false, false);
                                        }
                                        zf1Var4.f45161a.d();
                                    }
                                } else {
                                    zf1Var4.f45172n.setTransformationMethod(null);
                                    zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i111 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                        zf1Var4.f45164b0[3].N(18);
                                        org.telegram.ui.Components.oi0 animatedDrawable2 = zf1Var4.f45161a.getAnimatedDrawable();
                                        org.telegram.ui.Components.oi0 oi0Var2 = zf1Var4.f45164b0[3];
                                        if (animatedDrawable2 != oi0Var2) {
                                            zf1Var4.f45161a.setAnimation(oi0Var2);
                                        }
                                        zf1Var4.f45164b0[3].Q(0.0f, false);
                                        zf1Var4.f45161a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor3 = zf1Var4.f45172n;
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                zf1Var4.I = false;
                                break;
                        }
                    }
                });
                linearLayout.addView(this.A, h7.z5.t(24, 24, 16, 0, 0, 16, 0));
                this.f45172n.addTextChangedListener(new wf1(this, 2));
                this.f45174s.addView(linearLayout, h7.z5.c(-2.0f, -1));
                ra1Var.addView(this.f45174s, h7.z5.d(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.v = new org.telegram.ui.Components.jc0(context, null);
                EditTextBoldCursor editTextBoldCursor3 = new EditTextBoldCursor(context);
                this.f45173r = editTextBoldCursor3;
                editTextBoldCursor3.setTextSize(1, 18.0f);
                int iDp2 = AndroidUtilities.dp(16.0f);
                this.f45173r.setPadding(iDp2, iDp2, iDp2, iDp2);
                this.f45173r.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                this.f45173r.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                this.f45173r.setBackground(null);
                this.f45173r.setMaxLines(1);
                this.f45173r.setLines(1);
                this.f45173r.setGravity(3);
                this.f45173r.setCursorSize(AndroidUtilities.dp(20.0f));
                this.f45173r.setSingleLine(true);
                this.f45173r.setCursorWidth(1.5f);
                final int i23 = 0;
                this.f45173r.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

                    public final zf1 f41084b;

                    {
                        this.f41084b = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i24, KeyEvent keyEvent) {
                        switch (i23) {
                            case 0:
                                zf1 zf1Var = this.f41084b;
                                zf1Var.getClass();
                                if (i24 != 5 && i24 != 6) {
                                    return false;
                                }
                                zf1Var.C0();
                                return true;
                            default:
                                zf1 zf1Var2 = this.f41084b;
                                zf1Var2.getClass();
                                if (i24 != 5 && i24 != 6) {
                                    return false;
                                }
                                if (zf1Var2.v.getVisibility() == 0) {
                                    zf1Var2.f45173r.requestFocus();
                                } else {
                                    zf1Var2.C0();
                                }
                                return true;
                        }
                    }
                });
                this.v.e(this.f45173r);
                this.f45173r.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {

                    public final zf1 f41345b;

                    {
                        this.f41345b = this;
                    }

                    @Override
                    public final void onFocusChange(View view, boolean z10) {
                        switch (i23) {
                            case 0:
                                org.telegram.ui.Components.jc0 jc0Var2 = this.f41345b.v;
                                float f10 = z10 ? 1.0f : 0.0f;
                                jc0Var2.b(f10, f10, true);
                                break;
                            case 1:
                                zf1 zf1Var = this.f41345b;
                                if (!z10) {
                                    zf1Var.getClass();
                                } else {
                                    zf1Var.f45162a0.setEditText((EditText) view);
                                    zf1Var.f45162a0.setDispatchBackWhenEmpty(true);
                                }
                                break;
                            default:
                                org.telegram.ui.Components.jc0 jc0Var3 = this.f41345b.f45174s;
                                float f11 = z10 ? 1.0f : 0.0f;
                                jc0Var3.b(f11, f11, true);
                                break;
                        }
                    }
                });
                this.v.addView(this.f45173r, h7.z5.c(-2.0f, -1));
                ra1Var.addView(this.v, h7.z5.d(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.v.setVisibility(8);
                org.telegram.ui.Components.ir irVar = new org.telegram.ui.Components.ir(context);
                this.f45162a0 = irVar;
                irVar.setVisibility(8);
                i90Var.addView(this.f45162a0);
                od0 od0Var = new od0(this, context, 3);
                this.f45175w = od0Var;
                final int i24 = 1;
                od0Var.b(6, 1);
                wr[] wrVarArr = this.f45175w.f43279f;
                int length = wrVarArr.length;
                int i25 = 0;
                while (i25 < length) {
                    wr wrVar = wrVarArr[i25];
                    wrVar.setShowSoftInputOnFocusCompat((v0() ? 1 : 0) ^ i24);
                    wrVar.addTextChangedListener(new wf1(this, 0));
                    wrVar.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {

                        public final zf1 f41345b;

                        {
                            this.f41345b = this;
                        }

                        @Override
                        public final void onFocusChange(View view, boolean z10) {
                            switch (i24) {
                                case 0:
                                    org.telegram.ui.Components.jc0 jc0Var2 = this.f41345b.v;
                                    float f10 = z10 ? 1.0f : 0.0f;
                                    jc0Var2.b(f10, f10, true);
                                    break;
                                case 1:
                                    zf1 zf1Var = this.f41345b;
                                    if (!z10) {
                                        zf1Var.getClass();
                                    } else {
                                        zf1Var.f45162a0.setEditText((EditText) view);
                                        zf1Var.f45162a0.setDispatchBackWhenEmpty(true);
                                    }
                                    break;
                                default:
                                    org.telegram.ui.Components.jc0 jc0Var3 = this.f41345b.f45174s;
                                    float f11 = z10 ? 1.0f : 0.0f;
                                    jc0Var3.b(f11, f11, true);
                                    break;
                            }
                        }
                    });
                    i25++;
                    i24 = 1;
                }
                this.f45175w.setVisibility(8);
                ra1Var.addView(this.f45175w, h7.z5.t(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout = new FrameLayout(context);
                ra1Var.addView(frameLayout, h7.z5.t(-1, -2, 51, 0, 36, 0, 22));
                frameLayout.addView(this.f45168e, h7.z5.e(-2, -2, 49));
                if (i14 == 4) {
                    TextView textView5 = new TextView(context);
                    this.f45170f = textView5;
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
                    this.f45170f.setGravity(1);
                    this.f45170f.setTextSize(1, 14.0f);
                    this.f45170f.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.f45170f.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.f45170f.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    ra1Var.addView(this.f45170f, h7.z5.t(-2, -2, 49, 0, 0, 0, 25));
                    final int i26 = 1;
                    this.f45170f.setOnClickListener(new View.OnClickListener(this) {

                        public final zf1 f40824b;

                        {
                            this.f40824b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    this.f40824b.C0();
                                    break;
                                case 1:
                                    zf1 zf1Var = this.f40824b;
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new qf1(zf1Var, 1));
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                                    String string = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                    b2Var.P = string;
                                    zf1Var.showDialog(b2Var);
                                    break;
                                case 2:
                                    zf1.V(this.f40824b);
                                    break;
                                case 3:
                                    zf1 zf1Var2 = this.f40824b;
                                    if (zf1Var2.h.getAlpha() >= 0.5f) {
                                        int i110 = zf1Var2.K;
                                        if (i110 == 0) {
                                            zf1Var2.x0();
                                            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                            tL_auth_recoverPassword.code = zf1Var2.W;
                                            zf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sf1(zf1Var2, 1));
                                        } else if (i110 == 3) {
                                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zf1Var2.getParentActivity());
                                            alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                            alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                            alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new qf1(zf1Var2, 2));
                                            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                                            zf1Var2.showDialog(b2Var2);
                                            TextView textView6 = (TextView) b2Var2.d(-1);
                                            if (textView6 != null) {
                                                textView6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                            }
                                        } else if (i110 == 2) {
                                            zf1Var2.A0();
                                        }
                                        break;
                                    }
                                    break;
                                case 4:
                                    zf1 zf1Var3 = this.f40824b;
                                    if (zf1Var3.K == 8) {
                                        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                        twoStepVerificationActivity.S = true;
                                        twoStepVerificationActivity.E = zf1Var3.Q;
                                        twoStepVerificationActivity.F = false;
                                        twoStepVerificationActivity.T = zf1Var3.C;
                                        zf1Var3.presentFragment(twoStepVerificationActivity, true);
                                        jb0 jb0Var = zf1Var3.f45171f0;
                                        if (jb0Var != null) {
                                            AndroidUtilities.runOnUIThread(jb0Var);
                                            zf1Var3.f45171f0 = null;
                                        }
                                    }
                                    break;
                                case 5:
                                    this.f40824b.C0();
                                    break;
                                default:
                                    zf1 zf1Var4 = this.f40824b;
                                    int i111 = zf1Var4.K;
                                    zf1Var4.I = true;
                                    if (zf1Var4.f45172n.getTransformationMethod() == null) {
                                        zf1Var4.f45172n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                        zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i111 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                            zf1Var4.f45164b0[3].N(-1);
                                            org.telegram.ui.Components.oi0 animatedDrawable = zf1Var4.f45161a.getAnimatedDrawable();
                                            org.telegram.ui.Components.oi0 oi0Var = zf1Var4.f45164b0[3];
                                            if (animatedDrawable != oi0Var) {
                                                zf1Var4.f45161a.setAnimation(oi0Var);
                                                zf1Var4.f45164b0[3].L(18, false, false);
                                            }
                                            zf1Var4.f45161a.d();
                                        }
                                    } else {
                                        zf1Var4.f45172n.setTransformationMethod(null);
                                        zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                        if (i111 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                            zf1Var4.f45164b0[3].N(18);
                                            org.telegram.ui.Components.oi0 animatedDrawable2 = zf1Var4.f45161a.getAnimatedDrawable();
                                            org.telegram.ui.Components.oi0 oi0Var2 = zf1Var4.f45164b0[3];
                                            if (animatedDrawable2 != oi0Var2) {
                                                zf1Var4.f45161a.setAnimation(oi0Var2);
                                            }
                                            zf1Var4.f45164b0[3].Q(0.0f, false);
                                            zf1Var4.f45161a.d();
                                        }
                                    }
                                    EditTextBoldCursor editTextBoldCursor4 = zf1Var4.f45172n;
                                    editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
                                    zf1Var4.I = false;
                                    break;
                            }
                        }
                    });
                }
                this.fragmentView = q9Var;
                ag.t0 t0Var = new ag.t0(this, context);
                this.f45177y = t0Var;
                t0Var.setAlpha(0.0f);
                q9Var.addView(this.f45177y);
                q9Var.addView(this.actionBar);
                RadialProgressView radialProgressView = new RadialProgressView(context, null);
                this.H = radialProgressView;
                radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                this.H.setAlpha(0.0f);
                this.H.setScaleX(0.1f);
                this.H.setScaleY(0.1f);
                this.H.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23198l6, false));
                n0Var.addView(this.H, h7.z5.d(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                f fVar = new f(this, context, 3);
                fVar.setOnTouchListener(new kh.e(2));
                fVar.addView(this.actionBar);
                fVar.addView(this.f45161a);
                fVar.addView(this.f45165c);
                fVar.addView(this.d);
                fVar.addView(this.f45163b);
                this.fragmentView = fVar;
                break;
        }
        this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        switch (i14) {
            case 0:
            case 1:
                if (this.Q.has_password) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                    this.f45165c.setText(LocaleController.getString(R.string.PleaseEnterNewFirstPassword));
                } else {
                    String string = LocaleController.getString(i14 == 0 ? R.string.CreatePassword : R.string.ReEnterPassword);
                    this.actionBar.setTitle(string);
                    this.f45165c.setText(string);
                }
                if (!TextUtils.isEmpty(this.W)) {
                    this.h.setVisibility(0);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f45174s.setText(LocaleController.getString(i14 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.f45172n.setContentDescription(LocaleController.getString(i14 == 0 ? R.string.EnterPassword : R.string.ReEnterPassword));
                this.f45172n.setImeOptions(268435461);
                this.f45172n.setInputType(129);
                this.f45172n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f45172n.setTypeface(Typeface.DEFAULT);
                this.B = i14 == 0;
                AndroidUtilities.updateViewVisibilityAnimated(this.A, false, 0.1f, false);
                org.telegram.ui.Components.oi0[] oi0VarArr = new org.telegram.ui.Components.oi0[7];
                this.f45164b0 = oi0VarArr;
                oi0VarArr[0] = new org.telegram.ui.Components.oi0(R.raw.tsv_setup_monkey_idle1, "" + R.raw.tsv_setup_monkey_idle1, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f45164b0[1] = new org.telegram.ui.Components.oi0(R.raw.tsv_setup_monkey_idle2, "" + R.raw.tsv_setup_monkey_idle2, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f45164b0[2] = new org.telegram.ui.Components.oi0(R.raw.tsv_monkey_close, "" + R.raw.tsv_monkey_close, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f45164b0[3] = new org.telegram.ui.Components.oi0(R.raw.tsv_setup_monkey_peek, "" + R.raw.tsv_setup_monkey_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f45164b0[4] = new org.telegram.ui.Components.oi0(R.raw.tsv_setup_monkey_close_and_peek_to_idle, "" + R.raw.tsv_setup_monkey_close_and_peek_to_idle, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f45164b0[5] = new org.telegram.ui.Components.oi0(R.raw.tsv_setup_monkey_close_and_peek, "" + R.raw.tsv_setup_monkey_close_and_peek, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.f45164b0[6] = new org.telegram.ui.Components.oi0(R.raw.tsv_setup_monkey_tracking, "" + R.raw.tsv_setup_monkey_tracking, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                org.telegram.ui.Components.oi0 oi0Var = this.f45164b0[6];
                oi0Var.h = true;
                oi0Var.N(19);
                this.f45164b0[2].P(97, this.f45169e0);
                F0(true);
                if (i14 != 1) {
                    this.f45172n.dispatchTextWatchersTextChanged();
                    i10 = 1;
                    F0(true);
                } else {
                    rf1 rf1Var = this.f45166c0;
                    if (rf1Var != null) {
                        AndroidUtilities.cancelRunOnUIThread(rf1Var);
                    }
                    this.f45161a.setAnimation(this.f45164b0[6]);
                    this.f45161a.d();
                    i10 = 1;
                }
                break;
            case 2:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordHint));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.h.setVisibility(0);
                this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.f45165c.setText(LocaleController.getString(R.string.PasswordHint));
                this.d.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.d.setVisibility(0);
                this.f45174s.setText(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f45172n.setContentDescription(LocaleController.getString(R.string.PasswordHintPlaceholder));
                this.f45172n.setImeOptions(268435461);
                this.v.setVisibility(8);
                this.f45161a.f(R.raw.tsv_setup_hint, 120, 120, null);
                this.f45161a.d();
                i10 = 1;
                break;
            case 3:
                this.actionBar.setTitle(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.V) {
                    this.h.setVisibility(0);
                    this.h.setAlpha(0.0f);
                    this.h.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.f45165c.setText(LocaleController.getString(R.string.RecoveryEmailTitle));
                this.d.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.d.setVisibility(0);
                this.f45174s.setText(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f45172n.setContentDescription(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                this.f45172n.setImeOptions(268435461);
                this.f45172n.setInputType(33);
                this.v.setVisibility(8);
                this.f45161a.f(R.raw.tsv_setup_email_sent, 120, 120, null);
                this.f45161a.d();
                i10 = 1;
                break;
            case 4:
                this.actionBar.setTitle(LocaleController.getString(R.string.PasswordRecovery));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f45165c.setText(LocaleController.getString(R.string.PasswordRecovery));
                this.f45162a0.setVisibility(0);
                this.f45174s.setVisibility(8);
                String str = this.Q.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str2);
                int iIndexOf = str2.indexOf(42);
                int iLastIndexOf = str2.lastIndexOf(42);
                if (iIndexOf == iLastIndexOf || iIndexOf == -1 || iLastIndexOf == -1) {
                    r10 = 0;
                } else {
                    org.telegram.ui.Components.xz0 xz0Var = new org.telegram.ui.Components.xz0();
                    xz0Var.f34734a |= 256;
                    xz0Var.f34735b = iIndexOf;
                    int i27 = iLastIndexOf + 1;
                    xz0Var.f34736c = i27;
                    r10 = 0;
                    spannableStringBuilderValueOf.setSpan(new org.telegram.ui.Components.yz0(xz0Var, 0), iIndexOf, i27, 0);
                }
                eh.s sVar2 = this.d;
                String string2 = LocaleController.getString(R.string.RestoreEmailSent);
                CharSequence[] charSequenceArr = new CharSequence[1];
                charSequenceArr[r10] = spannableStringBuilderValueOf;
                sVar2.setText(AndroidUtilities.formatSpannable(string2, charSequenceArr));
                this.d.setVisibility(r10);
                this.Y.e(r10, r10);
                this.f45175w.setVisibility(r10);
                this.f45161a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f45161a.d();
                i10 = 1;
                break;
            case 5:
                this.actionBar.setTitle(LocaleController.getString(R.string.VerificationCode));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f45165c.setText(LocaleController.getString(R.string.VerificationCode));
                this.f45174s.setVisibility(8);
                this.f45162a0.setVisibility(0);
                eh.s sVar3 = this.d;
                int i28 = R.string.EmailPasswordConfirmText2;
                String str3 = this.Q.email_unconfirmed_pattern;
                sVar3.setText(LocaleController.formatString("EmailPasswordConfirmText2", i28, str3 != null ? str3 : ""));
                this.d.setVisibility(0);
                this.Y.e(false, false);
                this.h.setVisibility(0);
                this.h.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).bottomMargin = 0;
                this.h.setText(LocaleController.getString(R.string.ResendCode));
                final int i29 = 2;
                this.h.setOnClickListener(new View.OnClickListener(this) {

                    public final zf1 f40824b;

                    {
                        this.f40824b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i29) {
                            case 0:
                                this.f40824b.C0();
                                break;
                            case 1:
                                zf1 zf1Var = this.f40824b;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zf1Var.getParentActivity());
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Reset), new qf1(zf1Var, 1));
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ResetPassword);
                                String string3 = LocaleController.getString(R.string.RestoreEmailTroubleText2);
                                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                                b2Var.P = string3;
                                zf1Var.showDialog(b2Var);
                                break;
                            case 2:
                                zf1.V(this.f40824b);
                                break;
                            case 3:
                                zf1 zf1Var2 = this.f40824b;
                                if (zf1Var2.h.getAlpha() >= 0.5f) {
                                    int i110 = zf1Var2.K;
                                    if (i110 == 0) {
                                        zf1Var2.x0();
                                        TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
                                        tL_auth_recoverPassword.code = zf1Var2.W;
                                        zf1Var2.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new sf1(zf1Var2, 1));
                                    } else if (i110 == 3) {
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(zf1Var2.getParentActivity());
                                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.YourEmailSkipWarningText);
                                        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.YourEmailSkipWarning);
                                        alertDialog$Builder2.k(LocaleController.getString(R.string.YourEmailSkip), new qf1(zf1Var2, 2));
                                        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                                        zf1Var2.showDialog(b2Var2);
                                        TextView textView6 = (TextView) b2Var2.d(-1);
                                        if (textView6 != null) {
                                            textView6.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                                        }
                                    } else if (i110 == 2) {
                                        zf1Var2.A0();
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                zf1 zf1Var3 = this.f40824b;
                                if (zf1Var3.K == 8) {
                                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                                    twoStepVerificationActivity.S = true;
                                    twoStepVerificationActivity.E = zf1Var3.Q;
                                    twoStepVerificationActivity.F = false;
                                    twoStepVerificationActivity.T = zf1Var3.C;
                                    zf1Var3.presentFragment(twoStepVerificationActivity, true);
                                    jb0 jb0Var = zf1Var3.f45171f0;
                                    if (jb0Var != null) {
                                        AndroidUtilities.runOnUIThread(jb0Var);
                                        zf1Var3.f45171f0 = null;
                                    }
                                }
                                break;
                            case 5:
                                this.f40824b.C0();
                                break;
                            default:
                                zf1 zf1Var4 = this.f40824b;
                                int i111 = zf1Var4.K;
                                zf1Var4.I = true;
                                if (zf1Var4.f45172n.getTransformationMethod() == null) {
                                    zf1Var4.f45172n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                                    zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Xd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i111 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                        zf1Var4.f45164b0[3].N(-1);
                                        org.telegram.ui.Components.oi0 animatedDrawable = zf1Var4.f45161a.getAnimatedDrawable();
                                        org.telegram.ui.Components.oi0 oi0Var2 = zf1Var4.f45164b0[3];
                                        if (animatedDrawable != oi0Var2) {
                                            zf1Var4.f45161a.setAnimation(oi0Var2);
                                            zf1Var4.f45164b0[3].L(18, false, false);
                                        }
                                        zf1Var4.f45161a.d();
                                    }
                                } else {
                                    zf1Var4.f45172n.setTransformationMethod(null);
                                    zf1Var4.A.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Yd, false), PorterDuff.Mode.MULTIPLY));
                                    if (i111 == 0 && zf1Var4.f45172n.length() > 0 && zf1Var4.f45172n.hasFocus()) {
                                        zf1Var4.f45164b0[3].N(18);
                                        org.telegram.ui.Components.oi0 animatedDrawable2 = zf1Var4.f45161a.getAnimatedDrawable();
                                        org.telegram.ui.Components.oi0 oi0Var3 = zf1Var4.f45164b0[3];
                                        if (animatedDrawable2 != oi0Var3) {
                                            zf1Var4.f45161a.setAnimation(oi0Var3);
                                        }
                                        zf1Var4.f45164b0[3].Q(0.0f, false);
                                        zf1Var4.f45161a.d();
                                    }
                                }
                                EditTextBoldCursor editTextBoldCursor4 = zf1Var4.f45172n;
                                editTextBoldCursor4.setSelection(editTextBoldCursor4.length());
                                zf1Var4.I = false;
                                break;
                        }
                    }
                });
                this.f45175w.setVisibility(0);
                this.f45161a.f(R.raw.tsv_setup_mail, 120, 120, null);
                this.f45161a.d();
                i10 = 1;
                break;
            case 6:
                this.f45165c.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.d.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.f45163b.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.d.setVisibility(0);
                this.f45161a.f(R.raw.tsv_setup_intro, 140, 140, null);
                this.f45161a.d();
                i10 = 1;
                break;
            case 7:
                this.f45165c.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.d.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.U) {
                    this.f45163b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.D) {
                    this.f45163b.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.f45163b.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.d.setVisibility(0);
                this.f45161a.f(R.raw.wallet_allset, 160, 160, null);
                this.f45161a.d();
                i10 = 1;
                break;
            case 8:
                this.actionBar.setTitle(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.f45165c.setText(LocaleController.getString(R.string.PleaseEnterCurrentPassword));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.d.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.f45168e.setText(LocaleController.getString(R.string.ForgotPassword));
                this.f45168e.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251o6, false));
                this.f45174s.setText(LocaleController.getString(R.string.LoginPassword));
                this.f45172n.setContentDescription(LocaleController.getString(R.string.LoginPassword));
                this.f45172n.setImeOptions(268435462);
                this.f45172n.setInputType(129);
                this.f45172n.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.f45172n.setTypeface(Typeface.DEFAULT);
                this.f45161a.f(R.raw.wallet_science, 120, 120, null);
                this.f45161a.d();
                i10 = 1;
                break;
            case 9:
                this.f45165c.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.d.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.f45163b.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.d.setVisibility(0);
                this.f45161a.f(R.raw.wallet_perfect, 140, 140, null);
                this.f45161a.d();
                i10 = 1;
                break;
            default:
                i10 = 1;
                break;
        }
        EditTextBoldCursor editTextBoldCursor4 = this.f45172n;
        if (editTextBoldCursor4 != null) {
            editTextBoldCursor4.addTextChangedListener(new wf1(this, i10));
        }
        return this.fragmentView;
    }

    @Override
    public final boolean finishFragment(boolean z10) {
        for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
            if (n2Var != this && (n2Var instanceof zf1)) {
                ((org.telegram.ui.Components.x51) ((zf1) n2Var).X.f38984b).f34506b = true;
            }
        }
        return super.finishFragment(z10);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45165c, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45172n, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45172n, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45172n, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f45172n, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f23198l6));
        return arrayList;
    }

    @Override
    public final boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        int i10 = this.K;
        return i10 == 7 || i10 == 9;
    }

    @Override
    public final boolean isLightStatusBar() {
        return i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, true)) > 0.699999988079071d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.C < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (this.C < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            if (z10) {
                finishFragment();
            }
            return true;
        }
        if (!z10) {
            return false;
        }
        I0();
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f45161a != null) {
            int i10 = this.K;
            if (i10 == 2 && AndroidUtilities.isSmallScreen()) {
                this.f45161a.setVisibility(8);
            } else if (i10 != 6 && i10 != 9 && i10 != 7) {
                org.telegram.ui.Components.ri0 ri0Var = this.f45161a;
                Point point = AndroidUtilities.displaySize;
                ri0Var.setVisibility(point.x > point.y ? 8 : 0);
            }
        }
        org.telegram.ui.Components.ir irVar = this.f45162a0;
        if (irVar != null) {
            irVar.setVisibility(v0() ? 0 : 8);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.J = false;
        rf1 rf1Var = this.f45166c0;
        if (rf1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(rf1Var);
            this.f45166c0 = null;
        }
        if (this.f45164b0 != null) {
            int i10 = 0;
            while (true) {
                org.telegram.ui.Components.oi0[] oi0VarArr = this.f45164b0;
                if (i10 >= oi0VarArr.length) {
                    break;
                }
                oi0VarArr[i10].A(false);
                i10++;
            }
            this.f45164b0 = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.O = true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.O = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (v0()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            if (this.f45172n != null && !v0()) {
                AndroidUtilities.runOnUIThread(new rf1(this, 0), 200L);
            }
            od0 od0Var = this.f45175w;
            if (od0Var == null || od0Var.getVisibility() != 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new rf1(this, 1), 200L);
        }
    }

    public final void u0(Runnable runnable) {
        int i10 = 0;
        while (true) {
            od0 od0Var = this.f45175w;
            wr[] wrVarArr = od0Var.f43279f;
            if (i10 >= wrVarArr.length) {
                od0Var.postDelayed(new m21(25, this, runnable), (((long) wrVarArr.length) * 75) + 350);
                return;
            } else {
                wr wrVar = wrVarArr[i10];
                wrVar.postDelayed(new wk0(wrVar, 1), ((long) i10) * 75);
                i10++;
            }
        }
    }

    public final boolean v0() {
        int i10 = this.K;
        if ((i10 != 5 && i10 != 4) || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public final void w0() {
        this.Y.f(false, true);
    }

    public final void x0() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.Y.f(true, true);
    }

    public final void y0() {
        for (wr wrVar : this.f45175w.f43279f) {
            wrVar.setText("");
            wrVar.i(1.0f);
        }
        this.f45175w.f43279f[0].requestFocus();
        AndroidUtilities.shakeViewSpring(this.f45175w, 8.0f, new rf1(this, 6));
    }

    public final void z0(org.telegram.ui.Components.jc0 jc0Var, EditTextBoldCursor editTextBoldCursor, boolean z10) {
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
        AndroidUtilities.shakeViewSpring(jc0Var, 5.0f);
    }

    @Override
    public final void finishFragment() {
        if (this.C >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle bundleH = a9.p.h("afterSignup", true);
            qg0 qg0Var = new qg0();
            qg0Var.l0(bundleH);
            presentFragment(qg0Var, true);
            return;
        }
        super.finishFragment();
    }

    public zf1(int i10, TL_account.Password password) {
        super(null);
        this.B = false;
        this.C = -1;
        this.F = new ArrayList();
        this.R = new byte[0];
        this.f45167d0 = new rf1(this, 2);
        this.f45169e0 = new rf1(this, 3);
        this.K = i10;
        this.Q = password;
        if (password == null && (i10 == 6 || i10 == 8)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new sf1(this, 0), 10);
        } else {
            this.P = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public void B0() {
    }
}
