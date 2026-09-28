package v0;

import android.os.Bundle;
import n7.z0;
public abstract class b {
    public final Bundle f44092a;
    public final Bundle f44093b;
    public final z0 f44094c;

    public b(Bundle bundle, Bundle bundle2, z0 z0Var) {
        this.f44092a = bundle;
        this.f44093b = bundle2;
        this.f44094c = z0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
