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
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f43290f = new AtomicInteger();
    public int f43291a;
    public v f43292b;
    public Task f43293c;

    public final void a() {
        if (this.f43293c != null && this.f43292b != null) {
            e.delete(this.f43291a);
            d.removeCallbacks(this);
            v vVar = this.f43292b;
            if (vVar != null) {
                Task task = this.f43293c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f43293c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f43291a);
    }
}
