package sh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import bi.u;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.voip.j1;
import org.telegram.ui.ig;
import org.telegram.ui.r41;
import org.telegram.ui.wn;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, p6 {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final oe.b H;
    public final oe.b I;
    public final g6 f48653a;
    public final b f48654b;
    public final d f48655c;
    public final wn d;
    public final FrameLayout.LayoutParams e;
    public final b6 f48656f;
    public e h;
    public s1 f48657n;
    public int f48658r;
    public ig f48659s;
    public final r41 v;
    public final r41 f48660w;
    public final int f48661x;
    public final int[] f48662y;

    public c(Activity activity, u6 u6Var, wn wnVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.e = layoutParams;
        this.f48662y = new int[2];
        this.E = new Rect();
        j1 j1Var = new j1(this, 19);
        ds dsVar = ds.h;
        this.H = new oe.b(0, j1Var, dsVar, 380L, false);
        this.I = new oe.b(0, new j1(this, 19), dsVar, 380L, false);
        this.d = wnVar;
        this.f48661x = wnVar.getMessagesController().config.pollAnswerLengthMax.get();
        g6 g6Var = new g6(this, activity, u6Var, 2);
        this.f48653a = g6Var;
        g6Var.setAllowTextEntitiesIntersection(true);
        f7.V(g6Var, y6.G6, u6Var);
        f7.H(g6Var, y6.gc, u6Var);
        f7.E(g6Var, y6.H6, u6Var);
        g6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        g6Var.setTextSize(1, 15.0f);
        g6Var.setMaxLines(Integer.MAX_VALUE);
        g6Var.setBackground(null);
        g6Var.setImeOptions(268435462);
        g6Var.setInputType(g6Var.getInputType() | 16384);
        g6Var.addTextChangedListener(new u(this, 20));
        b bVar = new b(activity);
        this.f48654b = bVar;
        int i10 = y6.Vh;
        y g02 = y6.g0(y6.w0(i10, u6Var), 1, -1);
        b7 N = f7.N(i10);
        bVar.setBackground(g02);
        f7.k(bVar, g02, null, N, u6Var);
        kb1.b(bVar);
        d dVar = new d(getContext(), 36);
        this.f48655c = dVar;
        y g03 = y6.g0(y6.w0(i10, u6Var), 1, -1);
        b7 N2 = f7.N(i10);
        dVar.setBackground(g03);
        f7.k(dVar, g03, null, N2, u6Var);
        dVar.setOnClickListener(new org.telegram.ui.web.c(3, this, wnVar));
        kb1.b(dVar);
        b6 b6Var = new b6(getContext());
        this.f48656f = b6Var;
        b6Var.setTextSize(13);
        b6Var.setGravity(17);
        b6Var.setTranslationY(AndroidUtilities.dp(44.0f));
        b6Var.setVisibility(8);
        r41 r41Var = new r41(activity, 9);
        this.f48660w = r41Var;
        addView(r41Var, layoutParams);
        r41 r41Var2 = new r41(activity, 8);
        this.v = r41Var2;
        r41Var.addView(r41Var2, kb1.g(-2.0f, -1));
        r41Var2.addView(b6Var, kb1.i(54, 24, 53));
        r41Var2.addView(bVar, kb1.i(44, 44, 51));
        r41Var2.addView(dVar, kb1.h(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        r41Var2.addView(g6Var, kb1.h(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        g6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        b6 b6Var = cVar.f48656f;
        j20.d(b6Var, cVar.H.e);
        int i10 = y6.A6;
        wn wnVar = cVar.d;
        b6Var.setTextColor(i0.a.f(cVar.I.e, y6.w0(i10, wnVar.getResourceProvider()), y6.w0(y6.f23582p7, wnVar.getResourceProvider())));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.A6));
        hashSet.add(Integer.valueOf(y6.f23582p7));
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
        s1 s1Var;
        uh.a aVar;
        s1 s1Var2 = this.f48657n;
        if (s1Var2 != null) {
            int id2 = s1Var2.getMessageObject().getId();
            if (this.f48657n.isAttachedToWindow() && this.f48658r == id2 && (aVar = (s1Var = this.f48657n).f25021a6) != null && s1Var.f25206n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                s1 s1Var3 = this.f48657n;
                int[] iArr = this.f48662y;
                s1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.e;
                int i12 = layoutParams.width;
                r41 r41Var = this.f48660w;
                if (i12 != width) {
                    layoutParams.width = width;
                    r41Var.setLayoutParams(layoutParams);
                }
                r41Var.setTranslationX(rect.left);
                r41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ig igVar = this.f48659s;
            if (igVar != null) {
                igVar.run();
                this.f48659s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(s1 s1Var) {
        this.f48657n = s1Var;
        this.f48658r = s1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f48654b;
            bVar.f48651b.setColorFilter(porterDuffColorFilter);
            bVar.f48652c.setColorFilter(porterDuffColorFilter);
            this.f48655c.f48663a.setColorFilter(porterDuffColorFilter);
            g6 g6Var = this.f48653a;
            g6Var.setCursorColor(i10);
            g6Var.setHandlesColor(i10);
            g6Var.setHintTextColor(i10);
        }
    }

    @Override
    public final void updateColors() {
        wn wnVar;
        try {
            b6 b6Var = this.f48656f;
            if (b6Var != null && (wnVar = this.d) != null) {
                b6Var.setTextColor(i0.a.f(this.I.e, y6.w0(y6.A6, wnVar.getResourceProvider()), y6.w0(y6.f23582p7, wnVar.getResourceProvider())));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
