package wi;

import android.content.SharedPreferences;
public final class a {
    public final String f51325a;
    public volatile boolean f51326b;
    public volatile boolean f51327c;
    public volatile boolean d;

    public a(String str) {
        this.f51325a = str;
    }

    public final void a() {
        if (this.f51326b) {
            return;
        }
        synchronized (this) {
            if (!this.f51326b) {
                SharedPreferences sharedPreferences = d.f51333a;
                this.f51327c = sharedPreferences.contains(this.f51325a);
                this.d = sharedPreferences.getBoolean(this.f51325a, true);
                this.f51326b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f51327c = true;
        this.f51326b = true;
        d.f51333a.edit().putBoolean(this.f51325a, z10).apply();
    }
}
