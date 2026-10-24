package rh;

import ai.u;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.zr;
import org.telegram.ui.kg;
import org.telegram.ui.m41;
import org.telegram.ui.sn;
import qg.g0;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, b6 {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final ne.b H;
    public final ne.b I;
    public final c6 f46166a;
    public final b f46167b;
    public final d f46168c;
    public final sn d;
    public final FrameLayout.LayoutParams e;
    public final n5 f46169f;
    public e h;
    public t1 f46170n;
    public int f46171r;
    public kg f46172s;
    public final m41 v;
    public final m41 f46173w;
    public final int f46174x;
    public final int[] f46175y;

    public c(Activity activity, g6 g6Var, sn snVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f46175y = new int[2];
        this.E = new Rect();
        g0 g0Var = new g0(this, 15);
        zr zrVar = zr.h;
        this.H = new ne.b(0, g0Var, zrVar, 380L, false);
        this.I = new ne.b(0, new g0(this, 15), zrVar, 380L, false);
        this.d = snVar;
        this.f46174x = snVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, g6Var, 2);
        this.f46166a = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        r6.W(c6Var, k6.G6, g6Var);
        r6.I(c6Var, k6.f21243gc, g6Var);
        r6.F(c6Var, k6.H6, g6Var);
        c6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var.setTextSize(1, 15.0f);
        c6Var.setMaxLines(Integer.MAX_VALUE);
        c6Var.setBackground(null);
        c6Var.setImeOptions(268435462);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.addTextChangedListener(new u(this, 20));
        b bVar = new b(activity);
        this.f46167b = bVar;
        int i10 = k6.Vh;
        y g02 = k6.g0(k6.w0(i10, g6Var), 1, -1);
        n6 O = r6.O(i10);
        bVar.setBackground(g02);
        r6.k(bVar, g02, null, O, g6Var);
        w7.b6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f46168c = dVar;
        y g03 = k6.g0(k6.w0(i10, g6Var), 1, -1);
        n6 O2 = r6.O(i10);
        dVar.setBackground(g03);
        r6.k(dVar, g03, null, O2, g6Var);
        dVar.setOnClickListener(new org.telegram.ui.web.c(3, this, snVar));
        w7.b6.a(dVar);
        n5 n5Var = new n5(getContext());
        this.f46169f = n5Var;
        n5Var.setTextSize(13);
        n5Var.setGravity(17);
        n5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        n5Var.setVisibility(8);
        m41 m41Var = new m41(activity, 9);
        this.f46173w = m41Var;
        addView(m41Var, layoutParams);
        m41 m41Var2 = new m41(activity, 8);
        this.v = m41Var2;
        m41Var.addView(m41Var2, z5.c(-2.0f, -1));
        m41Var2.addView(n5Var, z5.e(54, 24, 53));
        m41Var2.addView(bVar, z5.e(44, 44, 51));
        m41Var2.addView(dVar, z5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        m41Var2.addView(c6Var, z5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        n5 n5Var = cVar.f46169f;
        f20.d(n5Var, cVar.H.e);
        int i10 = k6.A6;
        sn snVar = cVar.d;
        n5Var.setTextColor(i0.a.f(cVar.I.e, k6.w0(i10, snVar.getResourceProvider()), k6.w0(k6.f21405p7, snVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.A6));
        hashSet.add(Integer.valueOf(k6.f21405p7));
    }

    public e getAttachedMedia() {
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
        t1 t1Var;
        th.a aVar;
        t1 t1Var2 = this.f46170n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f46170n.isAttachedToWindow() && this.f46171r == id2 && (aVar = (t1Var = this.f46170n).f23314a6) != null && t1Var.f23499n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                t1 t1Var3 = this.f46170n;
                int[] iArr = this.f46175y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                m41 m41Var = this.f46173w;
                if (i12 != width) {
                    layoutParams.width = width;
                    m41Var.setLayoutParams(layoutParams);
                }
                m41Var.setTranslationX(rect.left);
                m41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            kg kgVar = this.f46172s;
            if (kgVar != null) {
                kgVar.run();
                this.f46172s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f46170n = t1Var;
        this.f46171r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f46167b;
            bVar.f46164b.setColorFilter(porterDuffColorFilter);
            bVar.f46165c.setColorFilter(porterDuffColorFilter);
            this.f46168c.f46176a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f46166a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }

    @Override
    public final void updateColors() {
        sn snVar;
        try {
            n5 n5Var = this.f46169f;
            if (n5Var != null && (snVar = this.d) != null) {
                n5Var.setTextColor(i0.a.f(this.I.e, k6.w0(k6.A6, snVar.getResourceProvider()), k6.w0(k6.f21405p7, snVar.getResourceProvider())));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
