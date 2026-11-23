package s4;

import android.os.Bundle;
import android.util.Log;
public final class o0 {
    public final p0 f57013a;

    public o0(p0 p0Var) {
        this.f57013a = p0Var;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        String string = bundle.getString("groupableTitle");
        p0 p0Var = this.f57013a;
        p0Var.f57019g = string;
        p0Var.h = bundle.getString("transferableTitle");
    }
}
