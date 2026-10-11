package tf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.o;
public final class a {
    public final SharedPreferences f48379a;
    public long f48380b;
    public long f48381c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f48379a = sharedPreferences;
        this.f48380b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f48381c == 0) {
            return;
        }
        this.f48380b = (((SystemClock.uptimeMillis() - this.f48381c) * (10 - b10)) / 10) + ((this.f48380b * o.b(this.d, 0, 9)) / 10);
        this.f48381c = 0L;
        this.d++;
        this.f48379a.edit().putLong("estimated", this.f48380b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f48380b > 0) {
            return o.a(((float) (SystemClock.uptimeMillis() - this.f48381c)) / ((float) this.f48380b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
