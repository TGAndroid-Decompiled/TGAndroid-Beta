package yh;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
public final class w3 extends FrameLayout {
    public final int f47934a = 0;
    public Object f47935b;
    public Object f47936c;

    public w3(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f47935b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f47936c).setText(charSequence);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f47934a) {
            case 2:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    zg.c0 c0Var = (zg.c0) this.f47936c;
                    if (!c0Var.f48990k) {
                        return true;
                    }
                    c0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f47934a) {
            case 2:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f47934a) {
            case 2:
                zg.c0 c0Var = (zg.c0) this.f47936c;
                float f7 = c0Var.f49000u;
                float f10 = rect.bottom;
                if (f7 != f10 && c0Var.v) {
                    c0Var.f49000u = f10;
                    w3 w3Var = c0Var.f48985c;
                    zg.b0 b0Var = c0Var.f48983a;
                    if (!c0Var.f48996q) {
                        float f11 = c0Var.f48999t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = c0Var.f49003y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (b0Var.getMeasuredHeight() + f11 > (w3Var.getMeasuredHeight() - c0Var.f49000u) - f12) {
                            f11 = ((w3Var.getMeasuredHeight() - c0Var.f49000u) - b0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        b0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.w(c0Var, 1)).setInterpolator(qr.f27423f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f47934a) {
            case 1:
                super.onAttachedToWindow();
                ((zg.n) this.f47935b).c();
                return;
            case 2:
                super.onAttachedToWindow();
                oc.a(this, (ai.w4) this.f47935b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f47934a) {
            case 1:
                super.onDetachedFromWindow();
                ((zg.n) this.f47935b).d();
                return;
            case 2:
                super.onDetachedFromWindow();
                oc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    public w3(zg.c0 c0Var, Context context) {
        super(context);
        this.f47936c = c0Var;
        this.f47935b = new ai.w4(this, 11);
    }

    public w3(zg.q qVar, Context context) {
        super(context);
        this.f47936c = qVar;
        this.f47935b = new zg.n(this, this);
    }

    private final void a(boolean z10) {
    }
}
