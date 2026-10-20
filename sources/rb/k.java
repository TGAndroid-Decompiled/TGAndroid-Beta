package rb;

import android.content.Context;
import b2.m0;
import java.util.UUID;
public final class k {
    public static final r9.a f45203b;
    public final Context f45204a;

    static {
        m0 a2 = r9.a.a(k.class);
        a2.a(r9.j.a(g.class));
        a2.a(r9.j.a(Context.class));
        a2.f3832f = new oa.d(22);
        f45203b = a2.b();
    }

    public k(Context context) {
        this.f45204a = context;
    }

    public final synchronized String a() {
        String string = this.f45204a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f45204a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
