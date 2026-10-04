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
    public static final SparseArray f48235e = new SparseArray(2);
    public static final AtomicInteger f48236f = new AtomicInteger();
    public int f48237a;
    public v f48238b;
    public Task f48239c;

    public final void a() {
        if (this.f48239c != null && this.f48238b != null) {
            f48235e.delete(this.f48237a);
            d.removeCallbacks(this);
            v vVar = this.f48238b;
            if (vVar != null) {
                Task task = this.f48239c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f48239c = task;
        a();
    }

    @Override
    public final void run() {
        f48235e.delete(this.f48237a);
    }
}
