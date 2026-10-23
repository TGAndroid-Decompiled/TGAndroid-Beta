package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f47860a;
    public final Bundle f47861b;
    public final mi.q f47862c;

    public b(Bundle bundle, Bundle bundle2, mi.q qVar) {
        this.f47860a = bundle;
        this.f47861b = bundle2;
        this.f47862c = qVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
