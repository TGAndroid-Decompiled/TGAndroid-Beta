package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.gr;
public final class v7 extends FrameLayout {
    public final org.telegram.ui.ActionBar.p6 f47590a;
    public final Drawable f47591b;
    public final Drawable f47592c;
    public final TextView d;
    public final org.telegram.ui.Components.f6 e;
    public SpannableString f47593f;
    public boolean h;
    public int f47594n;
    public final org.telegram.ui.Components.t5 f47595r;

    public v7(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        this.f47595r = new org.telegram.ui.Components.t5(this, 0L, 500L, gr.h);
        this.f47590a = p6Var;
        Drawable f7 = i0.a.f(context, 2131232750);
        this.f47591b = f7;
        org.telegram.ui.ActionBar.a7.y(this, f7, org.telegram.ui.ActionBar.t6.f21001h5, p6Var, PorterDuff.Mode.SRC_IN);
        this.f47592c = i0.a.f(context, 2131232749);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.d = textView;
        z20.n(textView, 1, 15.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        addView(textView, w7.b6.i(-2.0f, -2.0f, 8388627, 48.0f, 0.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.e = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.f21330z6, p6Var);
        if (cd.X) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        f6Var.setGravity(i10);
        addView(f6Var, w7.b6.i(-2.0f, 21.0f, 8388629, 0.0f, 0.0f, 19.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float L;
        float f10;
        Paint paint;
        int i10;
        super.onDraw(canvas);
        float e = this.f47595r.e(false, this.f47594n);
        if (cd.X) {
            f7 = -1.0f;
        } else {
            f7 = 1.0f;
        }
        float L2 = org.telegram.messenger.i0.L(24.0f);
        float L3 = org.telegram.messenger.i0.L(24.0f);
        float L4 = org.telegram.messenger.i0.L(2.5f);
        if (cd.X) {
            L = (getWidth() - org.telegram.messenger.i0.L(19.0f)) - L2;
        } else {
            L = org.telegram.messenger.i0.L(19.0f);
        }
        int ceil = ((int) Math.ceil(e)) - 1;
        while (true) {
            f10 = 0.0f;
            if (ceil < 0) {
                break;
            }
            float i11 = Utilities.i(e - ceil, 1.0f, 0.0f);
            float f11 = (((ceil - 1) - (1.0f - i11)) * L4 * f7) + L;
            float measuredHeight = (getMeasuredHeight() - L3) / 2.0f;
            int i12 = (int) f11;
            int i13 = (int) measuredHeight;
            int i14 = (int) (f11 + L2);
            int i15 = (int) (measuredHeight + L3);
            Drawable drawable = this.f47591b;
            drawable.setBounds(i12, i13, i14, i15);
            int i16 = (int) (i11 * 255.0f);
            drawable.setAlpha(i16);
            drawable.draw(canvas);
            Drawable drawable2 = this.f47592c;
            drawable2.setBounds(i12, i13, i14, i15);
            drawable2.setAlpha(i16);
            drawable2.draw(canvas);
            ceil--;
        }
        if (this.h) {
            org.telegram.ui.ActionBar.p6 p6Var = this.f47590a;
            if (p6Var != null) {
                paint = p6Var.d("paintDivider");
            } else {
                paint = null;
            }
            if (paint == null) {
                paint = org.telegram.ui.ActionBar.t6.f21052k0;
            }
            Paint paint2 = paint;
            if (!cd.X) {
                f10 = org.telegram.messenger.i0.L(22.0f);
            }
            float f12 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(22.0f);
            } else {
                i10 = 0;
            }
            canvas.drawRect(f12, measuredHeight2, measuredWidth - i10, getMeasuredHeight(), paint2);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }
}
