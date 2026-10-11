package qi;

import android.content.SharedPreferences;
public final class a {
    public final String f46836a;
    public volatile boolean f46837b;
    public volatile boolean f46838c;
    public volatile boolean d;

    public a(String str) {
        this.f46836a = str;
    }

    public final void a() {
        if (this.f46837b) {
            return;
        }
        synchronized (this) {
            if (!this.f46837b) {
                SharedPreferences sharedPreferences = d.f46844a;
                this.f46838c = sharedPreferences.contains(this.f46836a);
                this.d = sharedPreferences.getBoolean(this.f46836a, true);
                this.f46837b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f46838c = true;
        this.f46837b = true;
        d.f46844a.edit().putBoolean(this.f46836a, z10).apply();
    }
}
