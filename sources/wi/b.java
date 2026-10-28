package wi;

import android.content.SharedPreferences;
public final class b {
    public final String f51328a;
    public final Enum f51329b;
    public volatile boolean f51330c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f51328a = str;
        this.f51329b = r22;
    }

    public final Enum a() {
        if (!this.f51330c) {
            synchronized (this) {
                try {
                    if (!this.f51330c) {
                        SharedPreferences sharedPreferences = d.f51333a;
                        String str = this.f51328a;
                        Enum r22 = this.f51329b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f51330c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f51330c = true;
        d.f51333a.edit().putString(this.f51328a, r32.name()).apply();
    }
}
