package pi;

import android.content.SharedPreferences;
public final class b {
    public final String f41451a;
    public final Enum f41452b;
    public volatile boolean f41453c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f41451a = str;
        this.f41452b = r22;
    }

    public final Enum a() {
        if (!this.f41453c) {
            synchronized (this) {
                try {
                    if (!this.f41453c) {
                        SharedPreferences sharedPreferences = d.f41456a;
                        String str = this.f41451a;
                        Enum r22 = this.f41452b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f41453c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f41453c = true;
        d.f41456a.edit().putString(this.f41451a, r32.name()).apply();
    }
}
