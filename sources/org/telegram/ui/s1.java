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
public final class s1 extends FrameLayout implements org.telegram.ui.Cells.n9 {
    public final r1 f41554a;
    public final org.telegram.ui.Components.ia1 f41555b;
    public a3 f41556c;
    public a3 d;
    public int f41557e;
    public int f41558f;
    public int h;
    public int f41559n;
    public int f41560r;
    public boolean f41561s;
    public TL_iv.pageBlockEmbed v;
    public final f4 f41562w;
    public final h4 f41563x;

    public s1(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.f41563x = h4Var;
        this.f41562w = f4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.ia1 ia1Var = new org.telegram.ui.Components.ia1(context, false, new n1(this));
            this.f41555b = ia1Var;
            addView(ia1Var);
            h4Var.N.add(this);
            r1 r1Var = new r1(this, context);
            this.f41554a = r1Var;
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
        this.f41555b = null;
        this.f41554a = null;
    }

    public final void a(boolean z10) {
        r1 r1Var = this.f41554a;
        if (r1Var != null) {
            try {
                r1Var.stopLoading();
                r1Var.loadUrl("about:blank");
                if (z10) {
                    r1Var.destroy();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        this.v = null;
        org.telegram.ui.Components.ia1 ia1Var = this.f41555b;
        if (ia1Var != null) {
            ia1Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f41556c;
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
        a3 a3Var = this.f41556c;
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
        if (!this.f41563x.V) {
            this.v = null;
        }
        a3 a3Var = this.f41556c;
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
            a3 a3Var = this.f41556c;
            h4 h4Var = this.f41563x;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f41557e, this.f41558f);
                h4.v(h4Var, canvas, this, 0);
                this.f41556c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f41557e, this.f41558f + this.h);
                h4.v(h4Var, canvas, this, i10);
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
        if (this.f41556c != null) {
            sb2.append(", ");
            sb2.append(this.f41556c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        r1 r1Var = this.f41554a;
        if (r1Var != null) {
            int i14 = this.f41559n;
            r1Var.layout(i14, 0, r1Var.getMeasuredWidth() + i14, r1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.ia1 ia1Var = this.f41555b;
        if (ia1Var != null && ia1Var.getParent() == this) {
            int i15 = this.f41559n;
            ia1Var.layout(i15, 0, ia1Var.getMeasuredWidth() + i15, ia1Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f41556c;
        int i10 = this.f41557e;
        int i11 = this.f41558f;
        h4 h4Var = this.f41563x;
        if (!h4.l(h4Var, this.f41562w, motionEvent, this, a3Var, i10, i11)) {
            if (!h4.l(h4Var, this.f41562w, motionEvent, this, this.d, this.f41557e, this.f41558f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
