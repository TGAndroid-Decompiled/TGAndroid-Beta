package rh;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.th;
public final class i extends LinearLayout implements x5 {
    public final c6 f47455a;
    public final mb0 f47456b;
    public final FrameLayout f47457c;
    public final ImageView d;
    public final TextView f47458e;
    public final TextView f47459f;
    public final boolean h;
    public boolean f47460n;

    public i(Context context, c6 c6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f47455a = c6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47457c = frameLayout;
        mb0 mb0Var = new mb0(1);
        this.f47456b = mb0Var;
        frameLayout.setBackground(mb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, f6.e(24, 24, 17));
        LinearLayout g10 = x3.g(context, 1);
        TextView textView = new TextView(context);
        this.f47458e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i14 = th.i(g10, textView, f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f47459f = i14;
        i14.setGravity(17);
        i14.setMinWidth(AndroidUtilities.dp(20.66f));
        i14.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        i14.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i14, f6.j(13.33f, 0.0f));
            if (z10) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            addView(g10, f6.p(0, -2, 1.0f, 23, 20, 0, i12, 0));
            if (z10) {
                i13 = 9;
            } else {
                i13 = 14;
            }
            addView(frameLayout, f6.t(28, 28, 21, 0, 0, i13, 0));
        } else {
            if (z10) {
                i10 = 9;
            } else {
                i10 = 14;
            }
            addView(frameLayout, f6.t(28, 28, 19, i10, 0, 0, 0));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(g10, f6.p(0, -2, 1.0f, 23, i11, 0, 20, 0));
            addView(i14, f6.j(0.0f, 13.33f));
        }
        e();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int i13;
        float f9;
        if (i12 != 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        this.f47457c.setVisibility(i13);
        if (i12 == 0) {
            f9 = AndroidUtilities.dp(2.0f);
        } else {
            f9 = 0.0f;
        }
        this.f47458e.setTranslationX(f9);
        this.f47456b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void e() {
        int i10;
        ShapeDrawable shapeDrawable;
        boolean q6;
        int i11 = g6.G6;
        c6 c6Var = this.f47455a;
        this.f47458e.setTextColor(g6.v0(i11, c6Var));
        if (this.f47460n) {
            i10 = g6.W8;
        } else {
            i10 = g6.f23241n6;
        }
        int v02 = g6.v0(i10, c6Var);
        TextView textView = this.f47459f;
        textView.setTextColor(v02);
        if (this.f47460n) {
            shapeDrawable = g6.b0(AndroidUtilities.dp(10.33f), g6.v0(g6.U8, c6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = g6.I.q();
        }
        this.f47456b.f30641b = q6;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.h) {
            f9 = 44.0f;
        } else {
            f9 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9), 1073741824));
    }

    public void setTitle(CharSequence charSequence) {
        this.f47458e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        float f9;
        Typeface typeface;
        int i10;
        if (this.f47460n != z10) {
            this.f47460n = z10;
            if (z10) {
                f9 = 13.0f;
            } else {
                f9 = 16.0f;
            }
            TextView textView = this.f47459f;
            textView.setTextSize(1, f9);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i10 = g6.W8;
            } else {
                i10 = g6.f23241n6;
            }
            c6 c6Var = this.f47455a;
            textView.setTextColor(g6.v0(i10, c6Var));
            if (z10) {
                shapeDrawable = g6.b0(AndroidUtilities.dp(10.33f), g6.v0(g6.U8, c6Var));
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
        TextView textView = this.f47459f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
