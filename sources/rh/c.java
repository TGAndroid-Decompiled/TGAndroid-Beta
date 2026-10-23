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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h20;
import org.telegram.ui.kg;
import org.telegram.ui.n41;
import org.telegram.ui.sn;
import qg.g0;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, b6 {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final ne.b H;
    public final ne.b I;
    public final c6 f46167a;
    public final b f46168b;
    public final d f46169c;
    public final sn d;
    public final FrameLayout.LayoutParams e;
    public final n5 f46170f;
    public e h;
    public t1 f46171n;
    public int f46172r;
    public kg f46173s;
    public final n41 v;
    public final n41 f46174w;
    public final int f46175x;
    public final int[] f46176y;

    public c(Activity activity, g6 g6Var, sn snVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f46176y = new int[2];
        this.E = new Rect();
        g0 g0Var = new g0(this, 15);
        bs bsVar = bs.h;
        this.H = new ne.b(0, g0Var, bsVar, 380L, false);
        this.I = new ne.b(0, new g0(this, 15), bsVar, 380L, false);
        this.d = snVar;
        this.f46175x = snVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, g6Var, 2);
        this.f46167a = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        r6.W(c6Var, k6.G6, g6Var);
        r6.I(c6Var, k6.f21242gc, g6Var);
        r6.F(c6Var, k6.H6, g6Var);
        c6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var.setTextSize(1, 15.0f);
        c6Var.setMaxLines(Integer.MAX_VALUE);
        c6Var.setBackground(null);
        c6Var.setImeOptions(268435462);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.addTextChangedListener(new u(this, 20));
        b bVar = new b(activity);
        this.f46168b = bVar;
        int i10 = k6.Vh;
        y g02 = k6.g0(k6.w0(i10, g6Var), 1, -1);
        n6 O = r6.O(i10);
        bVar.setBackground(g02);
        r6.k(bVar, g02, null, O, g6Var);
        w7.b6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f46169c = dVar;
        y g03 = k6.g0(k6.w0(i10, g6Var), 1, -1);
        n6 O2 = r6.O(i10);
        dVar.setBackground(g03);
        r6.k(dVar, g03, null, O2, g6Var);
        dVar.setOnClickListener(new org.telegram.ui.web.c(3, this, snVar));
        w7.b6.a(dVar);
        n5 n5Var = new n5(getContext());
        this.f46170f = n5Var;
        n5Var.setTextSize(13);
        n5Var.setGravity(17);
        n5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        n5Var.setVisibility(8);
        n41 n41Var = new n41(activity, 9);
        this.f46174w = n41Var;
        addView(n41Var, layoutParams);
        n41 n41Var2 = new n41(activity, 8);
        this.v = n41Var2;
        n41Var.addView(n41Var2, z5.c(-2.0f, -1));
        n41Var2.addView(n5Var, z5.e(54, 24, 53));
        n41Var2.addView(bVar, z5.e(44, 44, 51));
        n41Var2.addView(dVar, z5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        n41Var2.addView(c6Var, z5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        n5 n5Var = cVar.f46170f;
        h20.d(n5Var, cVar.H.e);
        int i10 = k6.A6;
        sn snVar = cVar.d;
        n5Var.setTextColor(i0.a.f(cVar.I.e, k6.w0(i10, snVar.getResourceProvider()), k6.w0(k6.f21404p7, snVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.A6));
        hashSet.add(Integer.valueOf(k6.f21404p7));
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
        t1 t1Var2 = this.f46171n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f46171n.isAttachedToWindow() && this.f46172r == id2 && (aVar = (t1Var = this.f46171n).f23313a6) != null && t1Var.f23498n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                t1 t1Var3 = this.f46171n;
                int[] iArr = this.f46176y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                n41 n41Var = this.f46174w;
                if (i12 != width) {
                    layoutParams.width = width;
                    n41Var.setLayoutParams(layoutParams);
                }
                n41Var.setTranslationX(rect.left);
                n41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            kg kgVar = this.f46173s;
            if (kgVar != null) {
                kgVar.run();
                this.f46173s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f46171n = t1Var;
        this.f46172r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f46168b;
            bVar.f46165b.setColorFilter(porterDuffColorFilter);
            bVar.f46166c.setColorFilter(porterDuffColorFilter);
            this.f46169c.f46177a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f46167a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }

    @Override
    public final void updateColors() {
        sn snVar;
        try {
            n5 n5Var = this.f46170f;
            if (n5Var != null && (snVar = this.d) != null) {
                n5Var.setTextColor(i0.a.f(this.I.e, k6.w0(k6.A6, snVar.getResourceProvider()), k6.w0(k6.f21404p7, snVar.getResourceProvider())));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
