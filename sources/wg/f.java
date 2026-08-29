package wg;

import android.content.Context;
import android.view.View;
import f2.l;
import f2.n1;
import java.util.List;
import kg.m0;
import kg.q0;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.p30;
import org.telegram.ui.r50;
public final class f extends l {
    public final h F;

    public f(h hVar) {
        this.F = hVar;
    }

    @Override
    public final float A(View view) {
        return 0.6f;
    }

    @Override
    public final void w(n1 n1Var) {
        q0 q0Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.Q0;
        int b10 = n1Var.b();
        List list = eVar.f49975c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f49975c.get(b10);
        }
        if (groupCallMessage != null && (q0Var = groupCallMessage.visibleReaction) != null) {
            View view = n1Var.f6432a;
            if ((view instanceof c) && (gVar = hVar.V0) != null) {
                r50 r50Var = ((p30) gVar).f41288a;
                Context context = r50Var.getContext();
                fk0 fk0Var = r50Var.G;
                i10 = ((f3) r50Var).currentAccount;
                m0 m0Var = new m0(context, null, fk0Var, (c) view, null, 0.0f, 0.0f, q0Var, i10, 1, false);
                m0.B = m0Var;
                m0Var.f13770i.setTag(R.id.parent_tag, 1);
                r50Var.container.addView(m0Var.f13770i);
                m0Var.f13780s = true;
                m0Var.f13785y = System.currentTimeMillis();
            }
        }
    }
}
