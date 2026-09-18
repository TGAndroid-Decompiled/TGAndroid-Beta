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
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f44299f = new AtomicInteger();
    public int f44300a;
    public w f44301b;
    public Task f44302c;

    public final void a() {
        if (this.f44302c != null && this.f44301b != null) {
            e.delete(this.f44300a);
            d.removeCallbacks(this);
            w wVar = this.f44301b;
            if (wVar != null) {
                Task task = this.f44302c;
                int i10 = w.d;
                wVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f44302c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f44300a);
    }
}
