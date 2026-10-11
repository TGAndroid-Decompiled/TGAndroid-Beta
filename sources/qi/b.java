package qi;

import android.content.SharedPreferences;
public final class b {
    public final String f46839a;
    public final Enum f46840b;
    public volatile boolean f46841c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f46839a = str;
        this.f46840b = r22;
    }

    public final Enum a() {
        if (!this.f46841c) {
            synchronized (this) {
                try {
                    if (!this.f46841c) {
                        SharedPreferences sharedPreferences = d.f46844a;
                        String str = this.f46839a;
                        Enum r22 = this.f46840b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f46841c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f46841c = true;
        d.f46844a.edit().putString(this.f46839a, r32.name()).apply();
    }
}
