package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f43221a;
    public final AtomicLong f43222b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f43222b = new AtomicLong(-1L);
                this.f43221a = new com.google.android.gms.common.api.j(context, p6.b.f39816k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f4808c);
                return;
            case 2:
                this.f43222b = new AtomicLong(-1L);
                this.f43221a = new com.google.android.gms.common.api.j(context, p6.b.f39816k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f4808c);
                return;
            default:
                this.f43222b = new AtomicLong(-1L);
                this.f43221a = new com.google.android.gms.common.api.j(context, p6.b.f39816k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f4808c);
                return;
        }
    }
}
