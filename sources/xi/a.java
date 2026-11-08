package xi;

import android.content.SharedPreferences;
public final class a {
    public final String f58847a;
    public volatile boolean f58848b;
    public volatile boolean f58849c;
    public volatile boolean d;

    public a(String str) {
        this.f58847a = str;
    }

    public final void a() {
        if (this.f58848b) {
            return;
        }
        synchronized (this) {
            if (!this.f58848b) {
                SharedPreferences sharedPreferences = d.f58855a;
                this.f58849c = sharedPreferences.contains(this.f58847a);
                this.d = sharedPreferences.getBoolean(this.f58847a, true);
                this.f58848b = true;
            }
        }
    }

    public final synchronized void b(boolean z9) {
        this.d = z9;
        this.f58849c = true;
        this.f58848b = true;
        d.f58855a.edit().putBoolean(this.f58847a, z9).apply();
    }
}
