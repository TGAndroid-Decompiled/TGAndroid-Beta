package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import s4.n0;
import yf.y;
public final class d extends n0 {
    public final y f43584a = new y(2);
    public final e6 f43585b;
    public final f f43586c;

    public d(f fVar, e6 e6Var) {
        this.f43586c = fVar;
        this.f43585b = e6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f43586c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f43595g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = i6.v0(i6.f19128h5, this.f43585b);
        y yVar = this.f43584a;
        yVar.b(v02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
