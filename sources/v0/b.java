package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f47871a;
    public final Bundle f47872b;
    public final mi.q f47873c;

    public b(Bundle bundle, Bundle bundle2, mi.q qVar) {
        this.f47871a = bundle;
        this.f47872b = bundle2;
        this.f47873c = qVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
