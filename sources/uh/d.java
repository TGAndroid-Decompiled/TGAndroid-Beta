package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import s4.m0;
import zf.y;
public final class d extends m0 {
    public final y f47850a = new y(2);
    public final d6 f47851b;
    public final f f47852c;

    public d(f fVar, d6 d6Var) {
        this.f47852c = fVar;
        this.f47851b = d6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f47852c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f47861g0.getTranslationY()) + ((int) fVar.X.e));
        int w02 = h6.w0(h6.f21057h5, this.f47851b);
        y yVar = this.f47850a;
        yVar.b(w02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.R();
        fVar.S();
    }
}
