package qh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import ci.i2;
import k2.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.y10;
import org.telegram.ui.u41;
import org.telegram.ui.ug;
import org.telegram.ui.vy0;
import org.telegram.ui.zn;
import w7.a6;
import w7.y5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.b H;
    public final le.b I;
    public final d6 f42072a;
    public final b f42073b;
    public final d f42074c;
    public final zn d;
    public final FrameLayout.LayoutParams e;
    public final j5 f42075f;
    public e h;
    public u1 f42076n;
    public int f42077r;
    public ug f42078s;
    public final u41 v;
    public final u41 f42079w;
    public final int f42080x;
    public final int[] f42081y;

    public c(Activity activity, f6 f6Var, zn znVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f42081y = new int[2];
        this.E = new Rect();
        v vVar = new v(this, 27);
        qr qrVar = qr.h;
        this.H = new le.b(0, vVar, qrVar, 380L, false);
        this.I = new le.b(0, new v(this, 27), qrVar, 380L, false);
        this.d = znVar;
        this.f42080x = znVar.getMessagesController().config.pollAnswerLengthMax.get();
        d6 d6Var = new d6(this, activity, f6Var, 2);
        this.f42072a = d6Var;
        d6Var.setAllowTextEntitiesIntersection(true);
        d6Var.setTextColor(j6.v0(j6.G6, f6Var));
        d6Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        d6Var.setHintTextColor(j6.v0(j6.H6, f6Var));
        d6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        d6Var.setTextSize(1, 15.0f);
        d6Var.setMaxLines(Integer.MAX_VALUE);
        d6Var.setBackground(null);
        d6Var.setImeOptions(268435462);
        d6Var.setInputType(d6Var.getInputType() | 16384);
        d6Var.addTextChangedListener(new i2(this, 16));
        b bVar = new b(activity);
        this.f42073b = bVar;
        int i10 = j6.Vh;
        bVar.setBackground(j6.f0(j6.v0(i10, f6Var), 1, -1));
        a6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f42074c = dVar;
        dVar.setBackground(j6.f0(j6.v0(i10, f6Var), 1, -1));
        dVar.setOnClickListener(new vy0(15, this, znVar));
        a6.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f42075f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        u41 u41Var = new u41(activity, 10);
        this.f42079w = u41Var;
        addView(u41Var, layoutParams);
        u41 u41Var2 = new u41(activity, 9);
        this.v = u41Var2;
        u41Var.addView(u41Var2, y5.c(-2.0f, -1));
        u41Var2.addView(j5Var, y5.e(54, 24, 53));
        u41Var2.addView(bVar, y5.e(44, 44, 51));
        u41Var2.addView(dVar, y5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        u41Var2.addView(d6Var, y5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        d6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f42075f;
        y10.d(j5Var, cVar.H.e);
        int i10 = j6.A6;
        zn znVar = cVar.d;
        j5Var.setTextColor(i0.a.d(cVar.I.e, j6.v0(i10, znVar.getResourceProvider()), j6.v0(j6.f19330p7, znVar.getResourceProvider())));
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
        u1 u1Var2 = this.f42076n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f42076n.isAttachedToWindow() && this.f42077r == id2 && (aVar = (u1Var = this.f42076n).f21245a6) != null && u1Var.f21430n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f42076n;
                int[] iArr = this.f42081y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                u41 u41Var = this.f42079w;
                if (i12 != width) {
                    layoutParams.width = width;
                    u41Var.setLayoutParams(layoutParams);
                }
                u41Var.setTranslationX(rect.left);
                u41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ug ugVar = this.f42078s;
            if (ugVar != null) {
                ugVar.run();
                this.f42078s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f42076n = u1Var;
        this.f42077r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f42073b;
            bVar.f42070b.setColorFilter(porterDuffColorFilter);
            bVar.f42071c.setColorFilter(porterDuffColorFilter);
            this.f42074c.f42082a.setColorFilter(porterDuffColorFilter);
            d6 d6Var = this.f42072a;
            d6Var.setCursorColor(i10);
            d6Var.setHandlesColor(i10);
            d6Var.setHintTextColor(i10);
        }
    }
}
