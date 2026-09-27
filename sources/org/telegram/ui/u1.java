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
public final class u1 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final t1 f38095a;
    public final org.telegram.ui.Components.q91 f38096b;
    public c3 f38097c;
    public c3 d;
    public int e;
    public int f38098f;
    public int h;
    public int f38099n;
    public int f38100r;
    public boolean f38101s;
    public TL_iv.pageBlockEmbed v;
    public final h4 f38102w;
    public final j4 f38103x;

    public u1(j4 j4Var, Context context, h4 h4Var) {
        super(context);
        this.f38103x = j4Var;
        this.f38102w = h4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.q91 q91Var = new org.telegram.ui.Components.q91(context, false, new p1(this));
            this.f38096b = q91Var;
            addView(q91Var);
            j4Var.N.add(this);
            t1 t1Var = new t1(this, context);
            this.f38095a = t1Var;
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
        this.f38096b = null;
        this.f38095a = null;
    }

    public final void a(boolean z10) {
        t1 t1Var = this.f38095a;
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
        org.telegram.ui.Components.q91 q91Var = this.f38096b;
        if (q91Var != null) {
            q91Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f38097c;
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
        c3 c3Var = this.f38097c;
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
        if (!this.f38103x.V) {
            this.v = null;
        }
        c3 c3Var = this.f38097c;
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
            c3 c3Var = this.f38097c;
            j4 j4Var = this.f38103x;
            int i10 = 0;
            if (c3Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f38098f);
                j4.v(j4Var, canvas, this, 0);
                this.f38097c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f38098f + this.h);
                j4.v(j4Var, canvas, this, i10);
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
        if (this.f38097c != null) {
            sb2.append(", ");
            sb2.append(this.f38097c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        t1 t1Var = this.f38095a;
        if (t1Var != null) {
            int i14 = this.f38099n;
            t1Var.layout(i14, 0, t1Var.getMeasuredWidth() + i14, t1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.q91 q91Var = this.f38096b;
        if (q91Var != null && q91Var.getParent() == this) {
            int i15 = this.f38099n;
            q91Var.layout(i15, 0, q91Var.getMeasuredWidth() + i15, q91Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.u1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c3 c3Var = this.f38097c;
        int i10 = this.e;
        int i11 = this.f38098f;
        j4 j4Var = this.f38103x;
        if (!j4.l(j4Var, this.f38102w, motionEvent, this, c3Var, i10, i11)) {
            if (!j4.l(j4Var, this.f38102w, motionEvent, this, this.d, this.e, this.f38098f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
