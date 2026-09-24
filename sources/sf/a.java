package sf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.q;
public final class a {
    public final SharedPreferences f43175a;
    public long f43176b;
    public long f43177c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f43175a = sharedPreferences;
        this.f43176b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f43177c == 0) {
            return;
        }
        this.f43176b = (((SystemClock.uptimeMillis() - this.f43177c) * (10 - b10)) / 10) + ((this.f43176b * q.b(this.d, 0, 9)) / 10);
        this.f43177c = 0L;
        this.d++;
        this.f43175a.edit().putLong("estimated", this.f43176b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f43176b > 0) {
            return q.a(((float) (SystemClock.uptimeMillis() - this.f43177c)) / ((float) this.f43176b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
