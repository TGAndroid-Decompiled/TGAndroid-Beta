package vf;

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
import h7.n;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tq0;

public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList A;
    public int B;

    public g f48906a;

    public dq f48907b;

    public j f48908c;
    public j d;

    public SharedPreferences f48909e;

    public boolean f48910f;
    public boolean h;

    public boolean f48911n;

    public c f48912r;

    public boolean f48913s;
    public int v;

    public LinearLayout f48914w;

    public TextView f48915x;

    public zk0 f48916y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return n.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new tq0(15)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new a(LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug), new c(this, 1)));
        arrayList.add(new a(g6.I.q() ? "Switch to day theme" : "Switch to dark theme", new tq0(16)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        g gVar = this.f48906a;
        ArrayList arrayList = this.A;
        if (this.f48913s == z10) {
            return;
        }
        this.f48913s = z10;
        if (z10) {
            this.f48914w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                b5 b5VarO = ((LaunchActivity) getContext()).O();
                if (b5VarO instanceof b) {
                    arrayList.addAll(((b) b5VarO).C());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).f35525o0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.C());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).f35523n0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.C());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.f48916y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = gVar.getTranslationX();
        final float translationY = gVar.getTranslationY();
        j jVar = new j(new hb.a(z10 ? 0.0f : 1000.0f));
        k kVarK = pa.k(1000.0f, 900.0f, 1.0f);
        kVarK.f19154i = z10 ? 1000.0f : 0.0f;
        jVar.f19147u = kVarK;
        jVar.b(new o1.g() {
            @Override
            public final void a(o1.h hVar, float f10, float f11) {
                float f12 = f10 / 1000.0f;
                i iVar = this.f48888a;
                LinearLayout linearLayout = iVar.f48914w;
                linearLayout.setAlpha(f12);
                float fDp = AndroidUtilities.dp(8.0f);
                float f13 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f13 - fDp, 0.0f, f12));
                float fDp2 = AndroidUtilities.dp(8.0f);
                float f14 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f14 - fDp2, 0.0f, f12));
                g gVar2 = iVar.f48906a;
                linearLayout.setPivotX(gVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(gVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(gVar2.getWidth() / linearLayout.getWidth(), 1.0f, f12));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(gVar2.getHeight() / linearLayout.getHeight(), 1.0f, f12));
                }
                gVar2.setTranslationX(AndroidUtilities.lerp(f13, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                gVar2.setTranslationY(AndroidUtilities.lerp(f14, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                gVar2.setAlpha(1.0f - f12);
                window.setStatusBarColor(i0.b.d(f12, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        jVar.a(new o1.f() {
            @Override
            public final void a(o1.h hVar, boolean z11, float f10, float f11) {
                i iVar = this.f48891a;
                g gVar2 = iVar.f48906a;
                gVar2.setTranslationX(translationX);
                gVar2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                iVar.f48914w.setVisibility(8);
            }
        });
        jVar.f();
    }

    public final void d() {
        z zVarH0 = g6.h0(AndroidUtilities.dp(56.0f), g6.w0(null, g6.P9, false), g6.w0(null, g6.Q9, false));
        Drawable drawableMutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        dq dqVar = new dq(drawableMutate, zVarH0, 0, 0);
        int iDp = AndroidUtilities.dp(56.0f);
        int iDp2 = AndroidUtilities.dp(56.0f);
        dqVar.f27823e = iDp;
        dqVar.f27824f = iDp2;
        this.f48907b = dqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.f23124h5, false), mode));
        this.f48914w.setBackground(drawable);
        this.f48915x.setTextColor(g6.w0(null, g6.f23161j5, false));
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.f48916y.getAdapter().l();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.f48914w;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.f48909e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        g gVar = this.f48906a;
        gVar.setTranslationX((f10 == -1.0f || f10 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.1474836E9f) : a(displayMetrics, -2.1474836E9f));
        gVar.setTranslationY(f11 == -1.0f ? b(displayMetrics, 2.1474836E9f) : b(displayMetrics, f11));
        j jVar = new j(gVar, o1.h.f19129m, gVar.getTranslationX());
        k kVar = new k(gVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.f19147u = kVar;
        this.f48908c = jVar;
        j jVar2 = new j(gVar, o1.h.f19130n, gVar.getTranslationY());
        k kVar2 = new k(gVar.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.f19147u = kVar2;
        this.d = jVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f48908c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        g gVar = this.f48906a;
        gVar.setTranslationX(a(displayMetrics, gVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.1474836E9f : -2.1474836E9f));
        gVar.setTranslationY(b(displayMetrics, gVar.getTranslationY()));
        this.f48908c.f19147u.f19154i = gVar.getTranslationX();
        this.d.f19147u.f19154i = gVar.getTranslationY();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48908c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        g gVar = this.f48906a;
        canvas.translate(gVar.getTranslationX(), gVar.getTranslationY());
        canvas.scale(gVar.getScaleX(), gVar.getScaleY(), gVar.getPivotX(), gVar.getPivotY());
        this.f48907b.setAlpha((int) (gVar.getAlpha() * 255.0f));
        this.f48907b.setBounds(gVar.getLeft(), gVar.getTop(), gVar.getRight(), gVar.getBottom());
        this.f48907b.draw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f48913s;
    }
}
