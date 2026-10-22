package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47213a;
    public volatile boolean f47214b;
    public volatile boolean f47215c;
    public volatile boolean d;

    public a(String str) {
        this.f47213a = str;
    }

    public final void a() {
        if (this.f47214b) {
            return;
        }
        synchronized (this) {
            if (!this.f47214b) {
                SharedPreferences sharedPreferences = d.f47221a;
                this.f47215c = sharedPreferences.contains(this.f47213a);
                this.d = sharedPreferences.getBoolean(this.f47213a, true);
                this.f47214b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47215c = true;
        this.f47214b = true;
        d.f47221a.edit().putBoolean(this.f47213a, z10).apply();
    }
}
