package v0;

import android.os.Bundle;
import org.telegram.ui.i6;

public abstract class b {

    public final Bundle f48657a;

    public final Bundle f48658b;

    public final i6 f48659c;

    public b(Bundle bundle, Bundle bundle2, i6 i6Var) {
        this.f48657a = bundle;
        this.f48658b = bundle2;
        this.f48659c = i6Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
