package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import s4.n0;
import yf.y;
public final class d extends n0 {
    public final y f43537a = new y(2);
    public final d6 f43538b;
    public final f f43539c;

    public d(f fVar, d6 d6Var) {
        this.f43539c = fVar;
        this.f43538b = d6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f43539c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f43548g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = h6.v0(h6.f19129h5, this.f43538b);
        y yVar = this.f43537a;
        yVar.b(v02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
