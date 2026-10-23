package uf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.r;
public final class a {
    public final SharedPreferences f48083a;
    public long f48084b;
    public long f48085c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f48083a = sharedPreferences;
        this.f48084b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f48085c == 0) {
            return;
        }
        this.f48084b = (((SystemClock.uptimeMillis() - this.f48085c) * (10 - b10)) / 10) + ((this.f48084b * r.b(this.d, 0, 9)) / 10);
        this.f48085c = 0L;
        this.d++;
        this.f48083a.edit().putLong("estimated", this.f48084b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f48084b > 0) {
            return r.a(((float) (SystemClock.uptimeMillis() - this.f48085c)) / ((float) this.f48084b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
