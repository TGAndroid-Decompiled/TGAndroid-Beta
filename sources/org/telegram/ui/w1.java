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
public final class w1 extends FrameLayout implements org.telegram.ui.Cells.k9 {
    public final v1 f39233a;
    public final org.telegram.ui.Components.e91 f39234b;
    public f3 f39235c;
    public f3 d;
    public int e;
    public int f39236f;
    public int h;
    public int f39237n;
    public int f39238r;
    public boolean f39239s;
    public TL_iv.pageBlockEmbed v;
    public final l4 f39240w;
    public final n4 f39241x;

    public w1(n4 n4Var, Context context, l4 l4Var) {
        super(context);
        this.f39241x = n4Var;
        this.f39240w = l4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.e91 e91Var = new org.telegram.ui.Components.e91(context, false, new r1(this));
            this.f39234b = e91Var;
            addView(e91Var);
            n4Var.K.add(this);
            v1 v1Var = new v1(this, context);
            this.f39233a = v1Var;
            v1Var.getSettings().setJavaScriptEnabled(true);
            v1Var.getSettings().setDomStorageEnabled(true);
            v1Var.getSettings().setAllowContentAccess(true);
            v1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            v1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            v1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(v1Var, true);
            v1Var.setWebChromeClient(new s1(this, 0));
            v1Var.setWebViewClient(new t1(this));
            addView(v1Var);
            return;
        }
        this.f39234b = null;
        this.f39233a = null;
    }

    public final void a(boolean z4) {
        v1 v1Var = this.f39233a;
        if (v1Var != null) {
            try {
                v1Var.stopLoading();
                v1Var.loadUrl("about:blank");
                if (z4) {
                    v1Var.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.v = null;
        org.telegram.ui.Components.e91 e91Var = this.f39234b;
        if (e91Var != null) {
            e91Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f39235c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f39235c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f39241x.S) {
            this.v = null;
        }
        f3 f3Var = this.f39235c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            f3 f3Var = this.f39235c;
            n4 n4Var = this.f39241x;
            int i10 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f39236f);
                n4.v(n4Var, canvas, this, 0);
                this.f39235c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f39236f + this.h);
                n4.v(n4Var, canvas, this, i10);
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
        if (this.f39235c != null) {
            sb.append(", ");
            sb.append(this.f39235c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        v1 v1Var = this.f39233a;
        if (v1Var != null) {
            int i14 = this.f39237n;
            v1Var.layout(i14, 0, v1Var.getMeasuredWidth() + i14, v1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.e91 e91Var = this.f39234b;
        if (e91Var != null && e91Var.getParent() == this) {
            int i15 = this.f39237n;
            e91Var.layout(i15, 0, e91Var.getMeasuredWidth() + i15, e91Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.f39235c;
        int i10 = this.e;
        int i11 = this.f39236f;
        n4 n4Var = this.f39241x;
        if (!n4.l(n4Var, this.f39240w, motionEvent, this, f3Var, i10, i11)) {
            if (!n4.l(n4Var, this.f39240w, motionEvent, this, this.d, this.e, this.f39236f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
