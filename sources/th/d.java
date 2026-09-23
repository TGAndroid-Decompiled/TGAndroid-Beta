package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import s4.n0;
import yf.y;
public final class d extends n0 {
    public final y f43205a = new y(2);
    public final d6 f43206b;
    public final f f43207c;

    public d(f fVar, d6 d6Var) {
        this.f43207c = fVar;
        this.f43206b = d6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f43207c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f43216g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = h6.v0(h6.f18859h5, this.f43206b);
        y yVar = this.f43205a;
        yVar.b(v02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
