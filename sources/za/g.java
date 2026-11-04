package za;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import ci.l3;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
public final class g {
    public static final Object f60292c = new Object();
    public static a0 d;
    public final Object f60293a;
    public final Object f60294b;

    public g(ExecutorService executorService) {
        this.f60294b = new a0.l(0);
        this.f60293a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        a0 a0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f60292c) {
            try {
                if (d == null) {
                    d = new a0(context);
                }
                a0Var = d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            if (p.r().t(context)) {
                x.c(context, a0Var, intent);
            } else {
                a0Var.b(intent);
            }
            return Tasks.forResult(-1);
        }
        return a0Var.b(intent).continueWith(new c3.b(3), new z9.j(6));
    }

    public Task b(Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f60293a;
        c3.b bVar = (c3.b) this.f60294b;
        if (w6.b.d() && context.getApplicationInfo().targetSdkVersion >= 26) {
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
        return Tasks.call(bVar, new i2.i(3, context, intent)).continueWithTask(bVar, new l3(context, intent, z11, 12));
    }

    public g(Context context) {
        this.f60293a = context;
        this.f60294b = new c3.b(3);
    }

    public g(e0.q qVar, String str) {
        this.f60293a = qVar;
        this.f60294b = str;
    }
}
