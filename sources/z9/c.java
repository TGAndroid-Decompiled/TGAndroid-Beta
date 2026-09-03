package z9;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.w;
import c9.i;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
public final class c implements e, f {
    public final i f47460a;
    public final Context f47461b;
    public final ba.b f47462c;
    public final Set d;
    public final Executor e;

    public c(Context context, String str, Set set, ba.b bVar, Executor executor) {
        this.f47460a = new i(2, context, str);
        this.d = set;
        this.e = executor;
        this.f47462c = bVar;
        this.f47461b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f47460a.get();
        if (gVar.i(currentTimeMillis)) {
            gVar.g();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z4;
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = w.g(this.f47461b);
        } else {
            z4 = true;
        }
        if (!z4) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new b(this, 0));
    }

    public final void c() {
        boolean z4;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = w.g(this.f47461b);
        } else {
            z4 = true;
        }
        if (!z4) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.e, new b(this, 1));
    }
}
