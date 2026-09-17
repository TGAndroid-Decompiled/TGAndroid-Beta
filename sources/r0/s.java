package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f44726a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f44726a = new q(nestedScrollView);
        } else {
            this.f44726a = new qb.b(20);
        }
    }
}
