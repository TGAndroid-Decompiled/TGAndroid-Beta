package uf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.r;
public final class a {
    public final SharedPreferences f48082a;
    public long f48083b;
    public long f48084c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f48082a = sharedPreferences;
        this.f48083b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f48084c == 0) {
            return;
        }
        this.f48083b = (((SystemClock.uptimeMillis() - this.f48084c) * (10 - b10)) / 10) + ((this.f48083b * r.b(this.d, 0, 9)) / 10);
        this.f48084c = 0L;
        this.d++;
        this.f48082a.edit().putLong("estimated", this.f48083b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f48083b > 0) {
            return r.a(((float) (SystemClock.uptimeMillis() - this.f48084c)) / ((float) this.f48083b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
