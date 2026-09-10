package sh;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import s4.n0;
import xf.z;
public final class d extends n0 {
    public final z f42039a = new z(2);
    public final f6 f42040b;
    public final f f42041c;

    public d(f fVar, f6 f6Var) {
        this.f42041c = fVar;
        this.f42040b = f6Var;
    }

    @Override
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        f fVar = this.f42041c;
        int max = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) fVar.f42050g0.getTranslationY()) + ((int) fVar.X.e));
        int v02 = j6.v0(j6.f17998h5, this.f42040b);
        z zVar = this.f42039a;
        zVar.b(v02);
        zVar.setBounds(0, max, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + max);
        zVar.draw(canvas);
        fVar.Q();
        fVar.R();
    }
}
