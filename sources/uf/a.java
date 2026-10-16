package uf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import org.telegram.messenger.ApplicationLoader;
import w7.r;
public final class a {
    public final SharedPreferences f46245a;
    public long f46246b;
    public long f46247c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f46245a = sharedPreferences;
        this.f46246b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f46247c == 0) {
            return;
        }
        this.f46246b = (((SystemClock.uptimeMillis() - this.f46247c) * (10 - b10)) / 10) + ((this.f46246b * r.b(this.d, 0, 9)) / 10);
        this.f46247c = 0L;
        this.d++;
        this.f46245a.edit().putLong("estimated", this.f46246b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f46246b > 0) {
            return r.a(((float) (SystemClock.uptimeMillis() - this.f46247c)) / ((float) this.f46246b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
