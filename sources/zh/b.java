package zh;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import j$.util.Objects;
import java.util.HashSet;
public class b implements org.telegram.ui.ActionBar.f6 {
    public final HashSet f48287a = new HashSet();
    public final SparseIntArray f48288b;
    public final Paint f48289c;
    public Paint d;
    public PorterDuffColorFilter e;
    public org.telegram.ui.ActionBar.h5 f48290f;

    public b() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f48288b = sparseIntArray;
        Paint paint = new Paint();
        this.f48289c = paint;
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18297xf, -1308622848);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18315yf, -1056964608);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Yi, -1214008894);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Zi, -1946157057);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.aj, 452984831);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.bj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.cj, -667862461);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.dj, -665229191);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Oi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.J5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18162q7, -2406842);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.H5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18170qf, i0.a.d(0.2f, -16777216, -1));
        int i10 = org.telegram.ui.ActionBar.j6.P5;
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Q5, i0.a.d(0.5f, -16777216, -1));
        int i11 = org.telegram.ui.ActionBar.j6.O5;
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.E8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.F8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18144p7, -1152913);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18017i6, 385875967);
        int i12 = org.telegram.ui.ActionBar.j6.I5;
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Se, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17883ai, -1711276033);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.H6, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18217t5, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ii, i0.a.d(0.2f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18034j5, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18179r5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18254v6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Te, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ve, 1946157055);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.vf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Mh, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18201s8, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18152pf, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ie, i0.a.k(-1, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.He, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18308y8, -1);
        sparseIntArray.put(i10, i0.a.d(0.5f, -16777216, -1));
        sparseIntArray.put(i11, i0.a.k(-1, 17));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18306y6, i0.a.k(-1, 127));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17879ae, -14606046);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Zd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18044jf, -1221292);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17937df, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18064kf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17953ef, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18116nf, 2030043135);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18100mf, -10638868);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Wd, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Vd, org.telegram.ui.ActionBar.j6.l1(0.6f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18245uf, -1515107571);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18004hc, -5316609);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ud, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Xd, org.telegram.ui.ActionBar.j6.l1(0.9f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Wk, org.telegram.ui.ActionBar.j6.l1(0.8f, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Sd, -14670806);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17998h5, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18016i5, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.M5, -15393241);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17928d6, -15198183);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.G6, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Le, -8553090);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17999h6, -10177027);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Pe, 181267199);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Je, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Me, -2130706433);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ne, i0.a.k(-1, 125));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Oe, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Qe, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ke, i0.a.k(-16777216, 30));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Re, i0.a.k(-1, 125));
        int i13 = org.telegram.ui.ActionBar.j6.f17929d7;
        sparseIntArray.put(i13, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18334zf, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.U5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.e7, -14079703);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f7, -8158332);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17872a7, -16777216);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.L6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18073l6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18055k6, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.A6, i0.a.d(0.3f, -1, -16777216));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Fi, -14605274);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Gi, -7616267);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Hi, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.H8, -233499371);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ue, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.B6, -8355712);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18117ng, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17972fg, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.A5, -14538189);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Z8, -9316522);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.X8, -1446156);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18079lc, -2110438831);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.M6, -10263709);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.N6, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.B5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.E5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18109n5, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.wj, -832444);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18018i7, -12692893);
        int i14 = org.telegram.ui.ActionBar.j6.f18036j7;
        sparseIntArray.put(i14, -10329502);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.C5, -1);
        sparseIntArray.put(i12, 436207615);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17921ci, -13816531);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17939di, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f17902bi, -657931);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.J7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Xh, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Yh, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.G8, -232841441);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18220t8, 385875967);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18092m7, -12500671);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18074l7, -13133079);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18111n7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Oh, -15033089);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18054k5, -10177041);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.R5, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.gc, -12147733);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18161q5, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.ui, -592138);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.wi, -14737633);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.xi, -12632257);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.vi, -8796932);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ji, 1140850687);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Aa, i0.a.d(0.4f, -16777216, -1));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Da, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ea, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Fa, 0);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Md, i0.a.k(-1, 75));
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18000h7, -10177041);
        sparseIntArray.put(i14, -12237499);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.f18056k7, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.K7, -10703370);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.L7, -12547121);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Vk, -1);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Tk, -1207959553);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Uk, 352321535);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Si, -8553091);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Vi, -11292689);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ti, -12829636);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Ui, -11184811);
        sparseIntArray.put(org.telegram.ui.ActionBar.j6.Zk, -15198183);
        b();
        paint.setColor(F0(i13));
    }

    @Override
    public final Paint F(String str) {
        if (str.equals("paintDivider")) {
            return this.f48289c;
        }
        if (str.equals("paintChatActionBackground")) {
            if (this.d == null) {
                Paint paint = new Paint(1);
                this.d = paint;
                paint.setColor(i0.a.d(0.1f, -16777216, -1));
            }
            return this.d;
        }
        return org.telegram.ui.ActionBar.j6.S0(str);
    }

    @Override
    public final int F0(int i10) {
        SparseIntArray sparseIntArray = this.f48288b;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        Integer valueOf = Integer.valueOf(i10);
        HashSet hashSet = this.f48287a;
        if (!hashSet.contains(valueOf)) {
            hashSet.add(Integer.valueOf(i10));
        }
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.j6.I.q();
    }

    @Override
    public final int e0(int i10) {
        return F0(i10);
    }

    @Override
    public final int f1(int i10) {
        return F0(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        if (Objects.equals(str, "drawableMsgOutMedia")) {
            if (this.f48290f == null) {
                this.f48290f = new org.telegram.ui.ActionBar.h5(1, true, false, this);
            }
            return this.f48290f;
        }
        return null;
    }

    @Override
    public final void l(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.j6.q(f7, f10, i10, i11);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    @Override
    public final ColorFilter w() {
        if (this.e == null) {
            this.e = new PorterDuffColorFilter(F0(org.telegram.ui.ActionBar.j6.G6), PorterDuff.Mode.SRC_IN);
        }
        return this.e;
    }

    public void b() {
    }

    @Override
    public final void L0(int i10, int i11) {
    }
}
