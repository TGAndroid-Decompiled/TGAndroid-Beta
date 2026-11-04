package r6;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.Task;
import org.telegram.ui.Components.i9;
import p6.p;
public final class d extends j {
    public static final com.google.android.gms.common.api.e f54399l = new com.google.android.gms.common.api.e("ClientNotification.API", new a6.b(13), new Object());
    public static final com.google.android.gms.common.api.e f54400m = new com.google.android.gms.common.api.e("ClientTelemetry.API", new a6.b(14), new Object());

    public Task f(p pVar) {
        s b10 = t.b();
        b10.d = new m6.c[]{m7.b.f19209a};
        b10.f6736b = false;
        b10.f6737c = new i9(pVar, 16);
        return e(2, b10.a());
    }
}
