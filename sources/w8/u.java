package w8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class u implements OnCompleteListener, Runnable {
    public static final y d = new Handler(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f51138f = new AtomicInteger();
    public int f51139a;
    public v f51140b;
    public Task f51141c;

    public final void a() {
        if (this.f51141c != null && this.f51140b != null) {
            e.delete(this.f51139a);
            d.removeCallbacks(this);
            v vVar = this.f51140b;
            if (vVar != null) {
                Task task = this.f51141c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f51141c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f51139a);
    }
}
