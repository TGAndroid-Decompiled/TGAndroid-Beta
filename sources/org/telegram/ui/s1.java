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
public final class s1 extends FrameLayout implements org.telegram.ui.Cells.r9 {
    public final r1 f43326a;
    public final org.telegram.ui.Components.ma1 f43327b;
    public a3 f43328c;
    public a3 d;
    public int e;
    public int f43329f;
    public int h;
    public int f43330n;
    public int f43331r;
    public boolean f43332s;
    public TL_iv.pageBlockEmbed v;
    public final h4 f43333w;
    public final j4 f43334x;

    public s1(j4 j4Var, Context context, h4 h4Var) {
        super(context);
        this.f43334x = j4Var;
        this.f43333w = h4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.ma1 ma1Var = new org.telegram.ui.Components.ma1(context, false, new n1(this));
            this.f43327b = ma1Var;
            addView(ma1Var);
            j4Var.N.add(this);
            r1 r1Var = new r1(this, context);
            this.f43326a = r1Var;
            r1Var.getSettings().setJavaScriptEnabled(true);
            r1Var.getSettings().setDomStorageEnabled(true);
            r1Var.getSettings().setAllowContentAccess(true);
            r1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            r1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            r1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(r1Var, true);
            r1Var.setWebChromeClient(new o1(this, 0));
            r1Var.setWebViewClient(new p1(this));
            addView(r1Var);
            return;
        }
        this.f43327b = null;
        this.f43326a = null;
    }

    public final void a(boolean z10) {
        r1 r1Var = this.f43326a;
        if (r1Var != null) {
            try {
                r1Var.stopLoading();
                r1Var.loadUrl("about:blank");
                if (z10) {
                    r1Var.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.v = null;
        org.telegram.ui.Components.ma1 ma1Var = this.f43327b;
        if (ma1Var != null) {
            ma1Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f43328c;
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
        a3 a3Var = this.f43328c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f43334x.V) {
            this.v = null;
        }
        a3 a3Var = this.f43328c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            a3 a3Var = this.f43328c;
            j4 j4Var = this.f43334x;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f43329f);
                j4.v(j4Var, canvas, this, 0);
                this.f43328c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f43329f + this.h);
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
        if (this.f43328c != null) {
            sb2.append(", ");
            sb2.append(this.f43328c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        r1 r1Var = this.f43326a;
        if (r1Var != null) {
            int i14 = this.f43330n;
            r1Var.layout(i14, 0, r1Var.getMeasuredWidth() + i14, r1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.ma1 ma1Var = this.f43327b;
        if (ma1Var != null && ma1Var.getParent() == this) {
            int i15 = this.f43330n;
            ma1Var.layout(i15, 0, ma1Var.getMeasuredWidth() + i15, ma1Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f43328c;
        int i10 = this.e;
        int i11 = this.f43329f;
        j4 j4Var = this.f43334x;
        if (!j4.l(j4Var, this.f43333w, motionEvent, this, a3Var, i10, i11)) {
            if (!j4.l(j4Var, this.f43333w, motionEvent, this, this.d, this.e, this.f43329f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
