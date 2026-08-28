package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class t {
    public final s f46943a;

    public t(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f46943a = new r(nestedScrollView);
        } else {
            this.f46943a = new d7.u(22);
        }
    }
}
