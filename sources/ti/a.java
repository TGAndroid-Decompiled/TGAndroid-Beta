package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47226a;
    public volatile boolean f47227b;
    public volatile boolean f47228c;
    public volatile boolean d;

    public a(String str) {
        this.f47226a = str;
    }

    public final void a() {
        if (this.f47227b) {
            return;
        }
        synchronized (this) {
            if (!this.f47227b) {
                SharedPreferences sharedPreferences = d.f47234a;
                this.f47228c = sharedPreferences.contains(this.f47226a);
                this.d = sharedPreferences.getBoolean(this.f47226a, true);
                this.f47227b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47228c = true;
        this.f47227b = true;
        d.f47234a.edit().putBoolean(this.f47226a, z10).apply();
    }
}
