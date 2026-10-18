package ti;

import android.content.SharedPreferences;
public final class b {
    public final String f47204a;
    public final Enum f47205b;
    public volatile boolean f47206c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47204a = str;
        this.f47205b = r22;
    }

    public final Enum a() {
        if (!this.f47206c) {
            synchronized (this) {
                try {
                    if (!this.f47206c) {
                        SharedPreferences sharedPreferences = d.f47209a;
                        String str = this.f47204a;
                        Enum r22 = this.f47205b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47206c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47206c = true;
        d.f47209a.edit().putString(this.f47204a, r32.name()).apply();
    }
}
