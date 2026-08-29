package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f49307a;
    public final Bundle f49308b;
    public final oc.i f49309c;

    public b(Bundle bundle, Bundle bundle2, oc.i iVar) {
        this.f49307a = bundle;
        this.f49308b = bundle2;
        this.f49309c = iVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
