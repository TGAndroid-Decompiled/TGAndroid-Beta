package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f49136a;
    public final Bundle f49137b;
    public final n6.k f49138c;

    public b(Bundle bundle, Bundle bundle2, n6.k kVar) {
        this.f49136a = bundle;
        this.f49137b = bundle2;
        this.f49138c = kVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
