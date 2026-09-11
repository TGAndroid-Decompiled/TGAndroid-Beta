package tf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.p;
public final class a {
    public final SharedPreferences f46482a;
    public long f46483b;
    public long f46484c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f46482a = sharedPreferences;
        this.f46483b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f46484c == 0) {
            return;
        }
        this.f46483b = (((SystemClock.uptimeMillis() - this.f46484c) * (10 - b10)) / 10) + ((this.f46483b * p.b(this.d, 0, 9)) / 10);
        this.f46484c = 0L;
        this.d++;
        this.f46482a.edit().putLong("estimated", this.f46483b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f46483b > 0) {
            return p.a(((float) (SystemClock.uptimeMillis() - this.f46484c)) / ((float) this.f46483b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
