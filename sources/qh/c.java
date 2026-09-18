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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.y10;
import org.telegram.ui.bo;
import org.telegram.ui.t41;
import org.telegram.ui.wg;
import org.telegram.ui.xy0;
import w7.x5;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.b H;
    public final le.b I;
    public final b6 f41779a;
    public final b f41780b;
    public final d f41781c;
    public final bo d;
    public final FrameLayout.LayoutParams e;
    public final k5 f41782f;
    public e h;
    public t1 f41783n;
    public int f41784r;
    public wg f41785s;
    public final t41 v;
    public final t41 f41786w;
    public final int f41787x;
    public final int[] f41788y;

    public c(Activity activity, f6 f6Var, bo boVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f41788y = new int[2];
        this.E = new Rect();
        v vVar = new v(this, 27);
        qr qrVar = qr.h;
        this.H = new le.b(0, vVar, qrVar, 380L, false);
        this.I = new le.b(0, new v(this, 27), qrVar, 380L, false);
        this.d = boVar;
        this.f41787x = boVar.getMessagesController().config.pollAnswerLengthMax.get();
        b6 b6Var = new b6(this, activity, f6Var, 2);
        this.f41779a = b6Var;
        b6Var.setAllowTextEntitiesIntersection(true);
        b6Var.setTextColor(j6.v0(j6.G6, f6Var));
        b6Var.setLinkTextColor(j6.v0(j6.gc, f6Var));
        b6Var.setHintTextColor(j6.v0(j6.H6, f6Var));
        b6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        b6Var.setTextSize(1, 15.0f);
        b6Var.setMaxLines(Integer.MAX_VALUE);
        b6Var.setBackground(null);
        b6Var.setImeOptions(268435462);
        b6Var.setInputType(b6Var.getInputType() | 16384);
        b6Var.addTextChangedListener(new i2(this, 16));
        b bVar = new b(activity);
        this.f41780b = bVar;
        int i10 = j6.Vh;
        bVar.setBackground(j6.f0(j6.v0(i10, f6Var), 1, -1));
        z5.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f41781c = dVar;
        dVar.setBackground(j6.f0(j6.v0(i10, f6Var), 1, -1));
        dVar.setOnClickListener(new xy0(15, this, boVar));
        z5.a(dVar);
        k5 k5Var = new k5(getContext());
        this.f41782f = k5Var;
        k5Var.setTextSize(13);
        k5Var.setGravity(17);
        k5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        k5Var.setVisibility(8);
        t41 t41Var = new t41(activity, 10);
        this.f41786w = t41Var;
        addView(t41Var, layoutParams);
        t41 t41Var2 = new t41(activity, 9);
        this.v = t41Var2;
        t41Var.addView(t41Var2, x5.c(-2.0f, -1));
        t41Var2.addView(k5Var, x5.e(54, 24, 53));
        t41Var2.addView(bVar, x5.e(44, 44, 51));
        t41Var2.addView(dVar, x5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        t41Var2.addView(b6Var, x5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        b6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        k5 k5Var = cVar.f41782f;
        y10.d(k5Var, cVar.H.e);
        int i10 = j6.A6;
        bo boVar = cVar.d;
        k5Var.setTextColor(i0.a.d(cVar.I.e, j6.v0(i10, boVar.getResourceProvider()), j6.v0(j6.f19083p7, boVar.getResourceProvider())));
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
        t1 t1Var2 = this.f41783n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f41783n.isAttachedToWindow() && this.f41784r == id2 && (aVar = (t1Var = this.f41783n).f20988a6) != null && t1Var.f21173n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                t1 t1Var3 = this.f41783n;
                int[] iArr = this.f41788y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                t41 t41Var = this.f41786w;
                if (i12 != width) {
                    layoutParams.width = width;
                    t41Var.setLayoutParams(layoutParams);
                }
                t41Var.setTranslationX(rect.left);
                t41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            wg wgVar = this.f41785s;
            if (wgVar != null) {
                wgVar.run();
                this.f41785s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f41783n = t1Var;
        this.f41784r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f41780b;
            bVar.f41777b.setColorFilter(porterDuffColorFilter);
            bVar.f41778c.setColorFilter(porterDuffColorFilter);
            this.f41781c.f41789a.setColorFilter(porterDuffColorFilter);
            b6 b6Var = this.f41779a;
            b6Var.setCursorColor(i10);
            b6Var.setHandlesColor(i10);
            b6Var.setHintTextColor(i10);
        }
    }
}
