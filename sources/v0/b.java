package v0;

import android.os.Bundle;
import m4.w1;
public abstract class b {
    public final Bundle f49971a;
    public final Bundle f49972b;
    public final w1 f49973c;

    public b(Bundle bundle, Bundle bundle2, w1 w1Var) {
        this.f49971a = bundle;
        this.f49972b = bundle2;
        this.f49973c = w1Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
