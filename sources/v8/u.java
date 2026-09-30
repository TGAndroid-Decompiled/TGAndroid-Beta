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
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f44660f = new AtomicInteger();
    public int f44661a;
    public v f44662b;
    public Task f44663c;

    public final void a() {
        if (this.f44663c != null && this.f44662b != null) {
            e.delete(this.f44661a);
            d.removeCallbacks(this);
            v vVar = this.f44662b;
            if (vVar != null) {
                Task task = this.f44663c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f44663c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f44661a);
    }
}
