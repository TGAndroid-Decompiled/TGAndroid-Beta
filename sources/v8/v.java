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
    public static final SparseArray f47784e = new SparseArray(2);
    public static final AtomicInteger f47785f = new AtomicInteger();
    public int f47786a;
    public w f47787b;
    public Task f47788c;

    public final void a() {
        if (this.f47788c != null && this.f47787b != null) {
            f47784e.delete(this.f47786a);
            d.removeCallbacks(this);
            w wVar = this.f47787b;
            if (wVar != null) {
                Task task = this.f47788c;
                int i10 = w.d;
                wVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f47788c = task;
        a();
    }

    @Override
    public final void run() {
        f47784e.delete(this.f47786a);
    }
}
