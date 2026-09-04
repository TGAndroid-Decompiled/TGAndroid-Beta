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
    public static final SparseArray f47756e = new SparseArray(2);
    public static final AtomicInteger f47757f = new AtomicInteger();
    public int f47758a;
    public w f47759b;
    public Task f47760c;

    public final void a() {
        if (this.f47760c != null && this.f47759b != null) {
            f47756e.delete(this.f47758a);
            d.removeCallbacks(this);
            w wVar = this.f47759b;
            if (wVar != null) {
                Task task = this.f47760c;
                int i10 = w.d;
                wVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f47760c = task;
        a();
    }

    @Override
    public final void run() {
        f47756e.delete(this.f47758a);
    }
}
