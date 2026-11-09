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
import c8.j9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p61;
public final class j extends FrameLayout implements ls {
    public qj0 D;
    public ArrayList E;
    public int F;
    public h f53636a;
    public xp f53637b;
    public r1.g f53638c;
    public r1.g d;
    public SharedPreferences f53639e;
    public boolean f53640f;
    public boolean h;
    public boolean f53641n;
    public d f53642r;
    public boolean f53643s;
    public int f53644w;
    public LinearLayout f53645x;
    public TextView f53646y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return j9.a(f10, g0.L(16.0f), displayMetrics.widthPixels - g0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return j9.a(f10, g0.L(16.0f), displayMetrics.heightPixels - g0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i7;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new p61(13)));
        arrayList.add(new a("Show blur settings", new d(this, 0)));
        arrayList.add(new a(id.M0(2131751647, null)));
        if (iz.J0) {
            i7 = 2131751638;
        } else {
            i7 = 2131751630;
        }
        arrayList.add(new a(id.M0(i7, null), new d(this, 1)));
        if (l6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new p61(14)));
        arrayList.add(new a(id.M0(2131751613, null), new d(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z9) {
        float f10;
        h hVar = this.f53636a;
        ArrayList arrayList = this.E;
        if (this.f53643s == z9) {
            return;
        }
        this.f53643s = z9;
        if (z9) {
            this.f53645x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                q4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).E());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f41290q0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.E());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f41288p0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.E());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.D.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z9) {
            this.f53644w = window.getStatusBarColor();
        }
        final float translationX = hVar.getTranslationX();
        final float translationY = hVar.getTranslationY();
        float f11 = 0.0f;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1000.0f;
        }
        r1.g gVar = new r1.g(new r1.f(f10));
        r1.h o4 = f1.o(1000.0f, 900.0f, 1.0f);
        if (z9) {
            f11 = 1000.0f;
        }
        o4.f54288i = f11;
        gVar.f54280m = o4;
        gVar.b(new r1.d() {
            @Override
            public final void a(r1.g gVar2, float f12, float f13) {
                float f14 = f12 / 1000.0f;
                j jVar = j.this;
                LinearLayout linearLayout = jVar.f53645x;
                linearLayout.setAlpha(f14);
                float f15 = translationX;
                linearLayout.setTranslationX(g0.T1(f15 - g0.L(8.0f), 0.0f, f14));
                float f16 = translationY;
                linearLayout.setTranslationY(g0.T1(f16 - g0.L(8.0f), 0.0f, f14));
                h hVar2 = jVar.f53636a;
                linearLayout.setPivotX(hVar2.getTranslationX() + g0.L(28.0f));
                linearLayout.setPivotY(hVar2.getTranslationY() + g0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(g0.T1(hVar2.getWidth() / linearLayout.getWidth(), 1.0f, f14));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(g0.T1(hVar2.getHeight() / linearLayout.getHeight(), 1.0f, f14));
                }
                hVar2.setTranslationX(g0.T1(f15, (jVar.getWidth() / 2.0f) - g0.L(28.0f), f14));
                hVar2.setTranslationY(g0.T1(f16, (jVar.getHeight() / 2.0f) - g0.L(28.0f), f14));
                hVar2.setAlpha(1.0f - f14);
                window.setStatusBarColor(i0.a.f(f14, jVar.f53644w, 2046820352));
                jVar.invalidate();
            }
        });
        gVar.a(new r1.c() {
            @Override
            public final void a(r1.g gVar2, boolean z10, float f12, float f13) {
                j jVar = j.this;
                h hVar2 = jVar.f53636a;
                hVar2.setTranslationX(translationX);
                hVar2.setTranslationY(translationY);
                if (!z9) {
                    jVar.f53645x.setVisibility(8);
                }
            }
        });
        gVar.h();
    }

    public final void d() {
        y j02 = l6.j0(g0.L(56.0f), l6.x0(null, l6.P9, false), l6.x0(null, l6.Q9, false));
        Drawable mutate = getResources().getDrawable(2131231197).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        xp xpVar = new xp(mutate, j02, 0, 0);
        int L = g0.L(56.0f);
        int L2 = g0.L(56.0f);
        xpVar.f40447e = L;
        xpVar.f40448f = L2;
        this.f53637b = xpVar;
        Drawable drawable = getResources().getDrawable(2131232566);
        s6.x(this, drawable, l6.f27938h5, null, mode);
        this.f53645x.setBackground(drawable);
        s6.U(this.f53646y, l6.f27973j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25044n4) {
            d();
            this.D.getAdapter().f();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.f53645x;
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
        SharedPreferences sharedPreferences = this.f53639e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        h hVar = this.f53636a;
        if (f10 != -1.0f && f10 < displayMetrics.widthPixels / 2.0f) {
            a10 = a(displayMetrics, -2.1474836E9f);
        } else {
            a10 = a(displayMetrics, 2.1474836E9f);
        }
        hVar.setTranslationX(a10);
        if (f11 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f11);
        }
        hVar.setTranslationY(b10);
        r1.g gVar = new r1.g(hVar, r1.g.f54263o, hVar.getTranslationX());
        r1.h hVar2 = new r1.h(hVar.getTranslationX());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar.f54280m = hVar2;
        this.f53638c = gVar;
        r1.g gVar2 = new r1.g(hVar, r1.g.f54264p, hVar.getTranslationY());
        r1.h hVar3 = new r1.h(hVar.getTranslationY());
        hVar3.b(650.0f);
        hVar3.a(0.75f);
        gVar2.f54280m = hVar3;
        this.d = gVar2;
        qs.e().c(this, qs.f25044n4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        this.f53638c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        h hVar = this.f53636a;
        if (hVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f10 = 2.1474836E9f;
        } else {
            f10 = -2.1474836E9f;
        }
        hVar.setTranslationX(a(displayMetrics, f10));
        hVar.setTranslationY(b(displayMetrics, hVar.getTranslationY()));
        this.f53638c.f54280m.f54288i = hVar.getTranslationX();
        this.d.f54280m.f54288i = hVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f53638c.d();
        this.d.d();
        qs.e().n(this, qs.f25044n4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        h hVar = this.f53636a;
        canvas.translate(hVar.getTranslationX(), hVar.getTranslationY());
        canvas.scale(hVar.getScaleX(), hVar.getScaleY(), hVar.getPivotX(), hVar.getPivotY());
        this.f53637b.setAlpha((int) (hVar.getAlpha() * 255.0f));
        this.f53637b.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
        this.f53637b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f53643s;
    }
}
