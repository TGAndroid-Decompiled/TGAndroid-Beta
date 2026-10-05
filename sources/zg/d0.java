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
public final class d0 {
    public final ImageReceiver f53364a;
    public q5 f53365b;
    public m0 f53367e;
    public View f53368f;
    public boolean f53369g;
    public boolean f53370i;
    public int f53371j;
    public PorterDuffColorFilter f53372k;
    public final Rect f53366c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public d0(View view) {
        this.f53368f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f53364a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        q5 q5Var = this.f53365b;
        Rect rect = this.f53366c;
        if (q5Var != null) {
            l4 l4Var = q5Var.f29935k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f53365b.setColorFilter(this.f53372k);
            this.f53365b.setBounds(rect);
            this.f53365b.setAlpha((int) (this.h * 255.0f));
            this.f53365b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f53364a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f53369g = z10;
        ImageReceiver imageReceiver = this.f53364a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            q5 q5Var = this.f53365b;
            if (q5Var != null) {
                q5Var.a(this.f53368f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        q5 q5Var2 = this.f53365b;
        if (q5Var2 != null) {
            q5Var2.o(this.f53368f);
        }
    }

    public final void c(Rect rect) {
        this.f53366c.set(rect);
    }

    public final void d(int i10) {
        if (this.f53371j != i10) {
            this.f53371j = i10;
            this.f53372k = new PorterDuffColorFilter(this.f53371j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f53368f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(m0 m0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f53367e, m0Var)) {
            ImageReceiver imageReceiver = this.f53364a;
            imageReceiver.clearImage();
            q5 q5Var = this.f53365b;
            if (q5Var != null) {
                q5Var.o(this.f53368f);
                this.f53365b = null;
            }
            this.f53367e = m0Var;
            boolean z10 = this.f53370i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (m0Var.f53471f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(m0Var.f53471f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, i6.f20993m6, 0.2f), 0L, "tgs", m0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            q5 q5Var2 = new q5(i10, UserConfig.selectedAccount, m0Var.f53472g);
            this.f53365b = q5Var2;
            if (this.f53369g) {
                q5Var2.a(this.f53368f);
            }
            q5 q5Var3 = this.f53365b;
            this.f53371j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f53372k = porterDuffColorFilter;
            q5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
