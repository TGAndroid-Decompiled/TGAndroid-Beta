package tg;

import android.content.Context;
import android.view.View;
import f2.n;
import f2.q1;
import hg.n0;
import hg.r0;
import java.util.List;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.m30;
import org.telegram.ui.o50;
public final class g extends n {
    public final i F;

    public g(i iVar) {
        this.F = iVar;
    }

    @Override
    public final float A(View view) {
        return 0.6f;
    }

    @Override
    public final void w(q1 q1Var) {
        r0 r0Var;
        h hVar;
        int i9;
        i iVar = this.F;
        f fVar = iVar.Q0;
        int b10 = q1Var.b();
        List list = fVar.f47932c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) fVar.f47932c.get(b10);
        }
        if (groupCallMessage != null && (r0Var = groupCallMessage.visibleReaction) != null) {
            View view = q1Var.f5501a;
            if ((view instanceof d) && (hVar = iVar.V0) != null) {
                o50 o50Var = ((m30) hVar).f40313a;
                Context context = o50Var.getContext();
                uj0 uj0Var = o50Var.G;
                i9 = ((f3) o50Var).currentAccount;
                n0 n0Var = new n0(context, null, uj0Var, (d) view, null, 0.0f, 0.0f, r0Var, i9, 1, false);
                n0.B = n0Var;
                n0Var.f10662i.setTag(R.id.parent_tag, 1);
                o50Var.container.addView(n0Var.f10662i);
                n0Var.f10672s = true;
                n0Var.f10677y = System.currentTimeMillis();
            }
        }
    }
}
