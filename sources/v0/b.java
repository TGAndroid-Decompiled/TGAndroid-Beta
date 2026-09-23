package v0;

import android.os.Bundle;
import n7.a1;
public abstract class b {
    public final Bundle f43757a;
    public final Bundle f43758b;
    public final a1 f43759c;

    public b(Bundle bundle, Bundle bundle2, a1 a1Var) {
        this.f43757a = bundle;
        this.f43758b = bundle2;
        this.f43759c = a1Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
