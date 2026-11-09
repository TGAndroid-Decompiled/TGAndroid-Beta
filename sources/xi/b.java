package xi;

import android.content.SharedPreferences;
public final class b {
    public final String f58860a;
    public final Enum f58861b;
    public volatile boolean f58862c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f58860a = str;
        this.f58861b = r22;
    }

    public final Enum a() {
        if (!this.f58862c) {
            synchronized (this) {
                try {
                    if (!this.f58862c) {
                        SharedPreferences sharedPreferences = d.f58865a;
                        String str = this.f58860a;
                        Enum r22 = this.f58861b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f58862c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f58862c = true;
        d.f58865a.edit().putString(this.f58860a, r32.name()).apply();
    }
}
