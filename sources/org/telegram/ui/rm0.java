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
public final class rm0 implements RequestDelegate {
    public final boolean f40993a;
    public final byte[] f40994b;
    public final TL_account.getPasswordSettings f40995c;
    public final String d;
    public final fn0 f40996e;

    public rm0(fn0 fn0Var, boolean z4, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f40996e = fn0Var;
        this.f40993a = z4;
        this.f40994b = bArr;
        this.f40995c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.f5 f5Var;
        org.telegram.ui.ActionBar.f5 f5Var2;
        int i12;
        fn0 fn0Var = this.f40996e;
        if (fn0Var.V == null) {
            return;
        }
        if (!this.f40993a) {
            i12 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f40994b, fn0Var.f36922b1);
        }
        AndroidUtilities.hideKeyboard(fn0Var.V[0]);
        fn0Var.f36925c1 = true;
        long j10 = fn0Var.f36923c;
        if (j10 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        fn0 fn0Var2 = new fn0(i10, j10, fn0Var.h, fn0Var.f36955r, fn0Var.d, fn0Var.f36928e, fn0Var.f36946n, fn0Var.f36973y, fn0Var.G);
        fn0Var2.f36919a1 = fn0Var.f36919a1;
        i11 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.p2) fn0Var2).currentAccount = i11;
        fn0Var2.f36922b1 = fn0Var.f36922b1;
        fn0Var2.Z0 = fn0Var.Z0;
        fn0Var2.Y0 = fn0Var.Y0;
        fn0Var2.f36977z1 = fn0Var.f36977z1;
        f5Var = ((org.telegram.ui.ActionBar.p2) fn0Var).parentLayout;
        if (f5Var != null) {
            f5Var2 = ((org.telegram.ui.ActionBar.p2) fn0Var).parentLayout;
            if (((ActionBarLayout) f5Var2).j()) {
                fn0Var.f36930e1 = fn0Var2;
                return;
            }
        }
        fn0Var.presentFragment(fn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        fn0 fn0Var = this.f40996e;
        TL_account.Password password = fn0Var.G;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f40994b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.p2) fn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f40995c, new pm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.p2) this.f40996e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new org.telegram.messenger.zd(8, this, this.f40993a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new dg.t0(this, tLObject, this.d, this.f40993a, 20));
        } else {
            AndroidUtilities.runOnUIThread(new mh.r5(this, this.f40993a, tL_error, 27));
        }
    }
}
