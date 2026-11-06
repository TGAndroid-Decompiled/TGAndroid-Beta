package xi;

import android.content.SharedPreferences;
public final class b {
    public final String f58756a;
    public final Enum f58757b;
    public volatile boolean f58758c;
    public volatile Enum d;

    public b(String str, Enum r22) {
        this.f58756a = str;
        this.f58757b = r22;
    }

    public final Enum a() {
        if (!this.f58758c) {
            synchronized (this) {
                try {
                    if (!this.f58758c) {
                        SharedPreferences sharedPreferences = d.f58761a;
                        String str = this.f58756a;
                        Enum r22 = this.f58757b;
                        String string = sharedPreferences.getString(str, r22.name());
                        if (string != null) {
                            try {
                                r22 = Enum.valueOf(r22.getDeclaringClass(), string);
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        this.d = r22;
                        this.f58758c = true;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final synchronized void b(Enum r32) {
        this.d = r32;
        this.f58758c = true;
        d.f58761a.edit().putString(this.f58756a, r32.name()).apply();
    }
}
