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
public final class u1 extends FrameLayout implements org.telegram.ui.Cells.n9 {
    public final t1 f42171a;
    public final org.telegram.ui.Components.da1 f42172b;
    public c3 f42173c;
    public c3 d;
    public int e;
    public int f42174f;
    public int h;
    public int f42175n;
    public int f42176r;
    public boolean f42177s;
    public TL_iv.pageBlockEmbed v;
    public final i4 f42178w;
    public final k4 f42179x;

    public u1(k4 k4Var, Context context, i4 i4Var) {
        super(context);
        this.f42179x = k4Var;
        this.f42178w = i4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.da1 da1Var = new org.telegram.ui.Components.da1(context, false, new p1(this));
            this.f42172b = da1Var;
            addView(da1Var);
            k4Var.N.add(this);
            t1 t1Var = new t1(this, context);
            this.f42171a = t1Var;
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
        this.f42172b = null;
        this.f42171a = null;
    }

    public final void a(boolean z10) {
        t1 t1Var = this.f42171a;
        if (t1Var != null) {
            try {
                t1Var.stopLoading();
                t1Var.loadUrl("about:blank");
                if (z10) {
                    t1Var.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.v = null;
        org.telegram.ui.Components.da1 da1Var = this.f42172b;
        if (da1Var != null) {
            da1Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f42173c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            arrayList.add(c3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f42173c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f42179x.V) {
            this.v = null;
        }
        c3 c3Var = this.f42173c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
        c3 c3Var2 = this.d;
        if (c3Var2 != null) {
            c3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            c3 c3Var = this.f42173c;
            k4 k4Var = this.f42179x;
            int i10 = 0;
            if (c3Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f42174f);
                k4.v(k4Var, canvas, this, 0);
                this.f42173c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f42174f + this.h);
                k4.v(k4Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbed));
        if (this.f42173c != null) {
            sb2.append(", ");
            sb2.append(this.f42173c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        t1 t1Var = this.f42171a;
        if (t1Var != null) {
            int i14 = this.f42175n;
            t1Var.layout(i14, 0, t1Var.getMeasuredWidth() + i14, t1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.da1 da1Var = this.f42172b;
        if (da1Var != null && da1Var.getParent() == this) {
            int i15 = this.f42175n;
            da1Var.layout(i15, 0, da1Var.getMeasuredWidth() + i15, da1Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c3 c3Var = this.f42173c;
        int i10 = this.e;
        int i11 = this.f42174f;
        k4 k4Var = this.f42179x;
        if (!k4.l(k4Var, this.f42178w, motionEvent, this, c3Var, i10, i11)) {
            if (!k4.l(k4Var, this.f42178w, motionEvent, this, this.d, this.e, this.f42174f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
