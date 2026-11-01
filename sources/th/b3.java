package th;

import android.graphics.RectF;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.lw0;
public final class b3 implements Runnable {
    public final int f48813a;
    public final lw0 f48814b;

    public b3(lw0 lw0Var, int i10) {
        this.f48813a = i10;
        this.f48814b = lw0Var;
    }

    @Override
    public final void run() {
        int i10 = this.f48813a;
        lw0 lw0Var = this.f48814b;
        switch (i10) {
            case 0:
                int i11 = ProfileStoriesView.f34063s0;
                ProfileActivity profileActivity = lw0Var.f39396u0;
                RectF rectF = ProfileActivity.S6;
                profileActivity.K4(false);
                return;
            default:
                lw0Var.invalidate();
                return;
        }
    }
}
