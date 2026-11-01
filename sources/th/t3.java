package th;

import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class t3 extends org.telegram.ui.Cells.q6 {
    public final u3 L;

    public t3(int i10, Context context, b bVar, u3 u3Var) {
        super(1, i10, context, bVar, false, true);
        this.L = u3Var;
    }

    @Override
    public final void b(long j10) {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        o7 createOverlayStoryViewer = Q.createOverlayStoryViewer();
        createOverlayStoryViewer.getClass();
        createOverlayStoryViewer.R(getContext(), j10, n5.a(this.L.d.f49689r));
    }
}
