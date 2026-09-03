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
import org.telegram.ui.ai;
import org.telegram.ui.r3;
public final class y0 extends WebView {
    public static final int S = 0;
    public boolean B;
    public g3 C;
    public int D;
    public int E;
    public Runnable F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public boolean K;
    public Bitmap L;
    public final HashMap M;
    public c1 N;
    public boolean O;
    public bb.b P;
    public b1 Q;
    public Runnable R;
    public final int f39651a;
    public boolean f39652b;
    public final boolean f39653c;
    public String d;
    public d1 e;
    public y0 f39654f;
    public boolean h;
    public String f39655n;
    public String f39656r;
    public boolean f39657s;
    public boolean v;
    public int f39658w;
    public int f39659x;
    public String f39660y;

    public y0(Context context, boolean z4, long j10) {
        super(context);
        int i10 = c1.N0;
        c1.N0 = i10 + 1;
        this.f39651a = i10;
        this.f39660y = "about:blank";
        this.M = new HashMap();
        this.f39653c = z4;
        c("created new webview " + this);
        setOnLongClickListener(new k0(this));
        setWebViewClient(new m0(this, z4, context));
        setWebChromeClient(new v0(this, context, z4, j10));
        setFindListener(new w0(this));
        if (!z4) {
            setDownloadListener(new x0(this));
        }
    }

    public static void a(y0 y0Var) {
        if (!y0Var.f39653c) {
            l2 a2 = l2.a(y0Var);
            m2 b10 = m2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f39529a == null) {
                    b10.f39529a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f39518b)) {
                    b10.f39529a.put(a2.f39518b, a2);
                    b10.c();
                    b10.d();
                }
            }
            d1 d1Var = y0Var.e;
            if (d1Var != null && a2 != null) {
                d1Var.d = a2;
                e1.c(d1Var);
            }
        }
    }

    public final void b(l2 l2Var) {
        g0 g0Var;
        if (l2Var != null) {
            c1 c1Var = this.N;
            boolean z4 = false;
            if (c1Var != null && (g0Var = c1Var.f39385c) != null) {
                int i10 = l2Var.e;
                if (i10 != 0) {
                    g0Var.o(i10, true);
                    this.f39657s = true;
                }
                int i11 = l2Var.f39520f;
                if (i11 != 0) {
                    this.N.f39385c.o(i11, false);
                    this.v = true;
                } else {
                    i11 = -1;
                }
                Bitmap bitmap = l2Var.f39521i;
                if (bitmap != null) {
                    c1 c1Var2 = this.N;
                    this.L = bitmap;
                    c1Var2.getClass();
                    this.J = true;
                }
                if (!TextUtils.isEmpty(l2Var.d)) {
                    String str = l2Var.d;
                    this.f39656r = str;
                    c1 c1Var3 = this.N;
                    this.H = str;
                    c1Var3.I();
                    z4 = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i11);
                }
            }
            if (!z4) {
                setTitle(null);
                c1 c1Var4 = this.N;
                if (c1Var4 != null) {
                    c1Var4.I();
                }
            }
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.f39651a + " " + str);
    }

    @Override
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new h0(0));
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

    public final void e(String str, l2 l2Var) {
        g3 g3Var = this.C;
        if (g3Var != null) {
            g3Var.dismiss();
            this.C = null;
        }
        b(l2Var);
        this.d = str;
        String b10 = c1.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        c1 c1Var = this.N;
        if (c1Var != null) {
            c1Var.J(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(c1 c1Var, b1 b1Var) {
        boolean z4;
        c("setContainers(" + c1Var + ", " + b1Var + ")");
        if (this.N == null && c1Var != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.N = c1Var;
        this.Q = b1Var;
        if (z4) {
            d("window.__tg__postBackgroundChange()");
        }
    }

    @Override
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.L;
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
        return this.E;
    }

    public int getSearchIndex() {
        return this.D;
    }

    @Override
    public String getTitle() {
        return this.H;
    }

    @Override
    public String getUrl() {
        if (this.B) {
            return this.f39660y;
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
        StringBuilder l10 = ai.l("loadData ", str, " ", str2, " ");
        l10.append(str3);
        c(l10.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder l10 = ai.l("loadDataWithBaseURL ", str, " ", str2, " ");
        ai.w(l10, str3, " ", str4, " ");
        l10.append(str5);
        c(l10.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        g3 g3Var = this.C;
        if (g3Var != null) {
            g3Var.dismiss();
            this.C = null;
        }
        if (!this.f39653c) {
            b(m2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = c1.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        c1 c1Var = this.N;
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
        c1 c1Var = this.N;
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
        b1 b1Var = this.Q;
        if (b1Var != null) {
            getScrollX();
            getScrollY();
            ((r3) ((org.telegram.ui.h) b1Var).f34532b).H.f0();
        }
        getScrollX();
        getScrollY();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.N != null && motionEvent.getAction() == 0) {
            this.N.M = System.currentTimeMillis();
            if (!this.N.s()) {
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
        this.R = runnable;
    }

    @Override
    public void setFocusable(int i10) {
        c("setFocusable " + i10);
        super.setFocusable(i10);
    }

    @Override
    public void setFocusableInTouchMode(boolean z4) {
        c("setFocusableInTouchMode " + z4);
        super.setFocusableInTouchMode(z4);
    }

    @Override
    public void setFocusedByDefault(boolean z4) {
        c("setFocusedByDefault " + z4);
        super.setFocusedByDefault(z4);
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
        this.H = str;
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
    public void setFocusable(boolean z4) {
        c("setFocusable " + z4);
        super.setFocusable(z4);
    }

    @Override
    public final void loadUrl(String str, Map map) {
        g3 g3Var = this.C;
        if (g3Var != null) {
            g3Var.dismiss();
            this.C = null;
        }
        if (!this.f39653c) {
            b(m2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = c1.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        c1 c1Var = this.N;
        if (c1Var != null) {
            c1Var.J(!super.canGoBack(), !canGoForward());
        }
    }
}
