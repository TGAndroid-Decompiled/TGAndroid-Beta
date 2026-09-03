package zf;

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
import java.util.ArrayList;
import java.util.List;
import k7.n;
import o1.j;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.j21;
import ph.z4;
public final class h extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList B;
    public int C;
    public z4 f47494a;
    public mq f47495b;
    public j f47496c;
    public j d;
    public SharedPreferences e;
    public boolean f47497f;
    public boolean h;
    public boolean f47498n;
    public c f47499r;
    public boolean f47500s;
    public int v;
    public LinearLayout f47501w;
    public TextView f47502x;
    public rl0 f47503y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i10;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new j21(19)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        if (SharedConfig.debugWebView) {
            i10 = R.string.DebugMenuDisableWebViewDebug;
        } else {
            i10 = R.string.DebugMenuEnableWebViewDebug;
        }
        arrayList.add(new a(LocaleController.getString(i10), new c(this, 1)));
        if (j6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new j21(20)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z4) {
        float f10;
        z4 z4Var = this.f47494a;
        ArrayList arrayList = this.B;
        if (this.f47500s == z4) {
            return;
        }
        this.f47500s = z4;
        if (z4) {
            this.f47501w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                e5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f31616p0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f31614o0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f47503y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z4) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = z4Var.getTranslationX();
        final float translationY = z4Var.getTranslationY();
        float f11 = 0.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1000.0f;
        }
        j jVar = new j(new kb.a(f10));
        k m9 = ai.m(1000.0f, 900.0f, 1.0f);
        if (z4) {
            f11 = 1000.0f;
        }
        m9.f16184i = f11;
        jVar.f16178u = m9;
        jVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f12, float f13) {
                float f14 = f12 / 1000.0f;
                h hVar2 = h.this;
                LinearLayout linearLayout = hVar2.f47501w;
                linearLayout.setAlpha(f14);
                float f15 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f14));
                float f16 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f16 - AndroidUtilities.dp(8.0f), 0.0f, f14));
                z4 z4Var2 = hVar2.f47494a;
                linearLayout.setPivotX(z4Var2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(z4Var2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(z4Var2.getWidth() / linearLayout.getWidth(), 1.0f, f14));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(z4Var2.getHeight() / linearLayout.getHeight(), 1.0f, f14));
                }
                z4Var2.setTranslationX(AndroidUtilities.lerp(f15, (hVar2.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f14));
                z4Var2.setTranslationY(AndroidUtilities.lerp(f16, (hVar2.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f14));
                z4Var2.setAlpha(1.0f - f14);
                window.setStatusBarColor(i0.a.d(f14, hVar2.v, 2046820352));
                hVar2.invalidate();
            }
        });
        jVar.a(new o1.f() {
            @Override
            public final void a(o1.h hVar, boolean z10, float f12, float f13) {
                h hVar2 = h.this;
                z4 z4Var2 = hVar2.f47494a;
                z4Var2.setTranslationX(translationX);
                z4Var2.setTranslationY(translationY);
                if (!z4) {
                    hVar2.f47501w.setVisibility(8);
                }
            }
        });
        jVar.f();
    }

    public final void d() {
        z h02 = j6.h0(AndroidUtilities.dp(56.0f), j6.w0(null, j6.P9, false), j6.w0(null, j6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        mq mqVar = new mq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        mqVar.e = dp;
        mqVar.f27112f = dp2;
        this.f47495b = mqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.f19952h5, false), mode));
        this.f47501w.setBackground(drawable);
        this.f47502x.setTextColor(j6.w0(null, j6.f19987j5, false));
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f47503y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f47501w;
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
        SharedPreferences sharedPreferences = this.e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        z4 z4Var = this.f47494a;
        if (f10 != -1.0f && f10 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        z4Var.setTranslationX(a2);
        if (f11 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f11);
        }
        z4Var.setTranslationY(b10);
        j jVar = new j(z4Var, o1.h.f16161m, z4Var.getTranslationX());
        k kVar = new k(z4Var.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.f16178u = kVar;
        this.f47496c = jVar;
        j jVar2 = new j(z4Var, o1.h.f16162n, z4Var.getTranslationY());
        k kVar2 = new k(z4Var.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.f16178u = kVar2;
        this.d = jVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f10;
        super.onConfigurationChanged(configuration);
        this.f47496c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        z4 z4Var = this.f47494a;
        if (z4Var.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f10 = 2.1474836E9f;
        } else {
            f10 = -2.1474836E9f;
        }
        z4Var.setTranslationX(a(displayMetrics, f10));
        z4Var.setTranslationY(b(displayMetrics, z4Var.getTranslationY()));
        this.f47496c.f16178u.f16184i = z4Var.getTranslationX();
        this.d.f16178u.f16184i = z4Var.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47496c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        z4 z4Var = this.f47494a;
        canvas.translate(z4Var.getTranslationX(), z4Var.getTranslationY());
        canvas.scale(z4Var.getScaleX(), z4Var.getScaleY(), z4Var.getPivotX(), z4Var.getPivotY());
        this.f47495b.setAlpha((int) (z4Var.getAlpha() * 255.0f));
        this.f47495b.setBounds(z4Var.getLeft(), z4Var.getTop(), z4Var.getRight(), z4Var.getBottom());
        this.f47495b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f47500s;
    }
}
