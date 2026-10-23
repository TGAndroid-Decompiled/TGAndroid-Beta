package ti;

import android.content.SharedPreferences;
public final class b {
    public final String f47217a;
    public final Enum f47218b;
    public volatile boolean f47219c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47217a = str;
        this.f47218b = r22;
    }

    public final Enum a() {
        if (!this.f47219c) {
            synchronized (this) {
                try {
                    if (!this.f47219c) {
                        SharedPreferences sharedPreferences = d.f47222a;
                        String str = this.f47217a;
                        Enum r22 = this.f47218b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47219c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47219c = true;
        d.f47222a.edit().putString(this.f47217a, r32.name()).apply();
    }
}
