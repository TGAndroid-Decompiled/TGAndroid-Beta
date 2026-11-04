package r6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.o3;
import p6.h;
import p6.q;
public final class e extends h {
    public final q F;

    public e(Context context, Looper looper, o3 o3Var, q qVar, k kVar, l lVar) {
        super(context, looper, 270, o3Var, kVar, lVar, 0);
        this.F = qVar;
    }

    @Override
    public final int d() {
        return 203400000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new b8.a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 7);
    }

    @Override
    public final m6.c[] i() {
        return m7.b.f19211c;
    }

    @Override
    public final Bundle k() {
        q qVar = this.F;
        qVar.getClass();
        Bundle bundle = new Bundle();
        String str = qVar.f53303a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    public final boolean q() {
        return true;
    }
}
