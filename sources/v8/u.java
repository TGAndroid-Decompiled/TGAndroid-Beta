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
    public static final SparseArray f48236e = new SparseArray(2);
    public static final AtomicInteger f48237f = new AtomicInteger();
    public int f48238a;
    public v f48239b;
    public Task f48240c;

    public final void a() {
        if (this.f48240c != null && this.f48239b != null) {
            f48236e.delete(this.f48238a);
            d.removeCallbacks(this);
            v vVar = this.f48239b;
            if (vVar != null) {
                Task task = this.f48240c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f48240c = task;
        a();
    }

    @Override
    public final void run() {
        f48236e.delete(this.f48238a);
    }
}
