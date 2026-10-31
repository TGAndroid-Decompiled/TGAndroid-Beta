package th;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
public final class j5 extends View {
    public final x2 f49105a;
    public boolean f49106b;
    public final org.telegram.ui.Components.t5 f49107c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.f5 f49108f;
    public boolean h;
    public boolean f49109n;
    public boolean f49110r;
    public boolean f49111s;

    public j5(Context context, x2 x2Var) {
        super(context);
        this.f49107c = new org.telegram.ui.Components.t5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f49105a = x2Var;
        imageReceiver.f14424z1 = true;
        imageReceiver.f14420y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.e.P();
        this.f49111s = true;
        org.telegram.ui.Components.f5 f5Var = this.f49108f;
        if (f5Var != null) {
            f5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.e.R();
        this.f49111s = false;
        org.telegram.ui.Components.f5 f5Var = this.f49108f;
        if (f5Var != null) {
            f5Var.n(this);
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: th.j5.onDraw(android.graphics.Canvas):void");
    }

    public void setAllowDrawReaction(boolean z10) {
        if (this.h == z10) {
            return;
        }
        this.h = z10;
        invalidate();
    }

    public void setReaction(sg.o0 o0Var) {
        boolean z10;
        String str;
        String str2;
        if (o0Var != null && ((str2 = o0Var.f48434f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f49109n = z10;
        if (o0Var != null && (str = o0Var.f48434f) != null && str.equals("❤")) {
            this.f49106b = true;
        } else {
            this.f49106b = false;
        }
        org.telegram.ui.Components.f5 f5Var = this.f49108f;
        if (f5Var != null) {
            f5Var.n(this);
        }
        this.f49108f = null;
        if (o0Var != null) {
            if (o0Var.f48435g != 0) {
                org.telegram.ui.Components.f5 f5Var2 = new org.telegram.ui.Components.f5(3, d20.f15147s0, o0Var.f48435g);
                this.f49108f = f5Var2;
                if (this.f49111s) {
                    f5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(d20.f15147s0).f18341r.get(o0Var.f48434f);
                if (tL_availableReaction != null) {
                    this.d.q0(ic.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.v5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.t6.f20872a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
