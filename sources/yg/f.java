package yg;

import android.content.Context;
import android.view.View;
import f2.l;
import f2.l1;
import java.util.List;
import mg.m0;
import mg.q0;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.b40;
import org.telegram.ui.c60;
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
    public final void w(l1 l1Var) {
        q0 q0Var;
        g gVar;
        int i10;
        h hVar = this.F;
        e eVar = hVar.R0;
        int b10 = l1Var.b();
        List list = eVar.f47266c;
        GroupCallMessage groupCallMessage = null;
        if (list != null && b10 >= 0 && b10 < list.size()) {
            groupCallMessage = (GroupCallMessage) eVar.f47266c.get(b10);
        }
        if (groupCallMessage != null && (q0Var = groupCallMessage.visibleReaction) != null) {
            View view = l1Var.f5785a;
            if ((view instanceof c) && (gVar = hVar.W0) != null) {
                c60 c60Var = ((b40) gVar).f32787a;
                Context context = c60Var.getContext();
                pk0 pk0Var = c60Var.H;
                i10 = ((g3) c60Var).currentAccount;
                m0 m0Var = new m0(context, null, pk0Var, (c) view, null, 0.0f, 0.0f, q0Var, i10, 1, false);
                m0.B = m0Var;
                m0Var.f14053i.setTag(R.id.parent_tag, 1);
                c60Var.container.addView(m0Var.f14053i);
                m0Var.f14063s = true;
                m0Var.f14068y = System.currentTimeMillis();
            }
        }
    }
}
