package pi;

import android.content.SharedPreferences;
public final class a {
    public final String f45883a;
    public volatile boolean f45884b;
    public volatile boolean f45885c;
    public volatile boolean d;

    public a(String str) {
        this.f45883a = str;
    }

    public final void a() {
        if (this.f45884b) {
            return;
        }
        synchronized (this) {
            if (!this.f45884b) {
                SharedPreferences sharedPreferences = d.f45891a;
                this.f45885c = sharedPreferences.contains(this.f45883a);
                this.d = sharedPreferences.getBoolean(this.f45883a, true);
                this.f45884b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f45885c = true;
        this.f45884b = true;
        d.f45891a.edit().putBoolean(this.f45883a, z10).apply();
    }
}
