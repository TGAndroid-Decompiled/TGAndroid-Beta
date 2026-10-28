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
public final class wm0 implements RequestDelegate {
    public final boolean f45032a;
    public final byte[] f45033b;
    public final TL_account.getPasswordSettings f45034c;
    public final String d;
    public final kn0 e;

    public wm0(kn0 kn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = kn0Var;
        this.f45032a = z10;
        this.f45033b = bArr;
        this.f45034c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        int i11;
        kn0 kn0Var = this.e;
        if (kn0Var.Y == null) {
            return;
        }
        if (!this.f45032a) {
            i11 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f45033b, kn0Var.f40847e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(kn0Var.Y[0]);
        kn0Var.f40850f1 = true;
        long j10 = kn0Var.f40841c;
        if (j10 == 0) {
            i12 = 8;
        }
        kn0 kn0Var2 = new kn0(i12, j10, kn0Var.h, kn0Var.f40872r, kn0Var.d, kn0Var.e, kn0Var.f40863n, kn0Var.f40890y, kn0Var.J);
        kn0Var2.f40845d1 = kn0Var.f40845d1;
        i10 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.r2) kn0Var2).currentAccount = i10;
        kn0Var2.f40847e1 = kn0Var.f40847e1;
        kn0Var2.f40843c1 = kn0Var.f40843c1;
        kn0Var2.f40840b1 = kn0Var.f40840b1;
        kn0Var2.C1 = kn0Var.C1;
        j5Var = ((org.telegram.ui.ActionBar.r2) kn0Var).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) kn0Var).parentLayout;
            if (((ActionBarLayout) j5Var2).i()) {
                kn0Var.f40854h1 = kn0Var2;
                return;
            }
        }
        kn0Var.presentFragment(kn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        kn0 kn0Var = this.e;
        TL_account.Password password = kn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f45033b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.r2) kn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f45034c, new um0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.r2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new fi.m3(9, this, this.f45032a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new bi.s9((Object) this, tLObject, (Object) this.d, this.f45032a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new f80(this, this.f45032a, tL_error, 4));
        }
    }
}
