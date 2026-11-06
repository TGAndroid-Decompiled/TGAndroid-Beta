package v0;

import android.os.Bundle;
import m4.d0;
public abstract class b {
    public final Bundle f56871a;
    public final Bundle f56872b;
    public final d0 f56873c;

    public b(Bundle bundle, Bundle bundle2, d0 d0Var) {
        this.f56871a = bundle;
        this.f56872b = bundle2;
        this.f56873c = d0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
