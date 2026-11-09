package ug;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.uq0;
public final class c extends pj0 {
    public final g6 f56542c;
    public final int d;
    public final int f56543e;
    public final ArrayList f56544f;
    public final y0 h;
    public int f56545n;
    public b f56546r;
    public final boolean f56547s;

    public c(int i7, g6 g6Var) {
        ArrayList arrayList = new ArrayList();
        this.f56544f = arrayList;
        this.f56547s = true;
        this.f56542c = g6Var;
        y0 y0Var = new y0(l6.zk, l6.Ak, l6.Bk, l6.Ck, g6Var);
        this.h = y0Var;
        y0Var.f56889o = 0.0f;
        y0Var.f56890p = 0.0f;
        y0Var.f56891q = 1.0f;
        qp s12 = qp.s1(i7);
        arrayList.add(new d(s12.D4, s12.E4, id.M0(2131749379, null), id.a0(null, null, 2131749380, Integer.valueOf(s12.E4))));
        arrayList.add(new d(s12.P4, s12.Q4, id.M0(2131747248, null), id.a0(null, null, 2131747249, Integer.valueOf(s12.Q4))));
        arrayList.add(new d(s12.R4, s12.S4, id.M0(2131746589, null), id.a0(null, null, 2131746590, Integer.valueOf(s12.S4))));
        arrayList.add(new d(s12.F4, s12.G4, id.M0(2131745902, null), id.a0(null, null, 2131745903, Integer.valueOf(s12.G4))));
        arrayList.add(new d(s12.H4, s12.I4, id.M0(2131750839, null), id.a0(null, null, 2131750840, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.X4, s12.Y4, id.M0(2131753719, null), id.a0(null, null, 2131753720, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.T4, s12.U4, id.M0(2131752554, null), id.a0(null, null, 2131752555, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.L4, s12.M4, id.M0(2131750611, null), id.a0(null, null, 2131750612, Integer.valueOf(s12.M4))));
        arrayList.add(new d(s12.N4, s12.O4, id.M0(2131752215, null), id.a0(null, null, 2131752216, Integer.valueOf(s12.O4))));
        arrayList.add(new d(3, 4, id.M0(2131751810, null), id.a0(null, null, 2131751811, 4)));
        arrayList.add(new d(s12.f24929w4, s12.f24939x4, id.M0(2131745315, null), id.a0(null, null, 2131745316, Integer.valueOf(s12.f24939x4))));
        this.d = 1;
        this.f56543e = 1;
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
        if (d1Var.f57060f == 0) {
            e eVar = (e) d1Var.f57056a;
            int i10 = i7 - this.f56543e;
            ArrayList arrayList = this.f56544f;
            eVar.a((d) arrayList.get(i10));
            LimitPreviewView limitPreviewView = eVar.f56562c;
            limitPreviewView.F = ((d) arrayList.get(i10)).f56554e;
            limitPreviewView.f31458c = this.f56545n;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v3 v3Var;
        Context context = viewGroup.getContext();
        g6 g6Var = this.f56542c;
        if (i7 != 1) {
            if (i7 != 2) {
                ?? eVar = new e(context, g6Var);
                b bVar = this.f56546r;
                LimitPreviewView limitPreviewView = eVar.f56562c;
                limitPreviewView.setParentViewForGradien(bVar);
                limitPreviewView.setStaticGradinet(this.h);
                v3Var = eVar;
            } else {
                v3Var = new v3(context, 16);
            }
        } else if (this.f56547s) {
            ?? uq0Var = new uq0(context, 18);
            LinearLayout f10 = k5.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(ia.e.c(context.getDrawable(2131232471), (y0) ia.e.d().f15427b));
            f10.addView(imageView, ha.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(id.M0(2131751349, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            s6.U(textView, l6.G6, g6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            f10.addView(textView, ha.e(-2, -2, 16));
            uq0Var.addView(f10, ha.e(-2, -2, 17));
            v3Var = uq0Var;
        } else {
            v3Var = new v3(context, 64);
        }
        return jg.g.r(v3Var, v3Var, -1, -2);
    }
}
