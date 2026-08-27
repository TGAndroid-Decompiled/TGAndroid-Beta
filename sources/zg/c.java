package zg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import h7.b6;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m10;
import org.telegram.ui.lg;
import org.telegram.ui.rn;
import org.telegram.ui.z71;

public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect A;
    public ViewTreeObserver B;
    public int C;
    public final ud.a D;
    public final ud.a E;

    public final gh.r f50804a;

    public final b f50805b;

    public final d f50806c;
    public final rn d;

    public final FrameLayout.LayoutParams f50807e;

    public final h5 f50808f;
    public e h;

    public s1 f50809n;

    public int f50810r;

    public lg f50811s;
    public final z71 v;

    public final z71 f50812w;

    public final int f50813x;

    public final int[] f50814y;

    public c(Activity activity, c6 c6Var, rn rnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f50807e = layoutParams;
        this.f50814y = new int[2];
        this.A = new Rect();
        int i10 = 16;
        t0.c cVar = new t0.c(this, i10);
        er erVar = er.h;
        this.D = new ud.a(0, cVar, erVar, 380L, false);
        this.E = new ud.a(0, new t0.c(this, i10), erVar, 380L, false);
        this.d = rnVar;
        this.f50813x = rnVar.getMessagesController().config.pollAnswerLengthMax.get();
        gh.r rVar = new gh.r(this, activity, c6Var, 3);
        this.f50804a = rVar;
        rVar.setAllowTextEntitiesIntersection(true);
        rVar.setTextColor(g6.v0(g6.G6, c6Var));
        rVar.setLinkTextColor(g6.v0(g6.gc, c6Var));
        rVar.setHintTextColor(g6.v0(g6.H6, c6Var));
        rVar.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        rVar.setTextSize(1, 15.0f);
        rVar.setMaxLines(Integer.MAX_VALUE);
        rVar.setBackground(null);
        rVar.setImeOptions(268435462);
        rVar.setInputType(rVar.getInputType() | 16384);
        rVar.addTextChangedListener(new ch.e(this, 19));
        b bVar = new b(activity);
        this.f50805b = bVar;
        int i11 = g6.Vh;
        bVar.setBackground(g6.f0(g6.v0(i11, c6Var), 1, -1));
        b6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f50806c = dVar;
        dVar.setBackground(g6.f0(g6.v0(i11, c6Var), 1, -1));
        dVar.setOnClickListener(new org.telegram.ui.web.c(7, this, rnVar));
        b6.a(dVar);
        h5 h5Var = new h5(getContext());
        this.f50808f = h5Var;
        h5Var.setTextSize(13);
        h5Var.setGravity(17);
        h5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        h5Var.setVisibility(8);
        z71 z71Var = new z71(activity, 11);
        this.f50812w = z71Var;
        addView(z71Var, layoutParams);
        z71 z71Var2 = new z71(activity, 10);
        this.v = z71Var2;
        z71Var.addView(z71Var2, z5.c(-2.0f, -1));
        z71Var2.addView(h5Var, z5.e(54, 24, 53));
        z71Var2.addView(bVar, z5.e(44, 44, 51));
        z71Var2.addView(dVar, z5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        z71Var2.addView(rVar, z5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        rVar.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        h5 h5Var = cVar.f50808f;
        m10.d(h5Var, cVar.D.f48497e);
        int i10 = g6.A6;
        rn rnVar = cVar.d;
        h5Var.setTextColor(i0.b.d(cVar.E.f48497e, g6.v0(i10, rnVar.getResourceProvider()), g6.v0(g6.f23269p7, rnVar.getResourceProvider())));
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
        s1 s1Var;
        bh.a aVar;
        s1 s1Var2 = this.f50809n;
        if (s1Var2 != null) {
            int id2 = s1Var2.getMessageObject().getId();
            if (this.f50809n.isAttachedToWindow() && this.f50810r == id2 && (aVar = (s1Var = this.f50809n).W5) != null && s1Var.f25389j6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.A;
                rect.set(bounds);
                s1 s1Var3 = this.f50809n;
                int[] iArr = this.f50814y;
                s1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int iWidth = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f50807e;
                int i12 = layoutParams.width;
                z71 z71Var = this.f50812w;
                if (i12 != iWidth) {
                    layoutParams.width = iWidth;
                    z71Var.setLayoutParams(layoutParams);
                }
                z71Var.setTranslationX(rect.left);
                z71Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            lg lgVar = this.f50811s;
            if (lgVar != null) {
                lgVar.run();
                this.f50811s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f10) {
        this.v.setAlpha(f10);
    }

    public void setCellToWatch(s1 s1Var) {
        this.f50809n = s1Var;
        this.f50810r = s1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.C != i10) {
            this.C = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f50805b;
            bVar.f50802b.setColorFilter(porterDuffColorFilter);
            bVar.f50803c.setColorFilter(porterDuffColorFilter);
            this.f50806c.f50815a.setColorFilter(porterDuffColorFilter);
            gh.r rVar = this.f50804a;
            rVar.setCursorColor(i10);
            rVar.setHandlesColor(i10);
            rVar.setHintTextColor(i10);
        }
    }
}
