package zh;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class u3 extends org.telegram.ui.Cells.p6 {
    public final v3 K;

    public u3(int i10, Context context, b bVar, v3 v3Var) {
        super(1, i10, context, bVar, false, true);
        this.K = v3Var;
    }

    @Override
    public final void b(long j3) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        u7 createOverlayStoryViewer = R.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.D(getContext(), j3, s5.a(this.K.d.f49142r));
    }
}
