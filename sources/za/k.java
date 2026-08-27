package za;

import android.content.Context;
import java.util.UUID;

public final class k {

    public static final z8.a f50297b;

    public final Context f50298a;

    static {
        ug.b bVarA = z8.a.a(k.class);
        bVarA.a(z8.i.a(g.class));
        bVarA.a(z8.i.a(Context.class));
        bVarA.f48641f = new w9.d(27);
        f50297b = bVarA.b();
    }

    public k(Context context) {
        this.f50298a = context;
    }

    public final synchronized String a() {
        String string = this.f50298a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f50298a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
