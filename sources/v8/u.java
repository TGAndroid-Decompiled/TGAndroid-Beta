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
    public static final SparseArray f48251e = new SparseArray(2);
    public static final AtomicInteger f48252f = new AtomicInteger();
    public int f48253a;
    public v f48254b;
    public Task f48255c;

    public final void a() {
        if (this.f48255c != null && this.f48254b != null) {
            f48251e.delete(this.f48253a);
            d.removeCallbacks(this);
            v vVar = this.f48254b;
            if (vVar != null) {
                Task task = this.f48255c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f48255c = task;
        a();
    }

    @Override
    public final void run() {
        f48251e.delete(this.f48253a);
    }
}
