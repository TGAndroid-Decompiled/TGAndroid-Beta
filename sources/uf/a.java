package uf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.s;
public final class a {
    public final SharedPreferences f46246a;
    public long f46247b;
    public long f46248c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f46246a = sharedPreferences;
        this.f46247b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f46248c == 0) {
            return;
        }
        this.f46247b = (((SystemClock.uptimeMillis() - this.f46248c) * (10 - b10)) / 10) + ((this.f46247b * s.b(this.d, 0, 9)) / 10);
        this.f46248c = 0L;
        this.d++;
        this.f46246a.edit().putLong("estimated", this.f46247b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f46247b > 0) {
            return s.a(((float) (SystemClock.uptimeMillis() - this.f46248c)) / ((float) this.f46247b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
