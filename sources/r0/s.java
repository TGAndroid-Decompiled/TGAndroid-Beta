package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f41867a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f41867a = new q(nestedScrollView);
        } else {
            this.f41867a = new ob.a(20);
        }
    }
}
