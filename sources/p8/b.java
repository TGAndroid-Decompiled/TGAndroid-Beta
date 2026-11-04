package p8;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
public abstract class b {
    public static final a6.b f53426a;
    public static final e f53427b;

    static {
        ?? obj = new Object();
        a6.b bVar = new a6.b(11);
        f53426a = bVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        f53427b = new e("SignIn.API", bVar, obj);
    }
}
