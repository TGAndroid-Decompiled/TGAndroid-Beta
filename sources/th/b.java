package th;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
import org.telegram.messenger.tz;
public class b implements org.telegram.ui.ActionBar.p6 {
    public final HashSet f48790a = new HashSet();
    public final SparseIntArray f48791b;
    public final Paint f48792c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.c5 f48793f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f48791b = sparseIntArray;
        Paint paint = new Paint();
        this.f48792c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21086lg, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21105mg, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Mj, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Nj, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Oj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Pj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Qj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Rj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Cj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21170q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f20956eg, i0.b.f(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.t6.P5;
        sparseIntArray.put(i10, i0.b.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Q5, i0.b.f(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.t6.O5;
        sparseIntArray.put(i11, i0.b.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21153p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21020i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.t6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Hf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Oi, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.H6, i0.b.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21222t5, i0.b.f(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.wj, i0.b.f(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21037j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21185r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21259v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.If, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Kf, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21048jg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ai, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21206s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f20939dg, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.xf, i0.b.o(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21285wf, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21313y8, -1);
        sparseIntArray.put(i10, i0.b.f(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.b.o(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21311y6, i0.b.o(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Oe, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ne, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Xf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Sf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Yf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Tf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f20900bg, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f20881ag, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ke, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Je, org.telegram.ui.ActionBar.t6.r1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21028ig, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Vc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ie, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Le, org.telegram.ui.ActionBar.t6.r1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Kl, org.telegram.ui.ActionBar.t6.r1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ge, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21001h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21019i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f20929d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ml, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ql, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Af, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21002h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ef, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21320yf, i0.b.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Bf, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Cf, i0.b.o(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ff, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21337zf, i0.b.o(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Gf, i0.b.o(-1, 125));
        int i13 = org.telegram.ui.ActionBar.t6.f20930d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21125ng, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f20872a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21076l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21058k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.A6, i0.b.f(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.tj, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.uj, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.vj, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Jf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f20901bh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Tg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Zc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21114n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.kk, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21021i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.t6.f21039j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Qi, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ri, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Pi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Li, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Mi, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21225t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21096m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21077l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21116n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ci, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21057k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Uc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21169q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.ij, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.kj, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.lj, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.jj, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.xj, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21139ob, i0.b.f(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21191rb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21209sb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21228tb, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ae, i0.b.o(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21003h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.f21059k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Jl, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Hl, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Il, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Gj, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Jj, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Hj, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Ij, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.t6.Nl, -15198183);
        k();
        paint.setColor(h(i13));
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.t6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.t6.r(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(h(org.telegram.ui.ActionBar.t6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    @Override
    public final Paint d(String str) {
        if (str.equals("paintDivider")) {
            return this.f48792c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.b.f(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.t6.V0(str);
    }

    @Override
    public final boolean e() {
        return tz.H0;
    }

    @Override
    public final int f(int i10) {
        return h(i10);
    }

    @Override
    public final boolean g() {
        return false;
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f48793f == null) {
                this.f48793f = new org.telegram.ui.ActionBar.c5(1, true, false, this);
            }
            return this.f48793f;
        }
        return null;
    }

    @Override
    public final int h(int i10) {
        SparseIntArray sparseIntArray = this.f48791b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f48790a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.t6.v0(i10);
    }

    @Override
    public final int j(int i10) {
        return h(i10);
    }

    public void k() {
    }

    @Override
    public final void i(int i10, int i11) {
    }
}
