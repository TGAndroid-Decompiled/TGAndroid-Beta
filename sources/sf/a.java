package sf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.p;
public final class a {
    public final SharedPreferences f42897a;
    public long f42898b;
    public long f42899c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f42897a = sharedPreferences;
        this.f42898b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f42899c == 0) {
            return;
        }
        this.f42898b = (((SystemClock.uptimeMillis() - this.f42899c) * (10 - b10)) / 10) + ((this.f42898b * p.b(this.d, 0, 9)) / 10);
        this.f42899c = 0L;
        this.d++;
        this.f42897a.edit().putLong("estimated", this.f42898b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f42898b > 0) {
            return p.a(((float) (SystemClock.uptimeMillis() - this.f42899c)) / ((float) this.f42898b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
