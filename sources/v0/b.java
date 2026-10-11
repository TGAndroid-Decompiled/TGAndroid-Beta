package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f49102a;
    public final Bundle f49103b;
    public final n6.k f49104c;

    public b(Bundle bundle, Bundle bundle2, n6.k kVar) {
        this.f49102a = bundle;
        this.f49103b = bundle2;
        this.f49104c = kVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
