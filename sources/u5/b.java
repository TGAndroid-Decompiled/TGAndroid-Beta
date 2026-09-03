package u5;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f45160a;
    public final boolean f45161b;
    public final String f45162c;

    public b(String str, String str2) {
        boolean z4;
        String o10;
        b6.m.g(str, "The log tag cannot be null or empty.");
        this.f45160a = str;
        if (str.length() <= 23) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f45161b = z4;
        if (TextUtils.isEmpty(str2)) {
            o10 = null;
        } else {
            o10 = android.support.v4.media.a.o("[", str2, "] ");
        }
        this.f45162c = o10;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f45161b) {
            String str2 = this.f45160a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f45161b) {
            String str2 = this.f45160a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f45160a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f45162c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
