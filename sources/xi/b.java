package xi;

import android.content.SharedPreferences;
public final class b {
    public final String f58755a;
    public final Enum f58756b;
    public volatile boolean f58757c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f58755a = str;
        this.f58756b = r22;
    }

    public final Enum a() {
        if (!this.f58757c) {
            synchronized (this) {
                try {
                    if (!this.f58757c) {
                        SharedPreferences sharedPreferences = d.f58760a;
                        String str = this.f58755a;
                        Enum r22 = this.f58756b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f58757c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f58757c = true;
        d.f58760a.edit().putString(this.f58755a, r32.name()).apply();
    }
}
