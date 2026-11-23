package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class vj0 implements RequestDelegate {
    public final boolean f52818a;
    public final byte[] f52819b;
    public final TL_account.getPasswordSettings f52820c;
    public final String d;
    public final hk0 f52821e;

    public vj0(hk0 hk0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f52821e = hk0Var;
        this.f52818a = z10;
        this.f52819b = bArr;
        this.f52820c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        int i10;
        hk0 hk0Var = this.f52821e;
        if (hk0Var.Z == null) {
            return;
        }
        if (!this.f52818a) {
            i10 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
            org.telegram.messenger.k10 i11 = org.telegram.messenger.k10.i(i10);
            byte[] bArr = this.f52819b;
            byte[] bArr2 = this.f52821e.f48396f1;
            i11.m0 = SystemClock.elapsedRealtime();
            i11.f24949k0 = bArr;
            i11.f24950l0 = bArr2;
        }
        int i12 = 0;
        org.telegram.messenger.g0.v1(this.f52821e.Z[0]);
        hk0 hk0Var2 = this.f52821e;
        hk0Var2.f48398g1 = true;
        long j3 = hk0Var2.f48386c;
        if (j3 == 0) {
            i12 = 8;
        }
        hk0 hk0Var3 = new hk0(i12, j3, hk0Var2.h, hk0Var2.f48417r, hk0Var2.d, hk0Var2.f48391e, hk0Var2.f48409n, hk0Var2.E, hk0Var2.K);
        hk0 hk0Var4 = this.f52821e;
        hk0Var3.f48393e1 = hk0Var4.f48393e1;
        i7 = ((org.telegram.ui.ActionBar.g2) hk0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.g2) hk0Var3).currentAccount = i7;
        hk0 hk0Var5 = this.f52821e;
        hk0Var3.f48396f1 = hk0Var5.f48396f1;
        hk0Var3.f48390d1 = hk0Var5.f48390d1;
        hk0Var3.f48388c1 = hk0Var5.f48388c1;
        hk0Var3.D1 = hk0Var5.D1;
        r4Var = ((org.telegram.ui.ActionBar.g2) hk0Var5).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) this.f52821e).parentLayout;
            if (((ActionBarLayout) r4Var2).i()) {
                this.f52821e.f48402i1 = hk0Var3;
                return;
            }
        }
        this.f52821e.presentFragment(hk0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        hk0 hk0Var = this.f52821e;
        TL_account.Password password = hk0Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.kv.d(this.f52819b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.g2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.f52820c, new tj0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i7 = ((org.telegram.ui.ActionBar.g2) this.f52821e).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(getpassword, new hi.b3(8, this, this.f52818a), 8);
        } else if (tL_error == null) {
            Utilities.f22774e.c(new xn((Object) this, tLObject, (Object) this.d, this.f52818a, 11));
        } else {
            org.telegram.messenger.g0.g3(new b80(this, this.f52818a, tL_error, 3));
        }
    }
}
