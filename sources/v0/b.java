package v0;

import android.os.Bundle;
import tg.y;
public abstract class b {
    public final Bundle f59052a;
    public final Bundle f59053b;
    public final y f59054c;

    public b(Bundle bundle, Bundle bundle2, y yVar) {
        this.f59052a = bundle;
        this.f59053b = bundle2;
        this.f59054c = yVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
