package th;

import ai.z;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import b8.mf;
import b8.pf;
import ei.e3;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.j0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Wallet.ma;
import org.telegram.ui.tf;
import org.telegram.ui.wm;
import org.telegram.ui.yg0;
public final class b extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, z5 {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final qe.a I;
    public final qe.a J;
    public final z f55387a;
    public final e3 f55388b;
    public final ai f55389c;
    public final wm d;
    public final FrameLayout.LayoutParams f55390e;
    public final k5 f55391f;
    public c h;
    public q1 f55392n;
    public int f55393r;
    public tf f55394s;
    public final yg0 f55395w;
    public final yg0 f55396x;
    public final int f55397y;

    public b(Activity activity, e6 e6Var, wm wmVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f55390e = layoutParams;
        this.E = new int[2];
        this.F = new Rect();
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(this, 17);
        xq xqVar = xq.h;
        this.I = new qe.a(0, e3Var, xqVar, 380L, false);
        this.J = new qe.a(0, new org.telegram.ui.ActionBar.e3(this, 17), xqVar, 380L, false);
        this.d = wmVar;
        this.f55397y = ((j0) wmVar.getMessagesController().f23167x7.I.f13798b).f23620c;
        z zVar = new z(this, activity, e6Var, 3);
        this.f55387a = zVar;
        zVar.setAllowTextEntitiesIntersection(true);
        r6.V(zVar, k6.G6, e6Var);
        r6.H(zVar, k6.Uc, e6Var);
        r6.E(zVar, k6.H6, e6Var);
        zVar.setHint(bd.M0(2131747191, null));
        zVar.setTextSize(1, 15.0f);
        zVar.setMaxLines(Integer.MAX_VALUE);
        zVar.setBackground(null);
        zVar.setImeOptions(268435462);
        zVar.setInputType(zVar.getInputType() | 16384);
        zVar.addTextChangedListener(new ma(this, 2));
        e3 e3Var2 = new e3(activity, 7);
        this.f55388b = e3Var2;
        int i3 = k6.Ji;
        y h02 = k6.h0(k6.w0(i3, e6Var), 1, -1);
        n6 N = r6.N(i3);
        e3Var2.setBackground(h02);
        r6.k(e3Var2, h02, null, N, e6Var);
        pf.a(e3Var2);
        ai aiVar = new ai(getContext(), 36);
        this.f55389c = aiVar;
        y h03 = k6.h0(k6.w0(i3, e6Var), 1, -1);
        n6 N2 = r6.N(i3);
        aiVar.setBackground(h03);
        r6.k(aiVar, h03, null, N2, e6Var);
        aiVar.setOnClickListener(new org.telegram.ui.web.d(2, this, wmVar));
        pf.a(aiVar);
        k5 k5Var = new k5(getContext());
        this.f55391f = k5Var;
        k5Var.setTextSize(13);
        k5Var.setGravity(17);
        k5Var.setTranslationY(g0.L(44.0f));
        k5Var.setVisibility(8);
        yg0 yg0Var = new yg0(activity, 18);
        this.f55396x = yg0Var;
        addView(yg0Var, layoutParams);
        yg0 yg0Var2 = new yg0(activity, 17);
        this.f55395w = yg0Var2;
        yg0Var.addView(yg0Var2, mf.c(-2.0f, -1));
        yg0Var2.addView(k5Var, mf.e(54, 24, 53));
        yg0Var2.addView(e3Var2, mf.e(44, 44, 51));
        yg0Var2.addView(aiVar, mf.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        yg0Var2.addView(zVar, mf.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        zVar.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(b bVar) {
        k5 k5Var = bVar.f55391f;
        l00.d(k5Var, bVar.I.f53840e);
        int i3 = k6.A6;
        wm wmVar = bVar.d;
        k5Var.setTextColor(i0.a.f(bVar.J.f53840e, k6.w0(i3, wmVar.getResourceProvider()), k6.w0(k6.f28102p7, wmVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.A6));
        hashSet.add(Integer.valueOf(k6.f28102p7));
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
        w1 w1Var;
        vh.a aVar;
        q1 q1Var = this.f55392n;
        if (q1Var != null) {
            int f12 = q1Var.getMessageObject().f1();
            if (this.f55392n.isAttachedToWindow() && this.f55393r == f12 && (w1Var = this.f55392n.f30122w2) != null && (aVar = w1Var.f30784l) != null && w1Var.f30791s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                q1 q1Var2 = this.f55392n;
                int[] iArr = this.E;
                q1Var2.getLocationInWindow(iArr);
                int i3 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i3 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f55390e;
                int i11 = layoutParams.width;
                yg0 yg0Var = this.f55396x;
                if (i11 != width) {
                    layoutParams.width = width;
                    yg0Var.setLayoutParams(layoutParams);
                }
                yg0Var.setTranslationX(rect.left);
                yg0Var.setTranslationY(g0.L(0.66f) + rect.top);
                return true;
            }
            tf tfVar = this.f55394s;
            if (tfVar != null) {
                tfVar.run();
                this.f55394s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.f55395w.setAlpha(f10);
    }

    public void setCellToWatch(q1 q1Var) {
        this.f55392n = q1Var;
        this.f55393r = q1Var.getMessageObject().f1();
    }

    public void setColor(int i3) {
        if (this.H != i3) {
            this.H = i3;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
            e3 e3Var = this.f55388b;
            ((Drawable) e3Var.f10222c).setColorFilter(porterDuffColorFilter);
            ((Drawable) e3Var.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.f55389c.f31850c).setColorFilter(porterDuffColorFilter);
            z zVar = this.f55387a;
            zVar.setCursorColor(i3);
            zVar.setHandlesColor(i3);
            zVar.setHintTextColor(i3);
        }
    }

    @Override
    public final void updateColors() {
        wm wmVar;
        try {
            k5 k5Var = this.f55391f;
            if (k5Var != null && (wmVar = this.d) != null) {
                k5Var.setTextColor(i0.a.f(this.J.f53840e, k6.w0(k6.A6, wmVar.getResourceProvider()), k6.w0(k6.f28102p7, wmVar.getResourceProvider())));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
