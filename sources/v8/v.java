package v8;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicInteger;
public final class v implements OnCompleteListener, Runnable {
    public static final c0 d = new Handler(Looper.getMainLooper());
    public static final SparseArray e = new SparseArray(2);
    public static final AtomicInteger f44221f = new AtomicInteger();
    public int f44222a;
    public w f44223b;
    public Task f44224c;

    public final void a() {
        if (this.f44224c != null && this.f44223b != null) {
            e.delete(this.f44222a);
            d.removeCallbacks(this);
            w wVar = this.f44223b;
            if (wVar != null) {
                Task task = this.f44224c;
                int i10 = w.d;
                wVar.a(task);
            }
        }
    }

    @Override
    public final void onComplete(Task task) {
        this.f44224c = task;
        a();
    }

    @Override
    public final void run() {
        e.delete(this.f44222a);
    }
}
