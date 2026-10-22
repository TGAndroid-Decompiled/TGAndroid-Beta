package ti;

import android.content.SharedPreferences;
public final class b {
    public final String f47216a;
    public final Enum f47217b;
    public volatile boolean f47218c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47216a = str;
        this.f47217b = r22;
    }

    public final Enum a() {
        if (!this.f47218c) {
            synchronized (this) {
                try {
                    if (!this.f47218c) {
                        SharedPreferences sharedPreferences = d.f47221a;
                        String str = this.f47216a;
                        Enum r22 = this.f47217b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47218c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47218c = true;
        d.f47221a.edit().putString(this.f47216a, r32.name()).apply();
    }
}
