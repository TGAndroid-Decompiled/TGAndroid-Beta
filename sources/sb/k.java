package sb;

import android.content.Context;
import b2.n0;
import java.util.UUID;
public final class k {
    public static final s9.a f48057b;
    public final Context f48058a;

    static {
        n0 a2 = s9.a.a(k.class);
        a2.a(s9.j.a(g.class));
        a2.a(s9.j.a(Context.class));
        a2.f3290f = new u7.s(22);
        f48057b = a2.b();
    }

    public k(Context context) {
        this.f48058a = context;
    }

    public final synchronized String a() {
        String string = this.f48058a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f48058a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
