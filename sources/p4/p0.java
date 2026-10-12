package p4;

import android.os.Bundle;
import android.util.Log;
public final class p0 {
    public final q0 f45299a;

    public p0(q0 q0Var) {
        this.f45299a = q0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        q0 q0Var = this.f45299a;
        q0Var.f45301g = string;
        q0Var.h = bundle.getString("transferableTitle");
    }
}
