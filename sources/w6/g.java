package w6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.r3;
public final class g extends b6.g {
    public final k5.b R;

    public g(Context context, Looper looper, r3 r3Var, k5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, r3Var, kVar, lVar, 0);
        bVar = bVar == null ? k5.b.f10470c : bVar;
        f7.b bVar2 = new f7.b((char) 0, 20);
        bVar2.f6120b = Boolean.FALSE;
        k5.b bVar3 = k5.b.f10470c;
        bVar.getClass();
        bVar2.f6120b = Boolean.valueOf(bVar.f10471a);
        bVar2.f6121c = bVar.f10472b;
        bVar2.f6121c = e.a();
        this.R = new k5.b(bVar2);
    }

    @Override
    public final int k() {
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
        return new a7.a(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 10);
    }

    @Override
    public final Bundle t() {
        k5.b bVar = this.R;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f10471a);
        bundle.putString("log_session_id", bVar.f10472b);
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
