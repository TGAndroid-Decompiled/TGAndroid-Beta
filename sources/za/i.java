package za;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class i {

    public final com.google.firebase.messaging.l f50291a;

    public final AtomicInteger f50292b = new AtomicInteger(0);

    public final AtomicBoolean f50293c = new AtomicBoolean(false);

    public i() {
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
        lVar.f4600b = new Object();
        lVar.f4601c = new ArrayDeque();
        lVar.d = new AtomicReference();
        this.f50291a = lVar;
    }

    public final Task a(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        y5.l.k(this.f50292b.get() > 0);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f50291a.t(new Runnable() {
            @Override
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                i iVar = this.f50309a;
                AtomicBoolean atomicBoolean = iVar.f50293c;
                CancellationToken cancellationToken2 = cancellationToken;
                boolean zIsCancellationRequested = cancellationToken2.isCancellationRequested();
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                try {
                    if (zIsCancellationRequested) {
                        cancellationTokenSource2.cancel();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            iVar.b();
                            atomicBoolean.set(true);
                        }
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                            return;
                        }
                        Object objCall = callable2.call();
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                        } else {
                            taskCompletionSource2.setResult(objCall);
                        }
                    } catch (RuntimeException e9) {
                        throw new va.a("Internal error has occurred when executing ML Kit tasks", e9);
                    }
                } catch (Exception e10) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e10);
                    }
                }
            }
        }, new Executor() {
            @Override
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e9) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e9);
                    }
                    throw e9;
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public abstract void b();

    public abstract void c();

    public final void d(Executor executor) {
        y5.l.k(this.f50292b.get() > 0);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f50291a.t(new o0.m(12, this, taskCompletionSource), executor);
        taskCompletionSource.getTask();
    }
}
