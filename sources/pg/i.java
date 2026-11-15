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
import c8.i9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.g0;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o4;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ah0;
import org.telegram.ui.w61;
public final class i extends FrameLayout implements is {
    public uj0 E;
    public ArrayList F;
    public int G;
    public w61 f55040a;
    public fq f55041b;
    public r1.g f55042c;
    public r1.g d;
    public SharedPreferences f55043e;
    public boolean f55044f;
    public boolean h;
    public boolean f55045n;
    public d f55046r;
    public boolean f55047s;
    public int f55048w;
    public LinearLayout f55049x;
    public TextView f55050y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return i9.a(f10, g0.L(16.0f), displayMetrics.widthPixels - g0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return i9.a(f10, g0.L(16.0f), displayMetrics.heightPixels - g0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i7;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new ah0(17)));
        arrayList.add(new a("Show blur settings", new d(this, 0)));
        arrayList.add(new a(hd.M0(2131751647, null)));
        if (gz.J0) {
            i7 = 2131751638;
        } else {
            i7 = 2131751630;
        }
        arrayList.add(new a(hd.M0(i7, null), new d(this, 1)));
        if (j6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new ah0(18)));
        arrayList.add(new a(hd.M0(2131751613, null), new d(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f10;
        w61 w61Var = this.f55040a;
        ArrayList arrayList = this.F;
        if (this.f55047s == z10) {
            return;
        }
        this.f55047s = z10;
        if (z10) {
            this.f55049x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                o4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).F());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f42653r0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.F());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f42651q0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.F());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.f55048w = window.getStatusBarColor();
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
        r1.h n10 = y0.n(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f11 = 1000.0f;
        }
        n10.f55756i = f11;
        gVar.f55748m = n10;
        gVar.b(new r1.d() {
            @Override
            public final void a(r1.g gVar2, float f12, float f13) {
                float f14 = f12 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.f55049x;
                linearLayout.setAlpha(f14);
                float f15 = translationX;
                linearLayout.setTranslationX(g0.T1(f15 - g0.L(8.0f), 0.0f, f14));
                float f16 = translationY;
                linearLayout.setTranslationY(g0.T1(f16 - g0.L(8.0f), 0.0f, f14));
                w61 w61Var2 = iVar.f55040a;
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
                window.setStatusBarColor(i0.a.f(f14, iVar.f55048w, 2046820352));
                iVar.invalidate();
            }
        });
        gVar.a(new r1.c() {
            @Override
            public final void a(r1.g gVar2, boolean z11, float f12, float f13) {
                i iVar = i.this;
                w61 w61Var2 = iVar.f55040a;
                w61Var2.setTranslationX(translationX);
                w61Var2.setTranslationY(translationY);
                if (!z10) {
                    iVar.f55049x.setVisibility(8);
                }
            }
        });
        gVar.h();
    }

    public final void d() {
        y j02 = j6.j0(g0.L(56.0f), j6.x0(null, j6.P9, false), j6.x0(null, j6.Q9, false));
        Drawable mutate = getResources().getDrawable(2131231197).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        fq fqVar = new fq(mutate, j02, 0, 0);
        int L = g0.L(56.0f);
        int L2 = g0.L(56.0f);
        fqVar.f34676e = L;
        fqVar.f34677f = L2;
        this.f55041b = fqVar;
        Drawable drawable = getResources().getDrawable(2131232567);
        q6.x(this, drawable, j6.f28922h5, null, mode);
        this.f55049x.setBackground(drawable);
        q6.U(this.f55050y, j6.f28957j5, null);
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25541n4) {
            d();
            this.E.getAdapter().f();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.f55049x;
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
        SharedPreferences sharedPreferences = this.f55043e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w61 w61Var = this.f55040a;
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
        r1.g gVar = new r1.g(w61Var, r1.g.f55731o, w61Var.getTranslationX());
        r1.h hVar = new r1.h(w61Var.getTranslationX());
        hVar.b(650.0f);
        hVar.a(0.75f);
        gVar.f55748m = hVar;
        this.f55042c = gVar;
        r1.g gVar2 = new r1.g(w61Var, r1.g.f55732p, w61Var.getTranslationY());
        r1.h hVar2 = new r1.h(w61Var.getTranslationY());
        hVar2.b(650.0f);
        hVar2.a(0.75f);
        gVar2.f55748m = hVar2;
        this.d = gVar2;
        ns.e().c(this, ns.f25541n4);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        this.f55042c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w61 w61Var = this.f55040a;
        if (w61Var.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f10 = 2.1474836E9f;
        } else {
            f10 = -2.1474836E9f;
        }
        w61Var.setTranslationX(a(displayMetrics, f10));
        w61Var.setTranslationY(b(displayMetrics, w61Var.getTranslationY()));
        this.f55042c.f55748m.f55756i = w61Var.getTranslationX();
        this.d.f55748m.f55756i = w61Var.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55042c.d();
        this.d.d();
        ns.e().n(this, ns.f25541n4);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        w61 w61Var = this.f55040a;
        canvas.translate(w61Var.getTranslationX(), w61Var.getTranslationY());
        canvas.scale(w61Var.getScaleX(), w61Var.getScaleY(), w61Var.getPivotX(), w61Var.getPivotY());
        this.f55041b.setAlpha((int) (w61Var.getAlpha() * 255.0f));
        this.f55041b.setBounds(w61Var.getLeft(), w61Var.getTop(), w61Var.getRight(), w61Var.getBottom());
        this.f55041b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f55047s;
    }
}
