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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.p20;
import org.telegram.ui.tg;
import org.telegram.ui.vy0;
import org.telegram.ui.w51;
import org.telegram.ui.zn;
import w7.x5;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final me.b H;
    public final me.b I;
    public final c6 f46661a;
    public final b f46662b;
    public final d f46663c;
    public final zn d;
    public final FrameLayout.LayoutParams f46664e;
    public final j5 f46665f;
    public e h;
    public u1 f46666n;
    public int f46667r;
    public tg f46668s;
    public final w51 v;
    public final w51 f46669w;
    public final int f46670x;
    public final int[] f46671y;

    public c(Activity activity, e6 e6Var, zn znVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f46664e = layoutParams;
        this.f46671y = new int[2];
        this.E = new Rect();
        w wVar = new w(this, 27);
        hs hsVar = hs.h;
        this.H = new me.b(0, wVar, hsVar, 380L, false);
        this.I = new me.b(0, new w(this, 27), hsVar, 380L, false);
        this.d = znVar;
        this.f46670x = znVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, e6Var, 2);
        this.f46661a = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        c6Var.setTextColor(i6.w0(i6.G6, e6Var));
        c6Var.setLinkTextColor(i6.w0(i6.gc, e6Var));
        c6Var.setHintTextColor(i6.w0(i6.H6, e6Var));
        c6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var.setTextSize(1, 15.0f);
        c6Var.setMaxLines(Integer.MAX_VALUE);
        c6Var.setBackground(null);
        c6Var.setImeOptions(268435462);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.addTextChangedListener(new h2(this, 19));
        b bVar = new b(activity);
        this.f46662b = bVar;
        int i10 = i6.Vh;
        bVar.setBackground(i6.g0(i6.w0(i10, e6Var), 1, -1));
        z5.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f46663c = dVar;
        dVar.setBackground(i6.g0(i6.w0(i10, e6Var), 1, -1));
        dVar.setOnClickListener(new vy0(21, this, znVar));
        z5.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f46665f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        w51 w51Var = new w51(activity, 9);
        this.f46669w = w51Var;
        addView(w51Var, layoutParams);
        w51 w51Var2 = new w51(activity, 8);
        this.v = w51Var2;
        w51Var.addView(w51Var2, x5.d(-2.0f, -1));
        w51Var2.addView(j5Var, x5.e(54, 24, 53));
        w51Var2.addView(bVar, x5.e(44, 44, 51));
        w51Var2.addView(dVar, x5.a(44.0f, 0.0f, 0.0f, 5.0f, 0.0f, 44, 53));
        w51Var2.addView(c6Var, x5.a(-2.0f, 39.0f, 0.0f, 47.0f, 0.0f, -1, 119));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f46665f;
        p20.d(j5Var, cVar.H.f16337e);
        int i10 = i6.A6;
        zn znVar = cVar.d;
        j5Var.setTextColor(i0.a.d(cVar.I.f16337e, i6.w0(i10, znVar.getResourceProvider()), i6.w0(i6.f21018p7, znVar.getResourceProvider())));
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
        u1 u1Var2 = this.f46666n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f46666n.isAttachedToWindow() && this.f46667r == id2 && (aVar = (u1Var = this.f46666n).f23114a6) != null && u1Var.f23298n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f46666n;
                int[] iArr = this.f46671y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f46664e;
                int i12 = layoutParams.width;
                w51 w51Var = this.f46669w;
                if (i12 != width) {
                    layoutParams.width = width;
                    w51Var.setLayoutParams(layoutParams);
                }
                w51Var.setTranslationX(rect.left);
                w51Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            tg tgVar = this.f46668s;
            if (tgVar != null) {
                tgVar.run();
                this.f46668s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f46666n = u1Var;
        this.f46667r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f46662b;
            bVar.f46659b.setColorFilter(porterDuffColorFilter);
            bVar.f46660c.setColorFilter(porterDuffColorFilter);
            this.f46663c.f46672a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f46661a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
