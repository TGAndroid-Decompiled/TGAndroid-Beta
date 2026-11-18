package v0;

import android.os.Bundle;
import tg.x;
public abstract class b {
    public final Bundle f59014a;
    public final Bundle f59015b;
    public final x f59016c;

    public b(Bundle bundle, Bundle bundle2, x xVar) {
        this.f59014a = bundle;
        this.f59015b = bundle2;
        this.f59016c = xVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
