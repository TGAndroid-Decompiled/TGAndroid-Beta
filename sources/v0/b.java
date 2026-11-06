package v0;

import android.os.Bundle;
import m4.d0;
public abstract class b {
    public final Bundle f56870a;
    public final Bundle f56871b;
    public final d0 f56872c;

    public b(Bundle bundle, Bundle bundle2, d0 d0Var) {
        this.f56870a = bundle;
        this.f56871b = bundle2;
        this.f56872c = d0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
