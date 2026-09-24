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
public final class sm0 implements RequestDelegate {
    public final boolean f37812a;
    public final byte[] f37813b;
    public final TL_account.getPasswordSettings f37814c;
    public final String d;
    public final gn0 e;

    public sm0(gn0 gn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = gn0Var;
        this.f37812a = z10;
        this.f37813b = bArr;
        this.f37814c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i12;
        gn0 gn0Var = this.e;
        if (gn0Var.Y == null) {
            return;
        }
        if (!this.f37812a) {
            i12 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f37813b, gn0Var.f33968e1);
        }
        AndroidUtilities.hideKeyboard(gn0Var.Y[0]);
        gn0Var.f33971f1 = true;
        long j3 = gn0Var.f33962c;
        if (j3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        gn0 gn0Var2 = new gn0(i10, j3, gn0Var.h, gn0Var.f33993r, gn0Var.d, gn0Var.e, gn0Var.f33984n, gn0Var.f34011y, gn0Var.J);
        gn0Var2.f33966d1 = gn0Var.f33966d1;
        i11 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.m2) gn0Var2).currentAccount = i11;
        gn0Var2.f33968e1 = gn0Var.f33968e1;
        gn0Var2.f33964c1 = gn0Var.f33964c1;
        gn0Var2.f33961b1 = gn0Var.f33961b1;
        gn0Var2.C1 = gn0Var.C1;
        b5Var = ((org.telegram.ui.ActionBar.m2) gn0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) gn0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                gn0Var.f33975h1 = gn0Var2;
                return;
            }
        }
        gn0Var.presentFragment(gn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        gn0 gn0Var = this.e;
        TL_account.Password password = gn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f37813b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.m2) gn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f37814c, new qm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.m2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.t3(9, this, this.f37812a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.s4(this, tLObject, this.d, this.f37812a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new da0(this, this.f37812a, tL_error, 2));
        }
    }
}
