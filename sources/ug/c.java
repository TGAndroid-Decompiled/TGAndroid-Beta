package ug;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.ih0;
public final class c extends dk0 {
    public final h6 f58667c;
    public final int d;
    public final int f58668e;
    public final ArrayList f58669f;
    public final a1 h;
    public int f58670n;
    public b f58671r;
    public final boolean f58672s;

    public c(int i7, h6 h6Var) {
        ArrayList arrayList = new ArrayList();
        this.f58669f = arrayList;
        this.f58672s = true;
        this.f58667c = h6Var;
        a1 a1Var = new a1(m6.Ck, m6.Dk, m6.Ek, m6.Fk, h6Var);
        this.h = a1Var;
        a1Var.f58651o = 0.0f;
        a1Var.f58652p = 0.0f;
        a1Var.f58653q = 1.0f;
        mp u12 = mp.u1(i7);
        arrayList.add(new d(u12.G4, u12.H4, gd.N0(2131749186, null), gd.a0(null, null, 2131749187, Integer.valueOf(u12.H4))));
        arrayList.add(new d(u12.S4, u12.T4, gd.N0(2131747054, null), gd.a0(null, null, 2131747055, Integer.valueOf(u12.T4))));
        arrayList.add(new d(u12.U4, u12.V4, gd.N0(2131746393, null), gd.a0(null, null, 2131746394, Integer.valueOf(u12.V4))));
        arrayList.add(new d(u12.I4, u12.J4, gd.N0(2131745706, null), gd.a0(null, null, 2131745707, Integer.valueOf(u12.J4))));
        arrayList.add(new d(u12.K4, u12.L4, gd.N0(2131750827, null), gd.a0(null, null, 2131750828, Integer.valueOf(u12.L4))));
        arrayList.add(new d(u12.f25627a5, u12.f25637b5, gd.N0(2131753716, null), gd.a0(null, null, 2131753717, Integer.valueOf(u12.L4))));
        arrayList.add(new d(u12.W4, u12.X4, gd.N0(2131752542, null), gd.a0(null, null, 2131752543, Integer.valueOf(u12.L4))));
        arrayList.add(new d(u12.O4, u12.P4, gd.N0(2131750594, null), gd.a0(null, null, 2131750595, Integer.valueOf(u12.P4))));
        arrayList.add(new d(u12.Q4, u12.R4, gd.N0(2131752203, null), gd.a0(null, null, 2131752204, Integer.valueOf(u12.R4))));
        arrayList.add(new d(3, 4, gd.N0(2131751798, null), gd.a0(null, null, 2131751799, 4)));
        arrayList.add(new d(u12.f25851z4, u12.A4, gd.N0(2131745119, null), gd.a0(null, null, 2131745120, Integer.valueOf(u12.A4))));
        this.d = 1;
        this.f58668e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
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
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f59165f == 0) {
            e eVar = (e) f1Var.f59161a;
            int i10 = i7 - this.f58668e;
            ArrayList arrayList = this.f58669f;
            eVar.a((d) arrayList.get(i10));
            LimitPreviewView limitPreviewView = eVar.f58684c;
            limitPreviewView.G = ((d) arrayList.get(i10)).f58679e;
            limitPreviewView.f33061c = this.f58670n;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        w3 w3Var;
        Context context = viewGroup.getContext();
        h6 h6Var = this.f58667c;
        if (i7 != 1) {
            if (i7 != 2) {
                ?? eVar = new e(context, h6Var);
                b bVar = this.f58671r;
                LimitPreviewView limitPreviewView = eVar.f58684c;
                limitPreviewView.setParentViewForGradien(bVar);
                limitPreviewView.setStaticGradinet(this.h);
                w3Var = eVar;
            } else {
                w3Var = new w3(context, 16);
            }
        } else if (this.f58672s) {
            ?? ih0Var = new ih0(context, 20);
            LinearLayout g10 = f3.g(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(ia.e.c(context.getDrawable(2131232473), (a1) ia.e.d().f16222b));
            g10.addView(imageView, ma.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(gd.N0(2131751337, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            t6.U(textView, m6.G6, h6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            g10.addView(textView, ma.e(-2, -2, 16));
            ih0Var.addView(g10, ma.e(-2, -2, 17));
            w3Var = ih0Var;
        } else {
            w3Var = new w3(context, 64);
        }
        return i5.c.q(w3Var, w3Var, -1, -2);
    }
}
