package xi;

import android.content.SharedPreferences;
public final class a {
    public final String f58848a;
    public volatile boolean f58849b;
    public volatile boolean f58850c;
    public volatile boolean d;

    public a(String str) {
        this.f58848a = str;
    }

    public final void a() {
        if (this.f58849b) {
            return;
        }
        synchronized (this) {
            if (!this.f58849b) {
                SharedPreferences sharedPreferences = d.f58856a;
                this.f58850c = sharedPreferences.contains(this.f58848a);
                this.d = sharedPreferences.getBoolean(this.f58848a, true);
                this.f58849b = true;
            }
        }
    }

    public final synchronized void b(boolean z9) {
        this.d = z9;
        this.f58850c = true;
        this.f58849b = true;
        d.f58856a.edit().putBoolean(this.f58848a, z9).apply();
    }
}
