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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.o5;
public final class g0 {
    public final ImageReceiver f49022a;
    public o5 f49023b;
    public p0 e;
    public View f49025f;
    public boolean f49026g;
    public boolean f49027i;
    public int f49028j;
    public PorterDuffColorFilter f49029k;
    public final Rect f49024c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public g0(View view) {
        this.f49025f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f49022a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        o5 o5Var = this.f49023b;
        Rect rect = this.f49024c;
        if (o5Var != null) {
            l4 l4Var = o5Var.f26689k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f49023b.setColorFilter(this.f49029k);
            this.f49023b.setBounds(rect);
            this.f49023b.setAlpha((int) (this.h * 255.0f));
            this.f49023b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f49022a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f49026g = z10;
        ImageReceiver imageReceiver = this.f49022a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            o5 o5Var = this.f49023b;
            if (o5Var != null) {
                o5Var.a(this.f49025f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        o5 o5Var2 = this.f49023b;
        if (o5Var2 != null) {
            o5Var2.o(this.f49025f);
        }
    }

    public final void c(Rect rect) {
        this.f49024c.set(rect);
    }

    public final void d(int i10) {
        if (this.f49028j != i10) {
            this.f49028j = i10;
            this.f49029k = new PorterDuffColorFilter(this.f49028j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f49025f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, p0Var)) {
            ImageReceiver imageReceiver = this.f49022a;
            imageReceiver.clearImage();
            o5 o5Var = this.f49023b;
            if (o5Var != null) {
                o5Var.o(this.f49025f);
                this.f49023b = null;
            }
            this.e = p0Var;
            boolean z10 = this.f49027i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (p0Var.f49120f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(p0Var.f49120f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, i6.f18998m6, 0.2f), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            o5 o5Var2 = new o5(i10, UserConfig.selectedAccount, p0Var.f49121g);
            this.f49023b = o5Var2;
            if (this.f49026g) {
                o5Var2.a(this.f49025f);
            }
            o5 o5Var3 = this.f49023b;
            this.f49028j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f49029k = porterDuffColorFilter;
            o5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
