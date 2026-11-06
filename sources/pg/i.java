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
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.z;
public final class i extends FrameLayout implements ls {
    public pj0 D;
    public ArrayList E;
    public int F;
    public g f53531a;
    public xp f53532b;
    public r1.g f53533c;
    public r1.g d;
    public SharedPreferences f53534e;
    public boolean f53535f;
    public boolean h;
    public boolean f53536n;
    public c f53537r;
    public boolean f53538s;
    public int f53539w;
    public LinearLayout f53540x;
    public TextView f53541y;

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
        arrayList.add(new a("Draw action bar shadow", new z(10)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(hd.M0(2131751648, null)));
        if (iz.J0) {
            i7 = 2131751639;
        } else {
            i7 = 2131751631;
        }
        arrayList.add(new a(hd.M0(i7, null), new c(this, 1)));
        if (k6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new z(11)));
        arrayList.add(new a(hd.M0(2131751614, null), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z9) {
        float f10;
        g gVar = this.f53531a;
        ArrayList arrayList = this.E;
        if (this.f53538s == z9) {
            return;
        }
        this.f53538s = z9;
        if (z9) {
            this.f53540x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                q4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).E());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f41280q0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.E());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f41278p0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.E());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.D.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z9) {
            this.f53539w = window.getStatusBarColor();
        }
        final float translationX = gVar.getTranslationX();
        final float translationY = gVar.getTranslationY();
        float f11 = 0.0f;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1000.0f;
        }
        r1.g gVar2 = new r1.g(new r1.f(f10));
        r1.h o4 = f1.o(1000.0f, 900.0f, 1.0f);
        if (z9) {
            f11 = 1000.0f;
        }
        o4.f54183i = f11;
        gVar2.f54175m = o4;
        gVar2.b(new r1.d() {
            @Override
            public final void a(r1.g gVar3, float f12, float f13) {
                float f14 = f12 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f53540x;
                linearLayout.setAlpha(f14);
                float f15 = translationX;
                linearLayout.setTranslationX(g0.T1(f15 - g0.L(8.0f), 0.0f, f14));
                float f16 = translationY;
                linearLayout.setTranslationY(g0.T1(f16 - g0.L(8.0f), 0.0f, f14));
                g gVar4 = iVar.f53531a;
                linearLayout.setPivotX(gVar4.getTranslationX() + g0.L(28.0f));
                linearLayout.setPivotY(gVar4.getTranslationY() + g0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(g0.T1(gVar4.getWidth() / linearLayout.getWidth(), 1.0f, f14));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(g0.T1(gVar4.getHeight() / linearLayout.getHeight(), 1.0f, f14));
                }
                gVar4.setTranslationX(g0.T1(f15, (iVar.getWidth() / 2.0f) - g0.L(28.0f), f14));
                gVar4.setTranslationY(g0.T1(f16, (iVar.getHeight() / 2.0f) - g0.L(28.0f), f14));
                gVar4.setAlpha(1.0f - f14);
                window.setStatusBarColor(i0.a.f(f14, iVar.f53539w, 2046820352));
                iVar.invalidate();
            }
        });
        gVar2.a(new r1.c() {
            @Override
            public final void a(r1.g gVar3, boolean z10, float f12, float f13) {
                i iVar = i.this;
                g gVar4 = iVar.f53531a;
                gVar4.setTranslationX(translationX);
                gVar4.setTranslationY(translationY);
                if (!z9) {
                    iVar.f53540x.setVisibility(8);
                }
            }
        });
        gVar2.h();
    }

    public final void d() {
        y j02 = k6.j0(g0.L(56.0f), k6.x0(null, k6.P9, false), k6.x0(null, k6.Q9, false));
        Drawable mutate = getResources().getDrawable(2131231197).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        xp xpVar = new xp(mutate, j02, 0, 0);
        int L = g0.L(56.0f);
        int L2 = g0.L(56.0f);
        xpVar.f40318e = L;
        xpVar.f40319f = L2;
        this.f53532b = xpVar;
        Drawable drawable = getResources().getDrawable(2131232566);
        r6.y(this, drawable, k6.f27921h5, null, mode);
        this.f53540x.setBackground(drawable);
        r6.V(this.f53541y, k6.f27956j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f25027n4) {
            d();
            this.D.getAdapter().f();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.f53540x;
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
        SharedPreferences sharedPreferences = this.f53534e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        g gVar = this.f53531a;
        if (f10 != -1.0f && f10 < displayMetrics.widthPixels / 2.0f) {
            a10 = a(displayMetrics, -2.1474836E9f);
        } else {
            a10 = a(displayMetrics, 2.1474836E9f);
        }
        gVar.setTranslationX(a10);
        if (f11 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f11);
        }
        gVar.setTranslationY(b10);
        r1.g gVar2 = new r1.g(gVar, r1.g.f54158o, gVar.getTranslationX());
        r1.h hVar = new r1.h(gVar.getTranslationX());
        hVar.b(650.0f);
        hVar.a(0.75f);
        gVar2.f54175m = hVar;
        this.f53533c = gVar2;
        r1.g gVar3 = new r1.g(gVar, r1.g.f54159p, gVar.getTranslationY());
        r1.h hVar2 = new r1.h(gVar.getTranslationY());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar3.f54175m = hVar2;
        this.d = gVar3;
        qs.e().c(this, qs.f25027n4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        this.f53533c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        g gVar = this.f53531a;
        if (gVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f10 = 2.1474836E9f;
        } else {
            f10 = -2.1474836E9f;
        }
        gVar.setTranslationX(a(displayMetrics, f10));
        gVar.setTranslationY(b(displayMetrics, gVar.getTranslationY()));
        this.f53533c.f54175m.f54183i = gVar.getTranslationX();
        this.d.f54175m.f54183i = gVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f53533c.d();
        this.d.d();
        qs.e().n(this, qs.f25027n4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        g gVar = this.f53531a;
        canvas.translate(gVar.getTranslationX(), gVar.getTranslationY());
        canvas.scale(gVar.getScaleX(), gVar.getScaleY(), gVar.getPivotX(), gVar.getPivotY());
        this.f53532b.setAlpha((int) (gVar.getAlpha() * 255.0f));
        this.f53532b.setBounds(gVar.getLeft(), gVar.getTop(), gVar.getRight(), gVar.getBottom());
        this.f53532b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f53538s;
    }
}
