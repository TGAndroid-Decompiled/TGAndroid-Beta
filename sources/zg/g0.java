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
import org.telegram.ui.Components.p5;
public final class g0 {
    public final ImageReceiver f49349a;
    public p5 f49350b;
    public p0 e;
    public View f49352f;
    public boolean f49353g;
    public boolean f49354i;
    public int f49355j;
    public PorterDuffColorFilter f49356k;
    public final Rect f49351c = new Rect();
    public final int d = UserConfig.selectedAccount;
    public float h = 1.0f;

    public g0(View view) {
        this.f49352f = view;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f49349a = imageReceiver;
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
    }

    public final void a(Canvas canvas) {
        p5 p5Var = this.f49350b;
        Rect rect = this.f49351c;
        if (p5Var != null) {
            l4 l4Var = p5Var.f27256k;
            if (l4Var != null) {
                l4Var.setRoundRadius((int) (rect.width() * 0.1f));
            }
            this.f49350b.setColorFilter(this.f49356k);
            this.f49350b.setBounds(rect);
            this.f49350b.setAlpha((int) (this.h * 255.0f));
            this.f49350b.draw(canvas);
            return;
        }
        ImageReceiver imageReceiver = this.f49349a;
        imageReceiver.setImageCoords(rect.left, rect.top, rect.width(), rect.height());
        imageReceiver.setAlpha(this.h);
        imageReceiver.draw(canvas);
    }

    public final void b(boolean z10) {
        this.f49353g = z10;
        ImageReceiver imageReceiver = this.f49349a;
        if (z10) {
            imageReceiver.onAttachedToWindow();
            p5 p5Var = this.f49350b;
            if (p5Var != null) {
                p5Var.a(this.f49352f);
                return;
            }
            return;
        }
        imageReceiver.onDetachedFromWindow();
        p5 p5Var2 = this.f49350b;
        if (p5Var2 != null) {
            p5Var2.o(this.f49352f);
        }
    }

    public final void c(Rect rect) {
        this.f49351c.set(rect);
    }

    public final void d(int i10) {
        if (this.f49355j != i10) {
            this.f49355j = i10;
            this.f49356k = new PorterDuffColorFilter(this.f49355j, PorterDuff.Mode.SRC_ATOP);
            View view = this.f49352f;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final void e(p0 p0Var) {
        String str;
        int i10;
        if (!Objects.equals(this.e, p0Var)) {
            ImageReceiver imageReceiver = this.f49349a;
            imageReceiver.clearImage();
            p5 p5Var = this.f49350b;
            if (p5Var != null) {
                p5Var.o(this.f49352f);
                this.f49350b = null;
            }
            this.e = p0Var;
            boolean z10 = this.f49354i;
            if (z10) {
                str = "60_60_firstframe";
            } else {
                str = "60_60";
            }
            String str2 = str;
            if (p0Var.f49447f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.d).getReactionsMap().get(p0Var.f49447f);
                if (tL_availableReaction != null) {
                    imageReceiver.setImage(ImageLocation.getForDocument(tL_availableReaction.select_animation), str2, null, null, DocumentObject.getSvgThumb(tL_availableReaction.select_animation, j6.f19274m6, 0.2f), 0L, "tgs", p0Var, 0);
                    return;
                }
                return;
            }
            if (z10) {
                i10 = 13;
            } else {
                i10 = 1;
            }
            p5 p5Var2 = new p5(i10, UserConfig.selectedAccount, p0Var.f49448g);
            this.f49350b = p5Var2;
            if (this.f49353g) {
                p5Var2.a(this.f49352f);
            }
            p5 p5Var3 = this.f49350b;
            this.f49355j = -16777216;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
            this.f49356k = porterDuffColorFilter;
            p5Var3.setColorFilter(porterDuffColorFilter);
        }
    }
}
