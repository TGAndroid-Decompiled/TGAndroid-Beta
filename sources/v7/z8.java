package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f44455a;
    public final AtomicLong f44456b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f44456b = new AtomicLong(-1L);
                this.f44455a = new com.google.android.gms.common.api.j(context, p6.b.f40944k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6034c);
                return;
            default:
                this.f44456b = new AtomicLong(-1L);
                this.f44455a = new com.google.android.gms.common.api.j(context, p6.b.f40944k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6034c);
                return;
        }
    }
}
