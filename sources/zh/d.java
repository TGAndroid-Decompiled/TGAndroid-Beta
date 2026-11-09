package zh;

import android.content.Context;
import android.widget.FrameLayout;
import c8.ha;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.messenger.s9;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g7;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
public final class d extends na {
    public static final int S1 = 0;
    public final List P1;
    public final s9 Q1;
    public m41 R1;

    public d(Context context, g6 g6Var, s9 s9Var, List list) {
        super(context, null, false, false, 2, g6Var);
        this.Q1 = s9Var;
        this.P1 = list;
        this.f36308r1 = 0.2f;
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        this.l1.setTitle(O0());
        N();
        this.f36303k1.setPadding(this.f28654t0, org.telegram.messenger.g0.L(9.0f), this.f28654t0, org.telegram.messenger.g0.L(64.0f));
        this.f36303k1.setOnItemClickListener(new g7(3));
        this.f36303k1.setOverScrollMode(2);
        fi.d dVar = new fi.d(context, g6Var, true);
        dVar.setOnClickListener(new a(this, 0));
        dVar.i(id.M0(2131747831, null), false, true);
        FrameLayout.LayoutParams d = ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i7 = d.leftMargin;
        int i10 = this.f28654t0;
        d.leftMargin = i7 + i10;
        d.rightMargin += i10;
        this.f28624b.addView(dVar, d);
        this.R1.O(false);
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        m41 m41Var = new m41(this.f36303k1, getContext(), this.f28621a, 0, true, new hi.u1(this, 25), this.I0);
        this.R1 = m41Var;
        m41Var.f35945r = false;
        return m41Var;
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
