package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47210a;
    public volatile boolean f47211b;
    public volatile boolean f47212c;
    public volatile boolean d;

    public a(String str) {
        this.f47210a = str;
    }

    public final void a() {
        if (this.f47211b) {
            return;
        }
        synchronized (this) {
            if (!this.f47211b) {
                SharedPreferences sharedPreferences = d.f47218a;
                this.f47212c = sharedPreferences.contains(this.f47210a);
                this.d = sharedPreferences.getBoolean(this.f47210a, true);
                this.f47211b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47212c = true;
        this.f47211b = true;
        d.f47218a.edit().putBoolean(this.f47210a, z10).apply();
    }
}
