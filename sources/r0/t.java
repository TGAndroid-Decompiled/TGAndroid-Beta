package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class t {
    public final s f43142a;

    public t(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f43142a = new r(nestedScrollView);
        } else {
            this.f43142a = new ab.a(21);
        }
    }
}
