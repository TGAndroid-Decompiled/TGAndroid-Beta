package v0;

import android.os.Bundle;
import n7.z0;
public abstract class b {
    public final Bundle f47757a;
    public final Bundle f47758b;
    public final z0 f47759c;

    public b(Bundle bundle, Bundle bundle2, z0 z0Var) {
        this.f47757a = bundle;
        this.f47758b = bundle2;
        this.f47759c = z0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
