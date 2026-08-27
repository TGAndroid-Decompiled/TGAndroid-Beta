package w9;

import android.content.Context;
import android.os.Build;
import androidx.emoji2.text.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

public final class c implements e, f {

    public final t8.d f49281a;

    public final Context f49282b;

    public final y9.b f49283c;
    public final Set d;

    public final Executor f49284e;

    public c(Context context, String str, Set set, y9.b bVar, Executor executor) {
        this.f49281a = new t8.d(context, str);
        this.d = set;
        this.f49284e = executor;
        this.f49283c = bVar;
        this.f49282b = context;
    }

    public final synchronized int a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        g gVar = (g) this.f49281a.get();
        if (!gVar.i(jCurrentTimeMillis)) {
            return 1;
        }
        gVar.g();
        return 3;
    }

    public final Task b() {
        if (Build.VERSION.SDK_INT >= 24 ? v.g(this.f49282b) : true) {
            return Tasks.call(this.f49284e, new b(this, 0));
        }
        return Tasks.forResult("");
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
            return;
        }
        if (Build.VERSION.SDK_INT >= 24 ? v.g(this.f49282b) : true) {
            Tasks.call(this.f49284e, new b(this, 1));
        } else {
            Tasks.forResult(null);
        }
    }
}
