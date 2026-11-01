package ph;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.List;
import org.telegram.messenger.dd;
import org.telegram.messenger.u9;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.c7;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import w7.b6;
public final class c extends ha {
    public static final int S1 = 0;
    public final List P1;
    public final u9 Q1;
    public q51 R1;

    public c(Context context, p6 p6Var, u9 u9Var, List list) {
        super(context, null, false, false, 2, p6Var);
        this.Q1 = u9Var;
        this.P1 = list;
        this.f26730r1 = 0.2f;
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        this.l1.setTitle(O0());
        O();
        this.f26724k1.setPadding(this.f21616t0, org.telegram.messenger.i0.L(9.0f), this.f21616t0, org.telegram.messenger.i0.L(64.0f));
        this.f26724k1.setOnItemClickListener(new c7(3));
        this.f26724k1.setOverScrollMode(2);
        vh.d dVar = new vh.d(context, p6Var, true);
        dVar.setOnClickListener(new ag.g(this, 25));
        dVar.i(dd.L0(2131747847, null), false, true);
        FrameLayout.LayoutParams d = b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i10 = d.leftMargin;
        int i11 = this.f21616t0;
        d.leftMargin = i10 + i11;
        d.rightMargin += i11;
        this.f21587b.addView(dVar, d);
        this.R1.O(false);
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.f26724k1, getContext(), this.f21584a, 0, true, new ag.a(this, 20), this.I0);
        this.R1 = q51Var;
        q51Var.f29638r = false;
        return q51Var;
    }

    @Override
    public final CharSequence O0() {
        List list = this.P1;
        if (list == null) {
            return null;
        }
        return dd.G(list.size(), "Gift2AuctionsAcquiredGifts", new Object[0]);
    }
}
