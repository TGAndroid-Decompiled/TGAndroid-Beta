package p4;

import android.os.Bundle;
import android.util.Log;
public final class o0 {
    public final p0 f43909a;

    public o0(p0 p0Var) {
        this.f43909a = p0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        p0 p0Var = this.f43909a;
        p0Var.f43915g = string;
        p0Var.h = bundle.getString("transferableTitle");
    }
}
