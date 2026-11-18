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
    public final boolean f52802a;
    public final byte[] f52803b;
    public final TL_account.getPasswordSettings f52804c;
    public final String d;
    public final hk0 f52805e;

    public vj0(hk0 hk0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f52805e = hk0Var;
        this.f52802a = z10;
        this.f52803b = bArr;
        this.f52804c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.s4 s4Var;
        org.telegram.ui.ActionBar.s4 s4Var2;
        int i10;
        hk0 hk0Var = this.f52805e;
        if (hk0Var.Z == null) {
            return;
        }
        if (!this.f52802a) {
            i10 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
            org.telegram.messenger.j10 i11 = org.telegram.messenger.j10.i(i10);
            byte[] bArr = this.f52803b;
            byte[] bArr2 = this.f52805e.f48429f1;
            i11.m0 = SystemClock.elapsedRealtime();
            i11.f24790k0 = bArr;
            i11.f24791l0 = bArr2;
        }
        int i12 = 0;
        org.telegram.messenger.g0.v1(this.f52805e.Z[0]);
        hk0 hk0Var2 = this.f52805e;
        hk0Var2.f48431g1 = true;
        long j3 = hk0Var2.f48419c;
        if (j3 == 0) {
            i12 = 8;
        }
        hk0 hk0Var3 = new hk0(i12, j3, hk0Var2.h, hk0Var2.f48450r, hk0Var2.d, hk0Var2.f48424e, hk0Var2.f48442n, hk0Var2.E, hk0Var2.K);
        hk0 hk0Var4 = this.f52805e;
        hk0Var3.f48426e1 = hk0Var4.f48426e1;
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.h2) hk0Var3).currentAccount = i7;
        hk0 hk0Var5 = this.f52805e;
        hk0Var3.f48429f1 = hk0Var5.f48429f1;
        hk0Var3.f48423d1 = hk0Var5.f48423d1;
        hk0Var3.f48421c1 = hk0Var5.f48421c1;
        hk0Var3.D1 = hk0Var5.D1;
        s4Var = ((org.telegram.ui.ActionBar.h2) hk0Var5).parentLayout;
        if (s4Var != null) {
            s4Var2 = ((org.telegram.ui.ActionBar.h2) this.f52805e).parentLayout;
            if (((ActionBarLayout) s4Var2).i()) {
                this.f52805e.f48435i1 = hk0Var3;
                return;
            }
        }
        this.f52805e.presentFragment(hk0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        hk0 hk0Var = this.f52805e;
        TL_account.Password password = hk0Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.jv.d(this.f52803b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.h2) hk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.f52804c, new tj0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i7 = ((org.telegram.ui.ActionBar.h2) this.f52805e).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(getpassword, new hi.c3(8, this, this.f52802a), 8);
        } else if (tL_error == null) {
            Utilities.f22782e.c(new yn((Object) this, tLObject, (Object) this.d, this.f52802a, 11));
        } else {
            org.telegram.messenger.g0.g3(new a80(this, this.f52802a, tL_error, 3));
        }
    }
}
