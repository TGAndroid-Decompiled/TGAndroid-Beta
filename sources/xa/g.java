package xa;

import ag.v0;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import th.m1;
public final class g {
    public static final Object f53559c = new Object();
    public static y d;
    public final Object f53560a;
    public final Object f53561b;

    public g(ExecutorService executorService) {
        this.f53561b = new a0.l(0);
        this.f53560a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        y yVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f53559c) {
            try {
                if (d == null) {
                    d = new y(context);
                }
                yVar = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            if (n.D().I(context)) {
                v.c(context, yVar, intent);
            } else {
                yVar.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return yVar.b(intent).continueWith(new a3.b(3), new m1(24));
    }

    public Task b(Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f53560a;
        a3.b bVar = (a3.b) this.f53561b;
        if (u6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (z10 && !z11) {
            return a(context, intent, z11);
        }
        return Tasks.call(bVar, new g2.i(3, context, intent)).continueWithTask(bVar, new v0(context, intent, z11, 12));
    }

    public g(Context context) {
        this.f53560a = context;
        this.f53561b = new a3.b(3);
    }

    public g(e0.r rVar, String str) {
        this.f53560a = rVar;
        this.f53561b = str;
    }
}
