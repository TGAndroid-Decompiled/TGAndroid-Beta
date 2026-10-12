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
    public static final SparseArray f49739e = new SparseArray(2);
    public static final AtomicInteger f49740f = new AtomicInteger();
    public int f49741a;
    public v f49742b;
    public Task f49743c;

    public final void a() {
        if (this.f49743c != null && this.f49742b != null) {
            f49739e.delete(this.f49741a);
            d.removeCallbacks(this);
            v vVar = this.f49742b;
            if (vVar != null) {
                Task task = this.f49743c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f49743c = task;
        a();
    }

    @Override
    public final void run() {
        f49739e.delete(this.f49741a);
    }
}
