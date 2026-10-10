package pi;

import android.content.SharedPreferences;
public final class b {
    public final String f45930a;
    public final Enum f45931b;
    public volatile boolean f45932c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f45930a = str;
        this.f45931b = r22;
    }

    public final Enum a() {
        if (!this.f45932c) {
            synchronized (this) {
                try {
                    if (!this.f45932c) {
                        SharedPreferences sharedPreferences = d.f45935a;
                        String str = this.f45930a;
                        Enum r22 = this.f45931b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f45932c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f45932c = true;
        d.f45935a.edit().putString(this.f45930a, r32.name()).apply();
    }
}
