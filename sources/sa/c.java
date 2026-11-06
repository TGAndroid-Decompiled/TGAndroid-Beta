package sa;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.w;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import u9.m;
public final class c implements e, f {
    public final m f54895a;
    public final Context f54896b;
    public final ua.b f54897c;
    public final Set d;
    public final Executor f54898e;

    public c(Context context, String str, Set set, ua.b bVar, Executor executor) {
        this.f54895a = new m(new o9.c(context, str));
        this.d = set;
        this.f54898e = executor;
        this.f54897c = bVar;
        this.f54896b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        h hVar = (h) this.f54895a.get();
        if (hVar.g(currentTimeMillis)) {
            hVar.e();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = w.g(this.f54896b);
        } else {
            z9 = true;
        }
        if (!z9) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f54898e, new b(this, 0));
    }

    public final void c() {
        boolean z9;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z9 = w.g(this.f54896b);
        } else {
            z9 = true;
        }
        if (!z9) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f54898e, new b(this, 1));
    }
}
