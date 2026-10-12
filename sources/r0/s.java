package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f47007a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f47007a = new q(nestedScrollView);
        } else {
            this.f47007a = new qb.b(20);
        }
    }
}
