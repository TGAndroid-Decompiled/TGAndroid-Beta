package xi;

import android.content.SharedPreferences;
public final class a {
    public final String f58753a;
    public volatile boolean f58754b;
    public volatile boolean f58755c;
    public volatile boolean d;

    public a(String str) {
        this.f58753a = str;
    }

    public final void a() {
        if (this.f58754b) {
            return;
        }
        synchronized (this) {
            if (!this.f58754b) {
                SharedPreferences sharedPreferences = d.f58761a;
                this.f58755c = sharedPreferences.contains(this.f58753a);
                this.d = sharedPreferences.getBoolean(this.f58753a, true);
                this.f58754b = true;
            }
        }
    }

    public final synchronized void b(boolean z9) {
        this.d = z9;
        this.f58755c = true;
        this.f58754b = true;
        d.f58761a.edit().putBoolean(this.f58753a, z9).apply();
    }
}
