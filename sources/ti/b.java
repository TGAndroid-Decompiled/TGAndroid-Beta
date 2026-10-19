package ti;

import android.content.SharedPreferences;
public final class b {
    public final String f47208a;
    public final Enum f47209b;
    public volatile boolean f47210c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47208a = str;
        this.f47209b = r22;
    }

    public final Enum a() {
        if (!this.f47210c) {
            synchronized (this) {
                try {
                    if (!this.f47210c) {
                        SharedPreferences sharedPreferences = d.f47213a;
                        String str = this.f47208a;
                        Enum r22 = this.f47209b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47210c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47210c = true;
        d.f47213a.edit().putString(this.f47208a, r32.name()).apply();
    }
}
