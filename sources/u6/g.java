package u6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;
public final class g extends z5.g {
    public final i5.b Q;

    public g(Context context, Looper looper, s3 s3Var, i5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, s3Var, kVar, lVar, 0);
        bVar = bVar == null ? i5.b.f8250c : bVar;
        g9.l lVar2 = new g9.l(7, (byte) 0);
        lVar2.f7168b = Boolean.FALSE;
        i5.b bVar2 = i5.b.f8250c;
        bVar.getClass();
        lVar2.f7168b = Boolean.valueOf(bVar.f8251a);
        lVar2.f7169c = bVar.f8252b;
        lVar2.f7169c = e.a();
        this.Q = new i5.b(lVar2);
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
        return new com.google.android.gms.internal.cast.a(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 9);
    }

    @Override
    public final Bundle t() {
        i5.b bVar = this.Q;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", bVar.f8251a);
        bundle.putString("log_session_id", bVar.f8252b);
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
