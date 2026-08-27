package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.q3;

public final class w0 extends WebView {
    public static final int P = 0;
    public boolean A;
    public e3 B;
    public int C;
    public int D;
    public Runnable E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public boolean J;
    public Bitmap K;
    public final HashMap L;
    public z0 M;
    public y0 N;
    public Runnable O;

    public final int f44023a;

    public boolean f44024b;

    public final boolean f44025c;
    public String d;

    public a1 f44026e;

    public w0 f44027f;
    public boolean h;

    public String f44028n;

    public String f44029r;

    public boolean f44030s;
    public boolean v;

    public int f44031w;

    public int f44032x;

    public String f44033y;

    public w0(Context context, boolean z10, long j10) {
        super(context);
        int i10 = z0.J0;
        z0.J0 = i10 + 1;
        this.f44023a = i10;
        this.f44033y = "about:blank";
        this.L = new HashMap();
        this.f44025c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new j0(this));
        setWebViewClient(new l0(this, z10, context));
        setWebChromeClient(new t0(this, context, z10, j10));
        setFindListener(new u0(this));
        if (z10) {
            return;
        }
        setDownloadListener(new v0(this));
    }

    public static void a(w0 w0Var) {
        if (w0Var.f44025c) {
            return;
        }
        i2 i2VarA = i2.a(w0Var);
        j2 j2VarB = j2.b();
        if (i2VarA == null) {
            j2VarB.getClass();
        } else {
            if (j2VarB.f43881a == null) {
                j2VarB.f43881a = new HashMap();
            }
            if (!TextUtils.isEmpty(i2VarA.f43867b)) {
                j2VarB.f43881a.put(i2VarA.f43867b, i2VarA);
                j2VarB.c();
                j2VarB.d();
            }
        }
        a1 a1Var = w0Var.f44026e;
        if (a1Var == null || i2VarA == null) {
            return;
        }
        a1Var.d = i2VarA;
        b1.c(a1Var);
    }

    public final void b(i2 i2Var) {
        f0 f0Var;
        if (i2Var == null) {
            return;
        }
        z0 z0Var = this.M;
        boolean z10 = false;
        if (z0Var != null && (f0Var = z0Var.f44061c) != null) {
            int i10 = i2Var.f43869e;
            if (i10 != 0) {
                f0Var.o(i10, true);
                this.f44030s = true;
            }
            int i11 = i2Var.f43870f;
            if (i11 != 0) {
                this.M.f44061c.o(i11, false);
                this.v = true;
            } else {
                i11 = -1;
            }
            Bitmap bitmap = i2Var.f43871i;
            if (bitmap != null) {
                z0 z0Var2 = this.M;
                this.K = bitmap;
                z0Var2.getClass();
                this.I = true;
            }
            if (!TextUtils.isEmpty(i2Var.d)) {
                String str = i2Var.d;
                this.f44029r = str;
                z0 z0Var3 = this.M;
                this.G = str;
                z0Var3.E();
                z10 = true;
            }
            if (SharedConfig.adaptableColorInBrowser) {
                setBackgroundColor(i11);
            }
        }
        if (z10) {
            return;
        }
        setTitle(null);
        z0 z0Var4 = this.M;
        if (z0Var4 != null) {
            z0Var4.E();
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.f44023a + " " + str);
    }

    @Override
    public final boolean canGoBack() {
        return super.canGoBack();
    }

    @Override
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new g0(0));
    }

    @Override
    public final void destroy() {
        c("destroy");
        super.destroy();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(String str, i2 i2Var) {
        e3 e3Var = this.B;
        if (e3Var != null) {
            e3Var.dismiss();
            this.B = null;
        }
        b(i2Var);
        this.d = str;
        String strB = z0.b(str);
        c("loadUrl " + strB + " with cached meta");
        super.loadUrl(strB);
        z0 z0Var = this.M;
        if (z0Var != null) {
            z0Var.F(!canGoBack(), !canGoForward());
        }
    }

    public final void f(z0 z0Var, y0 y0Var) {
        c("setContainers(" + z0Var + ", " + y0Var + ")");
        boolean z10 = this.M == null;
        this.M = z0Var;
        this.N = y0Var;
        if (z10) {
            d("window.__tg__postBackgroundChange()");
        }
    }

    @Override
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.K;
    }

    public String getOpenURL() {
        return this.d;
    }

    public float getScrollProgress() {
        float fMax = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
        if (fMax <= getHeight()) {
            return 0.0f;
        }
        return Utilities.clamp01(getScrollY() / fMax);
    }

    public int getSearchCount() {
        return this.D;
    }

    public int getSearchIndex() {
        return this.C;
    }

    @Override
    public String getTitle() {
        return this.G;
    }

    @Override
    public String getUrl() {
        return this.A ? this.f44033y : super.getUrl();
    }

    @Override
    public final void goBack() {
        c("goBack");
        super.goBack();
    }

    @Override
    public final void goForward() {
        c("goForward");
        super.goForward();
    }

    @Override
    public final void loadData(String str, String str2, String str3) {
        this.d = null;
        StringBuilder sbP = i0.a.p("loadData ", str, " ", str2, " ");
        sbP.append(str3);
        c(sbP.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder sbP = i0.a.p("loadDataWithBaseURL ", str, " ", str2, " ");
        i0.a.z(sbP, str3, " ", str4, " ");
        sbP.append(str5);
        c(sbP.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        e3 e3Var = this.B;
        if (e3Var != null) {
            e3Var.dismiss();
            this.B = null;
        }
        if (!this.f44025c) {
            b(j2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String strB = z0.b(str);
        c("loadUrl " + strB);
        super.loadUrl(strB);
        z0 z0Var = this.M;
        if (z0Var != null) {
            z0Var.F(!canGoBack(), true ^ canGoForward());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        c("attached");
        AndroidUtilities.checkAndroidTheme(getContext(), true);
        super.onAttachedToWindow();
    }

    @Override
    public final boolean onCheckIsTextEditor() {
        z0 z0Var = this.M;
        if (z0Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean zIsFocusable = z0Var.isFocusable();
        c("onCheckIsTextEditor: " + zIsFocusable);
        return zIsFocusable;
    }

    @Override
    public final void onDetachedFromWindow() {
        c("detached");
        AndroidUtilities.checkAndroidTheme(getContext(), false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
    }

    @Override
    public final void onPause() {
        c("onPause");
        super.onPause();
    }

    @Override
    public final void onResume() {
        c("onResume");
        super.onResume();
    }

    @Override
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        y0 y0Var = this.N;
        if (y0Var != null) {
            getScrollX();
            getScrollY();
            ((q3) ((org.telegram.ui.g) y0Var).f38248b).G.f0();
        }
        getScrollX();
        getScrollY();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.M.L = System.currentTimeMillis();
            if (!this.M.p()) {
                getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void pauseTimers() {
        c("pauseTimers");
        super.pauseTimers();
    }

    @Override
    public final void postUrl(String str, byte[] bArr) {
        c("postUrl " + str + " " + bArr);
        super.postUrl(str, bArr);
    }

    @Override
    public final void reload() {
        CookieManager.getInstance().flush();
        c("reload");
        super.reload();
    }

    @Override
    public final void resumeTimers() {
        c("resumeTimers");
        super.resumeTimers();
    }

    public void setCloseListener(Runnable runnable) {
        this.O = runnable;
    }

    @Override
    public void setFocusable(int i10) {
        c("setFocusable " + i10);
        super.setFocusable(i10);
    }

    @Override
    public void setFocusableInTouchMode(boolean z10) {
        c("setFocusableInTouchMode " + z10);
        super.setFocusableInTouchMode(z10);
    }

    @Override
    public void setFocusedByDefault(boolean z10) {
        c("setFocusedByDefault " + z10);
        super.setFocusedByDefault(z10);
    }

    public void setScrollProgress(float f10) {
        setScrollY((int) (f10 * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
    }

    @Override
    public void setScrollX(int i10) {
        super.setScrollX(i10);
    }

    @Override
    public void setScrollY(int i10) {
        super.setScrollY(i10);
    }

    public void setTitle(String str) {
        this.G = str;
    }

    @Override
    public final void stopLoading() {
        c("stopLoading");
        super.stopLoading();
    }

    @Override
    public final void stopNestedScroll() {
        c("stopNestedScroll");
        super.stopNestedScroll();
    }

    @Override
    public void setFocusable(boolean z10) {
        c("setFocusable " + z10);
        super.setFocusable(z10);
    }

    @Override
    public final void loadUrl(String str, Map map) {
        e3 e3Var = this.B;
        if (e3Var != null) {
            e3Var.dismiss();
            this.B = null;
        }
        if (!this.f44025c) {
            b(j2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String strB = z0.b(str);
        c("loadUrl " + strB + " " + map);
        super.loadUrl(strB, map);
        z0 z0Var = this.M;
        if (z0Var != null) {
            z0Var.F(!canGoBack(), !canGoForward());
        }
    }
}
