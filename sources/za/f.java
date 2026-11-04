package za;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.na1;
public abstract class f extends Service {
    public final ExecutorService f60288a;
    public y f60289b;
    public final Object f60290c;
    public int d;
    public int f60291e;

    public f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new e5.r("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f60288a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f60290c = new Object();
        this.f60291e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            x.b(intent);
        }
        synchronized (this.f60290c) {
            try {
                int i3 = this.f60291e - 1;
                this.f60291e = i3;
                if (i3 == 0) {
                    stopSelfResult(this.d);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f60289b == null) {
                this.f60289b = new y(new z6.c(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f60289b;
    }

    @Override
    public final void onDestroy() {
        this.f60288a.shutdown();
        super.onDestroy();
    }

    @Override
    public final int onStartCommand(Intent intent, int i3, int i10) {
        synchronized (this.f60290c) {
            this.d = i10;
            this.f60291e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) p.r().d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f60288a.execute(new z9.o(this, intent2, taskCompletionSource, 1));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new c3.b(3), new na1(28, this, intent));
        return 3;
    }
}
