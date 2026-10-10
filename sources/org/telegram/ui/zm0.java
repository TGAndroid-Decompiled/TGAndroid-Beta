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
public final class zm0 implements RequestDelegate {
    public final boolean f44740a;
    public final byte[] f44741b;
    public final TL_account.getPasswordSettings f44742c;
    public final String d;
    public final nn0 f44743e;

    public zm0(nn0 nn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f44743e = nn0Var;
        this.f44740a = z10;
        this.f44741b = bArr;
        this.f44742c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.d5 d5Var;
        org.telegram.ui.ActionBar.d5 d5Var2;
        int i11;
        nn0 nn0Var = this.f44743e;
        if (nn0Var.Y == null) {
            return;
        }
        if (!this.f44740a) {
            i11 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f44741b, nn0Var.f40297e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(nn0Var.Y[0]);
        nn0Var.f40300f1 = true;
        long j3 = nn0Var.f40290c;
        if (j3 == 0) {
            i12 = 8;
        }
        nn0 nn0Var2 = new nn0(i12, j3, nn0Var.h, nn0Var.f40322r, nn0Var.d, nn0Var.f40295e, nn0Var.f40313n, nn0Var.f40340y, nn0Var.J);
        nn0Var2.f40294d1 = nn0Var.f40294d1;
        i10 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.n2) nn0Var2).currentAccount = i10;
        nn0Var2.f40297e1 = nn0Var.f40297e1;
        nn0Var2.f40292c1 = nn0Var.f40292c1;
        nn0Var2.f40289b1 = nn0Var.f40289b1;
        nn0Var2.C1 = nn0Var.C1;
        d5Var = ((org.telegram.ui.ActionBar.n2) nn0Var).parentLayout;
        if (d5Var != null) {
            d5Var2 = ((org.telegram.ui.ActionBar.n2) nn0Var).parentLayout;
            if (((ActionBarLayout) d5Var2).j()) {
                nn0Var.f40304h1 = nn0Var2;
                return;
            }
        }
        nn0Var.presentFragment(nn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        nn0 nn0Var = this.f44743e;
        TL_account.Password password = nn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f44741b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.n2) nn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f44742c, new xm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.n2) this.f44743e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.s3(9, this, this.f44740a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.t4(this, tLObject, this.d, this.f44740a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new ha0(this, this.f44740a, tL_error, 2));
        }
    }
}
