package sh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import bi.u;
import c8.ja;
import c8.na;
import fi.w2;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Wallet.i9;
import org.telegram.ui.an;
import org.telegram.ui.eh0;
import org.telegram.ui.sc1;
import org.telegram.ui.ye;
public final class b extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, z5 {
    public final int[] E;
    public final Rect F;
    public ViewTreeObserver G;
    public int H;
    public final te.a I;
    public final te.a J;
    public final u f56846a;
    public final w2 f56847b;
    public final ji f56848c;
    public final an d;
    public final FrameLayout.LayoutParams f56849e;
    public final j5 f56850f;
    public c h;
    public q1 f56851n;
    public int f56852r;
    public ye f56853s;
    public final eh0 f56854w;
    public final eh0 f56855x;
    public final int f56856y;

    public b(Activity activity, e6 e6Var, an anVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f56849e = layoutParams;
        this.E = new int[2];
        this.F = new Rect();
        z zVar = new z(this, 22);
        er erVar = er.h;
        this.I = new te.a(0, zVar, erVar, 380L, false);
        this.J = new te.a(0, new z(this, 22), erVar, 380L, false);
        this.d = anVar;
        this.f56856y = ((j0) anVar.getMessagesController().f25451y7.I.f15881b).f24498c;
        u uVar = new u(this, activity, e6Var, 3);
        this.f56846a = uVar;
        uVar.setAllowTextEntitiesIntersection(true);
        q6.U(uVar, j6.G6, e6Var);
        q6.G(uVar, j6.Xc, e6Var);
        q6.D(uVar, j6.H6, e6Var);
        uVar.setHint(hd.M0(2131747183, null));
        uVar.setTextSize(1, 15.0f);
        uVar.setMaxLines(Integer.MAX_VALUE);
        uVar.setBackground(null);
        uVar.setImeOptions(268435462);
        uVar.setInputType(uVar.getInputType() | 16384);
        uVar.addTextChangedListener(new i9(this, 4));
        w2 w2Var = new w2(activity, 6);
        this.f56847b = w2Var;
        int i7 = j6.Mi;
        y h02 = j6.h0(j6.w0(i7, e6Var), 1, -1);
        m6 M = q6.M(i7);
        w2Var.setBackground(h02);
        q6.j(w2Var, h02, null, M, e6Var);
        na.a(w2Var);
        ji jiVar = new ji(getContext(), 36);
        this.f56848c = jiVar;
        y h03 = j6.h0(j6.w0(i7, e6Var), 1, -1);
        m6 M2 = q6.M(i7);
        jiVar.setBackground(h03);
        q6.j(jiVar, h03, null, M2, e6Var);
        jiVar.setOnClickListener(new sc1(3, this, anVar));
        na.a(jiVar);
        j5 j5Var = new j5(getContext());
        this.f56850f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(g0.L(44.0f));
        j5Var.setVisibility(8);
        eh0 eh0Var = new eh0(activity, 18);
        this.f56855x = eh0Var;
        addView(eh0Var, layoutParams);
        eh0 eh0Var2 = new eh0(activity, 17);
        this.f56854w = eh0Var2;
        eh0Var.addView(eh0Var2, ja.c(-2.0f, -1));
        eh0Var2.addView(j5Var, ja.e(54, 24, 53));
        eh0Var2.addView(w2Var, ja.e(44, 44, 51));
        eh0Var2.addView(jiVar, ja.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        eh0Var2.addView(uVar, ja.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        uVar.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(b bVar) {
        j5 j5Var = bVar.f56850f;
        t00.d(j5Var, bVar.I.f57085e);
        int i7 = j6.A6;
        an anVar = bVar.d;
        j5Var.setTextColor(i0.a.f(bVar.J.f57085e, j6.w0(i7, anVar.getResourceProvider()), j6.w0(j6.f29070p7, anVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.A6));
        hashSet.add(Integer.valueOf(j6.f29070p7));
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
        uh.a aVar;
        q1 q1Var = this.f56851n;
        if (q1Var != null) {
            int e12 = q1Var.getMessageObject().e1();
            if (this.f56851n.isAttachedToWindow() && this.f56852r == e12 && (w1Var = this.f56851n.f31211x2) != null && (aVar = w1Var.f31860l) != null && w1Var.f31867s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.F;
                rect.set(bounds);
                q1 q1Var2 = this.f56851n;
                int[] iArr = this.E;
                q1Var2.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i7 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f56849e;
                int i11 = layoutParams.width;
                eh0 eh0Var = this.f56855x;
                if (i11 != width) {
                    layoutParams.width = width;
                    eh0Var.setLayoutParams(layoutParams);
                }
                eh0Var.setTranslationX(rect.left);
                eh0Var.setTranslationY(g0.L(0.66f) + rect.top);
                return true;
            }
            ye yeVar = this.f56853s;
            if (yeVar != null) {
                yeVar.run();
                this.f56853s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.f56854w.setAlpha(f10);
    }

    public void setCellToWatch(q1 q1Var) {
        this.f56851n = q1Var;
        this.f56852r = q1Var.getMessageObject().e1();
    }

    public void setColor(int i7) {
        if (this.H != i7) {
            this.H = i7;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            w2 w2Var = this.f56847b;
            ((Drawable) w2Var.f12460c).setColorFilter(porterDuffColorFilter);
            ((Drawable) w2Var.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.f56848c.f36007c).setColorFilter(porterDuffColorFilter);
            u uVar = this.f56846a;
            uVar.setCursorColor(i7);
            uVar.setHandlesColor(i7);
            uVar.setHintTextColor(i7);
        }
    }

    @Override
    public final void updateColors() {
        an anVar;
        try {
            j5 j5Var = this.f56850f;
            if (j5Var != null && (anVar = this.d) != null) {
                j5Var.setTextColor(i0.a.f(this.J.f57085e, j6.w0(j6.A6, anVar.getResourceProvider()), j6.w0(j6.f29070p7, anVar.getResourceProvider())));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
