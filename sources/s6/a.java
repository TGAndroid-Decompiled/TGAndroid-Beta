package s6;

import android.os.IBinder;
import android.os.IInterface;
import q6.h;
public final class a extends h {
    @Override
    public final int d() {
        return 253600000;
    }

    @Override
    public final IInterface i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        if (queryLocalInterface instanceof b) {
            return (b) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 8);
    }

    @Override
    public final n6.c[] k() {
        return n7.b.f20523c;
    }

    @Override
    public final String o() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override
    public final String p() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override
    public final boolean r() {
        return true;
    }
}
