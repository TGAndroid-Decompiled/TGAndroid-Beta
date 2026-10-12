package rh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import di.h2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.l20;
import org.telegram.ui.bz0;
import org.telegram.ui.d61;
import org.telegram.ui.fo;
import org.telegram.ui.xg;
import rg.b0;
import w7.a6;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final ne.b H;
    public final ne.b I;
    public final c6 f44652a;
    public final b f44653b;
    public final d f44654c;
    public final fo d;
    public final FrameLayout.LayoutParams e;
    public final h5 f44655f;
    public e h;
    public u1 f44656n;
    public int f44657r;
    public xg f44658s;
    public final d61 v;
    public final d61 f44659w;
    public final int f44660x;
    public final int[] f44661y;

    public c(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, fo foVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f44661y = new int[2];
        this.E = new Rect();
        b0 b0Var = new b0(this, 6);
        es esVar = es.h;
        this.H = new ne.b(0, b0Var, esVar, 380L, false);
        this.I = new ne.b(0, new b0(this, 6), esVar, 380L, false);
        this.d = foVar;
        this.f44660x = foVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var2 = new c6(this, activity, c6Var, 2);
        this.f44652a = c6Var2;
        c6Var2.setAllowTextEntitiesIntersection(true);
        c6Var2.setTextColor(g6.w0(g6.G6, c6Var));
        c6Var2.setLinkTextColor(g6.w0(g6.f19960gc, c6Var));
        c6Var2.setHintTextColor(g6.w0(g6.H6, c6Var));
        c6Var2.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var2.setTextSize(1, 15.0f);
        c6Var2.setMaxLines(Integer.MAX_VALUE);
        c6Var2.setBackground(null);
        c6Var2.setImeOptions(268435462);
        c6Var2.setInputType(c6Var2.getInputType() | 16384);
        c6Var2.addTextChangedListener(new h2(this, 19));
        b bVar = new b(activity);
        this.f44653b = bVar;
        int i10 = g6.Vh;
        bVar.setBackground(g6.g0(g6.w0(i10, c6Var), 1, -1));
        w7.c6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f44654c = dVar;
        dVar.setBackground(g6.g0(g6.w0(i10, c6Var), 1, -1));
        dVar.setOnClickListener(new bz0(21, this, foVar));
        w7.c6.a(dVar);
        h5 h5Var = new h5(getContext());
        this.f44655f = h5Var;
        h5Var.setTextSize(13);
        h5Var.setGravity(17);
        h5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        h5Var.setVisibility(8);
        d61 d61Var = new d61(activity, 9);
        this.f44659w = d61Var;
        addView(d61Var, layoutParams);
        d61 d61Var2 = new d61(activity, 8);
        this.v = d61Var2;
        d61Var.addView(d61Var2, a6.d(-2.0f, -1));
        d61Var2.addView(h5Var, a6.e(54, 24, 53));
        d61Var2.addView(bVar, a6.e(44, 44, 51));
        d61Var2.addView(dVar, a6.a(44.0f, 0.0f, 0.0f, 5.0f, 0.0f, 44, 53));
        d61Var2.addView(c6Var2, a6.a(-2.0f, 39.0f, 0.0f, 47.0f, 0.0f, -1, 119));
        c6Var2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        h5 h5Var = cVar.f44655f;
        l20.d(h5Var, cVar.H.e);
        int i10 = g6.A6;
        fo foVar = cVar.d;
        h5Var.setTextColor(i0.a.d(cVar.I.e, g6.w0(i10, foVar.getResourceProvider()), g6.w0(g6.f20122p7, foVar.getResourceProvider())));
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
        u1 u1Var;
        th.a aVar;
        u1 u1Var2 = this.f44656n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f44656n.isAttachedToWindow() && this.f44657r == id2 && (aVar = (u1Var = this.f44656n).f22142a6) != null && u1Var.f22327n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f44656n;
                int[] iArr = this.f44661y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                d61 d61Var = this.f44659w;
                if (i12 != width) {
                    layoutParams.width = width;
                    d61Var.setLayoutParams(layoutParams);
                }
                d61Var.setTranslationX(rect.left);
                d61Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            xg xgVar = this.f44658s;
            if (xgVar != null) {
                xgVar.run();
                this.f44658s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f44656n = u1Var;
        this.f44657r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f44653b;
            bVar.f44650b.setColorFilter(porterDuffColorFilter);
            bVar.f44651c.setColorFilter(porterDuffColorFilter);
            this.f44654c.f44662a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f44652a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
