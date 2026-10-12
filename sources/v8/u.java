package v8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements OnCompleteListener, Runnable {
    public static final a0 d = new Handler(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f46927f = new AtomicInteger();
    public int f46928a;
    public v f46929b;
    public Task f46930c;

    public final void a() {
        if (this.f46930c != null && this.f46929b != null) {
            e.delete(this.f46928a);
            d.removeCallbacks(this);
            v vVar = this.f46929b;
            if (vVar != null) {
                Task task = this.f46930c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f46930c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f46928a);
    }
}
