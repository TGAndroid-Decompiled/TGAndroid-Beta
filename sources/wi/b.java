package wi;

import android.content.SharedPreferences;
public final class b {
    public final String f51267a;
    public final Enum f51268b;
    public volatile boolean f51269c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f51267a = str;
        this.f51268b = r22;
    }

    public final Enum a() {
        if (!this.f51269c) {
            synchronized (this) {
                try {
                    if (!this.f51269c) {
                        SharedPreferences sharedPreferences = d.f51272a;
                        String str = this.f51267a;
                        Enum r22 = this.f51268b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f51269c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f51269c = true;
        d.f51272a.edit().putString(this.f51267a, r32.name()).apply();
    }
}
