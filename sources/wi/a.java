package wi;

import android.content.SharedPreferences;
public final class a {
    public final String f51264a;
    public volatile boolean f51265b;
    public volatile boolean f51266c;
    public volatile boolean d;

    public a(String str) {
        this.f51264a = str;
    }

    public final void a() {
        if (this.f51265b) {
            return;
        }
        synchronized (this) {
            if (!this.f51265b) {
                SharedPreferences sharedPreferences = d.f51272a;
                this.f51266c = sharedPreferences.contains(this.f51264a);
                this.d = sharedPreferences.getBoolean(this.f51264a, true);
                this.f51265b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f51266c = true;
        this.f51265b = true;
        d.f51272a.edit().putBoolean(this.f51264a, z10).apply();
    }
}
