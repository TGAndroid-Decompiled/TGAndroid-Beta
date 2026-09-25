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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.z10;
import org.telegram.ui.m51;
import org.telegram.ui.ny0;
import org.telegram.ui.rg;
import org.telegram.ui.wn;
import w7.a6;
import w7.y5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.c H;
    public final le.c I;
    public final c6 f42038a;
    public final b f42039b;
    public final d f42040c;
    public final wn d;
    public final FrameLayout.LayoutParams e;
    public final h5 f42041f;
    public e h;
    public u1 f42042n;
    public int f42043r;
    public rg f42044s;
    public final m51 v;
    public final m51 f42045w;
    public final int f42046x;
    public final int[] f42047y;

    public c(Activity activity, d6 d6Var, wn wnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f42047y = new int[2];
        this.E = new Rect();
        le.b bVar = new le.b(this, 27);
        rr rrVar = rr.h;
        this.H = new le.c(0, bVar, rrVar, 380L, false);
        this.I = new le.c(0, new le.b(this, 27), rrVar, 380L, false);
        this.d = wnVar;
        this.f42046x = wnVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, d6Var, 2);
        this.f42038a = c6Var;
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
        this.f42039b = bVar2;
        int i10 = h6.Vh;
        bVar2.setBackground(h6.f0(h6.v0(i10, d6Var), 1, -1));
        a6.a(bVar2);
        d dVar = new d(getContext(), 36);
        this.f42040c = dVar;
        dVar.setBackground(h6.f0(h6.v0(i10, d6Var), 1, -1));
        dVar.setOnClickListener(new ny0(15, this, wnVar));
        a6.a(dVar);
        h5 h5Var = new h5(getContext());
        this.f42041f = h5Var;
        h5Var.setTextSize(13);
        h5Var.setGravity(17);
        h5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        h5Var.setVisibility(8);
        m51 m51Var = new m51(activity, 9);
        this.f42045w = m51Var;
        addView(m51Var, layoutParams);
        m51 m51Var2 = new m51(activity, 8);
        this.v = m51Var2;
        m51Var.addView(m51Var2, y5.c(-2.0f, -1));
        m51Var2.addView(h5Var, y5.e(54, 24, 53));
        m51Var2.addView(bVar2, y5.e(44, 44, 51));
        m51Var2.addView(dVar, y5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        m51Var2.addView(c6Var, y5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        h5 h5Var = cVar.f42041f;
        z10.d(h5Var, cVar.H.e);
        int i10 = h6.A6;
        wn wnVar = cVar.d;
        h5Var.setTextColor(i0.a.d(cVar.I.e, h6.v0(i10, wnVar.getResourceProvider()), h6.v0(h6.f19280p7, wnVar.getResourceProvider())));
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
        u1 u1Var2 = this.f42042n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f42042n.isAttachedToWindow() && this.f42043r == id2 && (aVar = (u1Var = this.f42042n).f21264a6) != null && u1Var.f21448n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f42042n;
                int[] iArr = this.f42047y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                m51 m51Var = this.f42045w;
                if (i12 != width) {
                    layoutParams.width = width;
                    m51Var.setLayoutParams(layoutParams);
                }
                m51Var.setTranslationX(rect.left);
                m51Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            rg rgVar = this.f42044s;
            if (rgVar != null) {
                rgVar.run();
                this.f42044s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f42042n = u1Var;
        this.f42043r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f42039b;
            bVar.f42036b.setColorFilter(porterDuffColorFilter);
            bVar.f42037c.setColorFilter(porterDuffColorFilter);
            this.f42040c.f42048a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f42038a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
