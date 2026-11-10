package r8;

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
import m.q3;
import q6.m;
import q6.w;
public final class a extends q6.h implements com.google.android.gms.common.api.c {
    public final boolean F;
    public final q3 G;
    public final Bundle H;
    public final Integer I;

    public a(Context context, Looper looper, q3 q3Var, Bundle bundle, k kVar, l lVar) {
        super(context, looper, 44, q3Var, kVar, lVar, 0);
        this.F = true;
        this.G = q3Var;
        this.H = bundle;
        this.I = (Integer) q3Var.f19238g;
    }

    public final void B(c cVar) {
        GoogleSignInAccount googleSignInAccount;
        try {
            this.G.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = d6.b.a(this.h).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = this.I;
            m.g(num);
            w wVar = new w(2, account, num.intValue(), googleSignInAccount);
            e eVar = (e) n();
            g gVar = new g(1, wVar);
            Parcel j12 = eVar.j1();
            n7.a.b(j12, gVar);
            n7.a.c(j12, cVar);
            eVar.k1(j12, 12);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                cVar.V0(new h(1, new n6.a(8, null, null), null));
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
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 8);
    }

    @Override
    public final Bundle m() {
        q3 q3Var = this.G;
        boolean equals = this.h.getPackageName().equals((String) q3Var.d);
        Bundle bundle = this.H;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) q3Var.d);
        }
        return bundle;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.signin.service.START";
    }
}
