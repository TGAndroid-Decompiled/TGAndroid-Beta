package qh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import ci.h2;
import m4.w;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q20;
import org.telegram.ui.sg;
import org.telegram.ui.uy0;
import org.telegram.ui.v51;
import org.telegram.ui.zn;
import w7.x5;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final me.b H;
    public final me.b I;
    public final c6 f46772a;
    public final b f46773b;
    public final d f46774c;
    public final zn d;
    public final FrameLayout.LayoutParams f46775e;
    public final h5 f46776f;
    public e h;
    public u1 f46777n;
    public int f46778r;
    public sg f46779s;
    public final v51 v;
    public final v51 f46780w;
    public final int f46781x;
    public final int[] f46782y;

    public c(Activity activity, d6 d6Var, zn znVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f46775e = layoutParams;
        this.f46782y = new int[2];
        this.E = new Rect();
        w wVar = new w(this, 27);
        is isVar = is.h;
        this.H = new me.b(0, wVar, isVar, 380L, false);
        this.I = new me.b(0, new w(this, 27), isVar, 380L, false);
        this.d = znVar;
        this.f46781x = znVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, d6Var, 2);
        this.f46772a = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        c6Var.setTextColor(h6.w0(h6.G6, d6Var));
        c6Var.setLinkTextColor(h6.w0(h6.gc, d6Var));
        c6Var.setHintTextColor(h6.w0(h6.H6, d6Var));
        c6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var.setTextSize(1, 15.0f);
        c6Var.setMaxLines(Integer.MAX_VALUE);
        c6Var.setBackground(null);
        c6Var.setImeOptions(268435462);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.addTextChangedListener(new h2(this, 19));
        b bVar = new b(activity);
        this.f46773b = bVar;
        int i10 = h6.Vh;
        bVar.setBackground(h6.g0(h6.w0(i10, d6Var), 1, -1));
        z5.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f46774c = dVar;
        dVar.setBackground(h6.g0(h6.w0(i10, d6Var), 1, -1));
        dVar.setOnClickListener(new uy0(21, this, znVar));
        z5.a(dVar);
        h5 h5Var = new h5(getContext());
        this.f46776f = h5Var;
        h5Var.setTextSize(13);
        h5Var.setGravity(17);
        h5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        h5Var.setVisibility(8);
        v51 v51Var = new v51(activity, 9);
        this.f46780w = v51Var;
        addView(v51Var, layoutParams);
        v51 v51Var2 = new v51(activity, 8);
        this.v = v51Var2;
        v51Var.addView(v51Var2, x5.d(-2.0f, -1));
        v51Var2.addView(h5Var, x5.e(54, 24, 53));
        v51Var2.addView(bVar, x5.e(44, 44, 51));
        v51Var2.addView(dVar, x5.a(44.0f, 0.0f, 0.0f, 5.0f, 0.0f, 44, 53));
        v51Var2.addView(c6Var, x5.a(-2.0f, 39.0f, 0.0f, 47.0f, 0.0f, -1, 119));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        h5 h5Var = cVar.f46776f;
        q20.d(h5Var, cVar.H.f16401e);
        int i10 = h6.A6;
        zn znVar = cVar.d;
        h5Var.setTextColor(i0.a.d(cVar.I.f16401e, h6.w0(i10, znVar.getResourceProvider()), h6.w0(h6.f21043p7, znVar.getResourceProvider())));
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
        sh.a aVar;
        u1 u1Var2 = this.f46777n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f46777n.isAttachedToWindow() && this.f46778r == id2 && (aVar = (u1Var = this.f46777n).f23142a6) != null && u1Var.f23326n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f46777n;
                int[] iArr = this.f46782y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f46775e;
                int i12 = layoutParams.width;
                v51 v51Var = this.f46780w;
                if (i12 != width) {
                    layoutParams.width = width;
                    v51Var.setLayoutParams(layoutParams);
                }
                v51Var.setTranslationX(rect.left);
                v51Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            sg sgVar = this.f46779s;
            if (sgVar != null) {
                sgVar.run();
                this.f46779s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f46777n = u1Var;
        this.f46778r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f46773b;
            bVar.f46770b.setColorFilter(porterDuffColorFilter);
            bVar.f46771c.setColorFilter(porterDuffColorFilter);
            this.f46774c.f46783a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f46772a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
