package y7;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;

public abstract class b {

    public static final a6.b f49799a;

    public static final e f49800b;

    static {
        d dVar = new d();
        a6.b bVar = new a6.b(18);
        f49799a = bVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        f49800b = new e("SignIn.API", bVar, dVar);
    }
}
