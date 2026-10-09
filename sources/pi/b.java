package pi;

import android.content.SharedPreferences;
public final class b {
    public final String f45884a;
    public final Enum f45885b;
    public volatile boolean f45886c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f45884a = str;
        this.f45885b = r22;
    }

    public final Enum a() {
        if (!this.f45886c) {
            synchronized (this) {
                try {
                    if (!this.f45886c) {
                        SharedPreferences sharedPreferences = d.f45889a;
                        String str = this.f45884a;
                        Enum r22 = this.f45885b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f45886c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f45886c = true;
        d.f45889a.edit().putString(this.f45884a, r32.name()).apply();
    }
}
