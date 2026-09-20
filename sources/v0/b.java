package v0;

import android.os.Bundle;
import org.telegram.ui.Cells.f3;
public abstract class b {
    public final Bundle f44107a;
    public final Bundle f44108b;
    public final f3 f44109c;

    public b(Bundle bundle, Bundle bundle2, f3 f3Var) {
        this.f44107a = bundle;
        this.f44108b = bundle2;
        this.f44109c = f3Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
