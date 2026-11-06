package xi;

import android.content.SharedPreferences;
public final class a {
    public final String f58728a;
    public volatile boolean f58729b;
    public volatile boolean f58730c;
    public volatile boolean d;

    public a(String str) {
        this.f58728a = str;
    }

    public final void a() {
        if (this.f58729b) {
            return;
        }
        synchronized (this) {
            if (!this.f58729b) {
                SharedPreferences sharedPreferences = d.f58736a;
                this.f58730c = sharedPreferences.contains(this.f58728a);
                this.d = sharedPreferences.getBoolean(this.f58728a, true);
                this.f58729b = true;
            }
        }
    }

    public final synchronized void b(boolean z9) {
        this.d = z9;
        this.f58730c = true;
        this.f58729b = true;
        d.f58736a.edit().putBoolean(this.f58728a, z9).apply();
    }
}
