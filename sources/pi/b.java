package pi;

import android.content.SharedPreferences;
public final class b {
    public final String f45886a;
    public final Enum f45887b;
    public volatile boolean f45888c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f45886a = str;
        this.f45887b = r22;
    }

    public final Enum a() {
        if (!this.f45888c) {
            synchronized (this) {
                try {
                    if (!this.f45888c) {
                        SharedPreferences sharedPreferences = d.f45891a;
                        String str = this.f45886a;
                        Enum r22 = this.f45887b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f45888c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f45888c = true;
        d.f45891a.edit().putString(this.f45886a, r32.name()).apply();
    }
}
