package yh;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tr;
public final class t3 extends FrameLayout {
    public final int f52010a = 0;
    public Object f52011b;
    public Object f52012c;

    public t3(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f52011b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f52012c).setText(charSequence);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f52010a) {
            case 2:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    zg.b0 b0Var = (zg.b0) this.f52012c;
                    if (!b0Var.f53330k) {
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
        switch (this.f52010a) {
            case 2:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f52010a) {
            case 2:
                zg.b0 b0Var = (zg.b0) this.f52012c;
                float f7 = b0Var.f53340u;
                float f10 = rect.bottom;
                if (f7 != f10 && b0Var.v) {
                    b0Var.f53340u = f10;
                    t3 t3Var = b0Var.f53324c;
                    zg.a0 a0Var = b0Var.f53322a;
                    if (!b0Var.f53336q) {
                        float f11 = b0Var.f53339t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = b0Var.f53343y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (a0Var.getMeasuredHeight() + f11 > (t3Var.getMeasuredHeight() - b0Var.f53340u) - f12) {
                            f11 = ((t3Var.getMeasuredHeight() - b0Var.f53340u) - a0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        a0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.v(b0Var, 1)).setInterpolator(tr.f31147f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f52010a) {
            case 1:
                super.onAttachedToWindow();
                ((zg.n) this.f52011b).c();
                return;
            case 2:
                super.onAttachedToWindow();
                rc.a(this, (ai.w4) this.f52011b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f52010a) {
            case 1:
                super.onDetachedFromWindow();
                ((zg.n) this.f52011b).d();
                return;
            case 2:
                super.onDetachedFromWindow();
                rc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    public t3(zg.b0 b0Var, Context context) {
        super(context);
        this.f52012c = b0Var;
        this.f52011b = new ai.w4(this, 11);
    }

    public t3(zg.q qVar, Context context) {
        super(context);
        this.f52012c = qVar;
        this.f52011b = new zg.n(this, this);
    }

    private final void a(boolean z10) {
    }
}
