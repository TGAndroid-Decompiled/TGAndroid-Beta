package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import s4.m0;
import zf.y;
public final class d extends m0 {
    public final y f48274a = new y(2);
    public final g6 f48275b;
    public final f f48276c;

    public d(f fVar, g6 g6Var) {
        this.f48276c = fVar;
        this.f48275b = g6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f48276c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f48285g0.getTranslationY()) + ((int) fVar.X.e));
        int w02 = k6.w0(k6.f21255h5, this.f48275b);
        y yVar = this.f48274a;
        yVar.b(w02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
