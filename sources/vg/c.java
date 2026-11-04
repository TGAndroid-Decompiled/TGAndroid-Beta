package vg;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.yg0;
public final class c extends sj0 {
    public final e6 f56575c;
    public final int d;
    public final int f56576e;
    public final ArrayList f56577f;
    public final x0 h;
    public int f56578n;
    public b f56579r;
    public final boolean f56580s;

    public c(int i3, e6 e6Var) {
        ArrayList arrayList = new ArrayList();
        this.f56577f = arrayList;
        this.f56580s = true;
        this.f56575c = e6Var;
        x0 x0Var = new x0(k6.zk, k6.Ak, k6.Bk, k6.Ck, e6Var);
        this.h = x0Var;
        x0Var.f56919o = 0.0f;
        x0Var.f56920p = 0.0f;
        x0Var.f56921q = 1.0f;
        hp s12 = hp.s1(i3);
        arrayList.add(new d(s12.D4, s12.E4, bd.M0(2131749387, null), bd.a0(null, null, 2131749388, Integer.valueOf(s12.E4))));
        arrayList.add(new d(s12.P4, s12.Q4, bd.M0(2131747256, null), bd.a0(null, null, 2131747257, Integer.valueOf(s12.Q4))));
        arrayList.add(new d(s12.R4, s12.S4, bd.M0(2131746597, null), bd.a0(null, null, 2131746598, Integer.valueOf(s12.S4))));
        arrayList.add(new d(s12.F4, s12.G4, bd.M0(2131745912, null), bd.a0(null, null, 2131745913, Integer.valueOf(s12.G4))));
        arrayList.add(new d(s12.H4, s12.I4, bd.M0(2131750840, null), bd.a0(null, null, 2131750841, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.X4, s12.Y4, bd.M0(2131753719, null), bd.a0(null, null, 2131753720, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.T4, s12.U4, bd.M0(2131752554, null), bd.a0(null, null, 2131752555, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.L4, s12.M4, bd.M0(2131750612, null), bd.a0(null, null, 2131750613, Integer.valueOf(s12.M4))));
        arrayList.add(new d(s12.N4, s12.O4, bd.M0(2131752215, null), bd.a0(null, null, 2131752216, Integer.valueOf(s12.O4))));
        arrayList.add(new d(3, 4, bd.M0(2131751810, null), bd.a0(null, null, 2131751811, 4)));
        arrayList.add(new d(s12.f23154w4, s12.f23164x4, bd.M0(2131745325, null), bd.a0(null, null, 2131745326, Integer.valueOf(s12.f23164x4))));
        this.d = 1;
        this.f56576e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == 0) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        if (d1Var.f55544f == 0) {
            e eVar = (e) d1Var.f55540a;
            int i10 = i3 - this.f56576e;
            ArrayList arrayList = this.f56577f;
            eVar.a((d) arrayList.get(i10));
            LimitPreviewView limitPreviewView = eVar.f56595c;
            limitPreviewView.G = ((d) arrayList.get(i10)).f56587e;
            limitPreviewView.f31524c = this.f56578n;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        v3 v3Var;
        Context context = viewGroup.getContext();
        e6 e6Var = this.f56575c;
        if (i3 != 1) {
            if (i3 != 2) {
                ?? eVar = new e(context, e6Var);
                b bVar = this.f56579r;
                LimitPreviewView limitPreviewView = eVar.f56595c;
                limitPreviewView.setParentViewForGradien(bVar);
                limitPreviewView.setStaticGradinet(this.h);
                v3Var = eVar;
            } else {
                v3Var = new v3(context, 16);
            }
        } else if (this.f56580s) {
            ?? yg0Var = new yg0(context, 20);
            LinearLayout f10 = k5.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(ha.e.c(context.getDrawable(2131232471), (x0) ha.e.d().f14381b));
            f10.addView(imageView, mf.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(bd.M0(2131751350, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            r6.V(textView, k6.G6, e6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            f10.addView(textView, mf.e(-2, -2, 16));
            yg0Var.addView(f10, mf.e(-2, -2, 17));
            v3Var = yg0Var;
        } else {
            v3Var = new v3(context, 64);
        }
        return k2.p1.p(v3Var, v3Var, -1, -2);
    }
}
