package xi;

import android.content.SharedPreferences;
public final class a {
    public final String f58857a;
    public volatile boolean f58858b;
    public volatile boolean f58859c;
    public volatile boolean d;

    public a(String str) {
        this.f58857a = str;
    }

    public final void a() {
        if (this.f58858b) {
            return;
        }
        synchronized (this) {
            if (!this.f58858b) {
                SharedPreferences sharedPreferences = d.f58865a;
                this.f58859c = sharedPreferences.contains(this.f58857a);
                this.d = sharedPreferences.getBoolean(this.f58857a, true);
                this.f58858b = true;
            }
        }
    }

    public final synchronized void b(boolean z9) {
        this.d = z9;
        this.f58859c = true;
        this.f58858b = true;
        d.f58865a.edit().putBoolean(this.f58857a, z9).apply();
    }
}
