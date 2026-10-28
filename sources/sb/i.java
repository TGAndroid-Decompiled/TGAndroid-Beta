package sb;

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
import k9.u;
public abstract class i {
    public final c2.b f48092a;
    public final AtomicInteger f48093b = new AtomicInteger(0);
    public final AtomicBoolean f48094c = new AtomicBoolean(false);

    public i() {
        ?? obj = new Object();
        obj.f5930b = new Object();
        obj.f5931c = new ArrayDeque();
        obj.d = new AtomicReference();
        this.f48092a = obj;
    }

    public final Task a(final Executor executor, final Callable callable, final CancellationToken cancellationToken) {
        boolean z10;
        if (this.f48093b.get() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6.l.k(z10);
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
        this.f48092a.z(new Runnable() {
            @Override
            public final void run() {
                Callable callable2 = callable;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                i iVar = i.this;
                AtomicBoolean atomicBoolean = iVar.f48094c;
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
                        throw new ob.a("Internal error has occurred when executing ML Kit tasks", e);
                    }
                } catch (Exception e10) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e10);
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
        if (this.f48093b.get() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o6.l.k(z10);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f48092a.z(new u(28, this, taskCompletionSource), executor);
        taskCompletionSource.getTask();
    }
}
