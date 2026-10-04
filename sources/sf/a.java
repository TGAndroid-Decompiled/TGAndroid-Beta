package sf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.q;
public final class a {
    public final SharedPreferences f46776a;
    public long f46777b;
    public long f46778c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f46776a = sharedPreferences;
        this.f46777b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f46778c == 0) {
            return;
        }
        this.f46777b = (((SystemClock.uptimeMillis() - this.f46778c) * (10 - b10)) / 10) + ((this.f46777b * q.b(this.d, 0, 9)) / 10);
        this.f46778c = 0L;
        this.d++;
        this.f46776a.edit().putLong("estimated", this.f46777b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f46777b > 0) {
            return q.a(((float) (SystemClock.uptimeMillis() - this.f46778c)) / ((float) this.f46777b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
