package qh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import ci.i2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.sr;
import org.telegram.ui.n41;
import org.telegram.ui.py0;
import org.telegram.ui.ug;
import org.telegram.ui.xn;
import w7.a6;
import w7.y5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.c H;
    public final le.c I;
    public final c6 f42067a;
    public final b f42068b;
    public final d f42069c;
    public final xn d;
    public final FrameLayout.LayoutParams e;
    public final j5 f42070f;
    public e h;
    public u1 f42071n;
    public int f42072r;
    public ug f42073s;
    public final n41 v;
    public final n41 f42074w;
    public final int f42075x;
    public final int[] f42076y;

    public c(Activity activity, e6 e6Var, xn xnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f42076y = new int[2];
        this.E = new Rect();
        le.b bVar = new le.b(this, 28);
        sr srVar = sr.h;
        this.H = new le.c(0, bVar, srVar, 380L, false);
        this.I = new le.c(0, new le.b(this, 28), srVar, 380L, false);
        this.d = xnVar;
        this.f42075x = xnVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, e6Var, 2);
        this.f42067a = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        c6Var.setTextColor(i6.v0(i6.G6, e6Var));
        c6Var.setLinkTextColor(i6.v0(i6.gc, e6Var));
        c6Var.setHintTextColor(i6.v0(i6.H6, e6Var));
        c6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var.setTextSize(1, 15.0f);
        c6Var.setMaxLines(Integer.MAX_VALUE);
        c6Var.setBackground(null);
        c6Var.setImeOptions(268435462);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.addTextChangedListener(new i2(this, 16));
        b bVar2 = new b(activity);
        this.f42068b = bVar2;
        int i10 = i6.Vh;
        bVar2.setBackground(i6.f0(i6.v0(i10, e6Var), 1, -1));
        a6.a(bVar2);
        d dVar = new d(getContext(), 36);
        this.f42069c = dVar;
        dVar.setBackground(i6.f0(i6.v0(i10, e6Var), 1, -1));
        dVar.setOnClickListener(new py0(15, this, xnVar));
        a6.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f42070f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        n41 n41Var = new n41(activity, 10);
        this.f42074w = n41Var;
        addView(n41Var, layoutParams);
        n41 n41Var2 = new n41(activity, 9);
        this.v = n41Var2;
        n41Var.addView(n41Var2, y5.c(-2.0f, -1));
        n41Var2.addView(j5Var, y5.e(54, 24, 53));
        n41Var2.addView(bVar2, y5.e(44, 44, 51));
        n41Var2.addView(dVar, y5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        n41Var2.addView(c6Var, y5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f42070f;
        b20.d(j5Var, cVar.H.e);
        int i10 = i6.A6;
        xn xnVar = cVar.d;
        j5Var.setTextColor(i0.a.d(cVar.I.e, i6.v0(i10, xnVar.getResourceProvider()), i6.v0(i6.f19278p7, xnVar.getResourceProvider())));
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
        u1 u1Var2 = this.f42071n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f42071n.isAttachedToWindow() && this.f42072r == id2 && (aVar = (u1Var = this.f42071n).f21265a6) != null && u1Var.f21450n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f42071n;
                int[] iArr = this.f42076y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                n41 n41Var = this.f42074w;
                if (i12 != width) {
                    layoutParams.width = width;
                    n41Var.setLayoutParams(layoutParams);
                }
                n41Var.setTranslationX(rect.left);
                n41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ug ugVar = this.f42073s;
            if (ugVar != null) {
                ugVar.run();
                this.f42073s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f42071n = u1Var;
        this.f42072r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f42068b;
            bVar.f42065b.setColorFilter(porterDuffColorFilter);
            bVar.f42066c.setColorFilter(porterDuffColorFilter);
            this.f42069c.f42077a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f42067a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
