package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f41086a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f41086a = new q(nestedScrollView);
        } else {
            this.f41086a = new ob.a(20);
        }
    }
}
