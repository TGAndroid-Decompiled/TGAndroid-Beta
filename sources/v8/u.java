package v8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements OnCompleteListener, Runnable {
    public static final a0 d = new Handler(Looper.getMainLooper());
    public static final SparseArray f49624e = new SparseArray(2);
    public static final AtomicInteger f49625f = new AtomicInteger();
    public int f49626a;
    public v f49627b;
    public Task f49628c;

    public final void a() {
        if (this.f49628c != null && this.f49627b != null) {
            f49624e.delete(this.f49626a);
            d.removeCallbacks(this);
            v vVar = this.f49627b;
            if (vVar != null) {
                Task task = this.f49628c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f49628c = task;
        a();
    }

    @Override
    public final void run() {
        f49624e.delete(this.f49626a);
    }
}
