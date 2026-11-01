package uh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import m.p3;
import org.telegram.messenger.dd;
import org.telegram.messenger.kj;
import org.telegram.messenger.uz;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.vq0;
import s4.c1;
import th.d5;
import th.q4;
import th.x4;
import vh.n5;
public class h extends bk0 {
    public final Context f50253c;
    public x4 e;
    public h f50254f;
    public p3 h;
    public boolean f50256r;
    public final i f50257s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f50255n = new ArrayList();

    public h(i iVar, Context context) {
        this.f50257s = iVar;
        this.f50253c = context;
        M();
    }

    @Override
    public final boolean D(c1 c1Var) {
        return false;
    }

    @Override
    public final String F(int i10) {
        kj kjVar;
        TL_stories.StoryItem storyItem;
        x4 x4Var = this.e;
        if (x4Var == null || i10 < 0 || i10 >= x4Var.f49650i.size() || (kjVar = (kj) this.e.f49650i.get(i10)) == null || (storyItem = kjVar.f16694l) == null) {
            return null;
        }
        return dd.e0(storyItem.date, true);
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        int i10;
        int measuredHeight = uk0Var.getChildAt(0).getMeasuredHeight();
        h hVar = this.f50254f;
        i iVar = this.f50257s;
        if (this == hVar) {
            i10 = iVar.e;
        } else {
            i10 = iVar.d;
        }
        int ceil = (int) (Math.ceil(b() / i10) * measuredHeight);
        int measuredHeight2 = uk0Var.getMeasuredHeight() - uk0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f10 = f7 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f10 / measuredHeight)) * i10;
        iArr[1] = ((int) f10) % measuredHeight;
    }

    public final boolean L(int i10) {
        vq0 vq0Var = this.f50257s.W;
        x4 x4Var = this.e;
        if (x4Var != null) {
            if (x4Var instanceof q4) {
                TLRPC.User Z1 = wp.r1(vq0Var.f50274b).Z1(Long.valueOf(vq0Var.d));
                if (Z1 != null && Z1.bot && Z1.bot_has_main_app && Z1.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i10 >= 0 && i10 < x4Var.f49650i.size()) {
                return this.e.m(((kj) this.e.f49650i.get(i10)).f1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.e != null) {
            i iVar = this.f50257s;
            if ((!iVar.I || (iVar.H && b() > 1)) && b() > 0) {
                boolean z10 = false;
                if (b() < 5) {
                    int max = Math.max(1, b());
                    iVar.d = max;
                    if (max == 1) {
                        z10 = true;
                    }
                    iVar.H = z10;
                } else if (iVar.H || iVar.d == 1) {
                    iVar.H = false;
                    iVar.d = Math.max(2, uz.f18557u1);
                }
                iVar.h.y1(iVar.d);
                iVar.I = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.g() + this.d.size();
    }

    @Override
    public final int d(int i10) {
        return 19;
    }

    @Override
    public final int e() {
        return b();
    }

    @Override
    public void f() {
        x4 x4Var = this.e;
        boolean z10 = x4Var instanceof q4;
        i iVar = this.f50257s;
        if (z10) {
            q4 q4Var = (q4) x4Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = wp.r1(this.e.f49647c).O1().F(iVar.W.d);
            if (F != null) {
                for (int i10 = 0; i10 < F.size(); i10++) {
                    d5 d5Var = (d5) F.get(i10);
                    n5 n5Var = d5Var.f48892c;
                    if (n5Var != null && !n5Var.f51544g && TextUtils.equals(n5Var.K0, q4Var.E)) {
                        arrayList.add(d5Var);
                    }
                }
            }
        }
        super.f();
        h hVar = this.f50254f;
        if (hVar != null) {
            hVar.f();
        }
        if (this != iVar.f50267x) {
            M();
            iVar.c();
        }
    }

    @Override
    public final void t(c1 c1Var, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        if (this.e != null) {
            View view = c1Var.f47909a;
            if (!(view instanceof s7)) {
                return;
            }
            s7 s7Var = (s7) view;
            s7Var.f23024d0 = true;
            i iVar = this.f50257s;
            ArrayList arrayList = this.d;
            if (i10 >= 0 && i10 < arrayList.size()) {
                d5 d5Var = (d5) arrayList.get(i10);
                s7Var.f23027f0 = false;
                if (d5Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = d5Var.f48890a;
                    int i14 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i14;
                    tL_storyItem.f20032id = i14;
                    tL_storyItem.attachPath = d5Var.f48893f;
                    kj kjVar = new kj(this.e.f49647c, tL_storyItem);
                    d5Var.K = kjVar;
                    kjVar.f16697m = d5Var;
                }
                kj kjVar2 = d5Var.K;
                if (this == this.f50254f) {
                    i13 = iVar.e;
                } else {
                    i13 = iVar.d;
                }
                s7Var.k(kjVar2, i13, false);
                s7Var.f23024d0 = true;
                s7Var.setReorder(false);
                s7Var.i(false, false);
                return;
            }
            int size = i10 - arrayList.size();
            if (size >= 0 && size < this.e.f49650i.size()) {
                kj kjVar3 = (kj) this.e.f49650i.get(size);
                if (kjVar3 != null && this.e.m(kjVar3.f1())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                s7Var.f23027f0 = z10;
                s7Var.setReorder(true);
                if (this == this.f50254f) {
                    i12 = iVar.e;
                } else {
                    i12 = iVar.d;
                }
                s7Var.k(kjVar3, i12, false);
                vq0 vq0Var = iVar.W;
                if (vq0Var.G.E1 && kjVar3 != null) {
                    s7Var.i(vq0Var.c(kjVar3), true);
                    return;
                } else {
                    s7Var.i(false, false);
                    return;
                }
            }
            s7Var.f23027f0 = false;
            if (this == this.f50254f) {
                i11 = iVar.e;
            } else {
                i11 = iVar.d;
            }
            s7Var.k(null, i11, false);
            s7Var.f23024d0 = true;
        }
    }

    @Override
    public final c1 w(ViewGroup viewGroup, int i10) {
        vq0 vq0Var = this.f50257s.W;
        if (this.h == null) {
            this.h = new p3(viewGroup.getContext(), vq0Var.f50275c);
        }
        s7 s7Var = new s7(this.f50253c, this.h, vq0Var.f50274b);
        s7Var.f23047w0 = true;
        s7Var.setGradientView(null);
        s7Var.f23024d0 = true;
        return new c1(s7Var);
    }

    @Override
    public final void I() {
    }
}
