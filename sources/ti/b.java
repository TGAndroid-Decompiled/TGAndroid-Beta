package ti;

import android.content.SharedPreferences;
public final class b {
    public final String f47229a;
    public final Enum f47230b;
    public volatile boolean f47231c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47229a = str;
        this.f47230b = r22;
    }

    public final Enum a() {
        if (!this.f47231c) {
            synchronized (this) {
                try {
                    if (!this.f47231c) {
                        SharedPreferences sharedPreferences = d.f47234a;
                        String str = this.f47229a;
                        Enum r22 = this.f47230b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47231c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47231c = true;
        d.f47234a.edit().putString(this.f47229a, r32.name()).apply();
    }
}
