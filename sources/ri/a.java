package ri;

import android.content.SharedPreferences;
public final class a {
    public final String f47779a;
    public volatile boolean f47780b;
    public volatile boolean f47781c;
    public volatile boolean d;

    public a(String str) {
        this.f47779a = str;
    }

    public final void a() {
        if (this.f47780b) {
            return;
        }
        synchronized (this) {
            if (!this.f47780b) {
                SharedPreferences sharedPreferences = d.f47787a;
                this.f47781c = sharedPreferences.contains(this.f47779a);
                this.d = sharedPreferences.getBoolean(this.f47779a, true);
                this.f47780b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47781c = true;
        this.f47780b = true;
        d.f47787a.edit().putBoolean(this.f47779a, z10).apply();
    }
}
