package xi;

import android.content.SharedPreferences;
public final class b {
    public final String f58851a;
    public final Enum f58852b;
    public volatile boolean f58853c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f58851a = str;
        this.f58852b = r22;
    }

    public final Enum a() {
        if (!this.f58853c) {
            synchronized (this) {
                try {
                    if (!this.f58853c) {
                        SharedPreferences sharedPreferences = d.f58856a;
                        String str = this.f58851a;
                        Enum r22 = this.f58852b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f58853c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f58853c = true;
        d.f58856a.edit().putString(this.f58851a, r32.name()).apply();
    }
}
