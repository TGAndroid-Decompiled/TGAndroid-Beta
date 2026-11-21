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
import c8.l9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bz;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.r4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.c0;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cd0;
import org.telegram.ui.y61;
public final class i extends FrameLayout implements fs {
    public ek0 E;
    public ArrayList F;
    public int G;
    public y61 f55657a;
    public oq f55658b;
    public r1.g f55659c;
    public r1.g d;
    public SharedPreferences f55660e;
    public boolean f55661f;
    public boolean h;
    public boolean f55662n;
    public d f55663r;
    public boolean f55664s;
    public int f55665w;
    public LinearLayout f55666x;
    public TextView f55667y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return l9.a(f10, g0.L(16.0f), displayMetrics.widthPixels - g0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return l9.a(f10, g0.L(16.0f), displayMetrics.heightPixels - g0.L(72.0f));
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
        if (m6.I.q()) {
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
        y61 y61Var = this.f55657a;
        ArrayList arrayList = this.F;
        if (this.f55664s == z10) {
            return;
        }
        this.f55664s = z10;
        if (z10) {
            this.f55666x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                r4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).F());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f43139r0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.F());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f43137q0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.F());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.f55665w = window.getStatusBarColor();
        }
        final float translationX = y61Var.getTranslationX();
        final float translationY = y61Var.getTranslationY();
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
        p10.f56372i = f11;
        gVar.f56364m = p10;
        gVar.b(new r1.d() {
            @Override
            public final void a(r1.g gVar2, float f12, float f13) {
                float f14 = f12 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f55666x;
                linearLayout.setAlpha(f14);
                float f15 = translationX;
                linearLayout.setTranslationX(g0.T1(f15 - g0.L(8.0f), 0.0f, f14));
                float f16 = translationY;
                linearLayout.setTranslationY(g0.T1(f16 - g0.L(8.0f), 0.0f, f14));
                y61 y61Var2 = iVar.f55657a;
                linearLayout.setPivotX(y61Var2.getTranslationX() + g0.L(28.0f));
                linearLayout.setPivotY(y61Var2.getTranslationY() + g0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(g0.T1(y61Var2.getWidth() / linearLayout.getWidth(), 1.0f, f14));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(g0.T1(y61Var2.getHeight() / linearLayout.getHeight(), 1.0f, f14));
                }
                y61Var2.setTranslationX(g0.T1(f15, (iVar.getWidth() / 2.0f) - g0.L(28.0f), f14));
                y61Var2.setTranslationY(g0.T1(f16, (iVar.getHeight() / 2.0f) - g0.L(28.0f), f14));
                y61Var2.setAlpha(1.0f - f14);
                window.setStatusBarColor(i0.a.f(f14, iVar.f55665w, 2046820352));
                iVar.invalidate();
            }
        });
        gVar.a(new r1.c() {
            @Override
            public final void a(r1.g gVar2, boolean z11, float f12, float f13) {
                i iVar = i.this;
                y61 y61Var2 = iVar.f55657a;
                y61Var2.setTranslationX(translationX);
                y61Var2.setTranslationY(translationY);
                if (!z10) {
                    iVar.f55666x.setVisibility(8);
                }
            }
        });
        gVar.h();
    }

    public final void d() {
        y j02 = m6.j0(g0.L(56.0f), m6.x0(null, m6.P9, false), m6.x0(null, m6.Q9, false));
        Drawable mutate = getResources().getDrawable(2131231197).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        oq oqVar = new oq(mutate, j02, 0, 0);
        int L = g0.L(56.0f);
        int L2 = g0.L(56.0f);
        oqVar.f38339e = L;
        oqVar.f38340f = L2;
        this.f55658b = oqVar;
        Drawable drawable = getResources().getDrawable(2131232568);
        t6.x(this, drawable, m6.f29451h5, null, mode);
        this.f55666x.setBackground(drawable);
        t6.U(this.f55667y, m6.f29486j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25203q4) {
            d();
            this.E.getAdapter().f();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.f55666x;
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
        SharedPreferences sharedPreferences = this.f55660e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        y61 y61Var = this.f55657a;
        if (f10 != -1.0f && f10 < displayMetrics.widthPixels / 2.0f) {
            a10 = a(displayMetrics, -2.1474836E9f);
        } else {
            a10 = a(displayMetrics, 2.1474836E9f);
        }
        y61Var.setTranslationX(a10);
        if (f11 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f11);
        }
        y61Var.setTranslationY(b10);
        r1.g gVar = new r1.g(y61Var, r1.g.f56347o, y61Var.getTranslationX());
        r1.h hVar = new r1.h(y61Var.getTranslationX());
        hVar.b(650.0f);
        hVar.a(0.75f);
        gVar.f56364m = hVar;
        this.f55659c = gVar;
        r1.g gVar2 = new r1.g(y61Var, r1.g.f56348p, y61Var.getTranslationY());
        r1.h hVar2 = new r1.h(y61Var.getTranslationY());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar2.f56364m = hVar2;
        this.d = gVar2;
        ks.e().c(this, ks.f25203q4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        this.f55659c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        y61 y61Var = this.f55657a;
        if (y61Var.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f10 = 2.1474836E9f;
        } else {
            f10 = -2.1474836E9f;
        }
        y61Var.setTranslationX(a(displayMetrics, f10));
        y61Var.setTranslationY(b(displayMetrics, y61Var.getTranslationY()));
        this.f55659c.f56364m.f56372i = y61Var.getTranslationX();
        this.d.f56364m.f56372i = y61Var.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55659c.d();
        this.d.d();
        ks.e().n(this, ks.f25203q4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        y61 y61Var = this.f55657a;
        canvas.translate(y61Var.getTranslationX(), y61Var.getTranslationY());
        canvas.scale(y61Var.getScaleX(), y61Var.getScaleY(), y61Var.getPivotX(), y61Var.getPivotY());
        this.f55658b.setAlpha((int) (y61Var.getAlpha() * 255.0f));
        this.f55658b.setBounds(y61Var.getLeft(), y61Var.getTop(), y61Var.getRight(), y61Var.getBottom());
        this.f55658b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f55664s;
    }
}
