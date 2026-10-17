package uf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.r;
public final class a {
    public final SharedPreferences f47654a;
    public long f47655b;
    public long f47656c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f47654a = sharedPreferences;
        this.f47655b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f47656c == 0) {
            return;
        }
        this.f47655b = (((SystemClock.uptimeMillis() - this.f47656c) * (10 - b10)) / 10) + ((this.f47655b * r.b(this.d, 0, 9)) / 10);
        this.f47656c = 0L;
        this.d++;
        this.f47654a.edit().putLong("estimated", this.f47655b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f47655b > 0) {
            return r.a(((float) (SystemClock.uptimeMillis() - this.f47656c)) / ((float) this.f47655b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
