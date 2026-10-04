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
    public final boolean f42531a;
    public final byte[] f42532b;
    public final TL_account.getPasswordSettings f42533c;
    public final String d;
    public final kn0 f42534e;

    public wm0(kn0 kn0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f42534e = kn0Var;
        this.f42531a = z10;
        this.f42532b = bArr;
        this.f42533c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.c5 c5Var;
        org.telegram.ui.ActionBar.c5 c5Var2;
        int i12;
        kn0 kn0Var = this.f42534e;
        if (kn0Var.Y == null) {
            return;
        }
        if (!this.f42531a) {
            i12 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
            UserConfig.getInstance(i12).savePassword(this.f42532b, kn0Var.f38017e1);
        }
        AndroidUtilities.hideKeyboard(kn0Var.Y[0]);
        kn0Var.f38020f1 = true;
        long j3 = kn0Var.f38010c;
        if (j3 == 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        kn0 kn0Var2 = new kn0(i10, j3, kn0Var.h, kn0Var.f38042r, kn0Var.d, kn0Var.f38015e, kn0Var.f38033n, kn0Var.f38060y, kn0Var.J);
        kn0Var2.f38014d1 = kn0Var.f38014d1;
        i11 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
        ((org.telegram.ui.ActionBar.n2) kn0Var2).currentAccount = i11;
        kn0Var2.f38017e1 = kn0Var.f38017e1;
        kn0Var2.f38012c1 = kn0Var.f38012c1;
        kn0Var2.f38009b1 = kn0Var.f38009b1;
        kn0Var2.C1 = kn0Var.C1;
        c5Var = ((org.telegram.ui.ActionBar.n2) kn0Var).parentLayout;
        if (c5Var != null) {
            c5Var2 = ((org.telegram.ui.ActionBar.n2) kn0Var).parentLayout;
            if (((ActionBarLayout) c5Var2).j()) {
                kn0Var.f38024h1 = kn0Var2;
                return;
            }
        }
        kn0Var.presentFragment(kn0Var2, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        kn0 kn0Var = this.f42534e;
        TL_account.Password password = kn0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = SRPHelper.startCheck(this.f42532b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.n2) kn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f42533c, new um0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.n2) this.f42534e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ci.t3(9, this, this.f42531a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new ai.s4(this, tLObject, this.d, this.f42531a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new ha0(this, this.f42531a, tL_error, 2));
        }
    }
}
