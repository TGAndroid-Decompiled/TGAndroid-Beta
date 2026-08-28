package uf;

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
import fh.v;
import g7.n;
import java.util.ArrayList;
import java.util.List;
import o1.j;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lj0;
public final class h extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A;
    public int B;
    public v f48218a;
    public fq f48219b;
    public j f48220c;
    public j d;
    public SharedPreferences f48221e;
    public boolean f48222f;
    public boolean h;
    public boolean f48223n;
    public c f48224r;
    public boolean f48225s;
    public int v;
    public LinearLayout f48226w;
    public TextView f48227x;
    public wk0 f48228y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i9;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new lj0(14)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        if (SharedConfig.debugWebView) {
            i9 = R.string.DebugMenuDisableWebViewDebug;
        } else {
            i9 = R.string.DebugMenuEnableWebViewDebug;
        }
        arrayList.add(new a(LocaleController.getString(i9), new c(this, 1)));
        if (f6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new lj0(15)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f10;
        v vVar = this.f48218a;
        ArrayList arrayList = this.A;
        if (this.f48225s == z10) {
            return;
        }
        this.f48225s = z10;
        if (z10) {
            this.f48226w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                b5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).A());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f35522o0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.A());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f35520n0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.A());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f48228y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = vVar.getTranslationX();
        final float translationY = vVar.getTranslationY();
        float f11 = 0.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1000.0f;
        }
        j jVar = new j(new gb.a(f10));
        k i9 = j2.i(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f11 = 1000.0f;
        }
        i9.f18807i = f11;
        jVar.f18800u = i9;
        jVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f12, float f13) {
                float f14 = f12 / 1000.0f;
                h hVar2 = h.this;
                LinearLayout linearLayout = hVar2.f48226w;
                linearLayout.setAlpha(f14);
                float f15 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f14));
                float f16 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f16 - AndroidUtilities.dp(8.0f), 0.0f, f14));
                v vVar2 = hVar2.f48218a;
                linearLayout.setPivotX(vVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(vVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(vVar2.getWidth() / linearLayout.getWidth(), 1.0f, f14));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(vVar2.getHeight() / linearLayout.getHeight(), 1.0f, f14));
                }
                vVar2.setTranslationX(AndroidUtilities.lerp(f15, (hVar2.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f14));
                vVar2.setTranslationY(AndroidUtilities.lerp(f16, (hVar2.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f14));
                vVar2.setAlpha(1.0f - f14);
                window.setStatusBarColor(i0.a.d(f14, hVar2.v, 2046820352));
                hVar2.invalidate();
            }
        });
        jVar.a(new o1.f() {
            @Override
            public final void a(o1.h hVar, boolean z11, float f12, float f13) {
                h hVar2 = h.this;
                v vVar2 = hVar2.f48218a;
                vVar2.setTranslationX(translationX);
                vVar2.setTranslationY(translationY);
                if (!z10) {
                    hVar2.f48226w.setVisibility(8);
                }
            }
        });
        jVar.f();
    }

    public final void d() {
        z h02 = f6.h0(AndroidUtilities.dp(56.0f), f6.w0(null, f6.P9, false), f6.w0(null, f6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        fq fqVar = new fq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        fqVar.f28545e = dp;
        fqVar.f28546f = dp2;
        this.f48219b = fqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.f23072h5, false), mode));
        this.f48226w.setBackground(drawable);
        this.f48227x.setTextColor(f6.w0(null, f6.f23108j5, false));
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didSetNewTheme) {
            d();
            this.f48228y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f48226w;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        float a2;
        float b10;
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.f48221e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        v vVar = this.f48218a;
        if (f10 != -1.0f && f10 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        vVar.setTranslationX(a2);
        if (f11 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f11);
        }
        vVar.setTranslationY(b10);
        j jVar = new j(vVar, o1.h.f18782m, vVar.getTranslationX());
        k kVar = new k(vVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.f18800u = kVar;
        this.f48220c = jVar;
        j jVar2 = new j(vVar, o1.h.f18783n, vVar.getTranslationY());
        k kVar2 = new k(vVar.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.f18800u = kVar2;
        this.d = jVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        this.f48220c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        v vVar = this.f48218a;
        if (vVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f10 = 2.1474836E9f;
        } else {
            f10 = -2.1474836E9f;
        }
        vVar.setTranslationX(a(displayMetrics, f10));
        vVar.setTranslationY(b(displayMetrics, vVar.getTranslationY()));
        this.f48220c.f18800u.f18807i = vVar.getTranslationX();
        this.d.f18800u.f18807i = vVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48220c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        v vVar = this.f48218a;
        canvas.translate(vVar.getTranslationX(), vVar.getTranslationY());
        canvas.scale(vVar.getScaleX(), vVar.getScaleY(), vVar.getPivotX(), vVar.getPivotY());
        this.f48219b.setAlpha((int) (vVar.getAlpha() * 255.0f));
        this.f48219b.setBounds(vVar.getLeft(), vVar.getTop(), vVar.getRight(), vVar.getBottom());
        this.f48219b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f48225s;
    }
}
