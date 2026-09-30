package sf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.q;
public final class a {
    public final SharedPreferences f43297a;
    public long f43298b;
    public long f43299c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f43297a = sharedPreferences;
        this.f43298b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f43299c == 0) {
            return;
        }
        this.f43298b = (((SystemClock.uptimeMillis() - this.f43299c) * (10 - b10)) / 10) + ((this.f43298b * q.b(this.d, 0, 9)) / 10);
        this.f43299c = 0L;
        this.d++;
        this.f43297a.edit().putLong("estimated", this.f43298b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f43298b > 0) {
            return q.a(((float) (SystemClock.uptimeMillis() - this.f43299c)) / ((float) this.f43298b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
