package p4;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
public class x {
    public static final Object f55492b = new Object();
    public static final HashMap f55493c = new HashMap();
    public final e0 f55494a;

    public x(Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, w7.s sVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z10, boolean z11) {
        synchronized (f55492b) {
            HashMap hashMap = f55493c;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
        }
        this.f55494a = new e0(this, context, str, c1Var, i0Var, i0Var2, i0Var3, sVar, bundle, bundle2, dVar, z10, z11);
    }
}
