package pi;

import android.content.SharedPreferences;
public final class a {
    public final String f45927a;
    public volatile boolean f45928b;
    public volatile boolean f45929c;
    public volatile boolean d;

    public a(String str) {
        this.f45927a = str;
    }

    public final void a() {
        if (this.f45928b) {
            return;
        }
        synchronized (this) {
            if (!this.f45928b) {
                SharedPreferences sharedPreferences = d.f45935a;
                this.f45929c = sharedPreferences.contains(this.f45927a);
                this.d = sharedPreferences.getBoolean(this.f45927a, true);
                this.f45928b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f45929c = true;
        this.f45928b = true;
        d.f45935a.edit().putBoolean(this.f45927a, z10).apply();
    }
}
