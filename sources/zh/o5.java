package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class o5 extends View {
    public final y2 f48744a;
    public boolean f48745b;
    public final org.telegram.ui.Components.d6 f48746c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.p5 f48747f;
    public boolean h;
    public boolean f48748n;
    public boolean f48749r;
    public boolean f48750s;

    public o5(Context context, y2 y2Var) {
        super(context);
        this.f48746c = new org.telegram.ui.Components.d6(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f48744a = y2Var;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        imageReceiver.ignoreNotifications = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.onAttachedToWindow();
        this.e.onAttachedToWindow();
        this.f48750s = true;
        org.telegram.ui.Components.p5 p5Var = this.f48747f;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
        this.e.onDetachedFromWindow();
        this.f48750s = false;
        org.telegram.ui.Components.p5 p5Var = this.f48747f;
        if (p5Var != null) {
            p5Var.o(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: zh.o5.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(yg.p0 p0Var) {
        boolean z10;
        String str;
        String str2;
        if (p0Var != null && ((str2 = p0Var.f47101f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f48748n = z10;
        if (p0Var != null && (str = p0Var.f47101f) != null && str.equals("❤")) {
            this.f48745b = true;
        } else {
            this.f48745b = false;
        }
        org.telegram.ui.Components.p5 p5Var = this.f48747f;
        if (p5Var != null) {
            p5Var.o(this);
        }
        this.f48747f = null;
        if (p0Var != null) {
            if (p0Var.f47102g != 0) {
                org.telegram.ui.Components.p5 p5Var2 = new org.telegram.ui.Components.p5(3, UserConfig.selectedAccount, p0Var.f47102g);
                this.f48747f = p5Var2;
                if (this.f48750s) {
                    p5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(p0Var.f47101f);
                if (tL_availableReaction != null) {
                    this.d.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.j6.f17872a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
