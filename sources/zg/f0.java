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
    public final ImageReceiver f49299a;
    public q5 f49300b;
    public o0 e;
    public View f49302f;
    public boolean f49303g;
    public boolean f49304i;
    public int f49305j;
    public PorterDuffColorFilter f49306k;
    public final Rect f49301c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public f0(View view) {
        this.f49302f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f49299a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f49300b;
        Rect rect = this.f49301c;
        if (q5Var != null) {
            l4 l4Var = q5Var.f27505k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f49300b.setColorFilter(this.f49306k);
            this.f49300b.setBounds(rect);
            this.f49300b.setAlpha((int) (this.h * 255.0f));
            this.f49300b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f49299a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f49303g = z10;
        ImageReceiver imageReceiver = this.f49299a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            q5 q5Var = this.f49300b;
            if (q5Var != null) {
                q5Var.a(this.f49302f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        q5 q5Var2 = this.f49300b;
        if (q5Var2 != null) {
            q5Var2.o(this.f49302f);
        }
    }

    public final void c(Rect rect) {
        this.f49301c.set(rect);
    }

    public final void d(int i10) {
        if (this.f49305j != i10) {
            this.f49305j = i10;
            this.f49306k = new PorterDuffColorFilter(this.f49305j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f49302f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, o0Var)) {
            ImageReceiver imageReceiver = this.f49299a;
            imageReceiver.clearImage();
            q5 q5Var = this.f49300b;
            if (q5Var != null) {
                q5Var.o(this.f49302f);
                this.f49300b = null;
            }
            this.e = o0Var;
            boolean z10 = this.f49304i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (o0Var.f49397f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(o0Var.f49397f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, h6.f19224m6, 0.2f), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            q5 q5Var2 = new q5(i10, UserConfig.selectedAccount, o0Var.f49398g);
            this.f49300b = q5Var2;
            if (this.f49303g) {
                q5Var2.a(this.f49302f);
            }
            q5 q5Var3 = this.f49300b;
            this.f49305j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f49306k = porterDuffColorFilter;
            q5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
