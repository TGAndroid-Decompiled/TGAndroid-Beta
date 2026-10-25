package v0;

import android.os.Bundle;
import m4.w1;
public abstract class b {
    public final Bundle f49968a;
    public final Bundle f49969b;
    public final w1 f49970c;

    public b(Bundle bundle, Bundle bundle2, w1 w1Var) {
        this.f49968a = bundle;
        this.f49969b = bundle2;
        this.f49970c = w1Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
