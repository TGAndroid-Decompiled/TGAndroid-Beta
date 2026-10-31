package ph;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.messenger.cd;
import org.telegram.messenger.t9;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.c7;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import w7.b6;
public final class c extends ha {
    public static final int S1 = 0;
    public final List P1;
    public final t9 Q1;
    public p51 R1;

    public c(Context context, p6 p6Var, t9 t9Var, List list) {
        super(context, null, false, false, 2, p6Var);
        this.Q1 = t9Var;
        this.P1 = list;
        this.f26672r1 = 0.2f;
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.l1.setTitle(O0());
        O();
        this.f26666k1.setPadding(this.f21615t0, org.telegram.messenger.i0.L(9.0f), this.f21615t0, org.telegram.messenger.i0.L(64.0f));
        this.f26666k1.setOnItemClickListener(new c7(3));
        this.f26666k1.setOverScrollMode(2);
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.setOnClickListener(new ag.g(this, 25));
        dVar.i(cd.L0(2131747847, null), false, true);
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = d.leftMargin;
        int i11 = this.f21615t0;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.f21586b.addView(dVar, d);
        this.R1.O(false);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.f26666k1, getContext(), this.f21583a, 0, true, new ag.a(this, 20), this.I0);
        this.R1 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        List list = this.P1;
        if (list == null) {
            return null;
        }
        return cd.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
