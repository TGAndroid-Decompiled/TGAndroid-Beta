package xi;

import android.content.SharedPreferences;
public final class a {
    public final String f58752a;
    public volatile boolean f58753b;
    public volatile boolean f58754c;
    public volatile boolean d;

    public a(String str) {
        this.f58752a = str;
    }

    public final void a() {
        if (this.f58753b) {
            return;
        }
        synchronized (this) {
            if (!this.f58753b) {
                SharedPreferences sharedPreferences = d.f58760a;
                this.f58754c = sharedPreferences.contains(this.f58752a);
                this.d = sharedPreferences.getBoolean(this.f58752a, true);
                this.f58753b = true;
            }
        }
    }

    public final synchronized void b(boolean z9) {
        this.d = z9;
        this.f58754c = true;
        this.f58753b = true;
        d.f58760a.edit().putBoolean(this.f58752a, z9).apply();
    }
}
