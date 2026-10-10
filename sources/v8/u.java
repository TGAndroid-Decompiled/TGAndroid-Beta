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
    public static final SparseArray f49547e = new SparseArray(2);
    public static final AtomicInteger f49548f = new AtomicInteger();
    public int f49549a;
    public v f49550b;
    public Task f49551c;

    public final void a() {
        if (this.f49551c != null && this.f49550b != null) {
            f49547e.delete(this.f49549a);
            d.removeCallbacks(this);
            v vVar = this.f49550b;
            if (vVar != null) {
                Task task = this.f49551c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f49551c = task;
        a();
    }

    @Override
    public final void run() {
        f49547e.delete(this.f49549a);
    }
}
