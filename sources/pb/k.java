package pb;

import android.content.Context;
import e2.j0;
import java.util.UUID;
public final class k {
    public static final u9.a f53553b;
    public final Context f53554a;

    static {
        j0 a10 = u9.a.a(k.class);
        a10.a(u9.j.a(g.class));
        a10.a(u9.j.a(Context.class));
        a10.f10292f = new w7.s(20, false);
        f53553b = a10.b();
    }

    public k(Context context) {
        this.f53554a = context;
    }

    public final synchronized String a() {
        String string = this.f53554a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f53554a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
