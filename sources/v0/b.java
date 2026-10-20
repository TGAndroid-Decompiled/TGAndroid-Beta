package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f47856a;
    public final Bundle f47857b;
    public final mi.q f47858c;

    public b(Bundle bundle, Bundle bundle2, mi.q qVar) {
        this.f47856a = bundle;
        this.f47857b = bundle2;
        this.f47858c = qVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
