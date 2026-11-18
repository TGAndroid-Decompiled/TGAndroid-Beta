package y8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class t implements OnCompleteListener, Runnable {
    public static final y d = new Handler(Looper.getMainLooper());
    public static final SparseArray f61112e = new SparseArray(2);
    public static final AtomicInteger f61113f = new AtomicInteger();
    public int f61114a;
    public u f61115b;
    public Task f61116c;

    public final void a() {
        if (this.f61116c != null && this.f61115b != null) {
            f61112e.delete(this.f61114a);
            d.removeCallbacks(this);
            u uVar = this.f61115b;
            if (uVar != null) {
                Task task = this.f61116c;
                int i7 = u.d;
                uVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f61116c = task;
        a();
    }

    @Override
    public final void run() {
        f61112e.delete(this.f61114a);
    }
}
