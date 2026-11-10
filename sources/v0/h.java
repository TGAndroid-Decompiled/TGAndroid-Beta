package v0;

import android.os.Bundle;
import java.util.Set;
public abstract class h {
    public final String f56975a;
    public final Bundle f56976b;
    public final Bundle f56977c;
    public final Set d;

    public h(String str, Bundle bundle, Bundle bundle2, boolean z9, Set set) {
        this.f56975a = str;
        this.f56976b = bundle;
        this.f56977c = bundle2;
        this.d = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z9);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z9);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
    }
}
