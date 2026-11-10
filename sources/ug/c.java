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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.vq0;
public final class c extends oj0 {
    public final h6 f56541c;
    public final int d;
    public final int f56542e;
    public final ArrayList f56543f;
    public final y0 h;
    public int f56544n;
    public b f56545r;
    public final boolean f56546s;

    public c(int i7, h6 h6Var) {
        ArrayList arrayList = new ArrayList();
        this.f56543f = arrayList;
        this.f56546s = true;
        this.f56541c = h6Var;
        y0 y0Var = new y0(m6.zk, m6.Ak, m6.Bk, m6.Ck, h6Var);
        this.h = y0Var;
        y0Var.f56885o = 0.0f;
        y0Var.f56886p = 0.0f;
        y0Var.f56887q = 1.0f;
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
        arrayList.add(new d(s12.f24933w4, s12.f24943x4, id.M0(2131745315, null), id.a0(null, null, 2131745316, Integer.valueOf(s12.f24943x4))));
        this.d = 1;
        this.f56542e = 1;
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
        if (d1Var.f57056f == 0) {
            e eVar = (e) d1Var.f57052a;
            int i10 = i7 - this.f56542e;
            ArrayList arrayList = this.f56543f;
            eVar.a((d) arrayList.get(i10));
            LimitPreviewView limitPreviewView = eVar.f56561c;
            limitPreviewView.F = ((d) arrayList.get(i10)).f56553e;
            limitPreviewView.f31469c = this.f56544n;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v3 v3Var;
        Context context = viewGroup.getContext();
        h6 h6Var = this.f56541c;
        if (i7 != 1) {
            if (i7 != 2) {
                ?? eVar = new e(context, h6Var);
                b bVar = this.f56545r;
                LimitPreviewView limitPreviewView = eVar.f56561c;
                limitPreviewView.setParentViewForGradien(bVar);
                limitPreviewView.setStaticGradinet(this.h);
                v3Var = eVar;
            } else {
                v3Var = new v3(context, 16);
            }
        } else if (this.f56546s) {
            ?? vq0Var = new vq0(context, 18);
            LinearLayout f10 = k5.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(ia.e.c(context.getDrawable(2131232471), (y0) ia.e.d().f15429b));
            f10.addView(imageView, ha.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(id.M0(2131751349, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            t6.U(textView, m6.G6, h6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            f10.addView(textView, ha.e(-2, -2, 16));
            vq0Var.addView(f10, ha.e(-2, -2, 17));
            v3Var = vq0Var;
        } else {
            v3Var = new v3(context, 64);
        }
        return jg.g.r(v3Var, v3Var, -1, -2);
    }
}
