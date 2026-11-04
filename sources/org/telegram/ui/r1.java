package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class r1 extends FrameLayout implements org.telegram.ui.Cells.g9 {
    public final q1 f48989a;
    public final org.telegram.ui.Components.d71 f48990b;
    public a3 f48991c;
    public a3 d;
    public int f48992e;
    public int f48993f;
    public int h;
    public int f48994n;
    public int f48995r;
    public boolean f48996s;
    public TL_iv.pageBlockEmbed f48997w;
    public final g4 f48998x;
    public final i4 f48999y;

    public r1(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.f48999y = i4Var;
        this.f48998x = g4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.d71 d71Var = new org.telegram.ui.Components.d71(context, false, new m1(this));
            this.f48990b = d71Var;
            addView(d71Var);
            i4Var.O.add(this);
            q1 q1Var = new q1(this, context);
            this.f48989a = q1Var;
            q1Var.getSettings().setJavaScriptEnabled(true);
            q1Var.getSettings().setDomStorageEnabled(true);
            q1Var.getSettings().setAllowContentAccess(true);
            q1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            q1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            q1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(q1Var, true);
            q1Var.setWebChromeClient(new n1(this, 0));
            q1Var.setWebViewClient(new o1(this, 0));
            addView(q1Var);
            return;
        }
        this.f48990b = null;
        this.f48989a = null;
    }

    public final void a(boolean z10) {
        q1 q1Var = this.f48989a;
        if (q1Var != null) {
            try {
                q1Var.stopLoading();
                q1Var.loadUrl("about:blank");
                if (z10) {
                    q1Var.destroy();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.f48997w = null;
        org.telegram.ui.Components.d71 d71Var = this.f48990b;
        if (d71Var != null) {
            d71Var.b();
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f48991c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f48991c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f48999y.W) {
            this.f48997w = null;
        }
        a3 a3Var = this.f48991c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f48997w != null) {
            a3 a3Var = this.f48991c;
            i4 i4Var = this.f48999y;
            int i3 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f48992e, this.f48993f);
                i4.t(i4Var, canvas, this, 0);
                this.f48991c.d(canvas, this);
                canvas.restore();
                i3 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f48992e, this.f48993f + this.h);
                i4.t(i4Var, canvas, this, i3);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131754868, null));
        if (this.f48991c != null) {
            sb2.append(", ");
            sb2.append(this.f48991c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        q1 q1Var = this.f48989a;
        if (q1Var != null) {
            int i13 = this.f48994n;
            q1Var.layout(i13, 0, q1Var.getMeasuredWidth() + i13, q1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.d71 d71Var = this.f48990b;
        if (d71Var != null && d71Var.getParent() == this) {
            int i14 = this.f48994n;
            d71Var.layout(i14, 0, d71Var.getMeasuredWidth() + i14, d71Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f48991c;
        int i3 = this.f48992e;
        int i10 = this.f48993f;
        i4 i4Var = this.f48999y;
        if (!i4.j(i4Var, this.f48998x, motionEvent, this, a3Var, i3, i10)) {
            if (!i4.j(i4Var, this.f48998x, motionEvent, this, this.d, this.f48992e, this.f48993f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
