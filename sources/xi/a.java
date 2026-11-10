package xi;

import android.content.SharedPreferences;
public final class a {
    public final String f58855a;
    public volatile boolean f58856b;
    public volatile boolean f58857c;
    public volatile boolean d;

    public a(String str) {
        this.f58855a = str;
    }

    public final void a() {
        if (this.f58856b) {
            return;
        }
        synchronized (this) {
            if (!this.f58856b) {
                SharedPreferences sharedPreferences = d.f58863a;
                this.f58857c = sharedPreferences.contains(this.f58855a);
                this.d = sharedPreferences.getBoolean(this.f58855a, true);
                this.f58856b = true;
            }
        }
    }

    public final synchronized void b(boolean z9) {
        this.d = z9;
        this.f58857c = true;
        this.f58856b = true;
        d.f58863a.edit().putBoolean(this.f58855a, z9).apply();
    }
}
