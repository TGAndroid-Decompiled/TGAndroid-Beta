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
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.y10;
import org.telegram.ui.bo;
import org.telegram.ui.s51;
import org.telegram.ui.ug;
import org.telegram.ui.vy0;
import w7.x5;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.b H;
    public final le.b I;
    public final b6 f41752a;
    public final b f41753b;
    public final d f41754c;
    public final bo d;
    public final FrameLayout.LayoutParams e;
    public final j5 f41755f;
    public e h;
    public t1 f41756n;
    public int f41757r;
    public ug f41758s;
    public final s51 v;
    public final s51 f41759w;
    public final int f41760x;
    public final int[] f41761y;

    public c(Activity activity, e6 e6Var, bo boVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f41761y = new int[2];
        this.E = new Rect();
        v vVar = new v(this, 27);
        qr qrVar = qr.h;
        this.H = new le.b(0, vVar, qrVar, 380L, false);
        this.I = new le.b(0, new v(this, 27), qrVar, 380L, false);
        this.d = boVar;
        this.f41760x = boVar.getMessagesController().config.pollAnswerLengthMax.get();
        b6 b6Var = new b6(this, activity, e6Var, 2);
        this.f41752a = b6Var;
        b6Var.setAllowTextEntitiesIntersection(true);
        b6Var.setTextColor(i6.v0(i6.G6, e6Var));
        b6Var.setLinkTextColor(i6.v0(i6.gc, e6Var));
        b6Var.setHintTextColor(i6.v0(i6.H6, e6Var));
        b6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        b6Var.setTextSize(1, 15.0f);
        b6Var.setMaxLines(Integer.MAX_VALUE);
        b6Var.setBackground(null);
        b6Var.setImeOptions(268435462);
        b6Var.setInputType(b6Var.getInputType() | 16384);
        b6Var.addTextChangedListener(new i2(this, 16));
        b bVar = new b(activity);
        this.f41753b = bVar;
        int i10 = i6.Vh;
        bVar.setBackground(i6.f0(i6.v0(i10, e6Var), 1, -1));
        z5.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f41754c = dVar;
        dVar.setBackground(i6.f0(i6.v0(i10, e6Var), 1, -1));
        dVar.setOnClickListener(new vy0(15, this, boVar));
        z5.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f41755f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        s51 s51Var = new s51(activity, 9);
        this.f41759w = s51Var;
        addView(s51Var, layoutParams);
        s51 s51Var2 = new s51(activity, 8);
        this.v = s51Var2;
        s51Var.addView(s51Var2, x5.c(-2.0f, -1));
        s51Var2.addView(j5Var, x5.e(54, 24, 53));
        s51Var2.addView(bVar, x5.e(44, 44, 51));
        s51Var2.addView(dVar, x5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        s51Var2.addView(b6Var, x5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        b6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f41755f;
        y10.d(j5Var, cVar.H.e);
        int i10 = i6.A6;
        bo boVar = cVar.d;
        j5Var.setTextColor(i0.a.d(cVar.I.e, i6.v0(i10, boVar.getResourceProvider()), i6.v0(i6.f19056p7, boVar.getResourceProvider())));
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
        t1 t1Var2 = this.f41756n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f41756n.isAttachedToWindow() && this.f41757r == id2 && (aVar = (t1Var = this.f41756n).f20977a6) != null && t1Var.f21162n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                t1 t1Var3 = this.f41756n;
                int[] iArr = this.f41761y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                s51 s51Var = this.f41759w;
                if (i12 != width) {
                    layoutParams.width = width;
                    s51Var.setLayoutParams(layoutParams);
                }
                s51Var.setTranslationX(rect.left);
                s51Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ug ugVar = this.f41758s;
            if (ugVar != null) {
                ugVar.run();
                this.f41758s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f41756n = t1Var;
        this.f41757r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f41753b;
            bVar.f41750b.setColorFilter(porterDuffColorFilter);
            bVar.f41751c.setColorFilter(porterDuffColorFilter);
            this.f41754c.f41762a.setColorFilter(porterDuffColorFilter);
            b6 b6Var = this.f41752a;
            b6Var.setCursorColor(i10);
            b6Var.setHandlesColor(i10);
            b6Var.setHintTextColor(i10);
        }
    }
}
