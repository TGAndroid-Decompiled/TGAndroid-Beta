package z7;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
public abstract class b {
    public static final b6.b f50782a;
    public static final e f50783b;

    static {
        ?? obj = new Object();
        b6.b bVar = new b6.b(18);
        f50782a = bVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        f50783b = new e("SignIn.API", bVar, obj);
    }
}
