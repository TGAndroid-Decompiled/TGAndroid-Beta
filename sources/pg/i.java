package pg;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.m9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bz;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.w61;
public final class i extends FrameLayout implements fs {
    public ek0 E;
    public ArrayList F;
    public int G;
    public w61 f55739a;
    public lq f55740b;
    public r1.g f55741c;
    public r1.g d;
    public SharedPreferences f55742e;
    public boolean f55743f;
    public boolean h;
    public boolean f55744n;
    public d f55745r;
    public boolean f55746s;
    public int f55747w;
    public LinearLayout f55748x;
    public TextView f55749y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return m9.a(f10, g0.L(16.0f), displayMetrics.widthPixels - g0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return m9.a(f10, g0.L(16.0f), displayMetrics.heightPixels - g0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i7;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new cd0(20)));
        arrayList.add(new a("Show blur settings", new d(this, 0)));
        arrayList.add(new a(gd.N0(2131751635, null)));
        if (bz.J0) {
            i7 = 2131751626;
        } else {
            i7 = 2131751618;
        }
        arrayList.add(new a(gd.N0(i7, null), new d(this, 1)));
        if (n6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new cd0(21)));
        arrayList.add(new a(gd.N0(2131751601, null), new d(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f10;
        w61 w61Var = this.f55739a;
        ArrayList arrayList = this.F;
        if (this.f55746s == z10) {
            return;
        }
        this.f55746s = z10;
        if (z10) {
            this.f55748x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                r4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).E());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f43218r0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.E());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f43216q0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.E());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.f55747w = window.getStatusBarColor();
        }
        final float translationX = w61Var.getTranslationX();
        final float translationY = w61Var.getTranslationY();
        float f11 = 0.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1000.0f;
        }
        r1.g gVar = new r1.g(new r1.f(f10));
        r1.h p10 = c0.p(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f11 = 1000.0f;
        }
        p10.f56454i = f11;
        gVar.f56446m = p10;
        gVar.b(new r1.d() {
            @Override
            public final void a(r1.g gVar2, float f12, float f13) {
                float f14 = f12 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f55748x;
                linearLayout.setAlpha(f14);
                float f15 = translationX;
                linearLayout.setTranslationX(g0.T1(f15 - g0.L(8.0f), 0.0f, f14));
                float f16 = translationY;
                linearLayout.setTranslationY(g0.T1(f16 - g0.L(8.0f), 0.0f, f14));
                w61 w61Var2 = iVar.f55739a;
                linearLayout.setPivotX(w61Var2.getTranslationX() + g0.L(28.0f));
                linearLayout.setPivotY(w61Var2.getTranslationY() + g0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(g0.T1(w61Var2.getWidth() / linearLayout.getWidth(), 1.0f, f14));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(g0.T1(w61Var2.getHeight() / linearLayout.getHeight(), 1.0f, f14));
                }
                w61Var2.setTranslationX(g0.T1(f15, (iVar.getWidth() / 2.0f) - g0.L(28.0f), f14));
                w61Var2.setTranslationY(g0.T1(f16, (iVar.getHeight() / 2.0f) - g0.L(28.0f), f14));
                w61Var2.setAlpha(1.0f - f14);
                window.setStatusBarColor(i0.a.f(f14, iVar.f55747w, 2046820352));
                iVar.invalidate();
            }
        });
        gVar.a(new r1.c() {
            @Override
            public final void a(r1.g gVar2, boolean z11, float f12, float f13) {
                i iVar = i.this;
                w61 w61Var2 = iVar.f55739a;
                w61Var2.setTranslationX(translationX);
                w61Var2.setTranslationY(translationY);
                if (!z10) {
                    iVar.f55748x.setVisibility(8);
                }
            }
        });
        gVar.h();
    }

    public final void d() {
        y j02 = n6.j0(g0.L(56.0f), n6.x0(null, n6.P9, false), n6.x0(null, n6.Q9, false));
        Drawable mutate = getResources().getDrawable(2131231200).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        lq lqVar = new lq(mutate, j02, 0, 0);
        int L = g0.L(56.0f);
        int L2 = g0.L(56.0f);
        lqVar.f37198e = L;
        lqVar.f37199f = L2;
        this.f55740b = lqVar;
        Drawable drawable = getResources().getDrawable(2131232571);
        u6.x(this, drawable, n6.f29524h5, null, mode);
        this.f55748x.setBackground(drawable);
        u6.U(this.f55749y, n6.f29559j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25274q4) {
            d();
            this.E.getAdapter().f();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.f55748x;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onAttachedToWindow() {
        float a10;
        float b10;
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.f55742e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w61 w61Var = this.f55739a;
        if (f10 != -1.0f && f10 < displayMetrics.widthPixels / 2.0f) {
            a10 = a(displayMetrics, -2.1474836E9f);
        } else {
            a10 = a(displayMetrics, 2.1474836E9f);
        }
        w61Var.setTranslationX(a10);
        if (f11 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f11);
        }
        w61Var.setTranslationY(b10);
        r1.g gVar = new r1.g(w61Var, r1.g.f56429o, w61Var.getTranslationX());
        r1.h hVar = new r1.h(w61Var.getTranslationX());
        hVar.b(650.0f);
        hVar.a(0.75f);
        gVar.f56446m = hVar;
        this.f55741c = gVar;
        r1.g gVar2 = new r1.g(w61Var, r1.g.f56430p, w61Var.getTranslationY());
        r1.h hVar2 = new r1.h(w61Var.getTranslationY());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar2.f56446m = hVar2;
        this.d = gVar2;
        ks.e().c(this, ks.f25274q4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        this.f55741c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w61 w61Var = this.f55739a;
        if (w61Var.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f10 = 2.1474836E9f;
        } else {
            f10 = -2.1474836E9f;
        }
        w61Var.setTranslationX(a(displayMetrics, f10));
        w61Var.setTranslationY(b(displayMetrics, w61Var.getTranslationY()));
        this.f55741c.f56446m.f56454i = w61Var.getTranslationX();
        this.d.f56446m.f56454i = w61Var.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55741c.d();
        this.d.d();
        ks.e().n(this, ks.f25274q4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        w61 w61Var = this.f55739a;
        canvas.translate(w61Var.getTranslationX(), w61Var.getTranslationY());
        canvas.scale(w61Var.getScaleX(), w61Var.getScaleY(), w61Var.getPivotX(), w61Var.getPivotY());
        this.f55740b.setAlpha((int) (w61Var.getAlpha() * 255.0f));
        this.f55740b.setBounds(w61Var.getLeft(), w61Var.getTop(), w61Var.getRight(), w61Var.getBottom());
        this.f55740b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f55746s;
    }
}
