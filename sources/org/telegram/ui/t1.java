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
public final class t1 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final s1 f37908a;
    public final org.telegram.ui.Components.p91 f37909b;
    public b3 f37910c;
    public b3 d;
    public int e;
    public int f37911f;
    public int h;
    public int f37912n;
    public int f37913r;
    public boolean f37914s;
    public TL_iv.pageBlockEmbed v;
    public final g4 f37915w;
    public final i4 f37916x;

    public t1(i4 i4Var, Context context, g4 g4Var) {
        super(context);
        this.f37916x = i4Var;
        this.f37915w = g4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.p91 p91Var = new org.telegram.ui.Components.p91(context, false, new o1(this));
            this.f37909b = p91Var;
            addView(p91Var);
            i4Var.N.add(this);
            s1 s1Var = new s1(this, context);
            this.f37908a = s1Var;
            s1Var.getSettings().setJavaScriptEnabled(true);
            s1Var.getSettings().setDomStorageEnabled(true);
            s1Var.getSettings().setAllowContentAccess(true);
            s1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            s1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            s1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(s1Var, true);
            s1Var.setWebChromeClient(new p1(this, 0));
            s1Var.setWebViewClient(new q1(this));
            addView(s1Var);
            return;
        }
        this.f37909b = null;
        this.f37908a = null;
    }

    public final void a(boolean z10) {
        s1 s1Var = this.f37908a;
        if (s1Var != null) {
            try {
                s1Var.stopLoading();
                s1Var.loadUrl("about:blank");
                if (z10) {
                    s1Var.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.v = null;
        org.telegram.ui.Components.p91 p91Var = this.f37909b;
        if (p91Var != null) {
            p91Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f37910c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f37910c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f37916x.V) {
            this.v = null;
        }
        b3 b3Var = this.f37910c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            b3 b3Var = this.f37910c;
            i4 i4Var = this.f37916x;
            int i10 = 0;
            if (b3Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f37911f);
                i4.v(i4Var, canvas, this, 0);
                this.f37910c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f37911f + this.h);
                i4.v(i4Var, canvas, this, i10);
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
        if (this.f37910c != null) {
            sb2.append(", ");
            sb2.append(this.f37910c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        s1 s1Var = this.f37908a;
        if (s1Var != null) {
            int i14 = this.f37912n;
            s1Var.layout(i14, 0, s1Var.getMeasuredWidth() + i14, s1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.p91 p91Var = this.f37909b;
        if (p91Var != null && p91Var.getParent() == this) {
            int i15 = this.f37912n;
            p91Var.layout(i15, 0, p91Var.getMeasuredWidth() + i15, p91Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.t1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b3 b3Var = this.f37910c;
        int i10 = this.e;
        int i11 = this.f37911f;
        i4 i4Var = this.f37916x;
        if (!i4.l(i4Var, this.f37915w, motionEvent, this, b3Var, i10, i11)) {
            if (!i4.l(i4Var, this.f37915w, motionEvent, this, this.d, this.e, this.f37911f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
