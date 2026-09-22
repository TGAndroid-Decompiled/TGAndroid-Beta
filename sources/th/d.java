package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import yf.y;
public final class d extends n0 {
    public final y f43574a = new y(2);
    public final f6 f43575b;
    public final f f43576c;

    public d(f fVar, f6 f6Var) {
        this.f43576c = fVar;
        this.f43575b = f6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f43576c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f43585g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = j6.v0(j6.f19180h5, this.f43575b);
        y yVar = this.f43574a;
        yVar.b(v02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
