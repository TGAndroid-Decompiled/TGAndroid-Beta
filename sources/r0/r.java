package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class r {
    public final q f56282a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f56282a = new p(nestedScrollView);
        } else {
            this.f56282a = new w7.s(22);
        }
    }
}
