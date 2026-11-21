package p4;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b {
    public static final Uri f55193g = Uri.parse("content://androidx.car.app.connection");
    public final Context f55194a;
    public final f0 f55195b;
    public final Executor f55196c;
    public final androidx.mediarouter.app.f d;
    public final AtomicBoolean f55197e;
    public final AtomicBoolean f55198f;

    public b(Context context, f0 f0Var) {
        this.f55194a = context.getApplicationContext();
        this.f55195b = f0Var;
        Executor e10 = h2.a.e();
        this.f55196c = e10;
        this.d = new androidx.mediarouter.app.f(this, 10);
        this.f55197e = new AtomicBoolean();
        this.f55198f = new AtomicBoolean();
        e10.execute(new a(this, 1));
    }

    public static void a(b bVar) {
        androidx.mediarouter.app.f fVar = bVar.d;
        Context context = bVar.f55194a;
        IntentFilter intentFilter = new IntentFilter("androidx.car.app.connection.action.CAR_CONNECTION_UPDATED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(fVar, intentFilter, 2);
        } else {
            context.registerReceiver(fVar, intentFilter);
        }
        bVar.b();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: p4.b.b():void");
    }
}
