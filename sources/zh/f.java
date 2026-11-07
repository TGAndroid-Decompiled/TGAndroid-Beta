package zh;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.s9;
import org.telegram.messenger.u9;
import org.telegram.messenger.w9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.x31;
public final class f extends na implements u9 {
    public final x31 P1;
    public final LongSparseArray Q1;
    public ArrayList R1;
    public boolean S1;
    public l41 T1;
    public int U1;

    public f(Context context) {
        super(context, null, false, false, 2, null);
        int i7 = 0;
        this.Q1 = new LongSparseArray();
        this.R1 = new ArrayList();
        int x02 = k6.x0(null, k6.f27793a7, false);
        this.U1 = x02;
        v0(x02);
        w9.c(this.f28613a).f26278f.add(this);
        this.C1 = false;
        this.B1 = org.telegram.messenger.g0.L(12.0f);
        N();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.P1 = x31.j(-1, linearLayout);
        this.f36261k1.setPadding(this.f28646t0, org.telegram.messenger.g0.L(9.0f), this.f28646t0, org.telegram.messenger.g0.L(9.0f));
        this.f36261k1.setOverScrollMode(2);
        this.T1.O(false);
        ArrayList arrayList = w9.c(this.f28613a).f26276c;
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s9 s9Var = (s9) obj;
            e eVar = new e(context, s9Var);
            eVar.f60197a.setOnClickListener(new td0(this, context, s9Var, 4));
            linearLayout.addView(eVar, ha.o(-1, -2));
            this.Q1.put(s9Var.f25439b, eVar);
        }
        g(arrayList);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        l41 l41Var = new l41(this.f36261k1, getContext(), this.f28613a, 0, true, new hi.u1(this, 26), this.I0);
        this.T1 = l41Var;
        l41Var.f35510r = false;
        return l41Var;
    }

    @Override
    public final CharSequence O0() {
        ArrayList arrayList = this.R1;
        if (arrayList == null) {
            return null;
        }
        return hd.a0(null, null, 2131750417, Integer.valueOf(arrayList.size()));
    }

    @Override
    public final void dismiss() {
        w9.c(this.f28613a).f26278f.remove(this);
        super.dismiss();
    }

    @Override
    public final void g(ArrayList arrayList) {
        int i7;
        this.R1 = new ArrayList(arrayList);
        this.l1.setTitle(O0());
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
            e eVar = (e) this.Q1.get(s9Var.f25439b);
            if (eVar != null) {
                eVar.b(this.S1);
                long max = Math.max(0, i7 - ConnectionsManager.getInstance(this.f28613a).getCurrentTime());
                eVar.a(max, this.S1);
                eVar.f60201f.a(max);
            }
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = k6.x0(null, k6.f27793a7, false);
            if (x02 != this.U1) {
                this.U1 = x02;
                v0(x02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void v() {
        this.S1 = true;
    }
}
