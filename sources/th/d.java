package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import s4.o0;
import yf.y;
public final class d extends o0 {
    public final y f48692a = new y(2);
    public final c6 f48693b;
    public final f f48694c;

    public d(f fVar, c6 c6Var) {
        this.f48694c = fVar;
        this.f48693b = c6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f48694c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f48703g0.getTranslationY()) + ((int) fVar.X.f16095e));
        int w02 = h6.w0(h6.f20630h5, this.f48693b);
        y yVar = this.f48692a;
        yVar.b(w02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.R();
        fVar.S();
    }
}
