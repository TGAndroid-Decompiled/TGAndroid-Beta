package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f48297a;
    public final Bundle f48298b;
    public final mi.q f48299c;

    public b(Bundle bundle, Bundle bundle2, mi.q qVar) {
        this.f48297a = bundle;
        this.f48298b = bundle2;
        this.f48299c = qVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
