package vh;

import ag.h0;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import s4.n0;
public final class d extends n0 {
    public final h0 f50343a = new h0(2);
    public final u6 f50344b;
    public final f f50345c;

    public d(f fVar, u6 u6Var) {
        this.f50345c = fVar;
        this.f50344b = u6Var;
    }

    @Override
    public final void g(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f50345c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f50354g0.getTranslationY()) + ((int) fVar.X.f19333f));
        int w02 = y6.w0(y6.f23428h5, this.f50344b);
        h0 h0Var = this.f50343a;
        h0Var.b(w02);
        h0Var.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        h0Var.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
