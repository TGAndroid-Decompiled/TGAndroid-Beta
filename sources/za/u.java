package za;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.ActionBar.h4;
import z7.q0;
public final class u {
    public static final long h = TimeUnit.HOURS.toSeconds(8);
    public static final int f60326i = 0;
    public final Context f60327a;
    public final h4 f60328b;
    public final q0 f60329c;
    public final ScheduledThreadPoolExecutor f60330e;
    public final t f60332g;
    public final a0.f d = new a0.l(0);
    public boolean f60331f = false;

    public u(h4 h4Var, t tVar, q0 q0Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f60328b = h4Var;
        this.f60332g = tVar;
        this.f60329c = q0Var;
        this.f60327a = context;
        this.f60330e = scheduledThreadPoolExecutor;
    }

    public static boolean a() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b(s sVar) {
        synchronized (this.d) {
            try {
                String str = sVar.f60322c;
                if (!this.d.containsKey(str)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.d.get(str);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.d.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void c(boolean z10) {
        this.f60331f = z10;
    }

    public final boolean d() {
        throw new UnsupportedOperationException("Method not decompiled: za.u.d():boolean");
    }

    public final void e(long j10) {
        this.f60330e.schedule(new w(this, this.f60327a, this.f60328b, Math.min(Math.max(30L, 2 * j10), h)), j10, TimeUnit.SECONDS);
        c(true);
    }
}
