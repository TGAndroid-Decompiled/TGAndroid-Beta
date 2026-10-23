package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47214a;
    public volatile boolean f47215b;
    public volatile boolean f47216c;
    public volatile boolean d;

    public a(String str) {
        this.f47214a = str;
    }

    public final void a() {
        if (this.f47215b) {
            return;
        }
        synchronized (this) {
            if (!this.f47215b) {
                SharedPreferences sharedPreferences = d.f47222a;
                this.f47216c = sharedPreferences.contains(this.f47214a);
                this.d = sharedPreferences.getBoolean(this.f47214a, true);
                this.f47215b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47216c = true;
        this.f47215b = true;
        d.f47222a.edit().putBoolean(this.f47214a, z10).apply();
    }
}
