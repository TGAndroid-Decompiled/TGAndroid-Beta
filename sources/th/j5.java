package th;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.e20;
import org.telegram.messenger.jc;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
public final class j5 extends View {
    public final x2 f49119a;
    public boolean f49120b;
    public final org.telegram.ui.Components.t5 f49121c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public org.telegram.ui.Components.f5 f49122f;
    public boolean h;
    public boolean f49123n;
    public boolean f49124r;
    public boolean f49125s;

    public j5(Context context, x2 x2Var) {
        super(context);
        this.f49121c = new org.telegram.ui.Components.t5(this);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        this.e = new ImageReceiver(this);
        this.h = true;
        this.f49119a = x2Var;
        imageReceiver.f14425z1 = true;
        imageReceiver.f14421y = true;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.P();
        this.e.P();
        this.f49125s = true;
        org.telegram.ui.Components.f5 f5Var = this.f49122f;
        if (f5Var != null) {
            f5Var.a(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d.R();
        this.e.R();
        this.f49125s = false;
        org.telegram.ui.Components.f5 f5Var = this.f49122f;
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
        if (o0Var != null && ((str2 = o0Var.f48445f) == null || !str2.equals("❤"))) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f49123n = z10;
        if (o0Var != null && (str = o0Var.f48445f) != null && str.equals("❤")) {
            this.f49120b = true;
        } else {
            this.f49120b = false;
        }
        org.telegram.ui.Components.f5 f5Var = this.f49122f;
        if (f5Var != null) {
            f5Var.n(this);
        }
        this.f49122f = null;
        if (o0Var != null) {
            if (o0Var.f48446g != 0) {
                org.telegram.ui.Components.f5 f5Var2 = new org.telegram.ui.Components.f5(3, e20.f15506s0, o0Var.f48446g);
                this.f49122f = f5Var2;
                if (this.f49125s) {
                    f5Var2.a(this);
                }
            } else {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) vi.b0(e20.f15506s0).f18670r.get(o0Var.f48445f);
                if (tL_availableReaction != null) {
                    this.d.q0(jc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", org.telegram.messenger.v5.f(tL_availableReaction.static_icon, org.telegram.ui.ActionBar.t6.f20873a7, 1.0f, null), "webp", tL_availableReaction, 1);
                }
            }
        }
        invalidate();
    }
}
