package v0;

import android.os.Bundle;
import org.telegram.ui.Cells.e3;
public abstract class b {
    public final Bundle f48230a;
    public final Bundle f48231b;
    public final e3 f48232c;

    public b(Bundle bundle, Bundle bundle2, e3 e3Var) {
        this.f48230a = bundle;
        this.f48231b = bundle2;
        this.f48232c = e3Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
