package ri;

import android.content.SharedPreferences;
public final class b {
    public final String f46451a;
    public final Enum f46452b;
    public volatile boolean f46453c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f46451a = str;
        this.f46452b = r22;
    }

    public final Enum a() {
        if (!this.f46453c) {
            synchronized (this) {
                try {
                    if (!this.f46453c) {
                        SharedPreferences sharedPreferences = d.f46456a;
                        String str = this.f46451a;
                        Enum r22 = this.f46452b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f46453c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f46453c = true;
        d.f46456a.edit().putString(this.f46451a, r32.name()).apply();
    }
}
