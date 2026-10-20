package ti;

import android.content.SharedPreferences;
public final class b {
    public final String f47213a;
    public final Enum f47214b;
    public volatile boolean f47215c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47213a = str;
        this.f47214b = r22;
    }

    public final Enum a() {
        if (!this.f47215c) {
            synchronized (this) {
                try {
                    if (!this.f47215c) {
                        SharedPreferences sharedPreferences = d.f47218a;
                        String str = this.f47213a;
                        Enum r22 = this.f47214b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47215c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47215c = true;
        d.f47218a.edit().putString(this.f47213a, r32.name()).apply();
    }
}
