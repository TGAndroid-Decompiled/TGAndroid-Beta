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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Wallet.i9;
import org.telegram.ui.af;
import org.telegram.ui.bn;
import org.telegram.ui.cd0;
import org.telegram.ui.ih0;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, c6 {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final te.a I;
    public final te.a J;
    public final u f57422a;
    public final u2 f57423b;
    public final ri f57424c;
    public final bn d;
    public final FrameLayout.LayoutParams f57425e;
    public final n5 f57426f;
    public d h;
    public r1 f57427n;
    public int f57428r;
    public af f57429s;
    public final ih0 f57430w;
    public final ih0 f57431x;
    public final int f57432y;

    public c(Activity activity, i6 i6Var, bn bnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f57425e = layoutParams;
        this.E = new int[2];
        this.F = new Rect();
        org.telegram.ui.ActionBar.p pVar = new org.telegram.ui.ActionBar.p(this, 23);
        lr lrVar = lr.h;
        this.I = new te.a(0, pVar, lrVar, 380L, false);
        this.J = new te.a(0, new org.telegram.ui.ActionBar.p(this, 23), lrVar, 380L, false);
        this.d = bnVar;
        this.f57432y = ((j0) bnVar.getMessagesController().A7.N.f15536b).f24764c;
        u uVar = new u(this, activity, i6Var, 3);
        this.f57422a = uVar;
        uVar.setAllowTextEntitiesIntersection(true);
        u6.U(uVar, n6.G6, i6Var);
        u6.G(uVar, n6.Xc, i6Var);
        u6.D(uVar, n6.H6, i6Var);
        uVar.setHint(gd.M0(2131746990, null));
        uVar.setTextSize(1, 15.0f);
        uVar.setMaxLines(Integer.MAX_VALUE);
        uVar.setBackground(null);
        uVar.setImeOptions(268435462);
        uVar.setInputType(uVar.getInputType() | 16384);
        uVar.addTextChangedListener(new i9(this, 5));
        u2 u2Var = new u2(activity, 6);
        this.f57423b = u2Var;
        int i7 = n6.Mi;
        y h02 = n6.h0(n6.w0(i7, i6Var), 1, -1);
        q6 M = u6.M(i7);
        u2Var.setBackground(h02);
        u6.j(u2Var, h02, null, M, i6Var);
        ra.a(u2Var);
        ri riVar = new ri(getContext(), 36);
        this.f57424c = riVar;
        y h03 = n6.h0(n6.w0(i7, i6Var), 1, -1);
        q6 M2 = u6.M(i7);
        riVar.setBackground(h03);
        u6.j(riVar, h03, null, M2, i6Var);
        riVar.setOnClickListener(new cd0(28, this, bnVar));
        ra.a(riVar);
        n5 n5Var = new n5(getContext());
        this.f57426f = n5Var;
        n5Var.setTextSize(13);
        n5Var.setGravity(17);
        n5Var.setTranslationY(g0.L(44.0f));
        n5Var.setVisibility(8);
        ih0 ih0Var = new ih0(activity, 18);
        this.f57431x = ih0Var;
        addView(ih0Var, layoutParams);
        ih0 ih0Var2 = new ih0(activity, 17);
        this.f57430w = ih0Var2;
        ih0Var.addView(ih0Var2, ma.c(-2.0f, -1));
        ih0Var2.addView(n5Var, ma.e(54, 24, 53));
        ih0Var2.addView(u2Var, ma.e(44, 44, 51));
        ih0Var2.addView(riVar, ma.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        ih0Var2.addView(uVar, ma.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        uVar.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(c cVar) {
        n5 n5Var = cVar.f57426f;
        a10.d(n5Var, cVar.I.f57657e);
        int i7 = n6.A6;
        bn bnVar = cVar.d;
        n5Var.setTextColor(i0.a.f(cVar.J.f57657e, n6.w0(i7, bnVar.getResourceProvider()), n6.w0(n6.f29615p7, bnVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.A6));
        hashSet.add(Integer.valueOf(n6.f29615p7));
    }

    public d getAttachedMedia() {
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
        r1 r1Var = this.f57427n;
        if (r1Var != null) {
            int e12 = r1Var.getMessageObject().e1();
            if (this.f57427n.isAttachedToWindow() && this.f57428r == e12 && (x1Var = this.f57427n.f31633x2) != null && (aVar = x1Var.f32293l) != null && x1Var.f32300s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                r1 r1Var2 = this.f57427n;
                int[] iArr = this.E;
                r1Var2.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i7 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f57425e;
                int i11 = layoutParams.width;
                ih0 ih0Var = this.f57431x;
                if (i11 != width) {
                    layoutParams.width = width;
                    ih0Var.setLayoutParams(layoutParams);
                }
                ih0Var.setTranslationX(rect.left);
                ih0Var.setTranslationY(g0.L(0.66f) + rect.top);
                return true;
            }
            af afVar = this.f57429s;
            if (afVar != null) {
                afVar.run();
                this.f57429s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.f57430w.setAlpha(f10);
    }

    public void setCellToWatch(r1 r1Var) {
        this.f57427n = r1Var;
        this.f57428r = r1Var.getMessageObject().e1();
    }

    public void setColor(int i7) {
        if (this.H != i7) {
            this.H = i7;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            u2 u2Var = this.f57423b;
            ((Drawable) u2Var.f12612c).setColorFilter(porterDuffColorFilter);
            ((Drawable) u2Var.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.f57424c.f39153c).setColorFilter(porterDuffColorFilter);
            u uVar = this.f57422a;
            uVar.setCursorColor(i7);
            uVar.setHandlesColor(i7);
            uVar.setHintTextColor(i7);
        }
    }

    @Override
    public final void updateColors() {
        bn bnVar;
        try {
            n5 n5Var = this.f57426f;
            if (n5Var != null && (bnVar = this.d) != null) {
                n5Var.setTextColor(i0.a.f(this.J.f57657e, n6.w0(n6.A6, bnVar.getResourceProvider()), n6.w0(n6.f29615p7, bnVar.getResourceProvider())));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
