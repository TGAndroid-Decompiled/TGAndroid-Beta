package zg;

import ai.l4;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.q5;
public final class f0 {
    public final ImageReceiver f49300a;
    public q5 f49301b;
    public o0 e;
    public View f49303f;
    public boolean f49304g;
    public boolean f49305i;
    public int f49306j;
    public PorterDuffColorFilter f49307k;
    public final Rect f49302c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public f0(View view) {
        this.f49303f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f49300a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f49301b;
        Rect rect = this.f49302c;
        if (q5Var != null) {
            l4 l4Var = q5Var.f27544k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f49301b.setColorFilter(this.f49307k);
            this.f49301b.setBounds(rect);
            this.f49301b.setAlpha((int) (this.h * 255.0f));
            this.f49301b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f49300a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f49304g = z10;
        ImageReceiver imageReceiver = this.f49300a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            q5 q5Var = this.f49301b;
            if (q5Var != null) {
                q5Var.a(this.f49303f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        q5 q5Var2 = this.f49301b;
        if (q5Var2 != null) {
            q5Var2.o(this.f49303f);
        }
    }

    public final void c(Rect rect) {
        this.f49302c.set(rect);
    }

    public final void d(int i10) {
        if (this.f49306j != i10) {
            this.f49306j = i10;
            this.f49307k = new PorterDuffColorFilter(this.f49306j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f49303f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, o0Var)) {
            ImageReceiver imageReceiver = this.f49300a;
            imageReceiver.clearImage();
            q5 q5Var = this.f49301b;
            if (q5Var != null) {
                q5Var.o(this.f49303f);
                this.f49301b = null;
            }
            this.e = o0Var;
            boolean z10 = this.f49305i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (o0Var.f49398f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(o0Var.f49398f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, h6.f19225m6, 0.2f), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            q5 q5Var2 = new q5(i10, UserConfig.selectedAccount, o0Var.f49399g);
            this.f49301b = q5Var2;
            if (this.f49304g) {
                q5Var2.a(this.f49303f);
            }
            q5 q5Var3 = this.f49301b;
            this.f49306j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f49307k = porterDuffColorFilter;
            q5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
