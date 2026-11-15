package v0;

import android.os.Bundle;
import tg.x;
public abstract class b {
    public final Bundle f58446a;
    public final Bundle f58447b;
    public final x f58448c;

    public b(Bundle bundle, Bundle bundle2, x xVar) {
        this.f58446a = bundle;
        this.f58447b = bundle2;
        this.f58448c = xVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
