package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class yk0 implements RequestDelegate {
    public final boolean f43858a;
    public final byte[] f43859b;
    public final TL_account.getPasswordSettings f43860c;
    public final String d;
    public final ll0 e;

    public yk0(ll0 ll0Var, boolean z10, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.e = ll0Var;
        this.f43858a = z10;
        this.f43859b = bArr;
        this.f43860c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i10;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        int i11;
        ll0 ll0Var = this.e;
        if (ll0Var.Y == null) {
            return;
        }
        if (!this.f43858a) {
            i11 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
            org.telegram.messenger.d20 i12 = org.telegram.messenger.d20.i(i11);
            byte[] bArr = this.f43859b;
            byte[] bArr2 = this.e.f39269e1;
            i12.f15164l0 = SystemClock.elapsedRealtime();
            i12.f15162j0 = bArr;
            i12.f15163k0 = bArr2;
        }
        int i13 = 0;
        org.telegram.messenger.i0.v1(this.e.Y[0]);
        ll0 ll0Var2 = this.e;
        ll0Var2.f39272f1 = true;
        long j10 = ll0Var2.f39263c;
        if (j10 == 0) {
            i13 = 8;
        }
        ll0 ll0Var3 = new ll0(i13, j10, ll0Var2.h, ll0Var2.f39294r, ll0Var2.d, ll0Var2.e, ll0Var2.f39285n, ll0Var2.D, ll0Var2.J);
        ll0 ll0Var4 = this.e;
        ll0Var3.f39267d1 = ll0Var4.f39267d1;
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.k2) ll0Var3).currentAccount = i10;
        ll0 ll0Var5 = this.e;
        ll0Var3.f39269e1 = ll0Var5.f39269e1;
        ll0Var3.f39265c1 = ll0Var5.f39265c1;
        ll0Var3.f39262b1 = ll0Var5.f39262b1;
        ll0Var3.C1 = ll0Var5.C1;
        z4Var = ((org.telegram.ui.ActionBar.k2) ll0Var5).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) this.e).parentLayout;
            if (((ActionBarLayout) z4Var2).i()) {
                this.e.f39276h1 = ll0Var3;
                return;
            }
        }
        this.e.presentFragment(ll0Var3, true);
    }

    public final void b() {
        int i10;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        ll0 ll0Var = this.e;
        TL_account.Password password = ll0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.aw.d(this.f43859b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i10 = ((org.telegram.ui.ActionBar.k2) ll0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(this.f43860c, new wk0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i10 = ((org.telegram.ui.ActionBar.k2) this.e).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(getpassword, new org.telegram.messenger.voip.u0(7, this, this.f43858a), 8);
        } else if (tL_error == null) {
            Utilities.e.c(new kp(this, tLObject, this.d, this.f43858a, 9));
        } else {
            org.telegram.messenger.i0.g3(new bk0(this, this.f43858a, tL_error, 1));
        }
    }
}
