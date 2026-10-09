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
    public static final SparseArray f49503e = new SparseArray(2);
    public static final AtomicInteger f49504f = new AtomicInteger();
    public int f49505a;
    public v f49506b;
    public Task f49507c;

    public final void a() {
        if (this.f49507c != null && this.f49506b != null) {
            f49503e.delete(this.f49505a);
            d.removeCallbacks(this);
            v vVar = this.f49506b;
            if (vVar != null) {
                Task task = this.f49507c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f49507c = task;
        a();
    }

    @Override
    public final void run() {
        f49503e.delete(this.f49505a);
    }
}
