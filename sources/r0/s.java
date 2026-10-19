package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f44840a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f44840a = new q(nestedScrollView);
        } else {
            this.f44840a = new pb.a(20);
        }
    }
}
