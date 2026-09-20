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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p5;
public final class f0 {
    public final ImageReceiver f49325a;
    public p5 f49326b;
    public o0 e;
    public View f49328f;
    public boolean f49329g;
    public boolean f49330i;
    public int f49331j;
    public PorterDuffColorFilter f49332k;
    public final Rect f49327c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public f0(View view) {
        this.f49328f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f49325a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f49326b;
        Rect rect = this.f49327c;
        if (p5Var != null) {
            l4 l4Var = p5Var.f27162k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f49326b.setColorFilter(this.f49332k);
            this.f49326b.setBounds(rect);
            this.f49326b.setAlpha((int) (this.h * 255.0f));
            this.f49326b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f49325a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f49329g = z10;
        ImageReceiver imageReceiver = this.f49325a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            p5 p5Var = this.f49326b;
            if (p5Var != null) {
                p5Var.a(this.f49328f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        p5 p5Var2 = this.f49326b;
        if (p5Var2 != null) {
            p5Var2.o(this.f49328f);
        }
    }

    public final void c(Rect rect) {
        this.f49327c.set(rect);
    }

    public final void d(int i10) {
        if (this.f49331j != i10) {
            this.f49331j = i10;
            this.f49332k = new PorterDuffColorFilter(this.f49331j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f49328f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, o0Var)) {
            ImageReceiver imageReceiver = this.f49325a;
            imageReceiver.clearImage();
            p5 p5Var = this.f49326b;
            if (p5Var != null) {
                p5Var.o(this.f49328f);
                this.f49326b = null;
            }
            this.e = o0Var;
            boolean z10 = this.f49330i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (o0Var.f49423f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(o0Var.f49423f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.f19259m6, 0.2f), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            p5 p5Var2 = new p5(i10, UserConfig.selectedAccount, o0Var.f49424g);
            this.f49326b = p5Var2;
            if (this.f49329g) {
                p5Var2.a(this.f49328f);
            }
            p5 p5Var3 = this.f49326b;
            this.f49331j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f49332k = porterDuffColorFilter;
            p5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
