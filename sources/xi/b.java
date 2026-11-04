package xi;

import android.content.SharedPreferences;
public final class b {
    public final String f58871a;
    public final Enum f58872b;
    public volatile boolean f58873c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f58871a = str;
        this.f58872b = r22;
    }

    public final Enum a() {
        if (!this.f58873c) {
            synchronized (this) {
                try {
                    if (!this.f58873c) {
                        SharedPreferences sharedPreferences = d.f58876a;
                        String str = this.f58871a;
                        Enum r22 = this.f58872b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f58873c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f58873c = true;
        d.f58876a.edit().putString(this.f58871a, r32.name()).apply();
    }
}
