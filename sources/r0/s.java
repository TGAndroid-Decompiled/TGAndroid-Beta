package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f44753a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f44753a = new q(nestedScrollView);
        } else {
            this.f44753a = new qb.b(20);
        }
    }
}
