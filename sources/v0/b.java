package v0;

import android.os.Bundle;
import mi.h0;
public abstract class b {
    public final Bundle f56422a;
    public final Bundle f56423b;
    public final h0 f56424c;

    public b(Bundle bundle, Bundle bundle2, h0 h0Var) {
        this.f56422a = bundle;
        this.f56423b = bundle2;
        this.f56424c = h0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
