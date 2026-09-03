package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class u1 extends FrameLayout implements org.telegram.ui.Cells.l9 {
    public final t1 f41683a;
    public final org.telegram.ui.Components.e91 f41684b;
    public d3 f41685c;
    public d3 d;
    public int f41686e;
    public int f41687f;
    public int h;
    public int f41688n;
    public int f41689r;
    public boolean f41690s;
    public TL_iv.pageBlockEmbed v;
    public final j4 f41691w;
    public final l4 f41692x;

    public u1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f41692x = l4Var;
        this.f41691w = j4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.e91 e91Var = new org.telegram.ui.Components.e91(context, false, new p1(this));
            this.f41684b = e91Var;
            addView(e91Var);
            l4Var.K.add(this);
            t1 t1Var = new t1(this, context);
            this.f41683a = t1Var;
            t1Var.getSettings().setJavaScriptEnabled(true);
            t1Var.getSettings().setDomStorageEnabled(true);
            t1Var.getSettings().setAllowContentAccess(true);
            t1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            t1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            t1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(t1Var, true);
            t1Var.setWebChromeClient(new q1(this, 0));
            t1Var.setWebViewClient(new r1(this));
            addView(t1Var);
            return;
        }
        this.f41684b = null;
        this.f41683a = null;
    }

    public final void a(boolean z4) {
        t1 t1Var = this.f41683a;
        if (t1Var != null) {
            try {
                t1Var.stopLoading();
                t1Var.loadUrl("about:blank");
                if (z4) {
                    t1Var.destroy();
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        this.v = null;
        org.telegram.ui.Components.e91 e91Var = this.f41684b;
        if (e91Var != null) {
            e91Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f41685c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f41685c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f41692x.S) {
            this.v = null;
        }
        d3 d3Var = this.f41685c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            d3 d3Var = this.f41685c;
            l4 l4Var = this.f41692x;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.f41686e, this.f41687f);
                l4.v(l4Var, canvas, this, 0);
                this.f41685c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f41686e, this.f41687f + this.h);
                l4.v(l4Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbed));
        if (this.f41685c != null) {
            sb.append(", ");
            sb.append(this.f41685c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        t1 t1Var = this.f41683a;
        if (t1Var != null) {
            int i14 = this.f41688n;
            t1Var.layout(i14, 0, t1Var.getMeasuredWidth() + i14, t1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.e91 e91Var = this.f41684b;
        if (e91Var != null && e91Var.getParent() == this) {
            int i15 = this.f41688n;
            e91Var.layout(i15, 0, e91Var.getMeasuredWidth() + i15, e91Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.f41685c;
        int i10 = this.f41686e;
        int i11 = this.f41687f;
        l4 l4Var = this.f41692x;
        if (!l4.l(l4Var, this.f41691w, motionEvent, this, d3Var, i10, i11)) {
            if (!l4.l(l4Var, this.f41691w, motionEvent, this, this.d, this.f41686e, this.f41687f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
