package xh;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.rd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wr;
public final class t3 extends FrameLayout {
    public final int f46056a = 0;
    public Object f46057b;
    public Object f46058c;

    public t3(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f46057b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f46058c).setText(charSequence);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f46056a) {
            case 2:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    yg.c0 c0Var = (yg.c0) this.f46058c;
                    if (!c0Var.f46957k) {
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
        switch (this.f46056a) {
            case 2:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f46056a) {
            case 2:
                yg.c0 c0Var = (yg.c0) this.f46058c;
                float f7 = c0Var.f46967u;
                float f10 = rect.bottom;
                if (f7 != f10 && c0Var.v) {
                    c0Var.f46967u = f10;
                    t3 t3Var = c0Var.f46952c;
                    yg.b0 b0Var = c0Var.f46950a;
                    if (!c0Var.f46963q) {
                        float f11 = c0Var.f46966t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = c0Var.f46970y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (b0Var.getMeasuredHeight() + f11 > (t3Var.getMeasuredHeight() - c0Var.f46967u) - f12) {
                            f11 = ((t3Var.getMeasuredHeight() - c0Var.f46967u) - b0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        b0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new yg.x(c0Var, 1)).setInterpolator(wr.f28819f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f46056a) {
            case 1:
                super.onAttachedToWindow();
                ((yg.o) this.f46057b).c();
                return;
            case 2:
                super.onAttachedToWindow();
                pc.a(this, (rd) this.f46057b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f46056a) {
            case 1:
                super.onDetachedFromWindow();
                ((yg.o) this.f46057b).d();
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

    public t3(yg.c0 c0Var, Context context) {
        super(context);
        this.f46058c = c0Var;
        this.f46057b = new rd(this, 8);
    }

    public t3(yg.s sVar, Context context) {
        super(context);
        this.f46058c = sVar;
        this.f46057b = new yg.o(this, this);
    }

    private final void a(boolean z10) {
    }
}
