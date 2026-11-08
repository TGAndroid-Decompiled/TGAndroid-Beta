package xi;

import android.content.SharedPreferences;
public final class b {
    public final String f58850a;
    public final Enum f58851b;
    public volatile boolean f58852c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f58850a = str;
        this.f58851b = r22;
    }

    public final Enum a() {
        if (!this.f58852c) {
            synchronized (this) {
                try {
                    if (!this.f58852c) {
                        SharedPreferences sharedPreferences = d.f58855a;
                        String str = this.f58850a;
                        Enum r22 = this.f58851b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f58852c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f58852c = true;
        d.f58855a.edit().putString(this.f58850a, r32.name()).apply();
    }
}
