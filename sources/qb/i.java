package qb;

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
    public final com.google.firebase.messaging.m f40621a;
    public final AtomicInteger f40622b = new AtomicInteger(0);
    public final AtomicBoolean f40623c = new AtomicBoolean(false);

    public i() {
        ?? obj = new Object();
        obj.f6101b = new Object();
        obj.f6102c = new ArrayDeque();
        obj.d = new AtomicReference();
        this.f40621a = obj;
    }

    public final Task a(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        boolean z10;
        if (this.f40622b.get() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.k(z10);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        Executor executor2 = new Executor() {
            @Override
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RuntimeException e) {
                    if (cancellationToken.isCancellationRequested()) {
                        cancellationTokenSource.cancel();
                    } else {
                        taskCompletionSource.setException(e);
                    }
                    throw e;
                }
            }
        };
        this.f40621a.w(new Runnable() {
            @Override
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                i iVar = i.this;
                AtomicBoolean atomicBoolean = iVar.f40623c;
                CancellationToken cancellationToken2 = cancellationToken;
                boolean isCancellationRequested = cancellationToken2.isCancellationRequested();
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                try {
                    if (isCancellationRequested) {
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
                        Object call = callable2.call();
                        if (cancellationToken2.isCancellationRequested()) {
                            cancellationTokenSource2.cancel();
                        } else {
                            taskCompletionSource2.setResult(call);
                        }
                    } catch (RuntimeException e) {
                        throw new mb.a("Internal error has occurred when executing ML Kit tasks", e);
                    }
                } catch (Exception e7) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e7);
                    }
                }
            }
        }, executor2);
        return taskCompletionSource.getTask();
    }

    public abstract void b();

    public abstract void c();

    public final void d(Executor executor) {
        boolean z10;
        if (this.f40622b.get() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.k(z10);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f40621a.w(new i9.s(26, this, taskCompletionSource), executor);
        taskCompletionSource.getTask();
    }
}
