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
    public static final SparseArray f49731e = new SparseArray(2);
    public static final AtomicInteger f49732f = new AtomicInteger();
    public int f49733a;
    public v f49734b;
    public Task f49735c;

    public final void a() {
        if (this.f49735c != null && this.f49734b != null) {
            f49731e.delete(this.f49733a);
            d.removeCallbacks(this);
            v vVar = this.f49734b;
            if (vVar != null) {
                Task task = this.f49735c;
                int i10 = v.d;
                vVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f49735c = task;
        a();
    }

    @Override
    public final void run() {
        f49731e.delete(this.f49733a);
    }
}
