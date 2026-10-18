package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f47896a;
    public final Bundle f47897b;
    public final mi.q f47898c;

    public b(Bundle bundle, Bundle bundle2, mi.q qVar) {
        this.f47896a = bundle;
        this.f47897b = bundle2;
        this.f47898c = qVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
