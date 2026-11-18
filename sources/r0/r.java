package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class r {
    public final q f56272a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f56272a = new p(nestedScrollView);
        } else {
            this.f56272a = new w7.s(22);
        }
    }
}
