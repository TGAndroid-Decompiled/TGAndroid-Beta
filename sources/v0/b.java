package v0;

import android.os.Bundle;
import q5.g0;
public abstract class b {
    public final Bundle f45539a;
    public final Bundle f45540b;
    public final g0 f45541c;

    public b(Bundle bundle, Bundle bundle2, g0 g0Var) {
        this.f45539a = bundle;
        this.f45540b = bundle2;
        this.f45541c = g0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
