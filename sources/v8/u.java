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
    public static final AtomicInteger f50753f = new AtomicInteger();
    public int f50754a;
    public v f50755b;
    public Task f50756c;

    public final void a() {
        if (this.f50756c != null && this.f50755b != null) {
            e.delete(this.f50754a);
            d.removeCallbacks(this);
            v vVar = this.f50755b;
            if (vVar != null) {
                Task task = this.f50756c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f50756c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f50754a);
    }
}
