package ti;

import android.content.SharedPreferences;
public final class b {
    public final String f47652a;
    public final Enum f47653b;
    public volatile boolean f47654c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f47652a = str;
        this.f47653b = r22;
    }

    public final Enum a() {
        if (!this.f47654c) {
            synchronized (this) {
                try {
                    if (!this.f47654c) {
                        SharedPreferences sharedPreferences = d.f47657a;
                        String str = this.f47652a;
                        Enum r22 = this.f47653b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f47654c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f47654c = true;
        d.f47657a.edit().putString(this.f47652a, r32.name()).apply();
    }
}
