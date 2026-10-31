package xa;

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
import org.telegram.ui.web.k0;
import rh.l5;
import vh.e0;
public abstract class f extends Service {
    public final ExecutorService f53538a;
    public w f53539b;
    public final Object f53540c;
    public int d;
    public int e;

    public f() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c5.s("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f53538a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f53540c = new Object();
        this.e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            v.b(intent);
        }
        synchronized (this.f53540c) {
            try {
                int i10 = this.e - 1;
                this.e = i10;
                if (i10 == 0) {
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
            if (this.f53539b == null) {
                this.f53539b = new w(new e0(this));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f53539b;
    }

    @Override
    public final void onDestroy() {
        this.f53538a.shutdown();
        super.onDestroy();
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        synchronized (this.f53540c) {
            this.d = i11;
            this.e++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) n.D().d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f53538a.execute(new l5(this, intent2, taskCompletionSource, 21));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new a3.b(3), new k0(25, this, intent));
        return 3;
    }
}
