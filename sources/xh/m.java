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
import org.telegram.messenger.am;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.sc;
import w7.w5;
public final class m extends FrameLayout {
    public final int f51576a = 1;
    public Object f51577b;
    public Object f51578c;

    public m(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f51578c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f51577b).setText(charSequence);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f51576a) {
            case 3:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    zg.a0 a0Var = (zg.a0) this.f51577b;
                    if (!a0Var.f54681k) {
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
        switch (this.f51576a) {
            case 3:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f51576a) {
            case 3:
                zg.a0 a0Var = (zg.a0) this.f51577b;
                float f7 = a0Var.f54691u;
                float f10 = rect.bottom;
                if (f7 != f10 && a0Var.v) {
                    a0Var.f54691u = f10;
                    m mVar = a0Var.f54675c;
                    zg.z zVar = a0Var.f54673a;
                    if (!a0Var.f54687q) {
                        float f11 = a0Var.f54690t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = a0Var.f54694y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (zVar.getMeasuredHeight() + f11 > (mVar.getMeasuredHeight() - a0Var.f54691u) - f12) {
                            f11 = ((mVar.getMeasuredHeight() - a0Var.f54691u) - zVar.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        zVar.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.v(a0Var, 1)).setInterpolator(js.f27627f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f51576a) {
            case 2:
                super.onAttachedToWindow();
                ((zg.n) this.f51578c).c();
                return;
            case 3:
                super.onAttachedToWindow();
                sc.a(this, (ai.x4) this.f51578c);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f51576a) {
            case 2:
                super.onDetachedFromWindow();
                ((zg.n) this.f51578c).d();
                return;
            case 3:
                super.onDetachedFromWindow();
                sc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    public m(zg.a0 a0Var, Context context) {
        super(context);
        this.f51577b = a0Var;
        this.f51578c = new ai.x4(this, 11);
    }

    public m(zg.q qVar, Context context) {
        super(context);
        this.f51577b = qVar;
        this.f51578c = new zg.n(this, this);
    }

    public m(Context context, c6 c6Var) {
        super(context);
        LinearLayout e7 = am.e(context, 1);
        r6 r6Var = new r6(context, false, false, false);
        this.f51578c = r6Var;
        int i10 = h6.G6;
        r6Var.setTextColor(h6.w0(i10, c6Var));
        r6Var.setTextSize(AndroidUtilities.dp(17.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        e7.addView(r6Var, w5.q(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f51577b = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(h6.w0(i10, c6Var));
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        e7.addView(textView, w5.q(-2, -2, 1));
        addView(e7, w5.e(-2, -2, 17));
    }

    private final void a(boolean z10) {
    }
}
