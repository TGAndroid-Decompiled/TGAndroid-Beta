package r0;

import android.os.Build;
import androidx.core.widget.NestedScrollView;
public final class s {
    public final r f47128a;

    public s(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f47128a = new q(nestedScrollView);
        } else {
            this.f47128a = new sb.b(20);
        }
    }
}
