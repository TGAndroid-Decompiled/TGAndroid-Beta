package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import s4.m0;
import zf.y;
public final class d extends m0 {
    public final y f48275a = new y(2);
    public final g6 f48276b;
    public final f f48277c;

    public d(f fVar, g6 g6Var) {
        this.f48277c = fVar;
        this.f48276b = g6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f48277c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f48286g0.getTranslationY()) + ((int) fVar.X.e));
        int w02 = k6.w0(k6.f21254h5, this.f48276b);
        y yVar = this.f48275a;
        yVar.b(w02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
