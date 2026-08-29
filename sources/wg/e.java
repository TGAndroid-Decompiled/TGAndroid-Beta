package wg;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import f2.n1;
import org.telegram.messenger.AndroidUtilities;
public final class e extends d {
    public final h h;

    public e(h hVar) {
        this.h = hVar;
        this.f49976e = -1;
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.U0;
        RenderNode renderNode = hVar.S0;
        float f9 = hVar.T0;
        c cVar2 = bVar.v;
        cVar2.C = view;
        cVar2.A = renderNode;
        cVar2.B = f9;
        cVar2.setDelegate(hVar.W0);
        return bVar;
    }
}
