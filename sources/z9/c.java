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
    public final h f51097a;
    public final Context f51098b;
    public final ba.b f51099c;
    public final Set d;
    public final Executor f51100e;

    public c(Context context, String str, Set set, ba.b bVar, Executor executor) {
        this.f51097a = new h(2, context, str);
        this.d = set;
        this.f51100e = executor;
        this.f51099c = bVar;
        this.f51098b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f51097a.get();
        if (gVar.i(currentTimeMillis)) {
            gVar.g();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        boolean z4;
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = x.g(this.f51098b);
        } else {
            z4 = true;
        }
        if (!z4) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f51100e, new b(this, 0));
    }

    public final void c() {
        boolean z4;
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            z4 = x.g(this.f51098b);
        } else {
            z4 = true;
        }
        if (!z4) {
            Tasks.forResult(null);
            return;
        }
        Tasks.call(this.f51100e, new b(this, 1));
    }
}
