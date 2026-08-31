package v0;

import android.os.Bundle;
import q5.g0;
public abstract class b {
    public final Bundle f48829a;
    public final Bundle f48830b;
    public final g0 f48831c;

    public b(Bundle bundle, Bundle bundle2, g0 g0Var) {
        this.f48829a = bundle;
        this.f48830b = bundle2;
        this.f48831c = g0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
