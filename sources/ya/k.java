package ya;

import android.content.Context;
import java.util.UUID;
public final class k {
    public static final y8.a f49702b;
    public final Context f49703a;

    static {
        tg.b a2 = y8.a.a(k.class);
        a2.a(y8.j.a(g.class));
        a2.a(y8.j.a(Context.class));
        a2.f47919f = new v9.d(27);
        f49702b = a2.b();
    }

    public k(Context context) {
        this.f49703a = context;
    }

    public final synchronized String a() {
        String string = this.f49703a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f49703a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
