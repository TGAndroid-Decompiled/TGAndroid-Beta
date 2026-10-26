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
    public final boolean f44168a;
    public final byte[] f44169b;
    public final TL_account.getPasswordSettings f44170c;
    public final String d;
    public final in0 e;

    public um0(in0 in0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = in0Var;
        this.f44168a = z10;
        this.f44169b = bArr;
        this.f44170c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        int i11;
        in0 in0Var = this.e;
        if (in0Var.Y == null) {
            return;
        }
        if (!this.f44168a) {
            i11 = ((org.telegram.ui.ActionBar.r2) in0Var).currentAccount;
            UserConfig.getInstance(i11).savePassword(this.f44169b, in0Var.f40284e1);
        }
        int i12 = 0;
        AndroidUtilities.hideKeyboard(in0Var.Y[0]);
        in0Var.f40287f1 = true;
        long j10 = in0Var.f40278c;
        if (j10 == 0) {
            i12 = 8;
        }
        in0 in0Var2 = new in0(i12, j10, in0Var.h, in0Var.f40309r, in0Var.d, in0Var.e, in0Var.f40300n, in0Var.f40327y, in0Var.J);
        in0Var2.f40282d1 = in0Var.f40282d1;
        i10 = ((org.telegram.ui.ActionBar.r2) in0Var).currentAccount;
        ((org.telegram.ui.ActionBar.r2) in0Var2).currentAccount = i10;
        in0Var2.f40284e1 = in0Var.f40284e1;
        in0Var2.f40280c1 = in0Var.f40280c1;
        in0Var2.f40277b1 = in0Var.f40277b1;
        in0Var2.C1 = in0Var.C1;
        j5Var = ((org.telegram.ui.ActionBar.r2) in0Var).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) in0Var).parentLayout;
            if (((ActionBarLayout) j5Var2).i()) {
                in0Var.f40291h1 = in0Var2;
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
            updatepasswordsettings.password = SRPHelper.startCheck(this.f44169b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.r2) in0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f44170c, new sm0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.r2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new fi.m3(9, this, this.f44168a), 8);
        } else if (tL_error == null) {
            Utilities.globalQueue.postRunnable(new bi.s9((Object) this, tLObject, (Object) this.d, this.f44168a, 25));
        } else {
            AndroidUtilities.runOnUIThread(new d80(this, this.f44168a, tL_error, 4));
        }
    }
}
