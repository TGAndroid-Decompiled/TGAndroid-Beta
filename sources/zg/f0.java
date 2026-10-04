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
    public final ImageReceiver f53381a;
    public q5 f53382b;
    public o0 f53384e;
    public View f53385f;
    public boolean f53386g;
    public boolean f53387i;
    public int f53388j;
    public PorterDuffColorFilter f53389k;
    public final Rect f53383c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public f0(View view) {
        this.f53385f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f53381a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f53382b;
        Rect rect = this.f53383c;
        if (q5Var != null) {
            l4 l4Var = q5Var.f29914k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f53382b.setColorFilter(this.f53389k);
            this.f53382b.setBounds(rect);
            this.f53382b.setAlpha((int) (this.h * 255.0f));
            this.f53382b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f53381a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f53386g = z10;
        ImageReceiver imageReceiver = this.f53381a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            q5 q5Var = this.f53382b;
            if (q5Var != null) {
                q5Var.a(this.f53385f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        q5 q5Var2 = this.f53382b;
        if (q5Var2 != null) {
            q5Var2.o(this.f53385f);
        }
    }

    public final void c(Rect rect) {
        this.f53383c.set(rect);
    }

    public final void d(int i10) {
        if (this.f53388j != i10) {
            this.f53388j = i10;
            this.f53389k = new PorterDuffColorFilter(this.f53388j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f53385f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(o0 o0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f53384e, o0Var)) {
            ImageReceiver imageReceiver = this.f53381a;
            imageReceiver.clearImage();
            q5 q5Var = this.f53382b;
            if (q5Var != null) {
                q5Var.o(this.f53385f);
                this.f53382b = null;
            }
            this.f53384e = o0Var;
            boolean z10 = this.f53387i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (o0Var.f53485f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(o0Var.f53485f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, i6.f20988m6, 0.2f), 0L, "tgs", o0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            q5 q5Var2 = new q5(i10, UserConfig.selectedAccount, o0Var.f53486g);
            this.f53382b = q5Var2;
            if (this.f53386g) {
                q5Var2.a(this.f53385f);
            }
            q5 q5Var3 = this.f53382b;
            this.f53388j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f53389k = porterDuffColorFilter;
            q5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
