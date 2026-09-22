package v0;

import android.os.Bundle;
import org.telegram.ui.Cells.f3;
public abstract class b {
    public final Bundle f44128a;
    public final Bundle f44129b;
    public final f3 f44130c;

    public b(Bundle bundle, Bundle bundle2, f3 f3Var) {
        this.f44128a = bundle;
        this.f44129b = bundle2;
        this.f44130c = f3Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
