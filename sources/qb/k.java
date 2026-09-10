package qb;

import android.content.Context;
import b2.i0;
import java.util.UUID;
public final class k {
    public static final q9.a f40627b;
    public final Context f40628a;

    static {
        i0 a2 = q9.a.a(k.class);
        a2.a(q9.j.a(g.class));
        a2.a(q9.j.a(Context.class));
        a2.f1716f = new na.d(20);
        f40627b = a2.b();
    }

    public k(Context context) {
        this.f40628a = context;
    }

    public final synchronized String a() {
        String string = this.f40628a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f40628a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
