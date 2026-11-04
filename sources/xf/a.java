package xf;

import android.content.SharedPreferences;
import android.os.SystemClock;
import b8.be;
import org.telegram.messenger.t0;
public final class a {
    public final SharedPreferences f58621a;
    public long f58622b;
    public long f58623c;
    public int d;

    public a(String str) {
        SharedPreferences sharedPreferences = t0.f25457b.getSharedPreferences("pip_duration_".concat(str), 0);
        this.f58621a = sharedPreferences;
        this.f58622b = sharedPreferences.getLong("estimated", 400L);
        this.d = sharedPreferences.getInt("count", 0);
    }

    public final void a() {
        int b10;
        if (this.f58623c == 0) {
            return;
        }
        this.f58622b = (((SystemClock.uptimeMillis() - this.f58623c) * (10 - b10)) / 10) + ((this.f58622b * be.b(this.d, 0, 9)) / 10);
        this.f58623c = 0L;
        this.d++;
        this.f58621a.edit().putLong("estimated", this.f58622b).putInt("count", this.d).apply();
    }

    public final float b() {
        if (this.f58622b > 0) {
            return be.a(((float) (SystemClock.uptimeMillis() - this.f58623c)) / ((float) this.f58622b), 0.0f, 1.0f);
        }
        return 0.5f;
    }
}
