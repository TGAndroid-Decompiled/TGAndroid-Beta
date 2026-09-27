package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class vm0 implements RequestDelegate {
    public final boolean f38640a;
    public final byte[] f38641b;
    public final TL_account.getPasswordSettings f38642c;
    public final String d;
    public final jn0 e;

    public vm0(jn0 jn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = jn0Var;
        this.f38640a = z10;
        this.f38641b = bArr;
        this.f38642c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int i12;
        jn0 jn0Var = this.e;
        if (jn0Var.Y == null) {
            return;
        }
        if (!this.f38640a) {
            i12 = ((org.telegram.ui.ActionBar.o2) jn0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f38641b, jn0Var.f34779e1);
        }
        AndroidUtilities.hideKeyboard(jn0Var.Y[0]);
        jn0Var.f34782f1 = true;
        long j3 = jn0Var.f34773c;
        if (j3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        jn0 jn0Var2 = new jn0(i10, j3, jn0Var.h, jn0Var.f34804r, jn0Var.d, jn0Var.e, jn0Var.f34795n, jn0Var.f34822y, jn0Var.J);
        jn0Var2.f34777d1 = jn0Var.f34777d1;
        i11 = ((org.telegram.ui.ActionBar.o2) jn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.o2) jn0Var2).currentAccount = i11;
        jn0Var2.f34779e1 = jn0Var.f34779e1;
        jn0Var2.f34775c1 = jn0Var.f34775c1;
        jn0Var2.f34772b1 = jn0Var.f34772b1;
        jn0Var2.C1 = jn0Var.C1;
        d5Var = ((org.telegram.ui.ActionBar.o2) jn0Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.o2) jn0Var).parentLayout;
            if (((ActionBarLayout) d5Var2).j()) {
                jn0Var.f34786h1 = jn0Var2;
                return;
            }
        }
        jn0Var.presentFragment(jn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        jn0 jn0Var = this.e;
        TL_account.Password password = jn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f38641b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        }
        TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        updatepasswordsettings.new_settings = passwordinputsettings;
        passwordinputsettings.new_secure_settings = new TLRPC.TL_secureSecretSettings();
        TLRPC.TL_secureSecretSettings tL_secureSecretSettings = updatepasswordsettings.new_settings.new_secure_settings;
        tL_secureSecretSettings.secure_secret = new byte[0];
        tL_secureSecretSettings.secure_algo = new TLRPC.TL_securePasswordKdfAlgoUnknown();
        TL_account.passwordInputSettings passwordinputsettings2 = updatepasswordsettings.new_settings;
        passwordinputsettings2.new_secure_settings.secure_secret_id = 0L;
        passwordinputsettings2.flags |= 4;
        i10 = ((org.telegram.ui.ActionBar.o2) jn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f38642c, new tm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.o2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.t3(9, this, this.f38640a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.s4(this, tLObject, this.d, this.f38640a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new ga0(this, this.f38640a, tL_error, 2));
        }
    }
}
