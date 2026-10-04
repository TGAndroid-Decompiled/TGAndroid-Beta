package ri;

import android.content.SharedPreferences;
public final class a {
    public final String f46434a;
    public volatile boolean f46435b;
    public volatile boolean f46436c;
    public volatile boolean d;

    public a(String str) {
        this.f46434a = str;
    }

    public final void a() {
        if (this.f46435b) {
            return;
        }
        synchronized (this) {
            if (!this.f46435b) {
                SharedPreferences sharedPreferences = d.f46442a;
                this.f46436c = sharedPreferences.contains(this.f46434a);
                this.d = sharedPreferences.getBoolean(this.f46434a, true);
                this.f46435b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f46436c = true;
        this.f46435b = true;
        d.f46442a.edit().putBoolean(this.f46434a, z10).apply();
    }
}
