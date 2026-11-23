package v0;

import android.os.Bundle;
import java.util.Set;
public abstract class h {
    public final String f59142a;
    public final Bundle f59143b;
    public final Bundle f59144c;
    public final Set d;

    public h(String str, Bundle bundle, Bundle bundle2, boolean z10, Set set) {
        this.f59142a = str;
        this.f59143b = bundle;
        this.f59144c = bundle2;
        this.d = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z10);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z10);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
    }
}
