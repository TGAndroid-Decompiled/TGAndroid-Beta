package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class y8 {
    public final p6.b f50658a;
    public final AtomicLong f50659b;

    public y8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f50659b = new AtomicLong(-1L);
                this.f50658a = new com.google.android.gms.common.api.j(context, p6.b.f44848k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f4346c);
                return;
            default:
                this.f50659b = new AtomicLong(-1L);
                this.f50658a = new com.google.android.gms.common.api.j(context, p6.b.f44848k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f4346c);
                return;
        }
    }
}
