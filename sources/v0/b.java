package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f48296a;
    public final Bundle f48297b;
    public final mi.q f48298c;

    public b(Bundle bundle, Bundle bundle2, mi.q qVar) {
        this.f48296a = bundle;
        this.f48297b = bundle2;
        this.f48298c = qVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
