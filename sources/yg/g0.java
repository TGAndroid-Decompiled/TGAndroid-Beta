package yg;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import gg.h1;
import j$.util.Objects;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p5;
public final class g0 {
    public final ImageReceiver f47003a;
    public p5 f47004b;
    public p0 e;
    public View f47006f;
    public boolean f47007g;
    public boolean f47008i;
    public int f47009j;
    public PorterDuffColorFilter f47010k;
    public final Rect f47005c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public g0(View view) {
        this.f47006f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f47003a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f47004b;
        Rect rect = this.f47005c;
        if (p5Var != null) {
            h1 h1Var = p5Var.f26033k;
            if (h1Var != null) {
                h1Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f47004b.setColorFilter(this.f47010k);
            this.f47004b.setBounds(rect);
            this.f47004b.setAlpha((int) (this.h * 255.0f));
            this.f47004b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f47003a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f47007g = z10;
        ImageReceiver imageReceiver = this.f47003a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            p5 p5Var = this.f47004b;
            if (p5Var != null) {
                p5Var.a(this.f47006f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        p5 p5Var2 = this.f47004b;
        if (p5Var2 != null) {
            p5Var2.o(this.f47006f);
        }
    }

    public final void c(Rect rect) {
        this.f47005c.set(rect);
    }

    public final void d(int i10) {
        if (this.f47009j != i10) {
            this.f47009j = i10;
            this.f47010k = new PorterDuffColorFilter(this.f47009j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f47006f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, p0Var)) {
            ImageReceiver imageReceiver = this.f47003a;
            imageReceiver.clearImage();
            p5 p5Var = this.f47004b;
            if (p5Var != null) {
                p5Var.o(this.f47006f);
                this.f47004b = null;
            }
            this.e = p0Var;
            boolean z10 = this.f47008i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (p0Var.f47101f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(p0Var.f47101f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.f18091m6, 0.2f), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            p5 p5Var2 = new p5(i10, UserConfig.selectedAccount, p0Var.f47102g);
            this.f47004b = p5Var2;
            if (this.f47007g) {
                p5Var2.a(this.f47006f);
            }
            p5 p5Var3 = this.f47004b;
            this.f47009j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f47010k = porterDuffColorFilter;
            p5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
