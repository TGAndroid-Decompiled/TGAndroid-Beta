package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f48253a;
    public final AtomicLong f48254b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f48254b = new AtomicLong(-1L);
                this.f48253a = new com.google.android.gms.common.api.j(context, p6.b.f44239k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6356c);
                return;
            default:
                this.f48254b = new AtomicLong(-1L);
                this.f48253a = new com.google.android.gms.common.api.j(context, p6.b.f44239k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6356c);
                return;
        }
    }
}
