package zh;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.messenger.s9;
import org.telegram.messenger.u9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.x31;
public final class f extends ma implements u9 {
    public final x31 S1;
    public final LongSparseArray T1;
    public ArrayList U1;
    public boolean V1;
    public m41 W1;
    public int X1;

    public f(Context context) {
        super(context, null, false, false, 2, null);
        int i7 = 0;
        this.T1 = new LongSparseArray();
        this.U1 = new ArrayList();
        int x02 = m6.x0(null, m6.f27834a7, false);
        this.X1 = x02;
        v0(x02);
        w9.c(this.f28669a).f26285f.add(this);
        this.F1 = false;
        this.E1 = org.telegram.messenger.g0.L(12.0f);
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.S1 = x31.j(-1, linearLayout);
        this.n1.setPadding(this.f28705t0, org.telegram.messenger.g0.L(9.0f), this.f28705t0, org.telegram.messenger.g0.L(9.0f));
        this.n1.setOverScrollMode(2);
        this.W1.O(false);
        ArrayList arrayList = w9.c(this.f28669a).f26283c;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s9 s9Var = (s9) obj;
            e eVar = new e(context, s9Var);
            eVar.f60308a.setOnClickListener(new td0(this, context, s9Var, 4));
            linearLayout.addView(eVar, ha.o(-1, -2));
            this.T1.put(s9Var.f25439b, eVar);
        }
        g(arrayList);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        m41 m41Var = new m41(this.n1, getContext(), this.f28669a, 0, true, new hi.u1(this, 26), this.I0);
        this.W1 = m41Var;
        m41Var.f35845r = false;
        return m41Var;
    }

    @Override
    public final CharSequence O0() {
        ArrayList arrayList = this.U1;
        if (arrayList == null) {
            return null;
        }
        return id.a0(null, null, 2131750418, Integer.valueOf(arrayList.size()));
    }

    @Override
    public final void dismiss() {
        w9.c(this.f28669a).f26285f.remove(this);
        super.dismiss();
    }

    @Override
    public final void g(ArrayList arrayList) {
        int i7;
        this.U1 = new ArrayList(arrayList);
        this.f35902o1.setTitle(O0());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s9 s9Var = (s9) obj;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = s9Var.f25442f;
            if (tL_starGiftAuctionState != null) {
                i7 = tL_starGiftAuctionState.next_round_at;
            } else {
                i7 = 0;
            }
            e eVar = (e) this.T1.get(s9Var.f25439b);
            if (eVar != null) {
                eVar.b(this.V1);
                long max = Math.max(0, i7 - ConnectionsManager.getInstance(this.f28669a).getCurrentTime());
                eVar.a(max, this.V1);
                eVar.f60312f.a(max);
            }
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = m6.x0(null, m6.f27834a7, false);
            if (x02 != this.X1) {
                this.X1 = x02;
                v0(x02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.V1 = true;
    }
}
