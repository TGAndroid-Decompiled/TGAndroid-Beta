package ri;

import android.content.SharedPreferences;
public final class a {
    public final String f46448a;
    public volatile boolean f46449b;
    public volatile boolean f46450c;
    public volatile boolean d;

    public a(String str) {
        this.f46448a = str;
    }

    public final void a() {
        if (this.f46449b) {
            return;
        }
        synchronized (this) {
            if (!this.f46449b) {
                SharedPreferences sharedPreferences = d.f46456a;
                this.f46450c = sharedPreferences.contains(this.f46448a);
                this.d = sharedPreferences.getBoolean(this.f46448a, true);
                this.f46449b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f46450c = true;
        this.f46449b = true;
        d.f46456a.edit().putBoolean(this.f46448a, z10).apply();
    }
}
