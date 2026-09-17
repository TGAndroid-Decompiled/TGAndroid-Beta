package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f47681a;
    public final AtomicLong f47682b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f47682b = new AtomicLong(-1L);
                this.f47681a = new com.google.android.gms.common.api.j(context, p6.b.f43956k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f4958c);
                return;
            default:
                this.f47682b = new AtomicLong(-1L);
                this.f47681a = new com.google.android.gms.common.api.j(context, p6.b.f43956k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f4958c);
                return;
        }
    }
}
