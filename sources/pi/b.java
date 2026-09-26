package pi;

import android.content.SharedPreferences;
public final class b {
    public final String f41351a;
    public final Enum f41352b;
    public volatile boolean f41353c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f41351a = str;
        this.f41352b = r22;
    }

    public final Enum a() {
        if (!this.f41353c) {
            synchronized (this) {
                try {
                    if (!this.f41353c) {
                        SharedPreferences sharedPreferences = d.f41356a;
                        String str = this.f41351a;
                        Enum r22 = this.f41352b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f41353c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f41353c = true;
        d.f41356a.edit().putString(this.f41351a, r32.name()).apply();
    }
}
