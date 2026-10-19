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
import org.telegram.ui.j41;
import org.telegram.ui.kg;
import org.telegram.ui.qn;
import qg.h0;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final ne.b H;
    public final ne.b I;
    public final b6 f45732a;
    public final b f45733b;
    public final d f45734c;
    public final qn d;
    public final FrameLayout.LayoutParams e;
    public final j5 f45735f;
    public e h;
    public u1 f45736n;
    public int f45737r;
    public kg f45738s;
    public final j41 v;
    public final j41 f45739w;
    public final int f45740x;
    public final int[] f45741y;

    public c(Activity activity, d6 d6Var, qn qnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f45741y = new int[2];
        this.E = new Rect();
        h0 h0Var = new h0(this, 15);
        bs bsVar = bs.h;
        this.H = new ne.b(0, h0Var, bsVar, 380L, false);
        this.I = new ne.b(0, new h0(this, 15), bsVar, 380L, false);
        this.d = qnVar;
        this.f45740x = qnVar.getMessagesController().config.pollAnswerLengthMax.get();
        b6 b6Var = new b6(this, activity, d6Var, 2);
        this.f45732a = b6Var;
        b6Var.setAllowTextEntitiesIntersection(true);
        b6Var.setTextColor(h6.w0(h6.G6, d6Var));
        b6Var.setLinkTextColor(h6.w0(h6.f21048gc, d6Var));
        b6Var.setHintTextColor(h6.w0(h6.H6, d6Var));
        b6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        b6Var.setTextSize(1, 15.0f);
        b6Var.setMaxLines(Integer.MAX_VALUE);
        b6Var.setBackground(null);
        b6Var.setImeOptions(268435462);
        b6Var.setInputType(b6Var.getInputType() | 16384);
        b6Var.addTextChangedListener(new u(this, 20));
        b bVar = new b(activity);
        this.f45733b = bVar;
        int i10 = h6.Vh;
        bVar.setBackground(h6.g0(h6.w0(i10, d6Var), 1, -1));
        w7.b6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f45734c = dVar;
        dVar.setBackground(h6.g0(h6.w0(i10, d6Var), 1, -1));
        dVar.setOnClickListener(new qg.n(2, this, qnVar));
        w7.b6.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f45735f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        j41 j41Var = new j41(activity, 9);
        this.f45739w = j41Var;
        addView(j41Var, layoutParams);
        j41 j41Var2 = new j41(activity, 8);
        this.v = j41Var2;
        j41Var.addView(j41Var2, z5.c(-2.0f, -1));
        j41Var2.addView(j5Var, z5.e(54, 24, 53));
        j41Var2.addView(bVar, z5.e(44, 44, 51));
        j41Var2.addView(dVar, z5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        j41Var2.addView(b6Var, z5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        b6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f45735f;
        h20.d(j5Var, cVar.H.e);
        int i10 = h6.A6;
        qn qnVar = cVar.d;
        j5Var.setTextColor(i0.a.f(cVar.I.e, h6.w0(i10, qnVar.getResourceProvider()), h6.w0(h6.f21210p7, qnVar.getResourceProvider())));
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
        u1 u1Var2 = this.f45736n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f45736n.isAttachedToWindow() && this.f45737r == id2 && (aVar = (u1Var = this.f45736n).f23221a6) != null && u1Var.f23406n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f45736n;
                int[] iArr = this.f45741y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                j41 j41Var = this.f45739w;
                if (i12 != width) {
                    layoutParams.width = width;
                    j41Var.setLayoutParams(layoutParams);
                }
                j41Var.setTranslationX(rect.left);
                j41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            kg kgVar = this.f45738s;
            if (kgVar != null) {
                kgVar.run();
                this.f45738s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f45736n = u1Var;
        this.f45737r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f45733b;
            bVar.f45730b.setColorFilter(porterDuffColorFilter);
            bVar.f45731c.setColorFilter(porterDuffColorFilter);
            this.f45734c.f45742a.setColorFilter(porterDuffColorFilter);
            b6 b6Var = this.f45732a;
            b6Var.setCursorColor(i10);
            b6Var.setHandlesColor(i10);
            b6Var.setHintTextColor(i10);
        }
    }
}
