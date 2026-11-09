package p4;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
public final class b {
    public static final Uri f53177g = Uri.parse("content://androidx.car.app.connection");
    public final Context f53178a;
    public final e0 f53179b;
    public final Executor f53180c;
    public final androidx.mediarouter.app.f d;
    public final AtomicBoolean f53181e;
    public final AtomicBoolean f53182f;

    public b(Context context, e0 e0Var) {
        this.f53178a = context.getApplicationContext();
        this.f53179b = e0Var;
        Executor e10 = h2.a.e();
        this.f53180c = e10;
        this.d = new androidx.mediarouter.app.f(this, 10);
        this.f53181e = new AtomicBoolean();
        this.f53182f = new AtomicBoolean();
        e10.execute(new a(this, 1));
    }

    public static void a(b bVar) {
        androidx.mediarouter.app.f fVar = bVar.d;
        Context context = bVar.f53178a;
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
