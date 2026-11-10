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
import org.telegram.messenger.id;
import org.telegram.messenger.j0;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.n3;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.w1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Wallet.oa;
import org.telegram.ui.bf;
import org.telegram.ui.cn;
import org.telegram.ui.ik0;
import org.telegram.ui.vq0;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, c6 {
    public final int[] D;
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final te.a H;
    public final te.a I;
    public final z5 f55294a;
    public final b3 f55295b;
    public final bi f55296c;
    public final cn d;
    public final FrameLayout.LayoutParams f55297e;
    public final m5 f55298f;
    public d h;
    public q1 f55299n;
    public int f55300r;
    public bf f55301s;
    public final vq0 f55302w;
    public final vq0 f55303x;
    public final int f55304y;

    public c(Activity activity, h6 h6Var, cn cnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f55297e = layoutParams;
        this.D = new int[2];
        this.E = new Rect();
        n3 n3Var = new n3(this, 17);
        wq wqVar = wq.h;
        this.H = new te.a(0, n3Var, wqVar, 380L, false);
        this.I = new te.a(0, new n3(this, 17), wqVar, 380L, false);
        this.d = cnVar;
        this.f55304y = ((j0) cnVar.getMessagesController().f24946x7.I.f13557b).f23464c;
        z5 z5Var = new z5(this, activity, h6Var, 2);
        this.f55294a = z5Var;
        z5Var.setAllowTextEntitiesIntersection(true);
        t6.U(z5Var, m6.G6, h6Var);
        t6.G(z5Var, m6.Uc, h6Var);
        t6.D(z5Var, m6.H6, h6Var);
        z5Var.setHint(id.M0(2131747183, null));
        z5Var.setTextSize(1, 15.0f);
        z5Var.setMaxLines(Integer.MAX_VALUE);
        z5Var.setBackground(null);
        z5Var.setImeOptions(268435462);
        z5Var.setInputType(z5Var.getInputType() | 16384);
        z5Var.addTextChangedListener(new oa(this, 2));
        b3 b3Var = new b3(activity, 6);
        this.f55295b = b3Var;
        int i7 = m6.Ji;
        y h02 = m6.h0(m6.w0(i7, h6Var), 1, -1);
        p6 M = t6.M(i7);
        b3Var.setBackground(h02);
        t6.j(b3Var, h02, null, M, h6Var);
        ka.a(b3Var);
        bi biVar = new bi(getContext(), 36);
        this.f55296c = biVar;
        y h03 = m6.h0(m6.w0(i7, h6Var), 1, -1);
        p6 M2 = t6.M(i7);
        biVar.setBackground(h03);
        t6.j(biVar, h03, null, M2, h6Var);
        biVar.setOnClickListener(new ik0(25, this, cnVar));
        ka.a(biVar);
        m5 m5Var = new m5(getContext());
        this.f55298f = m5Var;
        m5Var.setTextSize(13);
        m5Var.setGravity(17);
        m5Var.setTranslationY(g0.L(44.0f));
        m5Var.setVisibility(8);
        vq0 vq0Var = new vq0(activity, 16);
        this.f55303x = vq0Var;
        addView(vq0Var, layoutParams);
        vq0 vq0Var2 = new vq0(activity, 15);
        this.f55302w = vq0Var2;
        vq0Var.addView(vq0Var2, ha.c(-2.0f, -1));
        vq0Var2.addView(m5Var, ha.e(54, 24, 53));
        vq0Var2.addView(b3Var, ha.e(44, 44, 51));
        vq0Var2.addView(biVar, ha.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        vq0Var2.addView(z5Var, ha.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        z5Var.setPadding(g0.L(5.0f), g0.L(11.0f), g0.L(5.0f), g0.L(11.0f));
    }

    public static void a(c cVar) {
        m5 m5Var = cVar.f55298f;
        p00.d(m5Var, cVar.H.f55498e);
        int i7 = m6.A6;
        cn cnVar = cVar.d;
        m5Var.setTextColor(i0.a.f(cVar.I.f55498e, m6.w0(i7, cnVar.getResourceProvider()), m6.w0(m6.f28111p7, cnVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.A6));
        hashSet.add(Integer.valueOf(m6.f28111p7));
    }

    public d getAttachedMedia() {
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
        q1 q1Var = this.f55299n;
        if (q1Var != null) {
            int e12 = q1Var.getMessageObject().e1();
            if (this.f55299n.isAttachedToWindow() && this.f55300r == e12 && (w1Var = this.f55299n.f30066w2) != null && (aVar = w1Var.f30724l) != null && w1Var.f30731s) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                q1 q1Var2 = this.f55299n;
                int[] iArr = this.D;
                q1Var2.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i7 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f55297e;
                int i11 = layoutParams.width;
                vq0 vq0Var = this.f55303x;
                if (i11 != width) {
                    layoutParams.width = width;
                    vq0Var.setLayoutParams(layoutParams);
                }
                vq0Var.setTranslationX(rect.left);
                vq0Var.setTranslationY(g0.L(0.66f) + rect.top);
                return true;
            }
            bf bfVar = this.f55301s;
            if (bfVar != null) {
                bfVar.run();
                this.f55301s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.f55302w.setAlpha(f10);
    }

    public void setCellToWatch(q1 q1Var) {
        this.f55299n = q1Var;
        this.f55300r = q1Var.getMessageObject().e1();
    }

    public void setColor(int i7) {
        if (this.G != i7) {
            this.G = i7;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
            b3 b3Var = this.f55295b;
            ((Drawable) b3Var.f8841c).setColorFilter(porterDuffColorFilter);
            ((Drawable) b3Var.d).setColorFilter(porterDuffColorFilter);
            ((Drawable) this.f55296c.f32272c).setColorFilter(porterDuffColorFilter);
            z5 z5Var = this.f55294a;
            z5Var.setCursorColor(i7);
            z5Var.setHandlesColor(i7);
            z5Var.setHintTextColor(i7);
        }
    }

    @Override
    public final void updateColors() {
        cn cnVar;
        try {
            m5 m5Var = this.f55298f;
            if (m5Var != null && (cnVar = this.d) != null) {
                m5Var.setTextColor(i0.a.f(this.I.f55498e, m6.w0(m6.A6, cnVar.getResourceProvider()), m6.w0(m6.f28111p7, cnVar.getResourceProvider())));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
