package xa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
public abstract class v {
    public static final long f53583a = TimeUnit.MINUTES.toMillis(1);
    public static final Object f53584b = new Object();
    public static p8.a f53585c;

    public static void a(Context context) {
        if (f53585c == null) {
            p8.a aVar = new p8.a(context);
            f53585c = aVar;
            synchronized (aVar.f44885a) {
                aVar.f44889g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f53584b) {
            try {
                if (f53585c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f53585c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Context context, y yVar, Intent intent) {
        synchronized (f53584b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f53585c.a(f53583a);
                }
                yVar.b(intent).addOnCompleteListener(new wh.b(intent, 5));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f53584b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f53585c.a(f53583a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
