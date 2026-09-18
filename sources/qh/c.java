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
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.y10;
import org.telegram.ui.r41;
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
    public final c6 f42006a;
    public final b f42007b;
    public final d f42008c;
    public final zn d;
    public final FrameLayout.LayoutParams e;
    public final j5 f42009f;
    public e h;
    public u1 f42010n;
    public int f42011r;
    public ug f42012s;
    public final r41 v;
    public final r41 f42013w;
    public final int f42014x;
    public final int[] f42015y;

    public c(Activity activity, e6 e6Var, zn znVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f42015y = new int[2];
        this.E = new Rect();
        v vVar = new v(this, 27);
        qr qrVar = qr.h;
        this.H = new le.b(0, vVar, qrVar, 380L, false);
        this.I = new le.b(0, new v(this, 27), qrVar, 380L, false);
        this.d = znVar;
        this.f42014x = znVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, e6Var, 2);
        this.f42006a = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        c6Var.setTextColor(j6.v0(j6.G6, e6Var));
        c6Var.setLinkTextColor(j6.v0(j6.gc, e6Var));
        c6Var.setHintTextColor(j6.v0(j6.H6, e6Var));
        c6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var.setTextSize(1, 15.0f);
        c6Var.setMaxLines(Integer.MAX_VALUE);
        c6Var.setBackground(null);
        c6Var.setImeOptions(268435462);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.addTextChangedListener(new i2(this, 16));
        b bVar = new b(activity);
        this.f42007b = bVar;
        int i10 = j6.Vh;
        bVar.setBackground(j6.f0(j6.v0(i10, e6Var), 1, -1));
        a6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f42008c = dVar;
        dVar.setBackground(j6.f0(j6.v0(i10, e6Var), 1, -1));
        dVar.setOnClickListener(new vy0(15, this, znVar));
        a6.a(dVar);
        j5 j5Var = new j5(getContext());
        this.f42009f = j5Var;
        j5Var.setTextSize(13);
        j5Var.setGravity(17);
        j5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        j5Var.setVisibility(8);
        r41 r41Var = new r41(activity, 10);
        this.f42013w = r41Var;
        addView(r41Var, layoutParams);
        r41 r41Var2 = new r41(activity, 9);
        this.v = r41Var2;
        r41Var.addView(r41Var2, y5.c(-2.0f, -1));
        r41Var2.addView(j5Var, y5.e(54, 24, 53));
        r41Var2.addView(bVar, y5.e(44, 44, 51));
        r41Var2.addView(dVar, y5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        r41Var2.addView(c6Var, y5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        j5 j5Var = cVar.f42009f;
        y10.d(j5Var, cVar.H.e);
        int i10 = j6.A6;
        zn znVar = cVar.d;
        j5Var.setTextColor(i0.a.d(cVar.I.e, j6.v0(i10, znVar.getResourceProvider()), j6.v0(j6.f19283p7, znVar.getResourceProvider())));
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
        u1 u1Var2 = this.f42010n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f42010n.isAttachedToWindow() && this.f42011r == id2 && (aVar = (u1Var = this.f42010n).f21227a6) != null && u1Var.f21412n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f42010n;
                int[] iArr = this.f42015y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                r41 r41Var = this.f42013w;
                if (i12 != width) {
                    layoutParams.width = width;
                    r41Var.setLayoutParams(layoutParams);
                }
                r41Var.setTranslationX(rect.left);
                r41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ug ugVar = this.f42012s;
            if (ugVar != null) {
                ugVar.run();
                this.f42012s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f42010n = u1Var;
        this.f42011r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f42007b;
            bVar.f42004b.setColorFilter(porterDuffColorFilter);
            bVar.f42005c.setColorFilter(porterDuffColorFilter);
            this.f42008c.f42016a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f42006a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
