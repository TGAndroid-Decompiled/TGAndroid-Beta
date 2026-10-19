package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47203a;
    public volatile boolean f47204b;
    public volatile boolean f47205c;
    public volatile boolean d;

    public a(String str) {
        this.f47203a = str;
    }

    public final void a() {
        if (this.f47204b) {
            return;
        }
        synchronized (this) {
            if (!this.f47204b) {
                SharedPreferences sharedPreferences = d.f47211a;
                this.f47205c = sharedPreferences.contains(this.f47203a);
                this.d = sharedPreferences.getBoolean(this.f47203a, true);
                this.f47204b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47205c = true;
        this.f47204b = true;
        d.f47211a.edit().putBoolean(this.f47203a, z10).apply();
    }
}
