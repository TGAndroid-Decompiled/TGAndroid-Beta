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
    public static final AtomicInteger f44590f = new AtomicInteger();
    public int f44591a;
    public v f44592b;
    public Task f44593c;

    public final void a() {
        if (this.f44593c != null && this.f44592b != null) {
            e.delete(this.f44591a);
            d.removeCallbacks(this);
            v vVar = this.f44592b;
            if (vVar != null) {
                Task task = this.f44593c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f44593c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f44591a);
    }
}
