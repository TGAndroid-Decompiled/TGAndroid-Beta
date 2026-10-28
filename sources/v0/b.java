package v0;

import android.os.Bundle;
import m4.w1;
public abstract class b {
    public final Bundle f50006a;
    public final Bundle f50007b;
    public final w1 f50008c;

    public b(Bundle bundle, Bundle bundle2, w1 w1Var) {
        this.f50006a = bundle;
        this.f50007b = bundle2;
        this.f50008c = w1Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
