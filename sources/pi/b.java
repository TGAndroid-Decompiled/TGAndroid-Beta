package pi;

import android.content.SharedPreferences;
public final class b {
    public final String f41338a;
    public final Enum f41339b;
    public volatile boolean f41340c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f41338a = str;
        this.f41339b = r22;
    }

    public final Enum a() {
        if (!this.f41340c) {
            synchronized (this) {
                try {
                    if (!this.f41340c) {
                        SharedPreferences sharedPreferences = d.f41343a;
                        String str = this.f41338a;
                        Enum r22 = this.f41339b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f41340c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f41340c = true;
        d.f41343a.edit().putString(this.f41338a, r32.name()).apply();
    }
}
