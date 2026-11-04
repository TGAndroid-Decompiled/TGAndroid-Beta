package za;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
public abstract class x {
    public static final long f60341a = TimeUnit.MINUTES.toMillis(1);
    public static final Object f60342b = new Object();
    public static r8.a f60343c;

    public static void a(Context context) {
        if (f60343c == null) {
            r8.a aVar = new r8.a(context);
            f60343c = aVar;
            synchronized (aVar.f54439a) {
                aVar.f54444g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f60342b) {
            try {
                if (f60343c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f60343c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(Context context, a0 a0Var, Intent intent) {
        synchronized (f60342b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    f60343c.a(f60341a);
                }
                a0Var.b(intent).addOnCompleteListener(new xg.c(intent, 9));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName d(Context context, Intent intent) {
        synchronized (f60342b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f60343c.a(f60341a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
