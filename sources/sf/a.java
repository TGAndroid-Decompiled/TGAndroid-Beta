package sf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.q;
public final class a {
    public final SharedPreferences f41836a;
    public long f41837b;
    public long f41838c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f41836a = sharedPreferences;
        this.f41837b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f41838c == 0) {
            return;
        }
        this.f41837b = (((SystemClock.uptimeMillis() - this.f41838c) * (10 - b10)) / 10) + ((this.f41837b * q.b(this.d, 0, 9)) / 10);
        this.f41838c = 0L;
        this.d++;
        this.f41836a.edit().putLong("estimated", this.f41837b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f41837b > 0) {
            return q.a(((float) (SystemClock.uptimeMillis() - this.f41838c)) / ((float) this.f41837b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
