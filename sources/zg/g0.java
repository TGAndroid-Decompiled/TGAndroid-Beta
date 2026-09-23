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
public final class g0 {
    public final ImageReceiver f48973a;
    public q5 f48974b;
    public p0 e;
    public View f48976f;
    public boolean f48977g;
    public boolean f48978i;
    public int f48979j;
    public PorterDuffColorFilter f48980k;
    public final Rect f48975c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public g0(View view) {
        this.f48976f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f48973a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f48974b;
        Rect rect = this.f48975c;
        if (q5Var != null) {
            l4 l4Var = q5Var.f27230k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f48974b.setColorFilter(this.f48980k);
            this.f48974b.setBounds(rect);
            this.f48974b.setAlpha((int) (this.h * 255.0f));
            this.f48974b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f48973a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f48977g = z10;
        ImageReceiver imageReceiver = this.f48973a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            q5 q5Var = this.f48974b;
            if (q5Var != null) {
                q5Var.a(this.f48976f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        q5 q5Var2 = this.f48974b;
        if (q5Var2 != null) {
            q5Var2.o(this.f48976f);
        }
    }

    public final void c(Rect rect) {
        this.f48975c.set(rect);
    }

    public final void d(int i10) {
        if (this.f48979j != i10) {
            this.f48979j = i10;
            this.f48980k = new PorterDuffColorFilter(this.f48979j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f48976f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, p0Var)) {
            ImageReceiver imageReceiver = this.f48973a;
            imageReceiver.clearImage();
            q5 q5Var = this.f48974b;
            if (q5Var != null) {
                q5Var.o(this.f48976f);
                this.f48974b = null;
            }
            this.e = p0Var;
            boolean z10 = this.f48978i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (p0Var.f49071f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(p0Var.f49071f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, h6.f18953m6, 0.2f), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            q5 q5Var2 = new q5(i10, UserConfig.selectedAccount, p0Var.f49072g);
            this.f48974b = q5Var2;
            if (this.f48977g) {
                q5Var2.a(this.f48976f);
            }
            q5 q5Var3 = this.f48974b;
            this.f48979j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f48980k = porterDuffColorFilter;
            q5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
