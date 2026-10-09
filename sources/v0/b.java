package v0;

import android.os.Bundle;
import n6.t;
public abstract class b {
    public final Bundle f49015a;
    public final Bundle f49016b;
    public final t f49017c;

    public b(Bundle bundle, Bundle bundle2, t tVar) {
        this.f49015a = bundle;
        this.f49016b = bundle2;
        this.f49017c = tVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
