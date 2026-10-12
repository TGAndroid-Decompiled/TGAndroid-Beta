package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f46462a;
    public final Bundle f46463b;
    public final m4.c f46464c;

    public b(Bundle bundle, Bundle bundle2, m4.c cVar) {
        this.f46462a = bundle;
        this.f46463b = bundle2;
        this.f46464c = cVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
