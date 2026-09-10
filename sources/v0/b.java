package v0;

import android.os.Bundle;
import og.u0;
public abstract class b {
    public final Bundle f42829a;
    public final Bundle f42830b;
    public final u0 f42831c;

    public b(Bundle bundle, Bundle bundle2, u0 u0Var) {
        this.f42829a = bundle;
        this.f42830b = bundle2;
        this.f42831c = u0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
