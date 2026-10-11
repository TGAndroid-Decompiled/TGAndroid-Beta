package tf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.o;
public final class a {
    public final SharedPreferences f48345a;
    public long f48346b;
    public long f48347c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f48345a = sharedPreferences;
        this.f48346b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f48347c == 0) {
            return;
        }
        this.f48346b = (((SystemClock.uptimeMillis() - this.f48347c) * (10 - b10)) / 10) + ((this.f48346b * o.b(this.d, 0, 9)) / 10);
        this.f48347c = 0L;
        this.d++;
        this.f48345a.edit().putLong("estimated", this.f48346b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f48346b > 0) {
            return o.a(((float) (SystemClock.uptimeMillis() - this.f48347c)) / ((float) this.f48346b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
