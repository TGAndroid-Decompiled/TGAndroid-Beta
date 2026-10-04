package v8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements OnCompleteListener, Runnable {
    public static final c0 d = new Handler(Looper.getMainLooper());
    public static final SparseArray f48244e = new SparseArray(2);
    public static final AtomicInteger f48245f = new AtomicInteger();
    public int f48246a;
    public v f48247b;
    public Task f48248c;

    public final void a() {
        if (this.f48248c != null && this.f48247b != null) {
            f48244e.delete(this.f48246a);
            d.removeCallbacks(this);
            v vVar = this.f48247b;
            if (vVar != null) {
                Task task = this.f48248c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f48248c = task;
        a();
    }

    @Override
    public final void run() {
        f48244e.delete(this.f48246a);
    }
}
