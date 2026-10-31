package sg;

import ag.c2;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;
public final class f0 {
    public final ImageReceiver f48327a;
    public f5 f48328b;
    public o0 e;
    public View f48330f;
    public boolean f48331g;
    public boolean f48332i;
    public int f48333j;
    public PorterDuffColorFilter f48334k;
    public final Rect f48329c = new Rect();
    public final int d = d20.f15147s0;
    public float h = 1.0f;

    public f0(View view) {
        this.f48330f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f48327a = imageReceiver;
        imageReceiver.f14424z1 = true;
    }

    public final void a(Canvas canvas) {
        f5 f5Var = this.f48328b;
        Rect rect = this.f48329c;
        if (f5Var != null) {
            c2 c2Var = f5Var.f25975k;
            if (c2Var != null) {
                c2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f48328b.setColorFilter(this.f48334k);
            this.f48328b.setBounds(rect);
            this.f48328b.setAlpha((int) (this.h * 255.0f));
            this.f48328b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f48327a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f48331g = z10;
        ImageReceiver imageReceiver = this.f48327a;
        if (z10) {
            imageReceiver.P();
            f5 f5Var = this.f48328b;
            if (f5Var != null) {
                f5Var.a(this.f48330f);
                return;
            }
            return;
        }
        imageReceiver.R();
        f5 f5Var2 = this.f48328b;
        if (f5Var2 != null) {
            f5Var2.n(this.f48330f);
        }
    }

    public final void c(Rect rect) {
        this.f48329c.set(rect);
    }

    public final void d(int i10) {
        if (this.f48333j != i10) {
            this.f48333j = i10;
            this.f48334k = new PorterDuffColorFilter(this.f48333j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f48330f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, o0Var)) {
            ImageReceiver imageReceiver = this.f48327a;
            imageReceiver.f();
            f5 f5Var = this.f48328b;
            if (f5Var != null) {
                f5Var.n(this.f48330f);
                this.f48328b = null;
            }
            this.e = o0Var;
            boolean z10 = this.f48332i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (o0Var.f48434f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ui.b0(this.d).f18341r.get(o0Var.f48434f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(ic.b(tL_availableReaction.select_animation), str, null, null, v5.f(tL_availableReaction.select_animation, t6.f21095m6, 0.2f, null), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            f5 f5Var2 = new f5(i10, d20.f15147s0, o0Var.f48435g);
            this.f48328b = f5Var2;
            if (this.f48331g) {
                f5Var2.a(this.f48330f);
            }
            f5 f5Var3 = this.f48328b;
            this.f48333j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f48334k = porterDuffColorFilter;
            f5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
