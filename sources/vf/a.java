package vf;

import a8.ee;
import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
public final class a {
    public final SharedPreferences f50145a;
    public long f50146b;
    public long f50147c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f50145a = sharedPreferences;
        this.f50146b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f50147c == 0) {
            return;
        }
        this.f50146b = (((SystemClock.uptimeMillis() - this.f50147c) * (10 - b10)) / 10) + ((this.f50146b * ee.b(this.d, 0, 9)) / 10);
        this.f50147c = 0L;
        this.d++;
        this.f50145a.edit().putLong("estimated", this.f50146b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f50146b > 0) {
            return ee.a(((float) (SystemClock.uptimeMillis() - this.f50147c)) / ((float) this.f50146b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
