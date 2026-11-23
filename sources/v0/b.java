package v0;

import android.os.Bundle;
import tg.y;
public abstract class b {
    public final Bundle f59021a;
    public final Bundle f59022b;
    public final y f59023c;

    public b(Bundle bundle, Bundle bundle2, y yVar) {
        this.f59021a = bundle;
        this.f59022b = bundle2;
        this.f59023c = yVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
