package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class r {
    public final q f54217a;

    public r(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f54217a = new p(nestedScrollView);
        } else {
            this.f54217a = new pb.b(22);
        }
    }
}
