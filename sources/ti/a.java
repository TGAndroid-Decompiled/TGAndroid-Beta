package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47648a;
    public volatile boolean f47649b;
    public volatile boolean f47650c;
    public volatile boolean d;

    public a(String str) {
        this.f47648a = str;
    }

    public final void a() {
        if (this.f47649b) {
            return;
        }
        synchronized (this) {
            if (!this.f47649b) {
                SharedPreferences sharedPreferences = d.f47656a;
                this.f47650c = sharedPreferences.contains(this.f47648a);
                this.d = sharedPreferences.getBoolean(this.f47648a, true);
                this.f47649b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47650c = true;
        this.f47649b = true;
        d.f47656a.edit().putBoolean(this.f47648a, z10).apply();
    }
}
