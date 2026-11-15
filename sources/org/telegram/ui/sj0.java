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
    public final boolean f51230a;
    public final byte[] f51231b;
    public final TL_account.getPasswordSettings f51232c;
    public final String d;
    public final ek0 f51233e;

    public sj0(ek0 ek0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f51233e = ek0Var;
        this.f51230a = z10;
        this.f51231b = bArr;
        this.f51232c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        int i10;
        ek0 ek0Var = this.f51233e;
        if (ek0Var.Z == null) {
            return;
        }
        if (!this.f51230a) {
            i10 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
            org.telegram.messenger.m10 i11 = org.telegram.messenger.m10.i(i10);
            byte[] bArr = this.f51231b;
            byte[] bArr2 = this.f51233e.f46808f1;
            i11.m0 = SystemClock.elapsedRealtime();
            i11.f24957k0 = bArr;
            i11.f24958l0 = bArr2;
        }
        int i12 = 0;
        org.telegram.messenger.g0.v1(this.f51233e.Z[0]);
        ek0 ek0Var2 = this.f51233e;
        ek0Var2.f46810g1 = true;
        long j3 = ek0Var2.f46798c;
        if (j3 == 0) {
            i12 = 8;
        }
        ek0 ek0Var3 = new ek0(i12, j3, ek0Var2.h, ek0Var2.f46829r, ek0Var2.d, ek0Var2.f46803e, ek0Var2.f46821n, ek0Var2.E, ek0Var2.K);
        ek0 ek0Var4 = this.f51233e;
        ek0Var3.f46805e1 = ek0Var4.f46805e1;
        i7 = ((org.telegram.ui.ActionBar.e2) ek0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.e2) ek0Var3).currentAccount = i7;
        ek0 ek0Var5 = this.f51233e;
        ek0Var3.f46808f1 = ek0Var5.f46808f1;
        ek0Var3.f46802d1 = ek0Var5.f46802d1;
        ek0Var3.f46800c1 = ek0Var5.f46800c1;
        ek0Var3.D1 = ek0Var5.D1;
        o4Var = ((org.telegram.ui.ActionBar.e2) ek0Var5).parentLayout;
        if (o4Var != null) {
            o4Var2 = ((org.telegram.ui.ActionBar.e2) this.f51233e).parentLayout;
            if (((ActionBarLayout) o4Var2).i()) {
                this.f51233e.f46814i1 = ek0Var3;
                return;
            }
        }
        this.f51233e.presentFragment(ek0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        ek0 ek0Var = this.f51233e;
        TL_account.Password password = ek0Var.K;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.nv.d(this.f51231b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.e2) ek0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.f51232c, new qj0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i7 = ((org.telegram.ui.ActionBar.e2) this.f51233e).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(getpassword, new hi.b3(8, this, this.f51230a), 8);
        } else if (tL_error == null) {
            Utilities.f22416e.c(new wn((Object) this, tLObject, (Object) this.d, this.f51230a, 11));
        } else {
            org.telegram.messenger.g0.h3(new f60(this, this.f51230a, tL_error, 4));
        }
    }
}
