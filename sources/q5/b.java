package q5;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
public final class b {
    public final String f46009a;
    public final boolean f46010b;
    public final String f46011c;

    public b(String str, String str2) {
        boolean z10;
        String o6;
        x5.l.g(str, "The log tag cannot be null or empty.");
        this.f46009a = str;
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f46010b = z10;
        if (TextUtils.isEmpty(str2)) {
            o6 = null;
        } else {
            o6 = aa.d.o("[", str2, "] ");
        }
        this.f46011c = o6;
    }

    public final void a(Exception exc, String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f46010b) {
            String str2 = this.f46009a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr), exc);
            }
        }
    }

    public final void b(String str, Object... objArr) {
        if (!Build.TYPE.equals("user") && this.f46010b) {
            String str2 = this.f46009a;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, d(str, objArr));
            }
        }
    }

    public final void c(Object... objArr) {
        Log.e(this.f46009a, d("Bundle is null", objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f46011c;
        if (!TextUtils.isEmpty(str2)) {
            return String.valueOf(str2).concat(String.valueOf(str));
        }
        return str;
    }
}
