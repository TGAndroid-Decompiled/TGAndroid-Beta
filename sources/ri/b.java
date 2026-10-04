package ri;

import android.content.SharedPreferences;
public final class b {
    public final String f46444a;
    public final Enum f46445b;
    public volatile boolean f46446c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f46444a = str;
        this.f46445b = r22;
    }

    public final Enum a() {
        if (!this.f46446c) {
            synchronized (this) {
                try {
                    if (!this.f46446c) {
                        SharedPreferences sharedPreferences = d.f46449a;
                        String str = this.f46444a;
                        Enum r22 = this.f46445b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f46446c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f46446c = true;
        d.f46449a.edit().putString(this.f46444a, r32.name()).apply();
    }
}
