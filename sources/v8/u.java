package v8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.z;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements OnCompleteListener, Runnable {
    public static final z d = new Handler(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f50739f = new AtomicInteger();
    public int f50740a;
    public v f50741b;
    public Task f50742c;

    public final void a() {
        if (this.f50742c != null && this.f50741b != null) {
            e.delete(this.f50740a);
            d.removeCallbacks(this);
            v vVar = this.f50741b;
            if (vVar != null) {
                Task task = this.f50742c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f50742c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f50740a);
    }
}
