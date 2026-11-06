package q6;

import a8.j8;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class m {
    public static final Object f53821a = new Object();
    public static boolean f53822b;
    public static int f53823c;

    public static void a(String str, boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void b(boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            int length = String.valueOf(name).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + length + 35 + 1);
            com.google.android.recaptcha.internal.a.s(sb2, "Must be called on ", name, " thread, but got ", str);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static void d(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void f(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void g(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static void h(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void i(String str, boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void j(boolean z9) {
        if (z9) {
            return;
        }
        throw new IllegalStateException();
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static com.google.android.gms.common.api.f l(Status status) {
        if (status.f6531c != null) {
            return new com.google.android.gms.common.api.f(status);
        }
        return new com.google.android.gms.common.api.f(status);
    }

    public static Task m(j8 j8Var, l lVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        j8Var.b(new v(j8Var, taskCompletionSource, lVar));
        return taskCompletionSource.getTask();
    }
}
