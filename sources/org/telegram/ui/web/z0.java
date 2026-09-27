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
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.n3;
public final class z0 extends WebView {
    public static final int V = 0;
    public boolean E;
    public g3 F;
    public int G;
    public int H;
    public Runnable I;
    public boolean J;
    public String K;
    public String L;
    public boolean M;
    public boolean N;
    public Bitmap O;
    public final HashMap P;
    public c1 Q;
    public boolean R;
    public a4.m S;
    public b1 T;
    public Runnable U;
    public final int f39241a;
    public boolean f39242b;
    public final boolean f39243c;
    public String d;
    public d1 e;
    public z0 f39244f;
    public boolean h;
    public String f39245n;
    public String f39246r;
    public boolean f39247s;
    public boolean v;
    public int f39248w;
    public int f39249x;
    public String f39250y;

    public z0(Context context, boolean z10, long j3) {
        super(context);
        int i10 = c1.Q0;
        c1.Q0 = i10 + 1;
        this.f39241a = i10;
        this.f39250y = "about:blank";
        this.P = new HashMap();
        this.f39243c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new l0(this));
        setWebViewClient(new n0(this, z10, context));
        setWebChromeClient(new w0(this, context, z10, j3));
        setFindListener(new x0(this));
        if (!z10) {
            setDownloadListener(new y0(this));
        }
    }

    public static void a(z0 z0Var) {
        if (!z0Var.f39243c) {
            n2 a2 = n2.a(z0Var);
            o2 b10 = o2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f39124a == null) {
                    b10.f39124a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f39106b)) {
                    b10.f39124a.put(a2.f39106b, a2);
                    b10.c();
                    b10.d();
                }
            }
            d1 d1Var = z0Var.e;
            if (d1Var != null && a2 != null) {
                d1Var.d = a2;
                e1.c(d1Var);
            }
        }
    }

    public final void b(n2 n2Var) {
        h0 h0Var;
        if (n2Var != null) {
            c1 c1Var = this.Q;
            boolean z10 = false;
            if (c1Var != null && (h0Var = c1Var.f38962c) != null) {
                int i10 = n2Var.e;
                if (i10 != 0) {
                    h0Var.o(i10, true);
                    this.f39247s = true;
                }
                int i11 = n2Var.f39108f;
                if (i11 != 0) {
                    this.Q.f38962c.o(i11, false);
                    this.v = true;
                } else {
                    i11 = -1;
                }
                Bitmap bitmap = n2Var.f39109i;
                if (bitmap != null) {
                    c1 c1Var2 = this.Q;
                    this.O = bitmap;
                    c1Var2.getClass();
                    this.M = true;
                }
                if (!TextUtils.isEmpty(n2Var.d)) {
                    String str = n2Var.d;
                    this.f39246r = str;
                    c1 c1Var3 = this.Q;
                    this.K = str;
                    c1Var3.I();
                    z10 = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i11);
                }
            }
            if (!z10) {
                setTitle(null);
                c1 c1Var4 = this.Q;
                if (c1Var4 != null) {
                    c1Var4.I();
                }
            }
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.f39241a + " " + str);
    }

    @Override
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new i0(0));
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(String str, n2 n2Var) {
        g3 g3Var = this.F;
        if (g3Var != null) {
            g3Var.dismiss();
            this.F = null;
        }
        b(n2Var);
        this.d = str;
        String b10 = c1.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.J(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(c1 c1Var, b1 b1Var) {
        boolean z10;
        c("setContainers(" + c1Var + ", " + b1Var + ")");
        if (this.Q == null && c1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = c1Var;
        this.T = b1Var;
        if (z10) {
            d("window.__tg__postBackgroundChange()");
        }
    }

    @Override
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.O;
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
        return this.H;
    }

    public int getSearchIndex() {
        return this.G;
    }

    @Override
    public String getTitle() {
        return this.K;
    }

    @Override
    public String getUrl() {
        if (this.E) {
            return this.f39250y;
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
        StringBuilder w10 = a4.a.w("loadData ", str, " ", str2, " ");
        w10.append(str3);
        c(w10.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder w10 = a4.a.w("loadDataWithBaseURL ", str, " ", str2, " ");
        a4.a.z(w10, str3, " ", str4, " ");
        w10.append(str5);
        c(w10.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        g3 g3Var = this.F;
        if (g3Var != null) {
            g3Var.dismiss();
            this.F = null;
        }
        if (!this.f39243c) {
            b(o2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = c1.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.J(!super.canGoBack(), true ^ canGoForward());
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
        c1 c1Var = this.Q;
        if (c1Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = c1Var.isFocusable();
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
        b1 b1Var = this.T;
        if (b1Var != null) {
            getScrollX();
            getScrollY();
            ((n3) ((org.telegram.ui.g) b1Var).f33670b).K.f0();
        }
        getScrollX();
        getScrollY();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Q != null && motionEvent.getAction() == 0) {
            this.Q.P = System.currentTimeMillis();
            if (!this.Q.s()) {
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
        this.U = runnable;
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

    public void setScrollProgress(float f7) {
        setScrollY((int) (f7 * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
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
        this.K = str;
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
        g3 g3Var = this.F;
        if (g3Var != null) {
            g3Var.dismiss();
            this.F = null;
        }
        if (!this.f39243c) {
            b(o2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = c1.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.J(!super.canGoBack(), !canGoForward());
        }
    }
}
