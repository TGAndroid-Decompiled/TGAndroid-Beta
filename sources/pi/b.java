package pi;

import android.content.SharedPreferences;
public final class b {
    public final String f41353a;
    public final Enum f41354b;
    public volatile boolean f41355c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f41353a = str;
        this.f41354b = r22;
    }

    public final Enum a() {
        if (!this.f41355c) {
            synchronized (this) {
                try {
                    if (!this.f41355c) {
                        SharedPreferences sharedPreferences = d.f41358a;
                        String str = this.f41353a;
                        Enum r22 = this.f41354b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f41355c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f41355c = true;
        d.f41358a.edit().putString(this.f41353a, r32.name()).apply();
    }
}
