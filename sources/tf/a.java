package tf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.p;
public final class a {
    public final SharedPreferences f46510a;
    public long f46511b;
    public long f46512c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f46510a = sharedPreferences;
        this.f46511b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f46512c == 0) {
            return;
        }
        this.f46511b = (((SystemClock.uptimeMillis() - this.f46512c) * (10 - b10)) / 10) + ((this.f46511b * p.b(this.d, 0, 9)) / 10);
        this.f46512c = 0L;
        this.d++;
        this.f46510a.edit().putLong("estimated", this.f46511b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f46511b > 0) {
            return p.a(((float) (SystemClock.uptimeMillis() - this.f46512c)) / ((float) this.f46511b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
