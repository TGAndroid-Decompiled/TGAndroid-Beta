package xi;

import android.content.SharedPreferences;
public final class a {
    public final String f58868a;
    public volatile boolean f58869b;
    public volatile boolean f58870c;
    public volatile boolean d;

    public a(String str) {
        this.f58868a = str;
    }

    public final void a() {
        if (this.f58869b) {
            return;
        }
        synchronized (this) {
            if (!this.f58869b) {
                SharedPreferences sharedPreferences = d.f58876a;
                this.f58870c = sharedPreferences.contains(this.f58868a);
                this.d = sharedPreferences.getBoolean(this.f58868a, true);
                this.f58869b = true;
            }
        }
    }

    public final synchronized void b(boolean z10) {
        this.d = z10;
        this.f58870c = true;
        this.f58869b = true;
        d.f58876a.edit().putBoolean(this.f58868a, z10).apply();
    }
}
