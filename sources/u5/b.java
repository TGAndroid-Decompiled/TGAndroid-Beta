package u5;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f48385a;
    public final boolean f48386b;
    public final String f48387c;

    public b(String str, String str2) {
        boolean z4;
        String o10;
        b6.m.g(str, "The log tag cannot be null or empty.");
        this.f48385a = str;
        if (str.length() <= 23) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f48386b = z4;
        if (TextUtils.isEmpty(str2)) {
            o10 = null;
        } else {
            o10 = android.support.v4.media.a.o("[", str2, "] ");
        }
        this.f48387c = o10;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f48386b) {
            String str2 = this.f48385a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f48386b) {
            String str2 = this.f48385a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f48385a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f48387c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
