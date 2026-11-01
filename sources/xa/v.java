package xa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
public abstract class v {
    public static final long f53601a = TimeUnit.MINUTES.toMillis(1);
    public static final Object f53602b = new Object();
    public static p8.a f53603c;

    public static void a(Context context) {
        if (f53603c == null) {
            p8.a aVar = new p8.a(context);
            f53603c = aVar;
            synchronized (aVar.f44896a) {
                aVar.f44900g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f53602b) {
            try {
                if (f53603c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f53603c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Context context, y yVar, Intent intent) {
        synchronized (f53602b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f53603c.a(f53601a);
                }
                yVar.b(intent).addOnCompleteListener(new wh.b(intent, 5));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f53602b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f53603c.a(f53601a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
