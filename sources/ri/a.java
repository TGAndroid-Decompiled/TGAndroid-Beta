package ri;

import android.content.SharedPreferences;
public final class a {
    public final String f47787a;
    public volatile boolean f47788b;
    public volatile boolean f47789c;
    public volatile boolean d;

    public a(String str) {
        this.f47787a = str;
    }

    public final void a() {
        if (this.f47788b) {
            return;
        }
        synchronized (this) {
            if (!this.f47788b) {
                SharedPreferences sharedPreferences = d.f47795a;
                this.f47789c = sharedPreferences.contains(this.f47787a);
                this.d = sharedPreferences.getBoolean(this.f47787a, true);
                this.f47788b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47789c = true;
        this.f47788b = true;
        d.f47795a.edit().putBoolean(this.f47787a, z10).apply();
    }
}
