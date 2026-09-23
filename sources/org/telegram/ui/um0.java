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
public final class um0 implements RequestDelegate {
    public final boolean f38133a;
    public final byte[] f38134b;
    public final TL_account.getPasswordSettings f38135c;
    public final String d;
    public final in0 e;

    public um0(in0 in0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = in0Var;
        this.f38133a = z10;
        this.f38134b = bArr;
        this.f38135c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        int i12;
        in0 in0Var = this.e;
        if (in0Var.Y == null) {
            return;
        }
        if (!this.f38133a) {
            i12 = ((org.telegram.ui.ActionBar.n2) in0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f38134b, in0Var.f34174e1);
        }
        AndroidUtilities.hideKeyboard(in0Var.Y[0]);
        in0Var.f34177f1 = true;
        long j3 = in0Var.f34168c;
        if (j3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        in0 in0Var2 = new in0(i10, j3, in0Var.h, in0Var.f34199r, in0Var.d, in0Var.e, in0Var.f34190n, in0Var.f34217y, in0Var.J);
        in0Var2.f34172d1 = in0Var.f34172d1;
        i11 = ((org.telegram.ui.ActionBar.n2) in0Var).currentAccount;
        ((org.telegram.ui.ActionBar.n2) in0Var2).currentAccount = i11;
        in0Var2.f34174e1 = in0Var.f34174e1;
        in0Var2.f34170c1 = in0Var.f34170c1;
        in0Var2.f34167b1 = in0Var.f34167b1;
        in0Var2.C1 = in0Var.C1;
        c5Var = ((org.telegram.ui.ActionBar.n2) in0Var).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) in0Var).parentLayout;
            if (((ActionBarLayout) c5Var2).j()) {
                in0Var.f34181h1 = in0Var2;
                return;
            }
        }
        in0Var.presentFragment(in0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        in0 in0Var = this.e;
        TL_account.Password password = in0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f38134b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.n2) in0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f38135c, new sm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.n2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.t3(9, this, this.f38133a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.s4(this, tLObject, this.d, this.f38133a, 24));
        } else {
            AndroidUtilities.runOnUIThread(new vl0(this, this.f38133a, tL_error, 1));
        }
    }
}
