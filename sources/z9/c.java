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
    public final h f47396a;
    public final Context f47397b;
    public final ba.b f47398c;
    public final Set d;
    public final Executor e;

    public c(Context context, String str, Set set, ba.b bVar, Executor executor) {
        this.f47396a = new h(2, context, str);
        this.d = set;
        this.e = executor;
        this.f47398c = bVar;
        this.f47397b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f47396a.get();
        if (gVar.i(currentTimeMillis)) {
            gVar.g();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z4;
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = x.g(this.f47397b);
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
            z4 = x.g(this.f47397b);
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
