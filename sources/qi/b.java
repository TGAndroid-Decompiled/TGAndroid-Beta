package qi;

import android.content.SharedPreferences;
public final class b {
    public final String f46805a;
    public final Enum f46806b;
    public volatile boolean f46807c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f46805a = str;
        this.f46806b = r22;
    }

    public final Enum a() {
        if (!this.f46807c) {
            synchronized (this) {
                try {
                    if (!this.f46807c) {
                        SharedPreferences sharedPreferences = d.f46810a;
                        String str = this.f46805a;
                        Enum r22 = this.f46806b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f46807c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f46807c = true;
        d.f46810a.edit().putString(this.f46805a, r32.name()).apply();
    }
}
