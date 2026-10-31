package th;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.mw0;
public final class b3 implements Runnable {
    public final int f48799a;
    public final mw0 f48800b;

    public b3(mw0 mw0Var, int i10) {
        this.f48799a = i10;
        this.f48800b = mw0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f48799a;
        mw0 mw0Var = this.f48800b;
        switch (i10) {
            case 0:
                int i11 = ProfileStoriesView.f34056s0;
                ProfileActivity profileActivity = mw0Var.f39786u0;
                RectF rectF = ProfileActivity.R6;
                profileActivity.J4(false);
                return;
            default:
                mw0Var.invalidate();
                return;
        }
    }
}
