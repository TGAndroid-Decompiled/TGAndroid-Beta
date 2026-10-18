package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47251a;
    public volatile boolean f47252b;
    public volatile boolean f47253c;
    public volatile boolean d;

    public a(String str) {
        this.f47251a = str;
    }

    public final void a() {
        if (this.f47252b) {
            return;
        }
        synchronized (this) {
            if (!this.f47252b) {
                SharedPreferences sharedPreferences = d.f47259a;
                this.f47253c = sharedPreferences.contains(this.f47251a);
                this.d = sharedPreferences.getBoolean(this.f47251a, true);
                this.f47252b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47253c = true;
        this.f47252b = true;
        d.f47259a.edit().putBoolean(this.f47251a, z10).apply();
    }
}
