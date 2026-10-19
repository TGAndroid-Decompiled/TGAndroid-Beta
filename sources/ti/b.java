package ti;

import android.content.SharedPreferences;
public final class b {
    public final String f47206a;
    public final Enum f47207b;
    public volatile boolean f47208c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47206a = str;
        this.f47207b = r22;
    }

    public final Enum a() {
        if (!this.f47208c) {
            synchronized (this) {
                try {
                    if (!this.f47208c) {
                        SharedPreferences sharedPreferences = d.f47211a;
                        String str = this.f47206a;
                        Enum r22 = this.f47207b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47208c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47208c = true;
        d.f47211a.edit().putString(this.f47206a, r32.name()).apply();
    }
}
