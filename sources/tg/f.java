package tg;

import android.graphics.RenderNode;
import android.view.View;
import android.view.ViewGroup;
import f2.q1;
import org.telegram.messenger.AndroidUtilities;
public final class f extends e {
    public final i h;

    public f(i iVar) {
        this.h = iVar;
        this.f47933e = -1;
    }

    @Override
    public final q1 x(ViewGroup viewGroup, int i9) {
        d dVar = new d(viewGroup.getContext());
        dVar.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
        c cVar = new c(dVar);
        i iVar = this.h;
        View view = iVar.U0;
        RenderNode renderNode = iVar.S0;
        float f10 = iVar.T0;
        d dVar2 = cVar.v;
        dVar2.C = view;
        dVar2.A = renderNode;
        dVar2.B = f10;
        dVar2.setDelegate(iVar.W0);
        return cVar;
    }
}
