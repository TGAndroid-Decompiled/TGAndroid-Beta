package ri;

import android.content.SharedPreferences;
public final class b {
    public final String f47782a;
    public final Enum f47783b;
    public volatile boolean f47784c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47782a = str;
        this.f47783b = r22;
    }

    public final Enum a() {
        if (!this.f47784c) {
            synchronized (this) {
                try {
                    if (!this.f47784c) {
                        SharedPreferences sharedPreferences = d.f47787a;
                        String str = this.f47782a;
                        Enum r22 = this.f47783b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47784c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47784c = true;
        d.f47787a.edit().putString(this.f47782a, r32.name()).apply();
    }
}
