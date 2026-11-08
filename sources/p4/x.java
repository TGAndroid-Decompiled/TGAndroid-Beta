package p4;

import android.content.Context;
import android.os.Bundle;
import java.util.HashMap;
public class x {
    public static final Object f53461b = new Object();
    public static final HashMap f53462c = new HashMap();
    public final d0 f53463a;

    public x(Context context, String str, e2.c1 c1Var, h9.i0 i0Var, h9.i0 i0Var2, h9.i0 i0Var3, pb.b bVar, Bundle bundle, Bundle bundle2, h2.d dVar, boolean z9, boolean z10) {
        synchronized (f53461b) {
            HashMap hashMap = f53462c;
            if (!hashMap.containsKey(str)) {
                hashMap.put(str, this);
            } else {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
        }
        this.f53463a = new d0(this, context, str, c1Var, i0Var, i0Var2, i0Var3, bVar, bundle, bundle2, dVar, z9, z10);
    }
}
