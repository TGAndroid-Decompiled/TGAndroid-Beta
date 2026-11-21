package sh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import bi.u;
import c8.ma;
import c8.ra;
import fi.u2;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j0;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Wallet.i9;
import org.telegram.ui.af;
import org.telegram.ui.bn;
import org.telegram.ui.ih0;
import org.telegram.ui.jg0;
public final class b extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, b6 {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final te.a I;
    public final te.a J;
    public final u f57461a;
    public final u2 f57462b;
    public final ti f57463c;
    public final bn d;
    public final FrameLayout.LayoutParams f57464e;
    public final m5 f57465f;
    public c h;
    public r1 f57466n;
    public int f57467r;
    public af f57468s;
    public final ih0 f57469w;
    public final ih0 f57470x;
    public final int f57471y;

    public b(Activity activity, h6 h6Var, bn bnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f57464e = layoutParams;
        this.E = new int[2];
        this.F = new Rect();
        org.telegram.tgnet.u uVar = new org.telegram.tgnet.u(this, 24);
        nr nrVar = nr.h;
        this.I = new te.a(0, uVar, nrVar, 380L, false);
        this.J = new te.a(0, new org.telegram.tgnet.u(this, 24), nrVar, 380L, false);
        this.d = bnVar;
        this.f57471y = ((j0) bnVar.getMessagesController().A7.N.f15505b).f24792c;
        u uVar2 = new u(this, activity, h6Var, 3);
        this.f57461a = uVar2;
        uVar2.setAllowTextEntitiesIntersection(true);
        t6.U(uVar2, m6.G6, h6Var);
        t6.G(uVar2, m6.Xc, h6Var);
        t6.D(uVar2, m6.H6, h6Var);
        uVar2.setHint(gd.N0(2131746989, null));
        uVar2.setTextSize(1, 15.0f);
        uVar2.setMaxLines(Integer.MAX_VALUE);
        uVar2.setBackground(null);
        uVar2.setImeOptions(268435462);
        uVar2.setInputType(uVar2.getInputType() | 16384);
        uVar2.addTextChangedListener(new i9(this, 5));
        u2 u2Var = new u2(activity, 6);
        this.f57462b = u2Var;
        int i7 = m6.Mi;
        y h02 = m6.h0(m6.w0(i7, h6Var), 1, -1);
        p6 M = t6.M(i7);
        u2Var.setBackground(h02);
        t6.j(u2Var, h02, null, M, h6Var);
        ra.a(u2Var);
        ti tiVar = new ti(getContext(), 36);
        this.f57463c = tiVar;
        y h03 = m6.h0(m6.w0(i7, h6Var), 1, -1);
        p6 M2 = t6.M(i7);
        tiVar.setBackground(h03);
        t6.j(tiVar, h03, null, M2, h6Var);
        tiVar.setOnClickListener(new jg0(26, this, bnVar));
        ra.a(tiVar);
        m5 m5Var = new m5(getContext());
        this.f57465f = m5Var;
        m5Var.setTextSize(13);
        m5Var.setGravity(17);
        m5Var.setTranslationY(g0.L(44.0f));
        m5Var.setVisibility(8);
        ih0 ih0Var = new ih0(activity, 18);
        this.f57470x = ih0Var;
        addView(ih0Var, layoutParams);
        ih0 ih0Var2 = new ih0(activity, 17);
        this.f57469w = ih0Var2;
        ih0Var.addView(ih0Var2, ma.c(-2.0f, -1));
        ih0Var2.addView(m5Var, ma.e(54, 24, 53));
        ih0Var2.addView(u2Var, ma.e(44, 44, 51));
        ih0Var2.addView(tiVar, ma.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        ih0Var2.addView(uVar2, ma.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        uVar2.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(b bVar) {
        m5 m5Var = bVar.f57465f;
        c10.d(m5Var, bVar.I.f57696e);
        int i7 = m6.A6;
        bn bnVar = bVar.d;
        m5Var.setTextColor(i0.a.f(bVar.J.f57696e, m6.w0(i7, bnVar.getResourceProvider()), m6.w0(m6.f29599p7, bnVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.A6));
        hashSet.add(Integer.valueOf(m6.f29599p7));
    }

    public c getAttachedMedia() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.G = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.G;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.G.removeOnPreDrawListener(this);
        }
        this.G = null;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onPreDraw() {
        x1 x1Var;
        uh.a aVar;
        r1 r1Var = this.f57466n;
        if (r1Var != null) {
            int e12 = r1Var.getMessageObject().e1();
            if (this.f57466n.isAttachedToWindow() && this.f57467r == e12 && (x1Var = this.f57466n.f31661x2) != null && (aVar = x1Var.f32321l) != null && x1Var.f32328s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                r1 r1Var2 = this.f57466n;
                int[] iArr = this.E;
                r1Var2.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i7 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f57464e;
                int i11 = layoutParams.width;
                ih0 ih0Var = this.f57470x;
                if (i11 != width) {
                    layoutParams.width = width;
                    ih0Var.setLayoutParams(layoutParams);
                }
                ih0Var.setTranslationX(rect.left);
                ih0Var.setTranslationY(g0.L(0.66f) + rect.top);
                return true;
            }
            af afVar = this.f57468s;
            if (afVar != null) {
                afVar.run();
                this.f57468s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.f57469w.setAlpha(f10);
    }

    public void setCellToWatch(r1 r1Var) {
        this.f57466n = r1Var;
        this.f57467r = r1Var.getMessageObject().e1();
    }

    public void setColor(int i7) {
        if (this.H != i7) {
            this.H = i7;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            u2 u2Var = this.f57462b;
            ((Drawable) u2Var.f12651c).setColorFilter(porterDuffColorFilter);
            ((Drawable) u2Var.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.f57463c.f39927c).setColorFilter(porterDuffColorFilter);
            u uVar = this.f57461a;
            uVar.setCursorColor(i7);
            uVar.setHandlesColor(i7);
            uVar.setHintTextColor(i7);
        }
    }

    @Override
    public final void updateColors() {
        bn bnVar;
        try {
            m5 m5Var = this.f57465f;
            if (m5Var != null && (bnVar = this.d) != null) {
                m5Var.setTextColor(i0.a.f(this.J.f57696e, m6.w0(m6.A6, bnVar.getResourceProvider()), m6.w0(m6.f29599p7, bnVar.getResourceProvider())));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
