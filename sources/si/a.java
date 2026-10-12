package si;

import android.content.SharedPreferences;
public final class a {
    public final String f45475a;
    public volatile boolean f45476b;
    public volatile boolean f45477c;
    public volatile boolean d;

    public a(String str) {
        this.f45475a = str;
    }

    public final void a() {
        if (this.f45476b) {
            return;
        }
        synchronized (this) {
            if (!this.f45476b) {
                SharedPreferences sharedPreferences = d.f45483a;
                this.f45477c = sharedPreferences.contains(this.f45475a);
                this.d = sharedPreferences.getBoolean(this.f45475a, true);
                this.f45476b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f45477c = true;
        this.f45476b = true;
        d.f45483a.edit().putBoolean(this.f45475a, z10).apply();
    }
}
