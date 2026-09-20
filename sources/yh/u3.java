package yh;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qr;
public final class u3 extends FrameLayout {
    public final int f48105a = 0;
    public Object f48106b;
    public Object f48107c;

    public u3(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f48106b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f48107c).setText(charSequence);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f48105a) {
            case 2:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    zg.b0 b0Var = (zg.b0) this.f48107c;
                    if (!b0Var.f49279k) {
                        return true;
                    }
                    b0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f48105a) {
            case 2:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f48105a) {
            case 2:
                zg.b0 b0Var = (zg.b0) this.f48107c;
                float f7 = b0Var.f49289u;
                float f10 = rect.bottom;
                if (f7 != f10 && b0Var.v) {
                    b0Var.f49289u = f10;
                    u3 u3Var = b0Var.f49274c;
                    zg.a0 a0Var = b0Var.f49272a;
                    if (!b0Var.f49285q) {
                        float f11 = b0Var.f49288t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = b0Var.f49292y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (a0Var.getMeasuredHeight() + f11 > (u3Var.getMeasuredHeight() - b0Var.f49289u) - f12) {
                            f11 = ((u3Var.getMeasuredHeight() - b0Var.f49289u) - a0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        a0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.v(b0Var, 1)).setInterpolator(qr.f27642f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f48105a) {
            case 1:
                super.onAttachedToWindow();
                ((zg.n) this.f48106b).c();
                return;
            case 2:
                super.onAttachedToWindow();
                pc.a(this, (ai.w4) this.f48106b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f48105a) {
            case 1:
                super.onDetachedFromWindow();
                ((zg.n) this.f48106b).d();
                return;
            case 2:
                super.onDetachedFromWindow();
                pc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    public u3(zg.b0 b0Var, Context context) {
        super(context);
        this.f48107c = b0Var;
        this.f48106b = new ai.w4(this, 11);
    }

    public u3(zg.q qVar, Context context) {
        super(context);
        this.f48107c = qVar;
        this.f48106b = new zg.n(this, this);
    }

    private final void a(boolean z10) {
    }
}
