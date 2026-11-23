package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class tj0 implements RequestDelegate {
    public final boolean f52416a;
    public final byte[] f52417b;
    public final TL_account.getPasswordSettings f52418c;
    public final String d;
    public final fk0 f52419e;

    public tj0(fk0 fk0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f52419e = fk0Var;
        this.f52416a = z10;
        this.f52417b = bArr;
        this.f52418c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        int i10;
        fk0 fk0Var = this.f52419e;
        if (fk0Var.Z == null) {
            return;
        }
        if (!this.f52416a) {
            i10 = ((org.telegram.ui.ActionBar.g2) fk0Var).currentAccount;
            org.telegram.messenger.i10 i11 = org.telegram.messenger.i10.i(i10);
            byte[] bArr = this.f52417b;
            byte[] bArr2 = this.f52419e.f47867f1;
            i11.m0 = SystemClock.elapsedRealtime();
            i11.f24654k0 = bArr;
            i11.f24655l0 = bArr2;
        }
        int i12 = 0;
        org.telegram.messenger.g0.v1(this.f52419e.Z[0]);
        fk0 fk0Var2 = this.f52419e;
        fk0Var2.f47869g1 = true;
        long j3 = fk0Var2.f47857c;
        if (j3 == 0) {
            i12 = 8;
        }
        fk0 fk0Var3 = new fk0(i12, j3, fk0Var2.h, fk0Var2.f47888r, fk0Var2.d, fk0Var2.f47862e, fk0Var2.f47880n, fk0Var2.E, fk0Var2.K);
        fk0 fk0Var4 = this.f52419e;
        fk0Var3.f47864e1 = fk0Var4.f47864e1;
        i7 = ((org.telegram.ui.ActionBar.g2) fk0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.g2) fk0Var3).currentAccount = i7;
        fk0 fk0Var5 = this.f52419e;
        fk0Var3.f47867f1 = fk0Var5.f47867f1;
        fk0Var3.f47861d1 = fk0Var5.f47861d1;
        fk0Var3.f47859c1 = fk0Var5.f47859c1;
        fk0Var3.D1 = fk0Var5.D1;
        r4Var = ((org.telegram.ui.ActionBar.g2) fk0Var5).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) this.f52419e).parentLayout;
            if (((ActionBarLayout) r4Var2).i()) {
                this.f52419e.f47873i1 = fk0Var3;
                return;
            }
        }
        this.f52419e.presentFragment(fk0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        fk0 fk0Var = this.f52419e;
        TL_account.Password password = fk0Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.jv.d(this.f52417b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.g2) fk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.f52418c, new rj0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i7 = ((org.telegram.ui.ActionBar.g2) this.f52419e).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(getpassword, new hi.k3(8, this, this.f52416a), 8);
        } else if (tL_error == null) {
            Utilities.f22877e.c(new xn((Object) this, tLObject, (Object) this.d, this.f52416a, 11));
        } else {
            org.telegram.messenger.g0.g3(new a80(this, this.f52416a, tL_error, 3));
        }
    }
}
