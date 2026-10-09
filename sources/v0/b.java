package v0;

import android.os.Bundle;
import n6.t;
public abstract class b {
    public final Bundle f49013a;
    public final Bundle f49014b;
    public final t f49015c;

    public b(Bundle bundle, Bundle bundle2, t tVar) {
        this.f49013a = bundle;
        this.f49014b = bundle2;
        this.f49015c = tVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
