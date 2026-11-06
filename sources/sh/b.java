package sh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import c8.ha;
import c8.ka;
import di.b3;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j0;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.na;
import org.telegram.ui.an;
import org.telegram.ui.fk0;
import org.telegram.ui.rq0;
import org.telegram.ui.xf;
public final class b extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, a6 {
    public final int[] D;
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final te.a H;
    public final te.a I;
    public final z5 f55166a;
    public final b3 f55167b;
    public final ci f55168c;
    public final an d;
    public final FrameLayout.LayoutParams f55169e;
    public final k5 f55170f;
    public c h;
    public q1 f55171n;
    public int f55172r;
    public xf f55173s;
    public final rq0 f55174w;
    public final rq0 f55175x;
    public final int f55176y;

    public b(Activity activity, f6 f6Var, an anVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f55169e = layoutParams;
        this.D = new int[2];
        this.E = new Rect();
        m3 m3Var = new m3(this, 17);
        xq xqVar = xq.h;
        this.H = new te.a(0, m3Var, xqVar, 380L, false);
        this.I = new te.a(0, new m3(this, 17), xqVar, 380L, false);
        this.d = anVar;
        this.f55176y = ((j0) anVar.getMessagesController().f24927x7.I.f13555b).f23432c;
        z5 z5Var = new z5(this, activity, f6Var, 2);
        this.f55166a = z5Var;
        z5Var.setAllowTextEntitiesIntersection(true);
        r6.V(z5Var, k6.G6, f6Var);
        r6.H(z5Var, k6.Uc, f6Var);
        r6.E(z5Var, k6.H6, f6Var);
        z5Var.setHint(hd.M0(2131747182, null));
        z5Var.setTextSize(1, 15.0f);
        z5Var.setMaxLines(Integer.MAX_VALUE);
        z5Var.setBackground(null);
        z5Var.setImeOptions(268435462);
        z5Var.setInputType(z5Var.getInputType() | 16384);
        z5Var.addTextChangedListener(new na(this, 2));
        b3 b3Var = new b3(activity, 6);
        this.f55167b = b3Var;
        int i7 = k6.Ji;
        y h02 = k6.h0(k6.w0(i7, f6Var), 1, -1);
        n6 N = r6.N(i7);
        b3Var.setBackground(h02);
        r6.k(b3Var, h02, null, N, f6Var);
        ka.a(b3Var);
        ci ciVar = new ci(getContext(), 36);
        this.f55168c = ciVar;
        y h03 = k6.h0(k6.w0(i7, f6Var), 1, -1);
        n6 N2 = r6.N(i7);
        ciVar.setBackground(h03);
        r6.k(ciVar, h03, null, N2, f6Var);
        ciVar.setOnClickListener(new fk0(26, this, anVar));
        ka.a(ciVar);
        k5 k5Var = new k5(getContext());
        this.f55170f = k5Var;
        k5Var.setTextSize(13);
        k5Var.setGravity(17);
        k5Var.setTranslationY(g0.L(44.0f));
        k5Var.setVisibility(8);
        rq0 rq0Var = new rq0(activity, 16);
        this.f55175x = rq0Var;
        addView(rq0Var, layoutParams);
        rq0 rq0Var2 = new rq0(activity, 15);
        this.f55174w = rq0Var2;
        rq0Var.addView(rq0Var2, ha.c(-2.0f, -1));
        rq0Var2.addView(k5Var, ha.e(54, 24, 53));
        rq0Var2.addView(b3Var, ha.e(44, 44, 51));
        rq0Var2.addView(ciVar, ha.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        rq0Var2.addView(z5Var, ha.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        z5Var.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(b bVar) {
        k5 k5Var = bVar.f55170f;
        p00.d(k5Var, bVar.H.f55370e);
        int i7 = k6.A6;
        an anVar = bVar.d;
        k5Var.setTextColor(i0.a.f(bVar.I.f55370e, k6.w0(i7, anVar.getResourceProvider()), k6.w0(k6.f28069p7, anVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.A6));
        hashSet.add(Integer.valueOf(k6.f28069p7));
    }

    public c getAttachedMedia() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.F = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.F.removeOnPreDrawListener(this);
        }
        this.F = null;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onPreDraw() {
        w1 w1Var;
        uh.a aVar;
        q1 q1Var = this.f55171n;
        if (q1Var != null) {
            int f12 = q1Var.getMessageObject().f1();
            if (this.f55171n.isAttachedToWindow() && this.f55172r == f12 && (w1Var = this.f55171n.f30046w2) != null && (aVar = w1Var.f30704l) != null && w1Var.f30711s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                q1 q1Var2 = this.f55171n;
                int[] iArr = this.D;
                q1Var2.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i7 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f55169e;
                int i11 = layoutParams.width;
                rq0 rq0Var = this.f55175x;
                if (i11 != width) {
                    layoutParams.width = width;
                    rq0Var.setLayoutParams(layoutParams);
                }
                rq0Var.setTranslationX(rect.left);
                rq0Var.setTranslationY(g0.L(0.66f) + rect.top);
                return true;
            }
            xf xfVar = this.f55173s;
            if (xfVar != null) {
                xfVar.run();
                this.f55173s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.f55174w.setAlpha(f10);
    }

    public void setCellToWatch(q1 q1Var) {
        this.f55171n = q1Var;
        this.f55172r = q1Var.getMessageObject().f1();
    }

    public void setColor(int i7) {
        if (this.G != i7) {
            this.G = i7;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            b3 b3Var = this.f55167b;
            ((Drawable) b3Var.f8842c).setColorFilter(porterDuffColorFilter);
            ((Drawable) b3Var.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.f55168c.f32577c).setColorFilter(porterDuffColorFilter);
            z5 z5Var = this.f55166a;
            z5Var.setCursorColor(i7);
            z5Var.setHandlesColor(i7);
            z5Var.setHintTextColor(i7);
        }
    }

    @Override
    public final void updateColors() {
        an anVar;
        try {
            k5 k5Var = this.f55170f;
            if (k5Var != null && (anVar = this.d) != null) {
                k5Var.setTextColor(i0.a.f(this.I.f55370e, k6.w0(k6.A6, anVar.getResourceProvider()), k6.w0(k6.f28069p7, anVar.getResourceProvider())));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
