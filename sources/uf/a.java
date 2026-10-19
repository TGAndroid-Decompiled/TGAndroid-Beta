package uf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.r;
public final class a {
    public final SharedPreferences f47631a;
    public long f47632b;
    public long f47633c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f47631a = sharedPreferences;
        this.f47632b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f47633c == 0) {
            return;
        }
        this.f47632b = (((SystemClock.uptimeMillis() - this.f47633c) * (10 - b10)) / 10) + ((this.f47632b * r.b(this.d, 0, 9)) / 10);
        this.f47633c = 0L;
        this.d++;
        this.f47631a.edit().putLong("estimated", this.f47632b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f47632b > 0) {
            return r.a(((float) (SystemClock.uptimeMillis() - this.f47633c)) / ((float) this.f47632b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
