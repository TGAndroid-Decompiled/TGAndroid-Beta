package pi;

import android.content.SharedPreferences;
public final class b {
    public final String f41352a;
    public final Enum f41353b;
    public volatile boolean f41354c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f41352a = str;
        this.f41353b = r22;
    }

    public final Enum a() {
        if (!this.f41354c) {
            synchronized (this) {
                try {
                    if (!this.f41354c) {
                        SharedPreferences sharedPreferences = d.f41357a;
                        String str = this.f41352a;
                        Enum r22 = this.f41353b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f41354c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f41354c = true;
        d.f41357a.edit().putString(this.f41352a, r32.name()).apply();
    }
}
