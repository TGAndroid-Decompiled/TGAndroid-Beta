package si;

import android.content.SharedPreferences;
public final class b {
    public final String f45478a;
    public final Enum f45479b;
    public volatile boolean f45480c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f45478a = str;
        this.f45479b = r22;
    }

    public final Enum a() {
        if (!this.f45480c) {
            synchronized (this) {
                try {
                    if (!this.f45480c) {
                        SharedPreferences sharedPreferences = d.f45483a;
                        String str = this.f45478a;
                        Enum r22 = this.f45479b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f45480c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f45480c = true;
        d.f45483a.edit().putString(this.f45478a, r32.name()).apply();
    }
}
