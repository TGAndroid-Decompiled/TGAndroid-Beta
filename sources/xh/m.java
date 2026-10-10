package xh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.tc;
import w7.x5;
public final class m extends FrameLayout {
    public final int f51390a = 1;
    public Object f51391b;
    public Object f51392c;

    public m(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f51392c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f51391b).setText(charSequence);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f51390a) {
            case 3:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    zg.a0 a0Var = (zg.a0) this.f51391b;
                    if (!a0Var.f54501k) {
                        return true;
                    }
                    a0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f51390a) {
            case 3:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f51390a) {
            case 3:
                zg.a0 a0Var = (zg.a0) this.f51391b;
                float f7 = a0Var.f54511u;
                float f10 = rect.bottom;
                if (f7 != f10 && a0Var.v) {
                    a0Var.f54511u = f10;
                    m mVar = a0Var.f54495c;
                    zg.z zVar = a0Var.f54493a;
                    if (!a0Var.f54507q) {
                        float f11 = a0Var.f54510t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = a0Var.f54514y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (zVar.getMeasuredHeight() + f11 > (mVar.getMeasuredHeight() - a0Var.f54511u) - f12) {
                            f11 = ((mVar.getMeasuredHeight() - a0Var.f54511u) - zVar.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        zVar.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.v(a0Var, 1)).setInterpolator(is.f27443f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f51390a) {
            case 2:
                super.onAttachedToWindow();
                ((zg.n) this.f51392c).c();
                return;
            case 3:
                super.onAttachedToWindow();
                tc.a(this, (ai.x4) this.f51392c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f51390a) {
            case 2:
                super.onDetachedFromWindow();
                ((zg.n) this.f51392c).d();
                return;
            case 3:
                super.onDetachedFromWindow();
                tc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    public m(zg.a0 a0Var, Context context) {
        super(context);
        this.f51391b = a0Var;
        this.f51392c = new ai.x4(this, 11);
    }

    public m(zg.q qVar, Context context) {
        super(context);
        this.f51391b = qVar;
        this.f51392c = new zg.n(this, this);
    }

    public m(Context context, e6 e6Var) {
        super(context);
        LinearLayout e7 = bi.e(context, 1);
        r6 r6Var = new r6(context, false, false, false);
        this.f51392c = r6Var;
        int i10 = i6.G6;
        r6Var.setTextColor(i6.w0(i10, e6Var));
        r6Var.setTextSize(AndroidUtilities.dp(17.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        e7.addView(r6Var, x5.q(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f51391b = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(i6.w0(i10, e6Var));
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        e7.addView(textView, x5.q(-2, -2, 1));
        addView(e7, x5.e(-2, -2, 17));
    }

    private final void a(boolean z10) {
    }
}
