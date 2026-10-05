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
public final class u3 extends FrameLayout {
    public final int f52079a = 0;
    public Object f52080b;
    public Object f52081c;

    public u3(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f52080b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f52081c).setText(charSequence);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f52079a) {
            case 2:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    zg.z zVar = (zg.z) this.f52081c;
                    if (!zVar.f53558k) {
                        return true;
                    }
                    zVar.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f52079a) {
            case 2:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f52079a) {
            case 2:
                zg.z zVar = (zg.z) this.f52081c;
                float f7 = zVar.f53568u;
                float f10 = rect.bottom;
                if (f7 != f10 && zVar.v) {
                    zVar.f53568u = f10;
                    u3 u3Var = zVar.f53552c;
                    zg.y yVar = zVar.f53550a;
                    if (!zVar.f53564q) {
                        float f11 = zVar.f53567t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = zVar.f53571y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (yVar.getMeasuredHeight() + f11 > (u3Var.getMeasuredHeight() - zVar.f53568u) - f12) {
                            f11 = ((u3Var.getMeasuredHeight() - zVar.f53568u) - yVar.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        yVar.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.t(zVar, 1)).setInterpolator(tr.f31215f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f52079a) {
            case 1:
                super.onAttachedToWindow();
                ((zg.k) this.f52080b).c();
                return;
            case 2:
                super.onAttachedToWindow();
                rc.a(this, (ai.w4) this.f52080b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f52079a) {
            case 1:
                super.onDetachedFromWindow();
                ((zg.k) this.f52080b).d();
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

    public u3(zg.z zVar, Context context) {
        super(context);
        this.f52081c = zVar;
        this.f52080b = new ai.w4(this, 11);
    }

    public u3(zg.o oVar, Context context) {
        super(context);
        this.f52081c = oVar;
        this.f52080b = new zg.k(this, this);
    }

    private final void a(boolean z10) {
    }
}
