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
    public static final SparseArray f47757e = new SparseArray(2);
    public static final AtomicInteger f47758f = new AtomicInteger();
    public int f47759a;
    public w f47760b;
    public Task f47761c;

    public final void a() {
        if (this.f47761c != null && this.f47760b != null) {
            f47757e.delete(this.f47759a);
            d.removeCallbacks(this);
            w wVar = this.f47760b;
            if (wVar != null) {
                Task task = this.f47761c;
                int i10 = w.d;
                wVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f47761c = task;
        a();
    }

    @Override
    public final void run() {
        f47757e.delete(this.f47759a);
    }
}
