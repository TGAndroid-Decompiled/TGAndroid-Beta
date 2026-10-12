package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f49251a;
    public final Bundle f49252b;
    public final n6.k f49253c;

    public b(Bundle bundle, Bundle bundle2, n6.k kVar) {
        this.f49251a = bundle;
        this.f49252b = bundle2;
        this.f49253c = kVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
