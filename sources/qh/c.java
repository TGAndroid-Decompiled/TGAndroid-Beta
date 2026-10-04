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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.tr;
import org.telegram.ui.n41;
import org.telegram.ui.py0;
import org.telegram.ui.ug;
import org.telegram.ui.yn;
import w7.b6;
import w7.z5;
public final class c extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    public final Rect E;
    public ViewTreeObserver F;
    public int G;
    public final le.b H;
    public final le.b I;
    public final c6 f45452a;
    public final b f45453b;
    public final d f45454c;
    public final yn d;
    public final FrameLayout.LayoutParams f45455e;
    public final i5 f45456f;
    public e h;
    public u1 f45457n;
    public int f45458r;
    public ug f45459s;
    public final n41 v;
    public final n41 f45460w;
    public final int f45461x;
    public final int[] f45462y;

    public c(Activity activity, d6 d6Var, yn ynVar) {
        super(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        this.f45455e = layoutParams;
        this.f45462y = new int[2];
        this.E = new Rect();
        v vVar = new v(this, 28);
        tr trVar = tr.h;
        this.H = new le.b(0, vVar, trVar, 380L, false);
        this.I = new le.b(0, new v(this, 28), trVar, 380L, false);
        this.d = ynVar;
        this.f45461x = ynVar.getMessagesController().config.pollAnswerLengthMax.get();
        c6 c6Var = new c6(this, activity, d6Var, 2);
        this.f45452a = c6Var;
        c6Var.setAllowTextEntitiesIntersection(true);
        c6Var.setTextColor(i6.v0(i6.G6, d6Var));
        c6Var.setLinkTextColor(i6.v0(i6.gc, d6Var));
        c6Var.setHintTextColor(i6.v0(i6.H6, d6Var));
        c6Var.setHint(LocaleController.getString(R.string.PollAddAnOptionHint));
        c6Var.setTextSize(1, 15.0f);
        c6Var.setMaxLines(Integer.MAX_VALUE);
        c6Var.setBackground(null);
        c6Var.setImeOptions(268435462);
        c6Var.setInputType(c6Var.getInputType() | 16384);
        c6Var.addTextChangedListener(new i2(this, 16));
        b bVar = new b(activity);
        this.f45453b = bVar;
        int i10 = i6.Vh;
        bVar.setBackground(i6.f0(i6.v0(i10, d6Var), 1, -1));
        b6.a(bVar);
        d dVar = new d(getContext(), 36);
        this.f45454c = dVar;
        dVar.setBackground(i6.f0(i6.v0(i10, d6Var), 1, -1));
        dVar.setOnClickListener(new py0(15, this, ynVar));
        b6.a(dVar);
        i5 i5Var = new i5(getContext());
        this.f45456f = i5Var;
        i5Var.setTextSize(13);
        i5Var.setGravity(17);
        i5Var.setTranslationY(AndroidUtilities.dp(44.0f));
        i5Var.setVisibility(8);
        n41 n41Var = new n41(activity, 10);
        this.f45460w = n41Var;
        addView(n41Var, layoutParams);
        n41 n41Var2 = new n41(activity, 9);
        this.v = n41Var2;
        n41Var.addView(n41Var2, z5.c(-2.0f, -1));
        n41Var2.addView(i5Var, z5.e(54, 24, 53));
        n41Var2.addView(bVar, z5.e(44, 44, 51));
        n41Var2.addView(dVar, z5.d(44, 44.0f, 53, 0.0f, 0.0f, 5.0f, 0.0f));
        n41Var2.addView(c6Var, z5.d(-1, -2.0f, 119, 39.0f, 0.0f, 47.0f, 0.0f));
        c6Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(11.0f));
    }

    public static void a(c cVar) {
        i5 i5Var = cVar.f45456f;
        c20.d(i5Var, cVar.H.f15436e);
        int i10 = i6.A6;
        yn ynVar = cVar.d;
        i5Var.setTextColor(i0.a.d(cVar.I.f15436e, i6.v0(i10, ynVar.getResourceProvider()), i6.v0(i6.f21044p7, ynVar.getResourceProvider())));
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
        u1 u1Var2 = this.f45457n;
        if (u1Var2 != null) {
            int id2 = u1Var2.getMessageObject().getId();
            if (this.f45457n.isAttachedToWindow() && this.f45458r == id2 && (aVar = (u1Var = this.f45457n).f23129a6) != null && u1Var.f23314n6) {
                Rect bounds = aVar.getBounds();
                Rect rect = this.E;
                rect.set(bounds);
                u1 u1Var3 = this.f45457n;
                int[] iArr = this.f45462y;
                u1Var3.getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                getLocationInWindow(iArr);
                rect.offset(i10 - iArr[0], i11 - iArr[1]);
                int width = rect.width();
                FrameLayout.LayoutParams layoutParams = this.f45455e;
                int i12 = layoutParams.width;
                n41 n41Var = this.f45460w;
                if (i12 != width) {
                    layoutParams.width = width;
                    n41Var.setLayoutParams(layoutParams);
                }
                n41Var.setTranslationX(rect.left);
                n41Var.setTranslationY(AndroidUtilities.dp(0.66f) + rect.top);
                return true;
            }
            ug ugVar = this.f45459s;
            if (ugVar != null) {
                ugVar.run();
                this.f45459s = null;
            }
        }
        return true;
    }

    public void setAnimatedVisibility(float f7) {
        this.v.setAlpha(f7);
    }

    public void setCellToWatch(u1 u1Var) {
        this.f45457n = u1Var;
        this.f45458r = u1Var.getMessageObject().getId();
    }

    public void setColor(int i10) {
        if (this.G != i10) {
            this.G = i10;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            b bVar = this.f45453b;
            bVar.f45450b.setColorFilter(porterDuffColorFilter);
            bVar.f45451c.setColorFilter(porterDuffColorFilter);
            this.f45454c.f45463a.setColorFilter(porterDuffColorFilter);
            c6 c6Var = this.f45452a;
            c6Var.setCursorColor(i10);
            c6Var.setHandlesColor(i10);
            c6Var.setHintTextColor(i10);
        }
    }
}
