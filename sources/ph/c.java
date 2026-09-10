package ph;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import bi.u2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import org.telegram.ui.m91;
import org.telegram.ui.vg;
import org.telegram.ui.w71;
import w7.a6;
import w7.c6;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.b H;
    public final le.b I;
    public final d6 f40395a;
    public final b f40396b;
    public final d f40397c;
    public final eo d;
    public final FrameLayout.LayoutParams e;
    public final l5 f40398f;
    public e h;
    public t1 f40399n;
    public int f40400r;
    public vg f40401s;
    public final m91 v;
    public final m91 f40402w;
    public final int f40403x;
    public final int[] f40404y;

    public c(Activity activity, f6 f6Var, eo eoVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f40404y = new int[2];
        this.E = new Rect();
        org.telegram.tgnet.j jVar = new org.telegram.tgnet.j(this, 16);
        wr wrVar = wr.h;
        this.H = new le.b(0, jVar, wrVar, 380L, false);
        this.I = new le.b(0, new org.telegram.tgnet.j(this, 16), wrVar, 380L, false);
        this.d = eoVar;
        this.f40403x = eoVar.getMessagesController().config.pollAnswerLengthMax.get();
        d6 d6Var = new d6(this, activity, f6Var, 2);
        this.f40395a = d6Var;
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
        d6Var.addTextChangedListener(new u2(this, 16));
        b bVar = new b(activity);
        this.f40396b = bVar;
        int i10 = j6.Vh;
        bVar.setBackground(j6.f0(j6.v0(i10, f6Var), 1, -1));
        c6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f40397c = dVar;
        dVar.setBackground(j6.f0(j6.v0(i10, f6Var), 1, -1));
        dVar.setOnClickListener(new w71(11, this, eoVar));
        c6.a(dVar);
        l5 l5Var = new l5(getContext());
        this.f40398f = l5Var;
        l5Var.setTextSize(13);
        l5Var.setGravity(17);
        l5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        l5Var.setVisibility(8);
        m91 m91Var = new m91(activity, 8);
        this.f40402w = m91Var;
        addView(m91Var, layoutParams);
        m91 m91Var2 = new m91(activity, 7);
        this.v = m91Var2;
        m91Var.addView(m91Var2, a6.c(-2.0f, -1));
        m91Var2.addView(l5Var, a6.e(54, 24, 53));
        m91Var2.addView(bVar, a6.e(44, 44, 51));
        m91Var2.addView(dVar, a6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        m91Var2.addView(d6Var, a6.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        d6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        l5 l5Var = cVar.f40398f;
        h20.d(l5Var, cVar.H.e);
        int i10 = j6.A6;
        eo eoVar = cVar.d;
        l5Var.setTextColor(i0.a.d(cVar.I.e, j6.v0(i10, eoVar.getResourceProvider()), j6.v0(j6.f18144p7, eoVar.getResourceProvider())));
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
        rh.a aVar;
        t1 t1Var2 = this.f40399n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f40399n.isAttachedToWindow() && this.f40400r == id2 && (aVar = (t1Var = this.f40399n).f20059a6) != null && t1Var.f20243n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                t1 t1Var3 = this.f40399n;
                int[] iArr = this.f40404y;
                t1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                m91 m91Var = this.f40402w;
                if (i12 != width) {
                    layoutParams.width = width;
                    m91Var.setLayoutParams(layoutParams);
                }
                m91Var.setTranslationX(rect.left);
                m91Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            vg vgVar = this.f40401s;
            if (vgVar != null) {
                vgVar.run();
                this.f40401s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f40399n = t1Var;
        this.f40400r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f40396b;
            bVar.f40393b.setColorFilter(porterDuffColorFilter);
            bVar.f40394c.setColorFilter(porterDuffColorFilter);
            this.f40397c.f40405a.setColorFilter(porterDuffColorFilter);
            d6 d6Var = this.f40395a;
            d6Var.setCursorColor(i10);
            d6Var.setHandlesColor(i10);
            d6Var.setHintTextColor(i10);
        }
    }
}
