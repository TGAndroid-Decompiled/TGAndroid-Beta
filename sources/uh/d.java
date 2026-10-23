package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import s4.m0;
import zf.y;
public final class d extends m0 {
    public final y f47839a = new y(2);
    public final d6 f47840b;
    public final f f47841c;

    public d(f fVar, d6 d6Var) {
        this.f47841c = fVar;
        this.f47840b = d6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f47841c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f47850g0.getTranslationY()) + ((int) fVar.X.e));
        int w02 = h6.w0(h6.f21065h5, this.f47840b);
        y yVar = this.f47839a;
        yVar.b(w02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.R();
        fVar.S();
    }
}
