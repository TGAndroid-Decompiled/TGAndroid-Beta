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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.z10;
import org.telegram.ui.l51;
import org.telegram.ui.py0;
import org.telegram.ui.sg;
import org.telegram.ui.xn;
import w7.x5;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.c H;
    public final le.c I;
    public final c6 f41704a;
    public final b f41705b;
    public final d f41706c;
    public final xn d;
    public final FrameLayout.LayoutParams e;
    public final i5 f41707f;
    public e h;
    public t1 f41708n;
    public int f41709r;
    public sg f41710s;
    public final l51 v;
    public final l51 f41711w;
    public final int f41712x;
    public final int[] f41713y;

    public c(Activity activity, d6 d6Var, xn xnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f41713y = new int[2];
        this.E = new Rect();
        le.b bVar = new le.b(this, 27);
        rr rrVar = rr.h;
        this.H = new le.c(0, bVar, rrVar, 380L, false);
        this.I = new le.c(0, new le.b(this, 27), rrVar, 380L, false);
        this.d = xnVar;
        this.f41712x = xnVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, d6Var, 2);
        this.f41704a = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        c6Var.setTextColor(h6.v0(h6.G6, d6Var));
        c6Var.setLinkTextColor(h6.v0(h6.gc, d6Var));
        c6Var.setHintTextColor(h6.v0(h6.H6, d6Var));
        c6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var.setTextSize(1, 15.0f);
        c6Var.setMaxLines(Integer.MAX_VALUE);
        c6Var.setBackground(null);
        c6Var.setImeOptions(268435462);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.addTextChangedListener(new i2(this, 16));
        b bVar2 = new b(activity);
        this.f41705b = bVar2;
        int i10 = h6.Vh;
        bVar2.setBackground(h6.f0(h6.v0(i10, d6Var), 1, -1));
        z5.a(bVar2);
        d dVar = new d(getContext(), 36);
        this.f41706c = dVar;
        dVar.setBackground(h6.f0(h6.v0(i10, d6Var), 1, -1));
        dVar.setOnClickListener(new py0(15, this, xnVar));
        z5.a(dVar);
        i5 i5Var = new i5(getContext());
        this.f41707f = i5Var;
        i5Var.setTextSize(13);
        i5Var.setGravity(17);
        i5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        i5Var.setVisibility(8);
        l51 l51Var = new l51(activity, 9);
        this.f41711w = l51Var;
        addView(l51Var, layoutParams);
        l51 l51Var2 = new l51(activity, 8);
        this.v = l51Var2;
        l51Var.addView(l51Var2, x5.c(-2.0f, -1));
        l51Var2.addView(i5Var, x5.e(54, 24, 53));
        l51Var2.addView(bVar2, x5.e(44, 44, 51));
        l51Var2.addView(dVar, x5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        l51Var2.addView(c6Var, x5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        i5 i5Var = cVar.f41707f;
        z10.d(i5Var, cVar.H.e);
        int i10 = h6.A6;
        xn xnVar = cVar.d;
        i5Var.setTextColor(i0.a.d(cVar.I.e, h6.v0(i10, xnVar.getResourceProvider()), h6.v0(h6.f19008p7, xnVar.getResourceProvider())));
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
        sh.a aVar;
        t1 t1Var2 = this.f41708n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f41708n.isAttachedToWindow() && this.f41709r == id2 && (aVar = (t1Var = this.f41708n).f20948a6) != null && t1Var.f21132n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                t1 t1Var3 = this.f41708n;
                int[] iArr = this.f41713y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                l51 l51Var = this.f41711w;
                if (i12 != width) {
                    layoutParams.width = width;
                    l51Var.setLayoutParams(layoutParams);
                }
                l51Var.setTranslationX(rect.left);
                l51Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            sg sgVar = this.f41710s;
            if (sgVar != null) {
                sgVar.run();
                this.f41710s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f41708n = t1Var;
        this.f41709r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f41705b;
            bVar.f41702b.setColorFilter(porterDuffColorFilter);
            bVar.f41703c.setColorFilter(porterDuffColorFilter);
            this.f41706c.f41714a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f41704a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
