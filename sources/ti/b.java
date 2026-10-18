package ti;

import android.content.SharedPreferences;
public final class b {
    public final String f47254a;
    public final Enum f47255b;
    public volatile boolean f47256c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47254a = str;
        this.f47255b = r22;
    }

    public final Enum a() {
        if (!this.f47256c) {
            synchronized (this) {
                try {
                    if (!this.f47256c) {
                        SharedPreferences sharedPreferences = d.f47259a;
                        String str = this.f47254a;
                        Enum r22 = this.f47255b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47256c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47256c = true;
        d.f47259a.edit().putString(this.f47254a, r32.name()).apply();
    }
}
