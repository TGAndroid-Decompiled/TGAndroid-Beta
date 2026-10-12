package tf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.n;
public final class a {
    public final SharedPreferences f48494a;
    public long f48495b;
    public long f48496c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f48494a = sharedPreferences;
        this.f48495b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f48496c == 0) {
            return;
        }
        this.f48495b = (((SystemClock.uptimeMillis() - this.f48496c) * (10 - b10)) / 10) + ((this.f48495b * n.b(this.d, 0, 9)) / 10);
        this.f48496c = 0L;
        this.d++;
        this.f48494a.edit().putLong("estimated", this.f48495b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f48495b > 0) {
            return n.a(((float) (SystemClock.uptimeMillis() - this.f48496c)) / ((float) this.f48495b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
