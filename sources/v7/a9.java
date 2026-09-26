package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class a9 {
    public final p6.b f44195a;
    public final AtomicLong f44196b;

    public a9(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f44196b = new AtomicLong(-1L);
                this.f44195a = new com.google.android.gms.common.api.j(context, p6.b.f40958k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6017c);
                return;
            default:
                this.f44196b = new AtomicLong(-1L);
                this.f44195a = new com.google.android.gms.common.api.j(context, p6.b.f40958k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f6017c);
                return;
        }
    }
}
