package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import s4.m0;
import zf.y;
public final class d extends m0 {
    public final y f47830a = new y(2);
    public final d6 f47831b;
    public final f f47832c;

    public d(f fVar, d6 d6Var) {
        this.f47832c = fVar;
        this.f47831b = d6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f47832c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f47841g0.getTranslationY()) + ((int) fVar.X.e));
        int w02 = h6.w0(h6.f21058h5, this.f47831b);
        y yVar = this.f47830a;
        yVar.b(w02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.R();
        fVar.S();
    }
}
