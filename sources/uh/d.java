package uh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import yf.z;
public final class d extends n0 {
    public final z f47243a = new z(2);
    public final f6 f47244b;
    public final f f47245c;

    public d(f fVar, f6 f6Var) {
        this.f47245c = fVar;
        this.f47244b = f6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f47245c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f47254g0.getTranslationY()) + ((int) fVar.X.f15376e));
        int v02 = j6.v0(j6.f20735h5, this.f47244b);
        z zVar = this.f47243a;
        zVar.b(v02);
        zVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        zVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
