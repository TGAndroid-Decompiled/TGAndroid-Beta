package v0;

import android.os.Bundle;
import tg.y;
public abstract class b {
    public final Bundle f59056a;
    public final Bundle f59057b;
    public final y f59058c;

    public b(Bundle bundle, Bundle bundle2, y yVar) {
        this.f59056a = bundle;
        this.f59057b = bundle2;
        this.f59058c = yVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
