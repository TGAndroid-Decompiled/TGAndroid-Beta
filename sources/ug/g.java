package ug;

import android.view.View;
import f2.l;
import f2.o1;
import ig.m0;
import ig.q0;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.p30;
import org.telegram.ui.s50;

public final class g extends l {
    public final i F;

    public g(i iVar) {
        this.F = iVar;
    }

    @Override
    public final float A(View view) {
        return 0.6f;
    }

    @Override
    public final void w(o1 o1Var) {
        q0 q0Var;
        h hVar;
        i iVar = this.F;
        f fVar = iVar.Q0;
        int iB = o1Var.b();
        List list = fVar.f48654c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && iB >= 0 && iB < list.size()) {
            groupCallMessage = (GroupCallMessage) fVar.f48654c.get(iB);
        }
        if (groupCallMessage == null || (q0Var = groupCallMessage.visibleReaction) == null) {
            return;
        }
        View view = o1Var.f5789a;
        if (!(view instanceof d) || (hVar = iVar.V0) == null) {
            return;
        }
        s50 s50Var = ((p30) hVar).f41256a;
        m0 m0Var = new m0(s50Var.getContext(), null, s50Var.G, (d) view, null, 0.0f, 0.0f, q0Var, ((e3) s50Var).currentAccount, 1, false);
        m0.B = m0Var;
        m0Var.f11357i.setTag(R.id.parent_tag, 1);
        s50Var.container.addView(m0Var.f11357i);
        m0Var.f11367s = true;
        m0Var.f11372y = System.currentTimeMillis();
    }
}
