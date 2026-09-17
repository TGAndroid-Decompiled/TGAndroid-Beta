package p6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.p3;
import n6.g;
import n6.p;
public final class c extends g {
    public final p U;

    public c(Context context, Looper looper, p3 p3Var, p pVar, k kVar, l lVar) {
        super(context, looper, 270, p3Var, kVar, lVar, 0);
        this.U = pVar;
    }

    @Override
    public final int l() {
        return 203400000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a9.a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 6);
    }

    @Override
    public final k6.c[] r() {
        return k7.b.f14861b;
    }

    @Override
    public final Bundle t() {
        p pVar = this.U;
        pVar.getClass();
        Bundle bundle = new Bundle();
        String str = pVar.f16612a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    public final boolean y() {
        return true;
    }
}
