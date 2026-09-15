package v0;

import android.os.Bundle;
import n7.a1;
public abstract class b {
    public final Bundle f43808a;
    public final Bundle f43809b;
    public final a1 f43810c;

    public b(Bundle bundle, Bundle bundle2, a1 a1Var) {
        this.f43808a = bundle;
        this.f43809b = bundle2;
        this.f43810c = a1Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
