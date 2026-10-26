package wi;

import android.content.SharedPreferences;
public final class a {
    public final String f51267a;
    public volatile boolean f51268b;
    public volatile boolean f51269c;
    public volatile boolean d;

    public a(String str) {
        this.f51267a = str;
    }

    public final void a() {
        if (this.f51268b) {
            return;
        }
        synchronized (this) {
            if (!this.f51268b) {
                SharedPreferences sharedPreferences = d.f51275a;
                this.f51269c = sharedPreferences.contains(this.f51267a);
                this.d = sharedPreferences.getBoolean(this.f51267a, true);
                this.f51268b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f51269c = true;
        this.f51268b = true;
        d.f51275a.edit().putBoolean(this.f51267a, z10).apply();
    }
}
