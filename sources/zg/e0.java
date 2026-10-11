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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.s5;
public final class e0 {
    public final ImageReceiver f54596a;
    public s5 f54597b;
    public n0 f54599e;
    public View f54600f;
    public boolean f54601g;
    public boolean f54602i;
    public int f54603j;
    public PorterDuffColorFilter f54604k;
    public final Rect f54598c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public e0(View view) {
        this.f54600f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f54596a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        s5 s5Var = this.f54597b;
        Rect rect = this.f54598c;
        if (s5Var != null) {
            m4 m4Var = s5Var.f30634k;
            if (m4Var != null) {
                m4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f54597b.setColorFilter(this.f54604k);
            this.f54597b.setBounds(rect);
            this.f54597b.setAlpha((int) (this.h * 255.0f));
            this.f54597b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f54596a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f54601g = z10;
        ImageReceiver imageReceiver = this.f54596a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            s5 s5Var = this.f54597b;
            if (s5Var != null) {
                s5Var.a(this.f54600f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        s5 s5Var2 = this.f54597b;
        if (s5Var2 != null) {
            s5Var2.o(this.f54600f);
        }
    }

    public final void c(Rect rect) {
        this.f54598c.set(rect);
    }

    public final void d(int i10) {
        if (this.f54603j != i10) {
            this.f54603j = i10;
            this.f54604k = new PorterDuffColorFilter(this.f54603j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f54600f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(n0 n0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.f54599e, n0Var)) {
            ImageReceiver imageReceiver = this.f54596a;
            imageReceiver.clearImage();
            s5 s5Var = this.f54597b;
            if (s5Var != null) {
                s5Var.o(this.f54600f);
                this.f54597b = null;
            }
            this.f54599e = n0Var;
            boolean z10 = this.f54602i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (n0Var.f54704f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(n0Var.f54704f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, h6.f20951m6, 0.2f), 0L, "tgs", n0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            s5 s5Var2 = new s5(i10, UserConfig.selectedAccount, n0Var.f54705g);
            this.f54597b = s5Var2;
            if (this.f54601g) {
                s5Var2.a(this.f54600f);
            }
            s5 s5Var3 = this.f54597b;
            this.f54603j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f54604k = porterDuffColorFilter;
            s5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
