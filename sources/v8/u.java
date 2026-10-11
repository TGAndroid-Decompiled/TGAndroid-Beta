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
    public static final SparseArray f49590e = new SparseArray(2);
    public static final AtomicInteger f49591f = new AtomicInteger();
    public int f49592a;
    public v f49593b;
    public Task f49594c;

    public final void a() {
        if (this.f49594c != null && this.f49593b != null) {
            f49590e.delete(this.f49592a);
            d.removeCallbacks(this);
            v vVar = this.f49593b;
            if (vVar != null) {
                Task task = this.f49594c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f49594c = task;
        a();
    }

    @Override
    public final void run() {
        f49590e.delete(this.f49592a);
    }
}
