package r5;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class b {

    public final String f46768a;

    public final boolean f46769b;

    public final String f46770c;

    public b(String str, String str2) {
        y5.l.g(str, "The log tag cannot be null or empty.");
        this.f46768a = str;
        this.f46769b = str.length() <= 23;
        this.f46770c = TextUtils.isEmpty(str2) ? null : a9.p.m("[", str2, "] ");
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.f46769b) {
            return;
        }
        String str2 = this.f46768a;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, d(str, objArr), exc);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.f46769b) {
            return;
        }
        String str2 = this.f46768a;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, d(str, objArr));
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f46768a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f46770c;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return String.valueOf(str2).concat(String.valueOf(str));
    }
}
