package sf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.q;
public final class a {
    public final SharedPreferences f43224a;
    public long f43225b;
    public long f43226c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f43224a = sharedPreferences;
        this.f43225b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f43226c == 0) {
            return;
        }
        this.f43225b = (((SystemClock.uptimeMillis() - this.f43226c) * (10 - b10)) / 10) + ((this.f43225b * q.b(this.d, 0, 9)) / 10);
        this.f43226c = 0L;
        this.d++;
        this.f43224a.edit().putLong("estimated", this.f43225b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f43225b > 0) {
            return q.a(((float) (SystemClock.uptimeMillis() - this.f43226c)) / ((float) this.f43225b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
