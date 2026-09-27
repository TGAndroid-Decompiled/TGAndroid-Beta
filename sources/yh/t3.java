package yh;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sr;
public final class t3 extends FrameLayout {
    public final int f48100a = 0;
    public Object f48101b;
    public Object f48102c;

    public t3(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f48101b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f48102c).setText(charSequence);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f48100a) {
            case 2:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    zg.c0 c0Var = (zg.c0) this.f48102c;
                    if (!c0Var.f49306k) {
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
        switch (this.f48100a) {
            case 2:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f48100a) {
            case 2:
                zg.c0 c0Var = (zg.c0) this.f48102c;
                float f7 = c0Var.f49316u;
                float f10 = rect.bottom;
                if (f7 != f10 && c0Var.v) {
                    c0Var.f49316u = f10;
                    t3 t3Var = c0Var.f49301c;
                    zg.b0 b0Var = c0Var.f49299a;
                    if (!c0Var.f49312q) {
                        float f11 = c0Var.f49315t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = c0Var.f49319y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (b0Var.getMeasuredHeight() + f11 > (t3Var.getMeasuredHeight() - c0Var.f49316u) - f12) {
                            f11 = ((t3Var.getMeasuredHeight() - c0Var.f49316u) - b0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        b0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.w(c0Var, 1)).setInterpolator(sr.f28359f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f48100a) {
            case 1:
                super.onAttachedToWindow();
                ((zg.o) this.f48101b).c();
                return;
            case 2:
                super.onAttachedToWindow();
                qc.a(this, (ai.w4) this.f48101b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f48100a) {
            case 1:
                super.onDetachedFromWindow();
                ((zg.o) this.f48101b).d();
                return;
            case 2:
                super.onDetachedFromWindow();
                qc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    public t3(zg.c0 c0Var, Context context) {
        super(context);
        this.f48102c = c0Var;
        this.f48101b = new ai.w4(this, 11);
    }

    public t3(zg.r rVar, Context context) {
        super(context);
        this.f48102c = rVar;
        this.f48101b = new zg.o(this, this);
    }

    private final void a(boolean z10) {
    }
}
