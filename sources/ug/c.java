package ug;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.eh0;
public final class c extends tj0 {
    public final e6 f58048c;
    public final int d;
    public final int f58049e;
    public final ArrayList f58050f;
    public final z0 h;
    public int f58051n;
    public b f58052r;
    public final boolean f58053s;

    public c(int i7, e6 e6Var) {
        ArrayList arrayList = new ArrayList();
        this.f58050f = arrayList;
        this.f58053s = true;
        this.f58048c = e6Var;
        z0 z0Var = new z0(j6.Ck, j6.Dk, j6.Ek, j6.Fk, e6Var);
        this.h = z0Var;
        z0Var.f58400o = 0.0f;
        z0Var.f58401p = 0.0f;
        z0Var.f58402q = 1.0f;
        np s12 = np.s1(i7);
        arrayList.add(new d(s12.E4, s12.F4, hd.M0(2131749379, null), hd.a0(null, null, 2131749380, Integer.valueOf(s12.F4))));
        arrayList.add(new d(s12.Q4, s12.R4, hd.M0(2131747248, null), hd.a0(null, null, 2131747249, Integer.valueOf(s12.R4))));
        arrayList.add(new d(s12.S4, s12.T4, hd.M0(2131746589, null), hd.a0(null, null, 2131746590, Integer.valueOf(s12.T4))));
        arrayList.add(new d(s12.G4, s12.H4, hd.M0(2131745902, null), hd.a0(null, null, 2131745903, Integer.valueOf(s12.H4))));
        arrayList.add(new d(s12.I4, s12.J4, hd.M0(2131750839, null), hd.a0(null, null, 2131750840, Integer.valueOf(s12.J4))));
        arrayList.add(new d(s12.Y4, s12.Z4, hd.M0(2131753719, null), hd.a0(null, null, 2131753720, Integer.valueOf(s12.J4))));
        arrayList.add(new d(s12.U4, s12.V4, hd.M0(2131752554, null), hd.a0(null, null, 2131752555, Integer.valueOf(s12.J4))));
        arrayList.add(new d(s12.M4, s12.N4, hd.M0(2131750611, null), hd.a0(null, null, 2131750612, Integer.valueOf(s12.N4))));
        arrayList.add(new d(s12.O4, s12.P4, hd.M0(2131752215, null), hd.a0(null, null, 2131752216, Integer.valueOf(s12.P4))));
        arrayList.add(new d(3, 4, hd.M0(2131751810, null), hd.a0(null, null, 2131751811, 4)));
        arrayList.add(new d(s12.f25435x4, s12.f25445y4, hd.M0(2131745315, null), hd.a0(null, null, 2131745316, Integer.valueOf(s12.f25445y4))));
        this.d = 1;
        this.f58049e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
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
    public final void t(v4.e1 e1Var, int i7) {
        if (e1Var.f58539f == 0) {
            e eVar = (e) e1Var.f58535a;
            int i10 = i7 - this.f58049e;
            ArrayList arrayList = this.f58050f;
            eVar.a((d) arrayList.get(i10));
            LimitPreviewView limitPreviewView = eVar.f58065c;
            limitPreviewView.G = ((d) arrayList.get(i10)).f58059e;
            limitPreviewView.f32631c = this.f58051n;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        v3 v3Var;
        Context context = viewGroup.getContext();
        e6 e6Var = this.f58048c;
        if (i7 != 1) {
            if (i7 != 2) {
                ?? eVar = new e(context, e6Var);
                b bVar = this.f58052r;
                LimitPreviewView limitPreviewView = eVar.f58065c;
                limitPreviewView.setParentViewForGradien(bVar);
                limitPreviewView.setStaticGradinet(this.h);
                v3Var = eVar;
            } else {
                v3Var = new v3(context, 16);
            }
        } else if (this.f58053s) {
            ?? eh0Var = new eh0(context, 20);
            LinearLayout f10 = k5.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(ia.f.c(context.getDrawable(2131232472), (z0) ia.f.d().f15884b));
            f10.addView(imageView, ja.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(hd.M0(2131751349, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            q6.U(textView, j6.G6, e6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            f10.addView(textView, ja.e(-2, -2, 16));
            eh0Var.addView(f10, ja.e(-2, -2, 17));
            v3Var = eh0Var;
        } else {
            v3Var = new v3(context, 64);
        }
        return i5.c.q(v3Var, v3Var, -1, -2);
    }
}
