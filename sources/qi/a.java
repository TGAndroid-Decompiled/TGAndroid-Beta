package qi;

import android.content.SharedPreferences;
public final class a {
    public final String f46802a;
    public volatile boolean f46803b;
    public volatile boolean f46804c;
    public volatile boolean d;

    public a(String str) {
        this.f46802a = str;
    }

    public final void a() {
        if (this.f46803b) {
            return;
        }
        synchronized (this) {
            if (!this.f46803b) {
                SharedPreferences sharedPreferences = d.f46810a;
                this.f46804c = sharedPreferences.contains(this.f46802a);
                this.d = sharedPreferences.getBoolean(this.f46802a, true);
                this.f46803b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f46804c = true;
        this.f46803b = true;
        d.f46810a.edit().putBoolean(this.f46802a, z10).apply();
    }
}
