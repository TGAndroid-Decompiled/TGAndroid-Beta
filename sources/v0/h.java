package v0;

import android.os.Bundle;
import java.util.Set;
public abstract class h {
    public final String f59025a;
    public final Bundle f59026b;
    public final Bundle f59027c;
    public final Set d;

    public h(String str, Bundle bundle, Bundle bundle2, boolean z10, Set set) {
        this.f59025a = str;
        this.f59026b = bundle;
        this.f59027c = bundle2;
        this.d = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z10);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z10);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
    }
}
