package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class r {
    public final q f56395a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f56395a = new p(nestedScrollView);
        } else {
            this.f56395a = new w7.s(22);
        }
    }
}
