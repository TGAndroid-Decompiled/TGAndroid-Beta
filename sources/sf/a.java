package sf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.p;
public final class a {
    public final SharedPreferences f42923a;
    public long f42924b;
    public long f42925c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f42923a = sharedPreferences;
        this.f42924b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f42925c == 0) {
            return;
        }
        this.f42924b = (((SystemClock.uptimeMillis() - this.f42925c) * (10 - b10)) / 10) + ((this.f42924b * p.b(this.d, 0, 9)) / 10);
        this.f42925c = 0L;
        this.d++;
        this.f42923a.edit().putLong("estimated", this.f42924b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f42924b > 0) {
            return p.a(((float) (SystemClock.uptimeMillis() - this.f42925c)) / ((float) this.f42924b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
