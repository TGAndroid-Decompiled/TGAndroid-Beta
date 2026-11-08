package s6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import m.q3;
import q6.h;
import q6.q;
public final class e extends h {
    public final q F;

    public e(Context context, Looper looper, q3 q3Var, q qVar, k kVar, l lVar) {
        super(context, looper, 270, q3Var, kVar, lVar, 0);
        this.F = qVar;
    }

    @Override
    public final int d() {
        return 203400000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 8);
    }

    @Override
    public final n6.c[] k() {
        return n7.b.f20523c;
    }

    @Override
    public final Bundle m() {
        q qVar = this.F;
        qVar.getClass();
        Bundle bundle = new Bundle();
        String str = qVar.f53927a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override
    public final boolean r() {
        return true;
    }
}
