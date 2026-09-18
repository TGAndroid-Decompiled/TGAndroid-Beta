package v0;

import android.os.Bundle;
import n7.a1;
public abstract class b {
    public final Bundle f43836a;
    public final Bundle f43837b;
    public final a1 f43838c;

    public b(Bundle bundle, Bundle bundle2, a1 a1Var) {
        this.f43836a = bundle;
        this.f43837b = bundle2;
        this.f43838c = a1Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
