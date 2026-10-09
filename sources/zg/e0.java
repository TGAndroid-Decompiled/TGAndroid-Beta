package zg;

import ai.m4;
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
import org.telegram.ui.Components.s5;
public final class e0 {
    public final ImageReceiver f54509a;
    public s5 f54510b;
    public n0 f54512e;
    public View f54513f;
    public boolean f54514g;
    public boolean f54515i;
    public int f54516j;
    public PorterDuffColorFilter f54517k;
    public final Rect f54511c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public e0(View view) {
        this.f54513f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f54509a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        s5 s5Var = this.f54510b;
        Rect rect = this.f54511c;
        if (s5Var != null) {
            m4 m4Var = s5Var.f30654k;
            if (m4Var != null) {
                m4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f54510b.setColorFilter(this.f54517k);
            this.f54510b.setBounds(rect);
            this.f54510b.setAlpha((int) (this.h * 255.0f));
            this.f54510b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f54509a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f54514g = z10;
        ImageReceiver imageReceiver = this.f54509a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            s5 s5Var = this.f54510b;
            if (s5Var != null) {
                s5Var.a(this.f54513f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        s5 s5Var2 = this.f54510b;
        if (s5Var2 != null) {
            s5Var2.o(this.f54513f);
        }
    }

    public final void c(Rect rect) {
        this.f54511c.set(rect);
    }

    public final void d(int i10) {
        if (this.f54516j != i10) {
            this.f54516j = i10;
            this.f54517k = new PorterDuffColorFilter(this.f54516j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f54513f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(n0 n0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f54512e, n0Var)) {
            ImageReceiver imageReceiver = this.f54509a;
            imageReceiver.clearImage();
            s5 s5Var = this.f54510b;
            if (s5Var != null) {
                s5Var.o(this.f54513f);
                this.f54510b = null;
            }
            this.f54512e = n0Var;
            boolean z10 = this.f54515i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (n0Var.f54617f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(n0Var.f54617f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, i6.f20962m6, 0.2f), 0L, "tgs", n0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            s5 s5Var2 = new s5(i10, UserConfig.selectedAccount, n0Var.f54618g);
            this.f54510b = s5Var2;
            if (this.f54514g) {
                s5Var2.a(this.f54513f);
            }
            s5 s5Var3 = this.f54510b;
            this.f54516j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f54517k = porterDuffColorFilter;
            s5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
