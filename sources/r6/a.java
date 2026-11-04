package r6;

import android.os.IBinder;
import android.os.IInterface;
import p6.h;
public final class a extends h {
    @Override
    public final int d() {
        return 253600000;
    }

    @Override
    public final IInterface g(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        if (queryLocalInterface instanceof b) {
            return (b) queryLocalInterface;
        }
        return new b8.a(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 7);
    }

    @Override
    public final m6.c[] i() {
        return m7.b.f19211c;
    }

    @Override
    public final String n() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override
    public final String o() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override
    public final boolean q() {
        return true;
    }
}
