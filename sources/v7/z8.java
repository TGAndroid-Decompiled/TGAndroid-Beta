package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class z8 {
    public final p6.b f44197a;
    public final AtomicLong f44198b;

    public z8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f44198b = new AtomicLong(-1L);
                this.f44197a = new com.google.android.gms.common.api.j(context, p6.b.f40687k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6031c);
                return;
            default:
                this.f44198b = new AtomicLong(-1L);
                this.f44197a = new com.google.android.gms.common.api.j(context, p6.b.f40687k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6031c);
                return;
        }
    }
}
