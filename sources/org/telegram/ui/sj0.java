package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class sj0 implements RequestDelegate {
    public final boolean f49865a;
    public final byte[] f49866b;
    public final TL_account.getPasswordSettings f49867c;
    public final String d;
    public final ek0 f49868e;

    public sj0(ek0 ek0Var, boolean z9, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f49868e = ek0Var;
        this.f49865a = z9;
        this.f49866b = bArr;
        this.f49867c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        int i10;
        ek0 ek0Var = this.f49868e;
        if (ek0Var.Y == null) {
            return;
        }
        if (!this.f49865a) {
            i10 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
            org.telegram.messenger.p10 i11 = org.telegram.messenger.p10.i(i10);
            byte[] bArr = this.f49866b;
            byte[] bArr2 = this.f49868e.f45328e1;
            i11.f24492l0 = SystemClock.elapsedRealtime();
            i11.f24490j0 = bArr;
            i11.f24491k0 = bArr2;
        }
        int i12 = 0;
        org.telegram.messenger.g0.v1(this.f49868e.Y[0]);
        ek0 ek0Var2 = this.f49868e;
        ek0Var2.f45331f1 = true;
        long j3 = ek0Var2.f45321c;
        if (j3 == 0) {
            i12 = 8;
        }
        ek0 ek0Var3 = new ek0(i12, j3, ek0Var2.h, ek0Var2.f45352r, ek0Var2.d, ek0Var2.f45326e, ek0Var2.f45344n, ek0Var2.D, ek0Var2.J);
        ek0 ek0Var4 = this.f49868e;
        ek0Var3.f45325d1 = ek0Var4.f45325d1;
        i7 = ((org.telegram.ui.ActionBar.f2) ek0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.f2) ek0Var3).currentAccount = i7;
        ek0 ek0Var5 = this.f49868e;
        ek0Var3.f45328e1 = ek0Var5.f45328e1;
        ek0Var3.f45323c1 = ek0Var5.f45323c1;
        ek0Var3.f45320b1 = ek0Var5.f45320b1;
        ek0Var3.C1 = ek0Var5.C1;
        r4Var = ((org.telegram.ui.ActionBar.f2) ek0Var5).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.f2) this.f49868e).parentLayout;
            if (((ActionBarLayout) r4Var2).i()) {
                this.f49868e.f45335h1 = ek0Var3;
                return;
            }
        }
        this.f49868e.presentFragment(ek0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        ek0 ek0Var = this.f49868e;
        TL_account.Password password = ek0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.pv.d(this.f49866b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.f2) ek0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.f49867c, new qj0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i7 = ((org.telegram.ui.ActionBar.f2) this.f49868e).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(getpassword, new fi.d3(8, this, this.f49865a), 8);
        } else if (tL_error == null) {
            Utilities.f21341e.c(new xn((Object) this, tLObject, (Object) this.d, this.f49865a, 11));
        } else {
            org.telegram.messenger.g0.h3(new j60(this, this.f49865a, tL_error, 4));
        }
    }
}
