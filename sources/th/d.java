package th;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import yf.y;
public final class d extends n0 {
    public final y f43553a = new y(2);
    public final f6 f43554b;
    public final f f43555c;

    public d(f fVar, f6 f6Var) {
        this.f43555c = fVar;
        this.f43554b = f6Var;
    }

    @Override
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f43555c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f43564g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = j6.v0(j6.f19165h5, this.f43554b);
        y yVar = this.f43553a;
        yVar.b(v02);
        yVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        yVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
