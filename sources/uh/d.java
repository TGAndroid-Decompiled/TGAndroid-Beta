package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import s4.m0;
import zf.z;
public final class d extends m0 {
    public final z f46441a = new z(2);
    public final c6 f46442b;
    public final f f46443c;

    public d(f fVar, c6 c6Var) {
        this.f46443c = fVar;
        this.f46442b = c6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f46443c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f46452g0.getTranslationY()) + ((int) fVar.X.e));
        int w02 = g6.w0(g6.f19972h5, this.f46442b);
        z zVar = this.f46441a;
        zVar.b(w02);
        zVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        zVar.draw(canvas);
        fVar.R();
        fVar.S();
    }
}
