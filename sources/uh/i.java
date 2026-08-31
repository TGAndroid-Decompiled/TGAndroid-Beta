package uh;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.yh;
public final class i extends LinearLayout implements b6 {
    public final g6 f48823a;
    public final tb0 f48824b;
    public final FrameLayout f48825c;
    public final ImageView d;
    public final TextView f48826e;
    public final TextView f48827f;
    public final boolean h;
    public boolean f48828n;

    public i(Context context, g6 g6Var, boolean z4) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f48823a = g6Var;
        this.h = z4;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48825c = frameLayout;
        tb0 tb0Var = new tb0(1);
        this.f48824b = tb0Var;
        frameLayout.setBackground(tb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, c6.e(24, 24, 17));
        LinearLayout f10 = y3.f(context, 1);
        TextView textView = new TextView(context);
        this.f48826e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i14 = yh.i(f10, textView, c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f48827f = i14;
        i14.setGravity(17);
        i14.setMinWidth(AndroidUtilities.dp(20.66f));
        i14.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        i14.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i14, c6.j(13.33f, 0.0f));
            if (z4) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            addView(f10, c6.p(0, -2, 1.0f, 23, 20, 0, i12, 0));
            if (z4) {
                i13 = 9;
            } else {
                i13 = 14;
            }
            addView(frameLayout, c6.t(28, 28, 21, 0, 0, i13, 0));
        } else {
            if (z4) {
                i10 = 9;
            } else {
                i10 = 14;
            }
            addView(frameLayout, c6.t(28, 28, 19, i10, 0, 0, 0));
            if (z4) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(f10, c6.p(0, -2, 1.0f, 23, i11, 0, 20, 0));
            addView(i14, c6.j(0.0f, 13.33f));
        }
        e();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        int i13;
        float f10;
        if (i12 != 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        this.f48825c.setVisibility(i13);
        if (i12 == 0) {
            f10 = AndroidUtilities.dp(2.0f);
        } else {
            f10 = 0.0f;
        }
        this.f48826e.setTranslationX(f10);
        this.f48824b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z4);
    }

    @Override
    public final void e() {
        int i10;
        ShapeDrawable shapeDrawable;
        boolean q10;
        int i11 = k6.G6;
        g6 g6Var = this.f48823a;
        this.f48826e.setTextColor(k6.v0(i11, g6Var));
        if (this.f48828n) {
            i10 = k6.W8;
        } else {
            i10 = k6.f21839n6;
        }
        int v02 = k6.v0(i10, g6Var);
        TextView textView = this.f48827f;
        textView.setTextColor(v02);
        if (this.f48828n) {
            shapeDrawable = k6.b0(AndroidUtilities.dp(10.33f), k6.v0(k6.U8, g6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = k6.I.q();
        }
        this.f48824b.f31313b = q10;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.h) {
            f10 = 44.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10), 1073741824));
    }

    public void setTitle(CharSequence charSequence) {
        this.f48826e.setText(charSequence);
    }

    public void setUnreadMode(boolean z4) {
        float f10;
        Typeface typeface;
        int i10;
        if (this.f48828n != z4) {
            this.f48828n = z4;
            if (z4) {
                f10 = 13.0f;
            } else {
                f10 = 16.0f;
            }
            TextView textView = this.f48827f;
            textView.setTextSize(1, f10);
            ShapeDrawable shapeDrawable = null;
            if (z4) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z4) {
                i10 = k6.W8;
            } else {
                i10 = k6.f21839n6;
            }
            g6 g6Var = this.f48823a;
            textView.setTextColor(k6.v0(i10, g6Var));
            if (z4) {
                shapeDrawable = k6.b0(AndroidUtilities.dp(10.33f), k6.v0(k6.U8, g6Var));
            }
            textView.setBackground(shapeDrawable);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i10;
        if (!TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        TextView textView = this.f48827f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
