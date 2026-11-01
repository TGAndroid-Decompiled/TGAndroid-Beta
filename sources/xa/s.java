package xa;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.telegram.ui.ActionBar.p4;
public final class s {
    public static final long f53587i = TimeUnit.HOURS.toSeconds(8);
    public static final int f53588j = 0;
    public final Context f53589a;
    public final p4 f53590b;
    public final j2.f f53591c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f53592f;
    public final q h;
    public final a0.f e = new a0.l(0);
    public boolean f53593g = false;

    public s(FirebaseMessaging firebaseMessaging, p4 p4Var, q qVar, j2.f fVar, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.f53590b = p4Var;
        this.h = qVar;
        this.f53591c = fVar;
        this.f53589a = context;
        this.f53592f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e7);
            }
            throw ((IOException) cause);
        }
    }

    public static boolean d() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b(String str) {
        String a2 = this.d.a();
        j2.f fVar = this.f53591c;
        fVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(fVar.n(fVar.C(a2, "/topics/" + str, bundle)));
    }

    public final void c(String str) {
        String a2 = this.d.a();
        j2.f fVar = this.f53591c;
        fVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(fVar.n(fVar.C(a2, "/topics/" + str, bundle)));
    }

    public final void e(p pVar) {
        synchronized (this.e) {
            try {
                String str = pVar.f53580c;
                if (!this.e.containsKey(str)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.e.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void f(boolean z10) {
        this.f53593g = z10;
    }

    public final boolean g() {
        throw new UnsupportedOperationException("Method not decompiled: xa.s.g():boolean");
    }

    public final void h(long j10) {
        this.f53592f.schedule(new u(this, this.f53589a, this.f53590b, Math.min(Math.max(30L, 2 * j10), f53587i)), j10, TimeUnit.SECONDS);
        f(true);
    }
}
