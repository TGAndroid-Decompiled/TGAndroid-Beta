package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47201a;
    public volatile boolean f47202b;
    public volatile boolean f47203c;
    public volatile boolean d;

    public a(String str) {
        this.f47201a = str;
    }

    public final void a() {
        if (this.f47202b) {
            return;
        }
        synchronized (this) {
            if (!this.f47202b) {
                SharedPreferences sharedPreferences = d.f47209a;
                this.f47203c = sharedPreferences.contains(this.f47201a);
                this.d = sharedPreferences.getBoolean(this.f47201a, true);
                this.f47202b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47203c = true;
        this.f47202b = true;
        d.f47209a.edit().putBoolean(this.f47201a, z10).apply();
    }
}
