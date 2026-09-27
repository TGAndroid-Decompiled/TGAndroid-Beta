package qi;

import android.content.SharedPreferences;
public final class b {
    public final String f42127a;
    public final Enum f42128b;
    public volatile boolean f42129c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f42127a = str;
        this.f42128b = r22;
    }

    public final Enum a() {
        if (!this.f42129c) {
            synchronized (this) {
                try {
                    if (!this.f42129c) {
                        SharedPreferences sharedPreferences = d.f42132a;
                        String str = this.f42127a;
                        Enum r22 = this.f42128b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f42129c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f42129c = true;
        d.f42132a.edit().putString(this.f42127a, r32.name()).apply();
    }
}
