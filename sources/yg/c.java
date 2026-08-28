package yg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import fh.s;
import g7.e6;
import g7.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j10;
import org.telegram.ui.b81;
import org.telegram.ui.jg;
import org.telegram.ui.qn;
import pf.v;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect A;
    public ViewTreeObserver B;
    public int C;
    public final td.a D;
    public final td.a E;
    public final s f50208a;
    public final b f50209b;
    public final d f50210c;
    public final qn d;
    public final FrameLayout.LayoutParams f50211e;
    public final h5 f50212f;
    public e h;
    public t1 f50213n;
    public int f50214r;
    public jg f50215s;
    public final b81 v;
    public final b81 f50216w;
    public final int f50217x;
    public final int[] f50218y;

    public c(Activity activity, b6 b6Var, qn qnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f50211e = layoutParams;
        this.f50218y = new int[2];
        this.A = new Rect();
        t0.c cVar = new t0.c(this, 16);
        gr grVar = gr.h;
        this.D = new td.a(0, cVar, grVar, 380L, false);
        this.E = new td.a(0, new t0.c(this, 16), grVar, 380L, false);
        this.d = qnVar;
        this.f50217x = qnVar.getMessagesController().config.pollAnswerLengthMax.get();
        s sVar = new s(this, activity, b6Var, 3);
        this.f50208a = sVar;
        sVar.setAllowTextEntitiesIntersection(true);
        sVar.setTextColor(f6.v0(f6.G6, b6Var));
        sVar.setLinkTextColor(f6.v0(f6.f23061gc, b6Var));
        sVar.setHintTextColor(f6.v0(f6.H6, b6Var));
        sVar.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        sVar.setTextSize(1, 15.0f);
        sVar.setMaxLines(Integer.MAX_VALUE);
        sVar.setBackground(null);
        sVar.setImeOptions(268435462);
        sVar.setInputType(sVar.getInputType() | 16384);
        sVar.addTextChangedListener(new bh.f(this, 19));
        b bVar = new b(activity);
        this.f50209b = bVar;
        int i9 = f6.Vh;
        bVar.setBackground(f6.f0(f6.v0(i9, b6Var), 1, -1));
        g6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f50210c = dVar;
        dVar.setBackground(f6.f0(f6.v0(i9, b6Var), 1, -1));
        dVar.setOnClickListener(new v(6, this, qnVar));
        g6.a(dVar);
        h5 h5Var = new h5(getContext());
        this.f50212f = h5Var;
        h5Var.setTextSize(13);
        h5Var.setGravity(17);
        h5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        h5Var.setVisibility(8);
        b81 b81Var = new b81(activity, 10);
        this.f50216w = b81Var;
        addView(b81Var, layoutParams);
        b81 b81Var2 = new b81(activity, 9);
        this.v = b81Var2;
        b81Var.addView(b81Var2, e6.c(-2.0f, -1));
        b81Var2.addView(h5Var, e6.e(54, 24, 53));
        b81Var2.addView(bVar, e6.e(44, 44, 51));
        b81Var2.addView(dVar, e6.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        b81Var2.addView(sVar, e6.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        sVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        h5 h5Var = cVar.f50212f;
        j10.d(h5Var, cVar.D.f47775e);
        int i9 = f6.A6;
        qn qnVar = cVar.d;
        h5Var.setTextColor(i0.a.d(cVar.E.f47775e, f6.v0(i9, qnVar.getResourceProvider()), f6.v0(f6.f23212p7, qnVar.getResourceProvider())));
    }

    public e getAttachedMedia() {
        return this.h;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.B = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.B.removeOnPreDrawListener(this);
        }
        this.B = null;
        super.onDetachedFromWindow();
    }

    @Override
    public final boolean onPreDraw() {
        t1 t1Var;
        ah.a aVar;
        t1 t1Var2 = this.f50213n;
        if (t1Var2 != null) {
            int id2 = t1Var2.getMessageObject().getId();
            if (this.f50213n.isAttachedToWindow() && this.f50214r == id2 && (aVar = (t1Var = this.f50213n).W5) != null && t1Var.f25436j6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.A;
                rect.set(bounds);
                t1 t1Var3 = this.f50213n;
                int[] iArr = this.f50218y;
                t1Var3.getLocationInWindow(iArr);
                int i9 = iArr[0];
                int i10 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i9 - iArr[0], i10 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f50211e;
                int i11 = layoutParams.width;
                b81 b81Var = this.f50216w;
                if (i11 != width) {
                    layoutParams.width = width;
                    b81Var.setLayoutParams(layoutParams);
                }
                b81Var.setTranslationX(rect.left);
                b81Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            jg jgVar = this.f50215s;
            if (jgVar != null) {
                jgVar.run();
                this.f50215s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.v.setAlpha(f10);
    }

    public void setCellToWatch(t1 t1Var) {
        this.f50213n = t1Var;
        this.f50214r = t1Var.getMessageObject().getId();
    }

    public void setColor(int i9) {
        if (this.C != i9) {
            this.C = i9;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
            b bVar = this.f50209b;
            bVar.f50206b.setColorFilter(porterDuffColorFilter);
            bVar.f50207c.setColorFilter(porterDuffColorFilter);
            this.f50210c.f50219a.setColorFilter(porterDuffColorFilter);
            s sVar = this.f50208a;
            sVar.setCursorColor(i9);
            sVar.setHandlesColor(i9);
            sVar.setHintTextColor(i9);
        }
    }
}
