package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import yf.y;
public final class d extends n0 {
    public final y f43277a = new y(2);
    public final f6 f43278b;
    public final f f43279c;

    public d(f fVar, f6 f6Var) {
        this.f43279c = fVar;
        this.f43278b = f6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f43279c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f43288g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = j6.v0(j6.f18933h5, this.f43278b);
        y yVar = this.f43277a;
        yVar.b(v02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
