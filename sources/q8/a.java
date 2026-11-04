package q8;

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
import m.o3;
import p6.m;
import p6.w;
public final class a extends p6.h implements com.google.android.gms.common.api.c {
    public final boolean F;
    public final o3 G;
    public final Bundle H;
    public final Integer I;

    public a(Context context, Looper looper, o3 o3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, o3Var, kVar, lVar, 0);
        this.F = true;
        this.G = o3Var;
        this.H = bundle;
        this.I = (Integer) o3Var.f18687g;
    }

    public final void A(c cVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.G.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = c6.b.a(this.h).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.I;
            m.g(num);
            w wVar = new w(2, account, num.intValue(), googleSignInAccount);
            e eVar = (e) m();
            g gVar = new g(1, wVar);
            Parcel J0 = eVar.J0();
            m7.a.b(J0, gVar);
            m7.a.c(J0, cVar);
            eVar.K0(J0, 12);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.Y(new h(1, new m6.a(8, null, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override
    public final int d() {
        return 12451000;
    }

    @Override
    public final boolean f() {
        return this.F;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new b8.a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 7);
    }

    @Override
    public final Bundle k() {
        o3 o3Var = this.G;
        boolean equals = this.h.getPackageName().equals((String) o3Var.d);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) o3Var.d);
        }
        return bundle;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.signin.service.START";
    }
}
