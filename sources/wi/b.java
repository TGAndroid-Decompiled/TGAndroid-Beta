package wi;

import android.content.SharedPreferences;
public final class b {
    public final String f51270a;
    public final Enum f51271b;
    public volatile boolean f51272c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f51270a = str;
        this.f51271b = r22;
    }

    public final Enum a() {
        if (!this.f51272c) {
            synchronized (this) {
                try {
                    if (!this.f51272c) {
                        SharedPreferences sharedPreferences = d.f51275a;
                        String str = this.f51270a;
                        Enum r22 = this.f51271b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f51272c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f51272c = true;
        d.f51275a.edit().putString(this.f51270a, r32.name()).apply();
    }
}
