package z9;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.x;
import c9.h;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
public final class c implements e, f {
    public final h f51132a;
    public final Context f51133b;
    public final ba.b f51134c;
    public final Set d;
    public final Executor f51135e;

    public c(Context context, String str, Set set, ba.b bVar, Executor executor) {
        this.f51132a = new h(2, context, str);
        this.d = set;
        this.f51135e = executor;
        this.f51134c = bVar;
        this.f51133b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f51132a.get();
        if (gVar.i(currentTimeMillis)) {
            gVar.g();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z4;
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = x.g(this.f51133b);
        } else {
            z4 = true;
        }
        if (!z4) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f51135e, new b(this, 0));
    }

    public final void c() {
        boolean z4;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = x.g(this.f51133b);
        } else {
            z4 = true;
        }
        if (!z4) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f51135e, new b(this, 1));
    }
}
