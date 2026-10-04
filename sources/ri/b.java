package ri;

import android.content.SharedPreferences;
public final class b {
    public final String f46436a;
    public final Enum f46437b;
    public volatile boolean f46438c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f46436a = str;
        this.f46437b = r22;
    }

    public final Enum a() {
        if (!this.f46438c) {
            synchronized (this) {
                try {
                    if (!this.f46438c) {
                        SharedPreferences sharedPreferences = d.f46441a;
                        String str = this.f46436a;
                        Enum r22 = this.f46437b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f46438c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f46438c = true;
        d.f46441a.edit().putString(this.f46436a, r32.name()).apply();
    }
}
