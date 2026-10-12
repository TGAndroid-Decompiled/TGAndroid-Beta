package ri;

import android.content.SharedPreferences;
public final class b {
    public final String f47790a;
    public final Enum f47791b;
    public volatile boolean f47792c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47790a = str;
        this.f47791b = r22;
    }

    public final Enum a() {
        if (!this.f47792c) {
            synchronized (this) {
                try {
                    if (!this.f47792c) {
                        SharedPreferences sharedPreferences = d.f47795a;
                        String str = this.f47790a;
                        Enum r22 = this.f47791b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47792c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47792c = true;
        d.f47795a.edit().putString(this.f47790a, r32.name()).apply();
    }
}
