package rh;

import ai.u;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.h20;
import org.telegram.ui.l41;
import org.telegram.ui.mg;
import org.telegram.ui.sn;
import qg.g0;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final ne.b H;
    public final ne.b I;
    public final b6 f45780a;
    public final b f45781b;
    public final d f45782c;
    public final sn d;
    public final FrameLayout.LayoutParams e;
    public final j5 f45783f;
    public e h;
    public u1 f45784n;
    public int f45785r;
    public mg f45786s;
    public final l41 v;
    public final l41 f45787w;
    public final int f45788x;
    public final int[] f45789y;

    public c(Activity activity, d6 d6Var, sn snVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f45789y = new int[2];
        this.E = new Rect();
        g0 g0Var = new g0(this, 15);
        bs bsVar = bs.h;
        this.H = new ne.b(0, g0Var, bsVar, 380L, false);
        this.I = new ne.b(0, new g0(this, 15), bsVar, 380L, false);
        this.d = snVar;
        this.f45788x = snVar.getMessagesController().config.pollAnswerLengthMax.get();
        b6 b6Var = new b6(this, activity, d6Var, 2);
        this.f45780a = b6Var;
        b6Var.setAllowTextEntitiesIntersection(true);
        b6Var.setTextColor(h6.w0(h6.G6, d6Var));
        b6Var.setLinkTextColor(h6.w0(h6.f21052gc, d6Var));
        b6Var.setHintTextColor(h6.w0(h6.H6, d6Var));
        b6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        b6Var.setTextSize(1, 15.0f);
        b6Var.setMaxLines(Integer.MAX_VALUE);
        b6Var.setBackground(null);
        b6Var.setImeOptions(268435462);
        b6Var.setInputType(b6Var.getInputType() | 16384);
        b6Var.addTextChangedListener(new u(this, 20));
        b bVar = new b(activity);
        this.f45781b = bVar;
        int i10 = h6.Vh;
        bVar.setBackground(h6.g0(h6.w0(i10, d6Var), 1, -1));
        w7.b6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f45782c = dVar;
        dVar.setBackground(h6.g0(h6.w0(i10, d6Var), 1, -1));
        dVar.setOnClickListener(new qg.n(2, this, snVar));
        w7.b6.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f45783f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        l41 l41Var = new l41(activity, 9);
        this.f45787w = l41Var;
        addView(l41Var, layoutParams);
        l41 l41Var2 = new l41(activity, 8);
        this.v = l41Var2;
        l41Var.addView(l41Var2, z5.d(-2.0f, -1));
        l41Var2.addView(j5Var, z5.e(54, 24, 53));
        l41Var2.addView(bVar, z5.e(44, 44, 51));
        l41Var2.addView(dVar, z5.a(44.0f, 0.0f, 0.0f, 5.0f, 0.0f, 44, 53));
        l41Var2.addView(b6Var, z5.a(-2.0f, 39.0f, 0.0f, 47.0f, 0.0f, -1, 119));
        b6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f45783f;
        h20.d(j5Var, cVar.H.e);
        int i10 = h6.A6;
        sn snVar = cVar.d;
        j5Var.setTextColor(i0.a.f(cVar.I.e, h6.w0(i10, snVar.getResourceProvider()), h6.w0(h6.f21214p7, snVar.getResourceProvider())));
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
        u1 u1Var2 = this.f45784n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f45784n.isAttachedToWindow() && this.f45785r == id2 && (aVar = (u1Var = this.f45784n).f23225a6) != null && u1Var.f23410n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f45784n;
                int[] iArr = this.f45789y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                l41 l41Var = this.f45787w;
                if (i12 != width) {
                    layoutParams.width = width;
                    l41Var.setLayoutParams(layoutParams);
                }
                l41Var.setTranslationX(rect.left);
                l41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            mg mgVar = this.f45786s;
            if (mgVar != null) {
                mgVar.run();
                this.f45786s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f45784n = u1Var;
        this.f45785r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f45781b;
            bVar.f45778b.setColorFilter(porterDuffColorFilter);
            bVar.f45779c.setColorFilter(porterDuffColorFilter);
            this.f45782c.f45790a.setColorFilter(porterDuffColorFilter);
            b6 b6Var = this.f45780a;
            b6Var.setCursorColor(i10);
            b6Var.setHandlesColor(i10);
            b6Var.setHintTextColor(i10);
        }
    }
}
