package v0;

import android.os.Bundle;
import q5.c0;
public abstract class b {
    public final Bundle f45603a;
    public final Bundle f45604b;
    public final c0 f45605c;

    public b(Bundle bundle, Bundle bundle2, c0 c0Var) {
        this.f45603a = bundle;
        this.f45604b = bundle2;
        this.f45605c = c0Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
