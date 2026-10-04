package sf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.q;
public final class a {
    public final SharedPreferences f46775a;
    public long f46776b;
    public long f46777c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f46775a = sharedPreferences;
        this.f46776b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f46777c == 0) {
            return;
        }
        this.f46776b = (((SystemClock.uptimeMillis() - this.f46777c) * (10 - b10)) / 10) + ((this.f46776b * q.b(this.d, 0, 9)) / 10);
        this.f46777c = 0L;
        this.d++;
        this.f46775a.edit().putLong("estimated", this.f46776b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f46776b > 0) {
            return q.a(((float) (SystemClock.uptimeMillis() - this.f46777c)) / ((float) this.f46776b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
