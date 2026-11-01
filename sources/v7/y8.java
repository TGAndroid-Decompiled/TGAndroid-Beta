package v7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class y8 {
    public final p6.b f50672a;
    public final AtomicLong f50673b;

    public y8(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f50673b = new AtomicLong(-1L);
                this.f50672a = new com.google.android.gms.common.api.j(context, p6.b.f44859k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f4346c);
                return;
            default:
                this.f50673b = new AtomicLong(-1L);
                this.f50672a = new com.google.android.gms.common.api.j(context, p6.b.f44859k, new n6.p("mlkit:natural_language"), com.google.android.gms.common.api.i.f4346c);
                return;
        }
    }
}
