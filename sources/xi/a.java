package xi;

import android.content.SharedPreferences;
public final class a {
    public final String f58758a;
    public volatile boolean f58759b;
    public volatile boolean f58760c;
    public volatile boolean d;

    public a(String str) {
        this.f58758a = str;
    }

    public final void a() {
        if (this.f58759b) {
            return;
        }
        synchronized (this) {
            if (!this.f58759b) {
                SharedPreferences sharedPreferences = d.f58766a;
                this.f58760c = sharedPreferences.contains(this.f58758a);
                this.d = sharedPreferences.getBoolean(this.f58758a, true);
                this.f58759b = true;
            }
        }
    }

    public final synchronized void b(boolean z9) {
        this.d = z9;
        this.f58760c = true;
        this.f58759b = true;
        d.f58766a.edit().putBoolean(this.f58758a, z9).apply();
    }
}
