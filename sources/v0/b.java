package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f47859a;
    public final Bundle f47860b;
    public final mi.q f47861c;

    public b(Bundle bundle, Bundle bundle2, mi.q qVar) {
        this.f47859a = bundle;
        this.f47860b = bundle2;
        this.f47861c = qVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
