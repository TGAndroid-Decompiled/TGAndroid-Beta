package v0;

import android.os.Bundle;
import m2.t;
public abstract class b {
    public final Bundle f46461a;
    public final Bundle f46462b;
    public final t f46463c;

    public b(Bundle bundle, Bundle bundle2, t tVar) {
        this.f46461a = bundle;
        this.f46462b = bundle2;
        this.f46463c = tVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
