package z7;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.t3;
import y5.u;

public final class a extends y5.g implements com.google.android.gms.common.api.c {
    public final boolean Q;
    public final t3 R;
    public final Bundle S;
    public final Integer T;

    public a(Context context, Looper looper, t3 t3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, t3Var, kVar, lVar, 0);
        this.Q = true;
        this.R = t3Var;
        this.S = bundle;
        this.T = (Integer) t3Var.h;
    }

    public final void G() {
        p(new y5.c(this));
    }

    public final void H(c cVar) {
        try {
            this.R.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? k5.b.a(this.f49635n).b() : null;
            Integer num = this.T;
            y5.l.h(num);
            u uVar = new u(2, account, num.intValue(), googleSignInAccountB);
            e eVar = (e) u();
            g gVar = new g(1, uVar);
            Parcel parcelG0 = eVar.G0();
            v6.a.c(parcelG0, gVar);
            v6.a.d(parcelG0, cVar);
            eVar.H0(parcelG0, 12);
        } catch (RemoteException e9) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.p0(new h(1, new v5.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e9);
            }
        }
    }

    @Override
    public final int k() {
        return 12451000;
    }

    @Override
    public final boolean o() {
        return this.Q;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder, "com.google.android.gms.signin.internal.ISignInService", 10);
    }

    @Override
    public final Bundle t() {
        t3 t3Var = this.R;
        boolean zEquals = this.f49635n.getPackageName().equals((String) t3Var.d);
        Bundle bundle = this.S;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) t3Var.d);
        }
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
