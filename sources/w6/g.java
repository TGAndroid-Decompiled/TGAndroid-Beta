package w6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.s3;
public final class g extends b6.g {
    public final k5.b R;

    public g(Context context, Looper looper, s3 s3Var, k5.b bVar, k kVar, l lVar) {
        super(context, looper, 68, s3Var, kVar, lVar, 0);
        bVar = bVar == null ? k5.b.f9749c : bVar;
        f7.b bVar2 = new f7.b((char) 0, 20);
        bVar2.f6012b = Boolean.FALSE;
        k5.b bVar3 = k5.b.f9749c;
        bVar.getClass();
        bVar2.f6012b = Boolean.valueOf(bVar.f9750a);
        bVar2.f6013c = bVar.f9751b;
        bVar2.f6013c = e.a();
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
        bundle.putBoolean("force_save_dialog", bVar.f9750a);
        bundle.putString("log_session_id", bVar.f9751b);
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
