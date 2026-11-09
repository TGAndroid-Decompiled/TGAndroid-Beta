package org.telegram.ui;

import android.os.SystemClock;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
public final class rj0 implements RequestDelegate {
    public final boolean f49494a;
    public final byte[] f49495b;
    public final TL_account.getPasswordSettings f49496c;
    public final String d;
    public final dk0 f49497e;

    public rj0(dk0 dk0Var, boolean z9, byte[] bArr, TL_account.getPasswordSettings getpasswordsettings, String str) {
        this.f49497e = dk0Var;
        this.f49494a = z9;
        this.f49495b = bArr;
        this.f49496c = getpasswordsettings;
        this.d = str;
    }

    public final void a() {
        int i7;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        int i10;
        dk0 dk0Var = this.f49497e;
        if (dk0Var.Y == null) {
            return;
        }
        if (!this.f49494a) {
            i10 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
            org.telegram.messenger.p10 i11 = org.telegram.messenger.p10.i(i10);
            byte[] bArr = this.f49495b;
            byte[] bArr2 = this.f49497e.f45004e1;
            i11.f24488l0 = SystemClock.elapsedRealtime();
            i11.f24486j0 = bArr;
            i11.f24487k0 = bArr2;
        }
        int i12 = 0;
        org.telegram.messenger.g0.v1(this.f49497e.Y[0]);
        dk0 dk0Var2 = this.f49497e;
        dk0Var2.f45007f1 = true;
        long j3 = dk0Var2.f44997c;
        if (j3 == 0) {
            i12 = 8;
        }
        dk0 dk0Var3 = new dk0(i12, j3, dk0Var2.h, dk0Var2.f45028r, dk0Var2.d, dk0Var2.f45002e, dk0Var2.f45020n, dk0Var2.D, dk0Var2.J);
        dk0 dk0Var4 = this.f49497e;
        dk0Var3.f45001d1 = dk0Var4.f45001d1;
        i7 = ((org.telegram.ui.ActionBar.f2) dk0Var4).currentAccount;
        ((org.telegram.ui.ActionBar.f2) dk0Var3).currentAccount = i7;
        dk0 dk0Var5 = this.f49497e;
        dk0Var3.f45004e1 = dk0Var5.f45004e1;
        dk0Var3.f44999c1 = dk0Var5.f44999c1;
        dk0Var3.f44996b1 = dk0Var5.f44996b1;
        dk0Var3.C1 = dk0Var5.C1;
        q4Var = ((org.telegram.ui.ActionBar.f2) dk0Var5).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) this.f49497e).parentLayout;
            if (((ActionBarLayout) q4Var2).i()) {
                this.f49497e.f45011h1 = dk0Var3;
                return;
            }
        }
        this.f49497e.presentFragment(dk0Var3, true);
    }

    public final void b() {
        int i7;
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        dk0 dk0Var = this.f49497e;
        TL_account.Password password = dk0Var.J;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            updatepasswordsettings.password = org.telegram.messenger.pv.d(this.f49495b, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
        i7 = ((org.telegram.ui.ActionBar.f2) dk0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(this.f49496c, new pj0(this, 1));
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7;
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            TL_account.getPassword getpassword = new TL_account.getPassword();
            i7 = ((org.telegram.ui.ActionBar.f2) this.f49497e).currentAccount;
            ConnectionsManager.getInstance(i7).sendRequest(getpassword, new fi.d3(8, this, this.f49494a), 8);
        } else if (tL_error == null) {
            Utilities.f21336e.c(new xn((Object) this, tLObject, (Object) this.d, this.f49494a, 11));
        } else {
            org.telegram.messenger.g0.h3(new i60(this, this.f49494a, tL_error, 4));
        }
    }
}
