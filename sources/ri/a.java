package ri;

import android.content.SharedPreferences;
public final class a {
    public final String f46441a;
    public volatile boolean f46442b;
    public volatile boolean f46443c;
    public volatile boolean d;

    public a(String str) {
        this.f46441a = str;
    }

    public final void a() {
        if (this.f46442b) {
            return;
        }
        synchronized (this) {
            if (!this.f46442b) {
                SharedPreferences sharedPreferences = d.f46449a;
                this.f46443c = sharedPreferences.contains(this.f46441a);
                this.d = sharedPreferences.getBoolean(this.f46441a, true);
                this.f46442b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f46443c = true;
        this.f46442b = true;
        d.f46449a.edit().putBoolean(this.f46441a, z10).apply();
    }
}
