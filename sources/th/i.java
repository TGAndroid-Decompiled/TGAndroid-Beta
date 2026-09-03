package th;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.ai;
public final class i extends LinearLayout implements a6 {
    public final f6 f45020a;
    public final sb0 f45021b;
    public final FrameLayout f45022c;
    public final ImageView d;
    public final TextView e;
    public final TextView f45023f;
    public final boolean h;
    public boolean f45024n;

    public i(Context context, f6 f6Var, boolean z4) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f45020a = f6Var;
        this.h = z4;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45022c = frameLayout;
        sb0 sb0Var = new sb0(1);
        this.f45021b = sb0Var;
        frameLayout.setBackground(sb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, b6.e(24, 24, 17));
        LinearLayout f10 = y3.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView i14 = ai.i(f10, textView, b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f45023f = i14;
        i14.setGravity(17);
        i14.setMinWidth(AndroidUtilities.dp(20.66f));
        i14.setPadding(AndroidUtilities.dp(6.33f), 0, AndroidUtilities.dp(6.33f), 0);
        i14.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(i14, b6.j(13.33f, 0.0f));
            if (z4) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            addView(f10, b6.p(0, -2, 1.0f, 23, 20, 0, i12, 0));
            if (z4) {
                i13 = 9;
            } else {
                i13 = 14;
            }
            addView(frameLayout, b6.t(28, 28, 21, 0, 0, i13, 0));
        } else {
            if (z4) {
                i10 = 9;
            } else {
                i10 = 14;
            }
            addView(frameLayout, b6.t(28, 28, 19, i10, 0, 0, 0));
            if (z4) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(f10, b6.p(0, -2, 1.0f, 23, i11, 0, 20, 0));
            addView(i14, b6.j(0.0f, 13.33f));
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
        this.f45022c.setVisibility(i13);
        if (i12 == 0) {
            f10 = AndroidUtilities.dp(2.0f);
        } else {
            f10 = 0.0f;
        }
        this.e.setTranslationX(f10);
        this.f45021b.b(i10, i11);
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
        int i11 = j6.G6;
        f6 f6Var = this.f45020a;
        this.e.setTextColor(j6.v0(i11, f6Var));
        if (this.f45024n) {
            i10 = j6.W8;
        } else {
            i10 = j6.f20060n6;
        }
        int v02 = j6.v0(i10, f6Var);
        TextView textView = this.f45023f;
        textView.setTextColor(v02);
        if (this.f45024n) {
            shapeDrawable = j6.b0(AndroidUtilities.dp(10.33f), j6.v0(j6.U8, f6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (f6Var != null) {
            q10 = f6Var.a();
        } else {
            q10 = j6.I.q();
        }
        this.f45021b.f28719b = q10;
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
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z4) {
        float f10;
        Typeface typeface;
        int i10;
        if (this.f45024n != z4) {
            this.f45024n = z4;
            if (z4) {
                f10 = 13.0f;
            } else {
                f10 = 16.0f;
            }
            TextView textView = this.f45023f;
            textView.setTextSize(1, f10);
            ShapeDrawable shapeDrawable = null;
            if (z4) {
                typeface = AndroidUtilities.bold();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z4) {
                i10 = j6.W8;
            } else {
                i10 = j6.f20060n6;
            }
            f6 f6Var = this.f45020a;
            textView.setTextColor(j6.v0(i10, f6Var));
            if (z4) {
                shapeDrawable = j6.b0(AndroidUtilities.dp(10.33f), j6.v0(j6.U8, f6Var));
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
        TextView textView = this.f45023f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
