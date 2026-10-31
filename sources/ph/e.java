package ph;

import android.content.Context;
import android.util.LongSparseArray;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.t9;
import org.telegram.messenger.v9;
import org.telegram.messenger.x9;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tk0;
import w7.b6;
public final class e extends ha implements v9 {
    public final a51 P1;
    public final LongSparseArray Q1;
    public ArrayList R1;
    public boolean S1;
    public p51 T1;
    public int U1;

    public e(Context context) {
        super(context, null, false, false, 2, null);
        int i10 = 0;
        this.Q1 = new LongSparseArray();
        this.R1 = new ArrayList();
        int x02 = t6.x0(null, t6.f20872a7, false);
        this.U1 = x02;
        v0(x02);
        x9.c(this.f21583a).f19235f.add(this);
        this.C1 = false;
        this.B1 = org.telegram.messenger.i0.L(12.0f);
        O();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.P1 = a51.j(-1, linearLayout);
        this.f26666k1.setPadding(this.f21615t0, org.telegram.messenger.i0.L(9.0f), this.f21615t0, org.telegram.messenger.i0.L(9.0f));
        this.f26666k1.setOverScrollMode(2);
        this.T1.O(false);
        ArrayList arrayList = x9.c(this.f21583a).f19234c;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t9 t9Var = (t9) obj;
            d dVar = new d(context, t9Var);
            dVar.f45015a.setOnClickListener(new ag.i(this, context, t9Var, 23));
            linearLayout.addView(dVar, b6.o(-1, -2));
            this.Q1.put(t9Var.f18034b, dVar);
        }
        g(arrayList);
    }

    @Override
    public final sk0 L0(tk0 tk0Var) {
        p51 p51Var = new p51(this.f26666k1, getContext(), this.f21583a, 0, true, new ag.a(this, 21), this.I0);
        this.T1 = p51Var;
        p51Var.f29295r = false;
        return p51Var;
    }

    @Override
    public final CharSequence O0() {
        ArrayList arrayList = this.R1;
        if (arrayList == null) {
            return null;
        }
        return cd.a0(null, null, 2131750427, Integer.valueOf(arrayList.size()));
    }

    @Override
    public final void dismiss() {
        x9.c(this.f21583a).f19235f.remove(this);
        super.dismiss();
    }

    @Override
    public final void g(ArrayList arrayList) {
        int i10;
        this.R1 = new ArrayList(arrayList);
        this.l1.setTitle(O0());
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            t9 t9Var = (t9) obj;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = t9Var.f18036f;
            if (tL_starGiftAuctionState != null) {
                i10 = tL_starGiftAuctionState.next_round_at;
            } else {
                i10 = 0;
            }
            d dVar = (d) this.Q1.get(t9Var.f18034b);
            if (dVar != null) {
                dVar.b(this.S1);
                long max = Math.max(0, i10 - ConnectionsManager.getInstance(this.f21583a).getCurrentTime());
                dVar.a(max, this.S1);
                dVar.f45018f.a(max);
            }
        }
    }

    @Override
    public final void s0() {
        try {
            super.s0();
            int x02 = t6.x0(null, t6.f20872a7, false);
            if (x02 != this.U1) {
                this.U1 = x02;
                v0(x02);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void w() {
        this.S1 = true;
    }
}
