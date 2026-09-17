package v8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class v implements OnCompleteListener, Runnable {
    public static final c0 d = new Handler(Looper.getMainLooper());
    public static final SparseArray f47785e = new SparseArray(2);
    public static final AtomicInteger f47786f = new AtomicInteger();
    public int f47787a;
    public w f47788b;
    public Task f47789c;

    public final void a() {
        if (this.f47789c != null && this.f47788b != null) {
            f47785e.delete(this.f47787a);
            d.removeCallbacks(this);
            w wVar = this.f47788b;
            if (wVar != null) {
                Task task = this.f47789c;
                int i10 = w.d;
                wVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f47789c = task;
        a();
    }

    @Override
    public final void run() {
        f47785e.delete(this.f47787a);
    }
}
