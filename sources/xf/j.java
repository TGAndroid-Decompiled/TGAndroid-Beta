package xf;

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
import i7.w;
import java.util.ArrayList;
import java.util.List;
import o1.k;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ef0;
import org.telegram.ui.th;
public final class j extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A;
    public int B;
    public rf.d f50141a;
    public jq f50142b;
    public k f50143c;
    public k d;
    public SharedPreferences f50144e;
    public boolean f50145f;
    public boolean h;
    public boolean f50146n;
    public d f50147r;
    public boolean f50148s;
    public int v;
    public LinearLayout f50149w;
    public TextView f50150x;
    public jl0 f50151y;

    public static float a(DisplayMetrics displayMetrics, float f9) {
        return w.a(f9, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f9) {
        return w.a(f9, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        int i10;
        String str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new ef0(19)));
        arrayList.add(new a("Show blur settings", new d(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        if (SharedConfig.debugWebView) {
            i10 = R.string.DebugMenuDisableWebViewDebug;
        } else {
            i10 = R.string.DebugMenuEnableWebViewDebug;
        }
        arrayList.add(new a(LocaleController.getString(i10), new d(this, 1)));
        if (g6.I.q()) {
            str = "Switch to day theme";
        } else {
            str = "Switch to dark theme";
        }
        arrayList.add(new a(str, new ef0(20)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new d(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        float f9;
        rf.d dVar = this.f50141a;
        ArrayList arrayList = this.A;
        if (this.f50148s == z10) {
            return;
        }
        this.f50148s = z10;
        if (z10) {
            this.f50149w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                b5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f35589o0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f35587n0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f50151y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = dVar.getTranslationX();
        final float translationY = dVar.getTranslationY();
        float f10 = 0.0f;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1000.0f;
        }
        k kVar = new k(new ib.a(f9));
        l l10 = th.l(1000.0f, 900.0f, 1.0f);
        if (z10) {
            f10 = 1000.0f;
        }
        l10.f19052i = f10;
        kVar.f19045u = l10;
        kVar.b(new o1.h() {
            @Override
            public final void a(o1.i iVar, float f11, float f12) {
                float f13 = f11 / 1000.0f;
                j jVar = j.this;
                LinearLayout linearLayout = jVar.f50149w;
                linearLayout.setAlpha(f13);
                float f14 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f14 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                float f15 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f15 - AndroidUtilities.dp(8.0f), 0.0f, f13));
                rf.d dVar2 = jVar.f50141a;
                linearLayout.setPivotX(dVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(dVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(dVar2.getWidth() / linearLayout.getWidth(), 1.0f, f13));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(dVar2.getHeight() / linearLayout.getHeight(), 1.0f, f13));
                }
                dVar2.setTranslationX(AndroidUtilities.lerp(f14, (jVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                dVar2.setTranslationY(AndroidUtilities.lerp(f15, (jVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f13));
                dVar2.setAlpha(1.0f - f13);
                window.setStatusBarColor(i0.a.d(f13, jVar.v, 2046820352));
                jVar.invalidate();
            }
        });
        kVar.a(new o1.g() {
            @Override
            public final void a(o1.i iVar, boolean z11, float f11, float f12) {
                j jVar = j.this;
                rf.d dVar2 = jVar.f50141a;
                dVar2.setTranslationX(translationX);
                dVar2.setTranslationY(translationY);
                if (!z10) {
                    jVar.f50149w.setVisibility(8);
                }
            }
        });
        kVar.f();
    }

    public final void d() {
        z h02 = g6.h0(AndroidUtilities.dp(56.0f), g6.w0(null, g6.P9, false), g6.w0(null, g6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        jq jqVar = new jq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        jqVar.f29787e = dp;
        jqVar.f29788f = dp2;
        this.f50142b = jqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.f23133h5, false), mode));
        this.f50149w.setBackground(drawable);
        this.f50150x.setTextColor(g6.w0(null, g6.f23169j5, false));
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f50151y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f50149w;
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
        SharedPreferences sharedPreferences = this.f50144e;
        float f9 = sharedPreferences.getFloat("x", -1.0f);
        float f10 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        rf.d dVar = this.f50141a;
        if (f9 != -1.0f && f9 < displayMetrics.widthPixels / 2.0f) {
            a2 = a(displayMetrics, -2.1474836E9f);
        } else {
            a2 = a(displayMetrics, 2.1474836E9f);
        }
        dVar.setTranslationX(a2);
        if (f10 == -1.0f) {
            b10 = b(displayMetrics, 2.1474836E9f);
        } else {
            b10 = b(displayMetrics, f10);
        }
        dVar.setTranslationY(b10);
        k kVar = new k(dVar, o1.i.f19027m, dVar.getTranslationX());
        l lVar = new l(dVar.getTranslationX());
        lVar.b(650.0f);
        lVar.a(0.75f);
        kVar.f19045u = lVar;
        this.f50143c = kVar;
        k kVar2 = new k(dVar, o1.i.f19028n, dVar.getTranslationY());
        l lVar2 = new l(dVar.getTranslationY());
        lVar2.b(650.0f);
        lVar2.a(0.75f);
        kVar2.f19045u = lVar2;
        this.d = kVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        float f9;
        super.onConfigurationChanged(configuration);
        this.f50143c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        rf.d dVar = this.f50141a;
        if (dVar.getTranslationX() >= displayMetrics.widthPixels / 2.0f) {
            f9 = 2.1474836E9f;
        } else {
            f9 = -2.1474836E9f;
        }
        dVar.setTranslationX(a(displayMetrics, f9));
        dVar.setTranslationY(b(displayMetrics, dVar.getTranslationY()));
        this.f50143c.f19045u.f19052i = dVar.getTranslationX();
        this.d.f19045u.f19052i = dVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50143c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        rf.d dVar = this.f50141a;
        canvas.translate(dVar.getTranslationX(), dVar.getTranslationY());
        canvas.scale(dVar.getScaleX(), dVar.getScaleY(), dVar.getPivotX(), dVar.getPivotY());
        this.f50142b.setAlpha((int) (dVar.getAlpha() * 255.0f));
        this.f50142b.setBounds(dVar.getLeft(), dVar.getTop(), dVar.getRight(), dVar.getBottom());
        this.f50142b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f50148s;
    }
}
