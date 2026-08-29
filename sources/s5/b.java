package s5;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f47580a;
    public final boolean f47581b;
    public final String f47582c;

    public b(String str, String str2) {
        boolean z10;
        String n10;
        z5.l.g(str, "The log tag cannot be null or empty.");
        this.f47580a = str;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47581b = z10;
        if (TextUtils.isEmpty(str2)) {
            n10 = null;
        } else {
            n10 = a4.w.n("[", str2, "] ");
        }
        this.f47582c = n10;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f47581b) {
            String str2 = this.f47580a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f47581b) {
            String str2 = this.f47580a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f47580a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f47582c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
