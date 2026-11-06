package zh;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ha;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.s9;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.g7;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
public final class d extends na {
    public static final int S1 = 0;
    public final List P1;
    public final s9 Q1;
    public f41 R1;

    public d(Context context, f6 f6Var, s9 s9Var, List list) {
        super(context, null, false, false, 2, f6Var);
        this.Q1 = s9Var;
        this.P1 = list;
        this.f36333r1 = 0.2f;
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.l1.setTitle(O0());
        N();
        this.f36328k1.setPadding(this.f28645t0, org.telegram.messenger.g0.L(9.0f), this.f28645t0, org.telegram.messenger.g0.L(64.0f));
        this.f36328k1.setOnItemClickListener(new g7(3));
        this.f36328k1.setOverScrollMode(2);
        fi.d dVar = new fi.d(context, f6Var, true);
        dVar.setOnClickListener(new a(this, 0));
        dVar.i(hd.M0(2131747830, null), false, true);
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f28645t0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f28615b.addView(dVar, d);
        this.R1.O(false);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        f41 f41Var = new f41(this.f36328k1, getContext(), this.f28612a, 0, true, new hi.u1(this, 25), this.I0);
        this.R1 = f41Var;
        f41Var.f33473r = false;
        return f41Var;
    }

    @Override
    public final CharSequence O0() {
        List list = this.P1;
        if (list == null) {
            return null;
        }
        return hd.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
