package xi;

import android.content.SharedPreferences;
public final class b {
    public final String f58761a;
    public final Enum f58762b;
    public volatile boolean f58763c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f58761a = str;
        this.f58762b = r22;
    }

    public final Enum a() {
        if (!this.f58763c) {
            synchronized (this) {
                try {
                    if (!this.f58763c) {
                        SharedPreferences sharedPreferences = d.f58766a;
                        String str = this.f58761a;
                        Enum r22 = this.f58762b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f58763c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f58763c = true;
        d.f58766a.edit().putString(this.f58761a, r32.name()).apply();
    }
}
