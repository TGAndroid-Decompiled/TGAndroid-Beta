package pi;

import android.content.SharedPreferences;
public final class b {
    public final String f41354a;
    public final Enum f41355b;
    public volatile boolean f41356c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f41354a = str;
        this.f41355b = r22;
    }

    public final Enum a() {
        if (!this.f41356c) {
            synchronized (this) {
                try {
                    if (!this.f41356c) {
                        SharedPreferences sharedPreferences = d.f41359a;
                        String str = this.f41354a;
                        Enum r22 = this.f41355b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f41356c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f41356c = true;
        d.f41359a.edit().putString(this.f41354a, r32.name()).apply();
    }
}
