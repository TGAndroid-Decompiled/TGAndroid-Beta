package yg;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import f2.l1;
import org.telegram.messenger.AndroidUtilities;
public final class e extends d {
    public final h h;

    public e(h hVar) {
        this.h = hVar;
        this.e = -1;
    }

    @Override
    public final l1 x(ViewGroup viewGroup, int i10) {
        c cVar = new c(viewGroup.getContext());
        cVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        b bVar = new b(cVar);
        h hVar = this.h;
        View view = hVar.V0;
        RenderNode renderNode = hVar.T0;
        float f10 = hVar.U0;
        c cVar2 = bVar.v;
        cVar2.D = view;
        cVar2.B = renderNode;
        cVar2.C = f10;
        cVar2.setDelegate(hVar.X0);
        return bVar;
    }
}
