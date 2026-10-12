package qh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import ci.h2;
import m4.x;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.s20;
import org.telegram.ui.eo;
import org.telegram.ui.wg;
import org.telegram.ui.xy0;
import org.telegram.ui.z51;
import w7.w5;
import w7.y5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final me.b H;
    public final me.b I;
    public final c6 f46608a;
    public final b f46609b;
    public final d f46610c;
    public final eo d;
    public final FrameLayout.LayoutParams f46611e;
    public final h5 f46612f;
    public e h;
    public u1 f46613n;
    public int f46614r;
    public wg f46615s;
    public final z51 v;
    public final z51 f46616w;
    public final int f46617x;
    public final int[] f46618y;

    public c(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, eo eoVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f46611e = layoutParams;
        this.f46618y = new int[2];
        this.E = new Rect();
        x xVar = new x(this, 27);
        js jsVar = js.h;
        this.H = new me.b(0, xVar, jsVar, 380L, false);
        this.I = new me.b(0, new x(this, 27), jsVar, 380L, false);
        this.d = eoVar;
        this.f46617x = eoVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var2 = new c6(this, activity, c6Var, 2);
        this.f46608a = c6Var2;
        c6Var2.setAllowTextEntitiesIntersection(true);
        c6Var2.setTextColor(h6.w0(h6.G6, c6Var));
        c6Var2.setLinkTextColor(h6.w0(h6.gc, c6Var));
        c6Var2.setHintTextColor(h6.w0(h6.H6, c6Var));
        c6Var2.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var2.setTextSize(1, 15.0f);
        c6Var2.setMaxLines(Integer.MAX_VALUE);
        c6Var2.setBackground(null);
        c6Var2.setImeOptions(268435462);
        c6Var2.setInputType(c6Var2.getInputType() | 16384);
        c6Var2.addTextChangedListener(new h2(this, 20));
        b bVar = new b(activity);
        this.f46609b = bVar;
        int i10 = h6.Vh;
        bVar.setBackground(h6.g0(h6.w0(i10, c6Var), 1, -1));
        y5.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f46610c = dVar;
        dVar.setBackground(h6.g0(h6.w0(i10, c6Var), 1, -1));
        dVar.setOnClickListener(new xy0(21, this, eoVar));
        y5.a(dVar);
        h5 h5Var = new h5(getContext());
        this.f46612f = h5Var;
        h5Var.setTextSize(13);
        h5Var.setGravity(17);
        h5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        h5Var.setVisibility(8);
        z51 z51Var = new z51(activity, 9);
        this.f46616w = z51Var;
        addView(z51Var, layoutParams);
        z51 z51Var2 = new z51(activity, 8);
        this.v = z51Var2;
        z51Var.addView(z51Var2, w5.d(-2.0f, -1));
        z51Var2.addView(h5Var, w5.e(54, 24, 53));
        z51Var2.addView(bVar, w5.e(44, 44, 51));
        z51Var2.addView(dVar, w5.a(44.0f, 0.0f, 0.0f, 5.0f, 0.0f, 44, 53));
        z51Var2.addView(c6Var2, w5.a(-2.0f, 39.0f, 0.0f, 47.0f, 0.0f, -1, 119));
        c6Var2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        h5 h5Var = cVar.f46612f;
        s20.d(h5Var, cVar.H.f16088e);
        int i10 = h6.A6;
        eo eoVar = cVar.d;
        h5Var.setTextColor(i0.a.d(cVar.I.f16088e, h6.w0(i10, eoVar.getResourceProvider()), h6.w0(h6.f20781p7, eoVar.getResourceProvider())));
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
        u1 u1Var2 = this.f46613n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f46613n.isAttachedToWindow() && this.f46614r == id2 && (aVar = (u1Var = this.f46613n).f22887a6) != null && u1Var.f23071n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f46613n;
                int[] iArr = this.f46618y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f46611e;
                int i12 = layoutParams.width;
                z51 z51Var = this.f46616w;
                if (i12 != width) {
                    layoutParams.width = width;
                    z51Var.setLayoutParams(layoutParams);
                }
                z51Var.setTranslationX(rect.left);
                z51Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            wg wgVar = this.f46615s;
            if (wgVar != null) {
                wgVar.run();
                this.f46615s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f46613n = u1Var;
        this.f46614r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f46609b;
            bVar.f46606b.setColorFilter(porterDuffColorFilter);
            bVar.f46607c.setColorFilter(porterDuffColorFilter);
            this.f46610c.f46619a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f46608a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
