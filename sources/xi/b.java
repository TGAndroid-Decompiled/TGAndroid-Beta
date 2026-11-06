package xi;

import android.content.SharedPreferences;
public final class b {
    public final String f58731a;
    public final Enum f58732b;
    public volatile boolean f58733c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f58731a = str;
        this.f58732b = r22;
    }

    public final Enum a() {
        if (!this.f58733c) {
            synchronized (this) {
                try {
                    if (!this.f58733c) {
                        SharedPreferences sharedPreferences = d.f58736a;
                        String str = this.f58731a;
                        Enum r22 = this.f58732b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f58733c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f58733c = true;
        d.f58736a.edit().putString(this.f58731a, r32.name()).apply();
    }
}
