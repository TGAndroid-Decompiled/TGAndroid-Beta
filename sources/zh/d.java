package zh;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ha;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.messenger.s9;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g7;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
public final class d extends na {
    public static final int S1 = 0;
    public final List P1;
    public final s9 Q1;
    public l41 R1;

    public d(Context context, f6 f6Var, s9 s9Var, List list) {
        super(context, null, false, false, 2, f6Var);
        this.Q1 = s9Var;
        this.P1 = list;
        this.f36282r1 = 0.2f;
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.l1.setTitle(O0());
        N();
        this.f36277k1.setPadding(this.f28649t0, org.telegram.messenger.g0.L(9.0f), this.f28649t0, org.telegram.messenger.g0.L(64.0f));
        this.f36277k1.setOnItemClickListener(new g7(3));
        this.f36277k1.setOverScrollMode(2);
        fi.d dVar = new fi.d(context, f6Var, true);
        dVar.setOnClickListener(new a(this, 0));
        dVar.i(id.M0(2131747832, null), false, true);
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f28649t0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f28619b.addView(dVar, d);
        this.R1.O(false);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.f36277k1, getContext(), this.f28616a, 0, true, new hi.u1(this, 25), this.I0);
        this.R1 = l41Var;
        l41Var.f35528r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        List list = this.P1;
        if (list == null) {
            return null;
        }
        return id.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
