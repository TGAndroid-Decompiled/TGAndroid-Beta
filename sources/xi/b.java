package xi;

import android.content.SharedPreferences;
public final class b {
    public final String f58858a;
    public final Enum f58859b;
    public volatile boolean f58860c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f58858a = str;
        this.f58859b = r22;
    }

    public final Enum a() {
        if (!this.f58860c) {
            synchronized (this) {
                try {
                    if (!this.f58860c) {
                        SharedPreferences sharedPreferences = d.f58863a;
                        String str = this.f58858a;
                        Enum r22 = this.f58859b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f58860c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f58860c = true;
        d.f58863a.edit().putString(this.f58858a, r32.name()).apply();
    }
}
