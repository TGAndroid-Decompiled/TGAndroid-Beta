package sf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.p;
public final class a {
    public final SharedPreferences f42901a;
    public long f42902b;
    public long f42903c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f42901a = sharedPreferences;
        this.f42902b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f42903c == 0) {
            return;
        }
        this.f42902b = (((SystemClock.uptimeMillis() - this.f42903c) * (10 - b10)) / 10) + ((this.f42902b * p.b(this.d, 0, 9)) / 10);
        this.f42903c = 0L;
        this.d++;
        this.f42901a.edit().putLong("estimated", this.f42902b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f42902b > 0) {
            return p.a(((float) (SystemClock.uptimeMillis() - this.f42903c)) / ((float) this.f42902b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
