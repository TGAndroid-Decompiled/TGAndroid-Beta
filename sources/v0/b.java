package v0;

import android.os.Bundle;
import n7.z0;
public abstract class b {
    public final Bundle f44063a;
    public final Bundle f44064b;
    public final z0 f44065c;

    public b(Bundle bundle, Bundle bundle2, z0 z0Var) {
        this.f44063a = bundle;
        this.f44064b = bundle2;
        this.f44065c = z0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
