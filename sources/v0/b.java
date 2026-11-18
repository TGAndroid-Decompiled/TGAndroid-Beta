package v0;

import android.os.Bundle;
import tg.x;
public abstract class b {
    public final Bundle f59013a;
    public final Bundle f59014b;
    public final x f59015c;

    public b(Bundle bundle, Bundle bundle2, x xVar) {
        this.f59013a = bundle;
        this.f59014b = bundle2;
        this.f59015c = xVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
