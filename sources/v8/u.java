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
    public static final SparseArray f49501e = new SparseArray(2);
    public static final AtomicInteger f49502f = new AtomicInteger();
    public int f49503a;
    public v f49504b;
    public Task f49505c;

    public final void a() {
        if (this.f49505c != null && this.f49504b != null) {
            f49501e.delete(this.f49503a);
            d.removeCallbacks(this);
            v vVar = this.f49504b;
            if (vVar != null) {
                Task task = this.f49505c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f49505c = task;
        a();
    }

    @Override
    public final void run() {
        f49501e.delete(this.f49503a);
    }
}
