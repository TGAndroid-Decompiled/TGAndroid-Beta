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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.y10;
import org.telegram.ui.bo;
import org.telegram.ui.t51;
import org.telegram.ui.ug;
import org.telegram.ui.wy0;
import w7.x5;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.b H;
    public final le.b I;
    public final c6 f41748a;
    public final b f41749b;
    public final d f41750c;
    public final bo d;
    public final FrameLayout.LayoutParams e;
    public final j5 f41751f;
    public e h;
    public t1 f41752n;
    public int f41753r;
    public ug f41754s;
    public final t51 v;
    public final t51 f41755w;
    public final int f41756x;
    public final int[] f41757y;

    public c(Activity activity, e6 e6Var, bo boVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f41757y = new int[2];
        this.E = new Rect();
        v vVar = new v(this, 26);
        qr qrVar = qr.h;
        this.H = new le.b(0, vVar, qrVar, 380L, false);
        this.I = new le.b(0, new v(this, 26), qrVar, 380L, false);
        this.d = boVar;
        this.f41756x = boVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, e6Var, 2);
        this.f41748a = c6Var;
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
        b bVar = new b(activity);
        this.f41749b = bVar;
        int i10 = i6.Vh;
        bVar.setBackground(i6.f0(i6.v0(i10, e6Var), 1, -1));
        z5.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f41750c = dVar;
        dVar.setBackground(i6.f0(i6.v0(i10, e6Var), 1, -1));
        dVar.setOnClickListener(new wy0(15, this, boVar));
        z5.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f41751f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        t51 t51Var = new t51(activity, 9);
        this.f41755w = t51Var;
        addView(t51Var, layoutParams);
        t51 t51Var2 = new t51(activity, 8);
        this.v = t51Var2;
        t51Var.addView(t51Var2, x5.c(-2.0f, -1));
        t51Var2.addView(j5Var, x5.e(54, 24, 53));
        t51Var2.addView(bVar, x5.e(44, 44, 51));
        t51Var2.addView(dVar, x5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        t51Var2.addView(c6Var, x5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f41751f;
        y10.d(j5Var, cVar.H.e);
        int i10 = i6.A6;
        bo boVar = cVar.d;
        j5Var.setTextColor(i0.a.d(cVar.I.e, i6.v0(i10, boVar.getResourceProvider()), i6.v0(i6.f19053p7, boVar.getResourceProvider())));
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
        t1 t1Var2 = this.f41752n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f41752n.isAttachedToWindow() && this.f41753r == id2 && (aVar = (t1Var = this.f41752n).f20961a6) != null && t1Var.f21145n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                t1 t1Var3 = this.f41752n;
                int[] iArr = this.f41757y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                t51 t51Var = this.f41755w;
                if (i12 != width) {
                    layoutParams.width = width;
                    t51Var.setLayoutParams(layoutParams);
                }
                t51Var.setTranslationX(rect.left);
                t51Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ug ugVar = this.f41754s;
            if (ugVar != null) {
                ugVar.run();
                this.f41754s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f41752n = t1Var;
        this.f41753r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f41749b;
            bVar.f41746b.setColorFilter(porterDuffColorFilter);
            bVar.f41747c.setColorFilter(porterDuffColorFilter);
            this.f41750c.f41758a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f41748a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
