package v0;

import android.os.Bundle;
import n6.t;
public abstract class b {
    public final Bundle f49059a;
    public final Bundle f49060b;
    public final t f49061c;

    public b(Bundle bundle, Bundle bundle2, t tVar) {
        this.f49059a = bundle;
        this.f49060b = bundle2;
        this.f49061c = tVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
