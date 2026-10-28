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
    public static final AtomicInteger f51196f = new AtomicInteger();
    public int f51197a;
    public v f51198b;
    public Task f51199c;

    public final void a() {
        if (this.f51199c != null && this.f51198b != null) {
            e.delete(this.f51197a);
            d.removeCallbacks(this);
            v vVar = this.f51198b;
            if (vVar != null) {
                Task task = this.f51199c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f51199c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f51197a);
    }
}
