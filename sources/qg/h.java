package qg;

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
import b8.be;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hb1;
import org.telegram.ui.n61;
public final class h extends FrameLayout implements cs {
    public tj0 E;
    public ArrayList F;
    public int G;
    public n61 f53930a;
    public xp f53931b;
    public q1.g f53932c;
    public q1.g d;
    public SharedPreferences f53933e;
    public boolean f53934f;
    public boolean h;
    public boolean f53935n;
    public c f53936r;
    public boolean f53937s;
    public int f53938w;
    public LinearLayout f53939x;
    public TextView f53940y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return be.a(f10, g0.L(16.0f), displayMetrics.widthPixels - g0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return be.a(f10, g0.L(16.0f), displayMetrics.heightPixels - g0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i3;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new hb1(11)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(bd.M0(2131751648, null)));
        if (az.J0) {
            i3 = 2131751639;
        } else {
            i3 = 2131751631;
        }
        arrayList.add(new a(bd.M0(i3, null), new c(this, 1)));
        if (k6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new hb1(12)));
        arrayList.add(new a(bd.M0(2131751614, null), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f10;
        n61 n61Var = this.f53930a;
        ArrayList arrayList = this.F;
        if (this.f53937s == z10) {
            return;
        }
        this.f53937s = z10;
        if (z10) {
            this.f53939x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                q4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).E());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f41318t0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.E());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f41316s0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.E());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.f53938w = window.getStatusBarColor();
        }
        final float translationX = n61Var.getTranslationX();
        final float translationY = n61Var.getTranslationY();
        float f11 = 0.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1000.0f;
        }
        q1.g gVar = new q1.g(new q1.f(f10));
        q1.h s6 = f1.s(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f11 = 1000.0f;
        }
        s6.f53661i = f11;
        gVar.f53653m = s6;
        gVar.b(new q1.d() {
            @Override
            public final void a(q1.g gVar2, float f12, float f13) {
                float f14 = f12 / 1000.0f;
                h hVar = h.this;
                LinearLayout linearLayout = hVar.f53939x;
                linearLayout.setAlpha(f14);
                float f15 = translationX;
                linearLayout.setTranslationX(g0.T1(f15 - g0.L(8.0f), 0.0f, f14));
                float f16 = translationY;
                linearLayout.setTranslationY(g0.T1(f16 - g0.L(8.0f), 0.0f, f14));
                n61 n61Var2 = hVar.f53930a;
                linearLayout.setPivotX(n61Var2.getTranslationX() + g0.L(28.0f));
                linearLayout.setPivotY(n61Var2.getTranslationY() + g0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(g0.T1(n61Var2.getWidth() / linearLayout.getWidth(), 1.0f, f14));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(g0.T1(n61Var2.getHeight() / linearLayout.getHeight(), 1.0f, f14));
                }
                n61Var2.setTranslationX(g0.T1(f15, (hVar.getWidth() / 2.0f) - g0.L(28.0f), f14));
                n61Var2.setTranslationY(g0.T1(f16, (hVar.getHeight() / 2.0f) - g0.L(28.0f), f14));
                n61Var2.setAlpha(1.0f - f14);
                window.setStatusBarColor(i0.a.f(f14, hVar.f53938w, 2046820352));
                hVar.invalidate();
            }
        });
        gVar.a(new q1.c() {
            @Override
            public final void a(q1.g gVar2, boolean z11, float f12, float f13) {
                h hVar = h.this;
                n61 n61Var2 = hVar.f53930a;
                n61Var2.setTranslationX(translationX);
                n61Var2.setTranslationY(translationY);
                if (!z10) {
                    hVar.f53939x.setVisibility(8);
                }
            }
        });
        gVar.h();
    }

    public final void d() {
        y j02 = k6.j0(g0.L(56.0f), k6.x0(null, k6.P9, false), k6.x0(null, k6.Q9, false));
        Drawable mutate = getResources().getDrawable(2131231197).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        xp xpVar = new xp(mutate, j02, 0, 0);
        int L = g0.L(56.0f);
        int L2 = g0.L(56.0f);
        xpVar.f40441e = L;
        xpVar.f40442f = L2;
        this.f53931b = xpVar;
        Drawable drawable = getResources().getDrawable(2131232564);
        r6.y(this, drawable, k6.f27954h5, null, mode);
        this.f53939x.setBackground(drawable);
        r6.V(this.f53940y, k6.f27988j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.n4) {
            d();
            this.E.getAdapter().f();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f53939x;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        float a10;
        float b10;
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.f53933e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        n61 n61Var = this.f53930a;
        if (f10 != -1.0f && f10 < displayMetrics.widthPixels / 2.0f) {
            a10 = a(displayMetrics, -2.1474836E9f);
        } else {
            a10 = a(displayMetrics, 2.1474836E9f);
        }
        n61Var.setTranslationX(a10);
        if (f11 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f11);
        }
        n61Var.setTranslationY(b10);
        q1.g gVar = new q1.g(n61Var, q1.g.f53636o, n61Var.getTranslationX());
        q1.h hVar = new q1.h(n61Var.getTranslationX());
        hVar.b(650.0f);
        hVar.a(0.75f);
        gVar.f53653m = hVar;
        this.f53932c = gVar;
        q1.g gVar2 = new q1.g(n61Var, q1.g.f53637p, n61Var.getTranslationY());
        q1.h hVar2 = new q1.h(n61Var.getTranslationY());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar2.f53653m = hVar2;
        this.d = gVar2;
        hs.e().c(this, hs.n4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        this.f53932c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        n61 n61Var = this.f53930a;
        if (n61Var.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f10 = 2.1474836E9f;
        } else {
            f10 = -2.1474836E9f;
        }
        n61Var.setTranslationX(a(displayMetrics, f10));
        n61Var.setTranslationY(b(displayMetrics, n61Var.getTranslationY()));
        this.f53932c.f53653m.f53661i = n61Var.getTranslationX();
        this.d.f53653m.f53661i = n61Var.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f53932c.d();
        this.d.d();
        hs.e().n(this, hs.n4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        n61 n61Var = this.f53930a;
        canvas.translate(n61Var.getTranslationX(), n61Var.getTranslationY());
        canvas.scale(n61Var.getScaleX(), n61Var.getScaleY(), n61Var.getPivotX(), n61Var.getPivotY());
        this.f53931b.setAlpha((int) (n61Var.getAlpha() * 255.0f));
        this.f53931b.setBounds(n61Var.getLeft(), n61Var.getTop(), n61Var.getRight(), n61Var.getBottom());
        this.f53931b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f53937s;
    }
}
