package pi;

import android.content.SharedPreferences;
public final class a {
    public final String f45881a;
    public volatile boolean f45882b;
    public volatile boolean f45883c;
    public volatile boolean d;

    public a(String str) {
        this.f45881a = str;
    }

    public final void a() {
        if (this.f45882b) {
            return;
        }
        synchronized (this) {
            if (!this.f45882b) {
                SharedPreferences sharedPreferences = d.f45889a;
                this.f45883c = sharedPreferences.contains(this.f45881a);
                this.d = sharedPreferences.getBoolean(this.f45881a, true);
                this.f45882b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f45883c = true;
        this.f45882b = true;
        d.f45889a.edit().putBoolean(this.f45881a, z10).apply();
    }
}
