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
import org.telegram.ui.Components.q5;
public final class f0 {
    public final ImageReceiver f53375a;
    public q5 f53376b;
    public o0 f53378e;
    public View f53379f;
    public boolean f53380g;
    public boolean f53381i;
    public int f53382j;
    public PorterDuffColorFilter f53383k;
    public final Rect f53377c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public f0(View view) {
        this.f53379f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f53375a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f53376b;
        Rect rect = this.f53377c;
        if (q5Var != null) {
            l4 l4Var = q5Var.f29908k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f53376b.setColorFilter(this.f53383k);
            this.f53376b.setBounds(rect);
            this.f53376b.setAlpha((int) (this.h * 255.0f));
            this.f53376b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f53375a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f53380g = z10;
        ImageReceiver imageReceiver = this.f53375a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            q5 q5Var = this.f53376b;
            if (q5Var != null) {
                q5Var.a(this.f53379f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        q5 q5Var2 = this.f53376b;
        if (q5Var2 != null) {
            q5Var2.o(this.f53379f);
        }
    }

    public final void c(Rect rect) {
        this.f53377c.set(rect);
    }

    public final void d(int i10) {
        if (this.f53382j != i10) {
            this.f53382j = i10;
            this.f53383k = new PorterDuffColorFilter(this.f53382j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f53379f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f53378e, o0Var)) {
            ImageReceiver imageReceiver = this.f53375a;
            imageReceiver.clearImage();
            q5 q5Var = this.f53376b;
            if (q5Var != null) {
                q5Var.o(this.f53379f);
                this.f53376b = null;
            }
            this.f53378e = o0Var;
            boolean z10 = this.f53381i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (o0Var.f53479f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(o0Var.f53479f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, i6.f20983m6, 0.2f), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            q5 q5Var2 = new q5(i10, UserConfig.selectedAccount, o0Var.f53480g);
            this.f53376b = q5Var2;
            if (this.f53380g) {
                q5Var2.a(this.f53379f);
            }
            q5 q5Var3 = this.f53376b;
            this.f53382j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f53383k = porterDuffColorFilter;
            q5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
