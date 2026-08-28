package s6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.t3;
public final class g extends x5.g {
    public final g5.c Q;

    public g(Context context, Looper looper, t3 t3Var, g5.c cVar, k kVar, l lVar) {
        super(context, looper, 68, t3Var, kVar, lVar, 0);
        cVar = cVar == null ? g5.c.f7113c : cVar;
        g5.b bVar = new g5.b(0);
        bVar.f7111b = Boolean.FALSE;
        g5.c cVar2 = g5.c.f7113c;
        cVar.getClass();
        bVar.f7111b = Boolean.valueOf(cVar.f7114a);
        bVar.f7112c = cVar.f7115b;
        bVar.f7112c = e.a();
        this.Q = new g5.c(bVar);
    }

    @Override
    public final int l() {
        return 12800000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof h) {
            return (h) queryLocalInterface;
        }
        return new b7.a(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 9);
    }

    @Override
    public final Bundle t() {
        g5.c cVar = this.Q;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", cVar.f7114a);
        bundle.putString("log_session_id", cVar.f7115b);
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
