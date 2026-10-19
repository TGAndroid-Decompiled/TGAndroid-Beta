package uf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.r;
public final class a {
    public final SharedPreferences f47629a;
    public long f47630b;
    public long f47631c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f47629a = sharedPreferences;
        this.f47630b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f47631c == 0) {
            return;
        }
        this.f47630b = (((SystemClock.uptimeMillis() - this.f47631c) * (10 - b10)) / 10) + ((this.f47630b * r.b(this.d, 0, 9)) / 10);
        this.f47631c = 0L;
        this.d++;
        this.f47629a.edit().putLong("estimated", this.f47630b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f47630b > 0) {
            return r.a(((float) (SystemClock.uptimeMillis() - this.f47631c)) / ((float) this.f47630b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
