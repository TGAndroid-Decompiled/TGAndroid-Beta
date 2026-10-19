package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47205a;
    public volatile boolean f47206b;
    public volatile boolean f47207c;
    public volatile boolean d;

    public a(String str) {
        this.f47205a = str;
    }

    public final void a() {
        if (this.f47206b) {
            return;
        }
        synchronized (this) {
            if (!this.f47206b) {
                SharedPreferences sharedPreferences = d.f47213a;
                this.f47207c = sharedPreferences.contains(this.f47205a);
                this.d = sharedPreferences.getBoolean(this.f47205a, true);
                this.f47206b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47207c = true;
        this.f47206b = true;
        d.f47213a.edit().putBoolean(this.f47205a, z10).apply();
    }
}
