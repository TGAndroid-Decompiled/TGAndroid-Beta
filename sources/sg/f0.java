package sg;

import ag.c2;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.e20;
import org.telegram.messenger.jc;
import org.telegram.messenger.v5;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;
public final class f0 {
    public final ImageReceiver f48338a;
    public f5 f48339b;
    public o0 e;
    public View f48341f;
    public boolean f48342g;
    public boolean f48343i;
    public int f48344j;
    public PorterDuffColorFilter f48345k;
    public final Rect f48340c = new Rect();
    public final int d = e20.f15506s0;
    public float h = 1.0f;

    public f0(View view) {
        this.f48341f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f48338a = imageReceiver;
        imageReceiver.f14425z1 = true;
    }

    public final void a(Canvas canvas) {
        f5 f5Var = this.f48339b;
        Rect rect = this.f48340c;
        if (f5Var != null) {
            c2 c2Var = f5Var.f26070k;
            if (c2Var != null) {
                c2Var.J0((int) (rect.width() * 0.1f));
            }
            this.f48339b.setColorFilter(this.f48345k);
            this.f48339b.setBounds(rect);
            this.f48339b.setAlpha((int) (this.h * 255.0f));
            this.f48339b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f48338a;
        imageReceiver.y0(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.h(canvas, null);
    }

    public final void b(boolean z10) {
        this.f48342g = z10;
        ImageReceiver imageReceiver = this.f48338a;
        if (z10) {
            imageReceiver.P();
            f5 f5Var = this.f48339b;
            if (f5Var != null) {
                f5Var.a(this.f48341f);
                return;
            }
            return;
        }
        imageReceiver.R();
        f5 f5Var2 = this.f48339b;
        if (f5Var2 != null) {
            f5Var2.n(this.f48341f);
        }
    }

    public final void c(Rect rect) {
        this.f48340c.set(rect);
    }

    public final void d(int i10) {
        if (this.f48344j != i10) {
            this.f48344j = i10;
            this.f48345k = new PorterDuffColorFilter(this.f48344j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f48341f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, o0Var)) {
            ImageReceiver imageReceiver = this.f48338a;
            imageReceiver.f();
            f5 f5Var = this.f48339b;
            if (f5Var != null) {
                f5Var.n(this.f48341f);
                this.f48339b = null;
            }
            this.e = o0Var;
            boolean z10 = this.f48343i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            if (o0Var.f48445f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) vi.b0(this.d).f18670r.get(o0Var.f48445f);
                if (tL_availableReaction != null) {
                    imageReceiver.r0(jc.b(tL_availableReaction.select_animation), str, null, null, v5.f(tL_availableReaction.select_animation, t6.f21096m6, 0.2f, null), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            f5 f5Var2 = new f5(i10, e20.f15506s0, o0Var.f48446g);
            this.f48339b = f5Var2;
            if (this.f48342g) {
                f5Var2.a(this.f48341f);
            }
            f5 f5Var3 = this.f48339b;
            this.f48344j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f48345k = porterDuffColorFilter;
            f5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
