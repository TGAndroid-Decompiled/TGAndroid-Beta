package v0;

import android.os.Bundle;
public abstract class b {
    public final Bundle f59138a;
    public final Bundle f59139b;
    public final t1.a f59140c;

    public b(Bundle bundle, Bundle bundle2, t1.a aVar) {
        this.f59138a = bundle;
        this.f59139b = bundle2;
        this.f59140c = aVar;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
