package ug;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.sq0;
public final class c extends oj0 {
    public final f6 f56437c;
    public final int d;
    public final int f56438e;
    public final ArrayList f56439f;
    public final y0 h;
    public int f56440n;
    public b f56441r;
    public final boolean f56442s;

    public c(int i7, f6 f6Var) {
        ArrayList arrayList = new ArrayList();
        this.f56439f = arrayList;
        this.f56442s = true;
        this.f56437c = f6Var;
        y0 y0Var = new y0(k6.zk, k6.Ak, k6.Bk, k6.Ck, f6Var);
        this.h = y0Var;
        y0Var.f56784o = 0.0f;
        y0Var.f56785p = 0.0f;
        y0Var.f56786q = 1.0f;
        qp s12 = qp.s1(i7);
        arrayList.add(new d(s12.D4, s12.E4, hd.M0(2131749378, null), hd.a0(null, null, 2131749379, Integer.valueOf(s12.E4))));
        arrayList.add(new d(s12.P4, s12.Q4, hd.M0(2131747247, null), hd.a0(null, null, 2131747248, Integer.valueOf(s12.Q4))));
        arrayList.add(new d(s12.R4, s12.S4, hd.M0(2131746588, null), hd.a0(null, null, 2131746589, Integer.valueOf(s12.S4))));
        arrayList.add(new d(s12.F4, s12.G4, hd.M0(2131745903, null), hd.a0(null, null, 2131745904, Integer.valueOf(s12.G4))));
        arrayList.add(new d(s12.H4, s12.I4, hd.M0(2131750840, null), hd.a0(null, null, 2131750841, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.X4, s12.Y4, hd.M0(2131753719, null), hd.a0(null, null, 2131753720, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.T4, s12.U4, hd.M0(2131752554, null), hd.a0(null, null, 2131752555, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.L4, s12.M4, hd.M0(2131750612, null), hd.a0(null, null, 2131750613, Integer.valueOf(s12.M4))));
        arrayList.add(new d(s12.N4, s12.O4, hd.M0(2131752215, null), hd.a0(null, null, 2131752216, Integer.valueOf(s12.O4))));
        arrayList.add(new d(3, 4, hd.M0(2131751810, null), hd.a0(null, null, 2131751811, 4)));
        arrayList.add(new d(s12.f24922w4, s12.f24932x4, hd.M0(2131745316, null), hd.a0(null, null, 2131745317, Integer.valueOf(s12.f24932x4))));
        this.d = 1;
        this.f56438e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == 0) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f56955f == 0) {
            e eVar = (e) d1Var.f56951a;
            int i10 = i7 - this.f56438e;
            ArrayList arrayList = this.f56439f;
            eVar.a((d) arrayList.get(i10));
            LimitPreviewView limitPreviewView = eVar.f56457c;
            limitPreviewView.F = ((d) arrayList.get(i10)).f56449e;
            limitPreviewView.f31449c = this.f56440n;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v3 v3Var;
        Context context = viewGroup.getContext();
        f6 f6Var = this.f56437c;
        if (i7 != 1) {
            if (i7 != 2) {
                ?? eVar = new e(context, f6Var);
                b bVar = this.f56441r;
                LimitPreviewView limitPreviewView = eVar.f56457c;
                limitPreviewView.setParentViewForGradien(bVar);
                limitPreviewView.setStaticGradinet(this.h);
                v3Var = eVar;
            } else {
                v3Var = new v3(context, 16);
            }
        } else if (this.f56442s) {
            ?? sq0Var = new sq0(context, 18);
            LinearLayout f10 = k5.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(ia.e.c(context.getDrawable(2131232471), (y0) ia.e.d().f15424b));
            f10.addView(imageView, ha.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(hd.M0(2131751350, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            r6.V(textView, k6.G6, f6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            f10.addView(textView, ha.e(-2, -2, 16));
            sq0Var.addView(f10, ha.e(-2, -2, 17));
            v3Var = sq0Var;
        } else {
            v3Var = new v3(context, 64);
        }
        return jg.g.r(v3Var, v3Var, -1, -2);
    }
}
