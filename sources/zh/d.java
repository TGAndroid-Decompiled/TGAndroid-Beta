package zh;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ha;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.messenger.s9;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.f7;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
public final class d extends ma {
    public static final int V1 = 0;
    public final List S1;
    public final s9 T1;
    public m41 U1;

    public d(Context context, h6 h6Var, s9 s9Var, List list) {
        super(context, null, false, false, 2, h6Var);
        this.T1 = s9Var;
        this.S1 = list;
        this.f35908u1 = 0.2f;
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        this.f35902o1.setTitle(O0());
        N();
        this.n1.setPadding(this.f28705t0, org.telegram.messenger.g0.L(9.0f), this.f28705t0, org.telegram.messenger.g0.L(64.0f));
        this.n1.setOnItemClickListener(new f7(3));
        this.n1.setOverScrollMode(2);
        fi.d dVar = new fi.d(context, h6Var, true);
        dVar.setOnClickListener(new a(this, 0));
        dVar.i(id.M0(2131747831, null), false, true);
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f28705t0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f28672b.addView(dVar, d);
        this.U1.O(false);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.f28669a, 0, true, new hi.u1(this, 25), this.I0);
        this.U1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        List list = this.S1;
        if (list == null) {
            return null;
        }
        return id.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
