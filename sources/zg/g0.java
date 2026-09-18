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
import org.telegram.ui.Components.o5;
public final class g0 {
    public final ImageReceiver f49057a;
    public o5 f49058b;
    public p0 e;
    public View f49060f;
    public boolean f49061g;
    public boolean f49062i;
    public int f49063j;
    public PorterDuffColorFilter f49064k;
    public final Rect f49059c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public g0(View view) {
        this.f49060f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f49057a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f49058b;
        Rect rect = this.f49059c;
        if (o5Var != null) {
            l4 l4Var = o5Var.f26639k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f49058b.setColorFilter(this.f49064k);
            this.f49058b.setBounds(rect);
            this.f49058b.setAlpha((int) (this.h * 255.0f));
            this.f49058b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f49057a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f49061g = z10;
        ImageReceiver imageReceiver = this.f49057a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            o5 o5Var = this.f49058b;
            if (o5Var != null) {
                o5Var.a(this.f49060f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        o5 o5Var2 = this.f49058b;
        if (o5Var2 != null) {
            o5Var2.o(this.f49060f);
        }
    }

    public final void c(Rect rect) {
        this.f49059c.set(rect);
    }

    public final void d(int i10) {
        if (this.f49063j != i10) {
            this.f49063j = i10;
            this.f49064k = new PorterDuffColorFilter(this.f49063j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f49060f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, p0Var)) {
            ImageReceiver imageReceiver = this.f49057a;
            imageReceiver.clearImage();
            o5 o5Var = this.f49058b;
            if (o5Var != null) {
                o5Var.o(this.f49060f);
                this.f49058b = null;
            }
            this.e = p0Var;
            boolean z10 = this.f49062i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (p0Var.f49155f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(p0Var.f49155f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.f19028m6, 0.2f), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            o5 o5Var2 = new o5(i10, UserConfig.selectedAccount, p0Var.f49156g);
            this.f49058b = o5Var2;
            if (this.f49061g) {
                o5Var2.a(this.f49060f);
            }
            o5 o5Var3 = this.f49058b;
            this.f49063j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f49064k = porterDuffColorFilter;
            o5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
