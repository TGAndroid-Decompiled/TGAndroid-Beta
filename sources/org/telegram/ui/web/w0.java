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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.q3;
import org.telegram.ui.th;
public final class w0 extends WebView {
    public static final int P = 0;
    public boolean A;
    public f3 B;
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
    public final int f44225a;
    public boolean f44226b;
    public final boolean f44227c;
    public String d;
    public a1 f44228e;
    public w0 f44229f;
    public boolean h;
    public String f44230n;
    public String f44231r;
    public boolean f44232s;
    public boolean v;
    public int f44233w;
    public int f44234x;
    public String f44235y;

    public w0(Context context, boolean z10, long j10) {
        super(context);
        int i10 = z0.J0;
        z0.J0 = i10 + 1;
        this.f44225a = i10;
        this.f44235y = "about:blank";
        this.L = new HashMap();
        this.f44227c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new j0(this));
        setWebViewClient(new l0(this, z10, context));
        setWebChromeClient(new t0(this, context, z10, j10));
        setFindListener(new u0(this));
        if (!z10) {
            setDownloadListener(new v0(this));
        }
    }

    public static void a(w0 w0Var) {
        if (!w0Var.f44227c) {
            j2 a2 = j2.a(w0Var);
            k2 b10 = k2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f44092a == null) {
                    b10.f44092a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f44077b)) {
                    b10.f44092a.put(a2.f44077b, a2);
                    b10.c();
                    b10.d();
                }
            }
            a1 a1Var = w0Var.f44228e;
            if (a1Var != null && a2 != null) {
                a1Var.d = a2;
                b1.c(a1Var);
            }
        }
    }

    public final void b(j2 j2Var) {
        f0 f0Var;
        if (j2Var != null) {
            z0 z0Var = this.M;
            boolean z10 = false;
            if (z0Var != null && (f0Var = z0Var.f44264c) != null) {
                int i10 = j2Var.f44079e;
                if (i10 != 0) {
                    f0Var.o(i10, true);
                    this.f44232s = true;
                }
                int i11 = j2Var.f44080f;
                if (i11 != 0) {
                    this.M.f44264c.o(i11, false);
                    this.v = true;
                } else {
                    i11 = -1;
                }
                Bitmap bitmap = j2Var.f44081i;
                if (bitmap != null) {
                    z0 z0Var2 = this.M;
                    this.K = bitmap;
                    z0Var2.getClass();
                    this.I = true;
                }
                if (!TextUtils.isEmpty(j2Var.d)) {
                    String str = j2Var.d;
                    this.f44231r = str;
                    z0 z0Var3 = this.M;
                    this.G = str;
                    z0Var3.E();
                    z10 = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i11);
                }
            }
            if (!z10) {
                setTitle(null);
                z0 z0Var4 = this.M;
                if (z0Var4 != null) {
                    z0Var4.E();
                }
            }
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.f44225a + " " + str);
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

    public final void e(String str, j2 j2Var) {
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        b(j2Var);
        this.d = str;
        String b10 = z0.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        z0 z0Var = this.M;
        if (z0Var != null) {
            z0Var.F(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(z0 z0Var, y0 y0Var) {
        boolean z10;
        c("setContainers(" + z0Var + ", " + y0Var + ")");
        if (this.M == null) {
            z10 = true;
        } else {
            z10 = false;
        }
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
        float max = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
        if (max <= getHeight()) {
            return 0.0f;
        }
        return Utilities.clamp01(getScrollY() / max);
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
        if (this.A) {
            return this.f44235y;
        }
        return super.getUrl();
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
        StringBuilder k9 = th.k("loadData ", str, " ", str2, " ");
        k9.append(str3);
        c(k9.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder k9 = th.k("loadDataWithBaseURL ", str, " ", str2, " ");
        th.w(k9, str3, " ", str4, " ");
        k9.append(str5);
        c(k9.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        if (!this.f44227c) {
            b(k2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = z0.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        z0 z0Var = this.M;
        if (z0Var != null) {
            z0Var.F(!super.canGoBack(), true ^ canGoForward());
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
        boolean isFocusable = z0Var.isFocusable();
        c("onCheckIsTextEditor: " + isFocusable);
        return isFocusable;
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
            ((q3) ((org.telegram.ui.h) y0Var).f38706b).G.f0();
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

    public void setScrollProgress(float f9) {
        setScrollY((int) (f9 * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
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
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        if (!this.f44227c) {
            b(k2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = z0.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        z0 z0Var = this.M;
        if (z0Var != null) {
            z0Var.F(!super.canGoBack(), !canGoForward());
        }
    }
}
