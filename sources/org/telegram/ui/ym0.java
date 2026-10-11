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
public final class ym0 implements RequestDelegate {
    public final boolean f44456a;
    public final byte[] f44457b;
    public final TL_account.getPasswordSettings f44458c;
    public final String d;
    public final mn0 f44459e;

    public ym0(mn0 mn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f44459e = mn0Var;
        this.f44456a = z10;
        this.f44457b = bArr;
        this.f44458c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        int i11;
        mn0 mn0Var = this.f44459e;
        if (mn0Var.Y == null) {
            return;
        }
        if (!this.f44456a) {
            i11 = ((org.telegram.ui.ActionBar.m2) mn0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f44457b, mn0Var.f39995e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(mn0Var.Y[0]);
        mn0Var.f39998f1 = true;
        long j3 = mn0Var.f39988c;
        if (j3 == 0) {
            i12 = 8;
        }
        mn0 mn0Var2 = new mn0(i12, j3, mn0Var.h, mn0Var.f40020r, mn0Var.d, mn0Var.f39993e, mn0Var.f40011n, mn0Var.f40038y, mn0Var.J);
        mn0Var2.f39992d1 = mn0Var.f39992d1;
        i10 = ((org.telegram.ui.ActionBar.m2) mn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.m2) mn0Var2).currentAccount = i10;
        mn0Var2.f39995e1 = mn0Var.f39995e1;
        mn0Var2.f39990c1 = mn0Var.f39990c1;
        mn0Var2.f39987b1 = mn0Var.f39987b1;
        mn0Var2.C1 = mn0Var.C1;
        b5Var = ((org.telegram.ui.ActionBar.m2) mn0Var).parentLayout;
        if (b5Var != null) {
            b5Var2 = ((org.telegram.ui.ActionBar.m2) mn0Var).parentLayout;
            if (((ActionBarLayout) b5Var2).j()) {
                mn0Var.f40002h1 = mn0Var2;
                return;
            }
        }
        mn0Var.presentFragment(mn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        mn0 mn0Var = this.f44459e;
        TL_account.Password password = mn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f44457b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.m2) mn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f44458c, new wm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.m2) this.f44459e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.s3(9, this, this.f44456a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.t4(this, tLObject, this.d, this.f44456a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new ga0(this, this.f44456a, tL_error, 2));
        }
    }
}
