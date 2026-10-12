package tf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.n;
public final class a {
    public final SharedPreferences f48486a;
    public long f48487b;
    public long f48488c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f48486a = sharedPreferences;
        this.f48487b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f48488c == 0) {
            return;
        }
        this.f48487b = (((SystemClock.uptimeMillis() - this.f48488c) * (10 - b10)) / 10) + ((this.f48487b * n.b(this.d, 0, 9)) / 10);
        this.f48488c = 0L;
        this.d++;
        this.f48486a.edit().putLong("estimated", this.f48487b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f48487b > 0) {
            return n.a(((float) (SystemClock.uptimeMillis() - this.f48488c)) / ((float) this.f48487b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
