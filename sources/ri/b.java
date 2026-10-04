package ri;

import android.content.SharedPreferences;
public final class b {
    public final String f46437a;
    public final Enum f46438b;
    public volatile boolean f46439c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f46437a = str;
        this.f46438b = r22;
    }

    public final Enum a() {
        if (!this.f46439c) {
            synchronized (this) {
                try {
                    if (!this.f46439c) {
                        SharedPreferences sharedPreferences = d.f46442a;
                        String str = this.f46437a;
                        Enum r22 = this.f46438b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f46439c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f46439c = true;
        d.f46442a.edit().putString(this.f46437a, r32.name()).apply();
    }
}
