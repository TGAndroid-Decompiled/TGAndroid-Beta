package vf;

import a8.ee;
import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
public final class a {
    public final SharedPreferences f50110a;
    public long f50111b;
    public long f50112c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f50110a = sharedPreferences;
        this.f50111b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f50112c == 0) {
            return;
        }
        this.f50111b = (((SystemClock.uptimeMillis() - this.f50112c) * (10 - b10)) / 10) + ((this.f50111b * ee.b(this.d, 0, 9)) / 10);
        this.f50112c = 0L;
        this.d++;
        this.f50110a.edit().putLong("estimated", this.f50111b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f50111b > 0) {
            return ee.a(((float) (SystemClock.uptimeMillis() - this.f50112c)) / ((float) this.f50111b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
