package q6;

import a8.k8;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public abstract class m {
    public static final Object f55936a = new Object();
    public static boolean f55937b;
    public static int f55938c;

    public static void a(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void b(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(boolean z10, String str, Object... objArr) {
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void d(Handler handler) {
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
            e2.r(sb2, "Must be called on ", name, " thread, but got ", str);
            sb2.append(".");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public static void e(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void g(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void j(String str, boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void k(boolean z10) {
        if (z10) {
            return;
        }
        throw new IllegalStateException();
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static com.google.android.gms.common.api.f m(Status status) {
        if (status.f6199c != null) {
            return new com.google.android.gms.common.api.f(status);
        }
        return new com.google.android.gms.common.api.f(status);
    }

    public static Task n(k8 k8Var, l lVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k8Var.b(new v(k8Var, taskCompletionSource, lVar));
        return taskCompletionSource.getTask();
    }
}
