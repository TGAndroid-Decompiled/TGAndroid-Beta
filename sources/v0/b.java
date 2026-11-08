package v0;

import android.os.Bundle;
import m4.d0;
public abstract class b {
    public final Bundle f56962a;
    public final Bundle f56963b;
    public final d0 f56964c;

    public b(Bundle bundle, Bundle bundle2, d0 d0Var) {
        this.f56962a = bundle;
        this.f56963b = bundle2;
        this.f56964c = d0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
