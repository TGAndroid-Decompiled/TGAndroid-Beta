package ti;

import android.content.SharedPreferences;
public final class a {
    public final String f47649a;
    public volatile boolean f47650b;
    public volatile boolean f47651c;
    public volatile boolean d;

    public a(String str) {
        this.f47649a = str;
    }

    public final void a() {
        if (this.f47650b) {
            return;
        }
        synchronized (this) {
            if (!this.f47650b) {
                SharedPreferences sharedPreferences = d.f47657a;
                this.f47651c = sharedPreferences.contains(this.f47649a);
                this.d = sharedPreferences.getBoolean(this.f47649a, true);
                this.f47650b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f47651c = true;
        this.f47650b = true;
        d.f47657a.edit().putBoolean(this.f47649a, z10).apply();
    }
}
