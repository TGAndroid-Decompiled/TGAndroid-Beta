package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f50283a;
    public final Bundle f50284b;
    public final m5.e f50285c;

    public b(Bundle bundle, Bundle bundle2, m5.e eVar) {
        this.f50283a = bundle;
        this.f50284b = bundle2;
        this.f50285c = eVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
