package zh;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.m5;
import org.telegram.messenger.z20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.va0;
import w7.b6;
public final class j extends LinearLayout implements k6 {
    public final p6 f55789a;
    public final va0 f55790b;
    public final FrameLayout f55791c;
    public final ImageView d;
    public final TextView e;
    public final TextView f55792f;
    public final boolean h;
    public boolean f55793n;

    public j(Context context, p6 p6Var, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        this.f55789a = p6Var;
        this.h = z10;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f55791c = frameLayout;
        va0 va0Var = new va0(1);
        this.f55790b = va0Var;
        frameLayout.setBackground(va0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, b6.e(24, 24, 17));
        LinearLayout f7 = m5.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView f10 = z20.f(f7, textView, b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f55792f = f10;
        f10.setGravity(17);
        f10.setMinWidth(i0.L(20.66f));
        f10.setPadding(i0.L(6.33f), 0, i0.L(6.33f), 0);
        f10.setTextSize(1, 16.0f);
        if (cd.X) {
            addView(f10, b6.j(13.33f, 0.0f));
            if (z10) {
                i12 = 12;
            } else {
                i12 = 16;
            }
            addView(f7, b6.q(0, -2, 1.0f, 23, 20, 0, i12, 0));
            if (z10) {
                i13 = 9;
            } else {
                i13 = 14;
            }
            addView(frameLayout, b6.t(28, 28, 21, 0, 0, i13, 0));
        } else {
            if (z10) {
                i10 = 9;
            } else {
                i10 = 14;
            }
            addView(frameLayout, b6.t(28, 28, 19, i10, 0, 0, 0));
            if (z10) {
                i11 = 12;
            } else {
                i11 = 16;
            }
            addView(f7, b6.q(0, -2, 1.0f, 23, i11, 0, 20, 0));
            addView(f10, b6.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i10, int i11, int i12, CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int i13;
        float f7;
        if (i12 != 0) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        this.f55791c.setVisibility(i13);
        if (i12 == 0) {
            f7 = i0.L(2.0f);
        } else {
            f7 = 0.0f;
        }
        this.e.setTranslationX(f7);
        this.f55790b.b(i10, i11);
        this.d.setImageResource(i12);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.G6));
        hashSet.add(Integer.valueOf(t6.U8));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.h) {
            f7 = 44.0f;
        } else {
            f7 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i0.L(f7), 1073741824));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z10) {
        float f7;
        Typeface typeface;
        int i10;
        if (this.f55793n != z10) {
            this.f55793n = z10;
            if (z10) {
                f7 = 13.0f;
            } else {
                f7 = 16.0f;
            }
            TextView textView = this.f55792f;
            textView.setTextSize(1, f7);
            ShapeDrawable shapeDrawable = null;
            if (z10) {
                typeface = i0.o();
            } else {
                typeface = null;
            }
            textView.setTypeface(typeface);
            if (z10) {
                i10 = t6.W8;
            } else {
                i10 = t6.f21115n6;
            }
            p6 p6Var = this.f55789a;
            a7.V(textView, i10, p6Var);
            if (z10) {
                shapeDrawable = t6.d0(i0.L(10.33f), t6.w0(t6.U8, p6Var));
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
        TextView textView = this.f55792f;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int i10;
        ShapeDrawable shapeDrawable;
        boolean q6;
        int i11 = t6.G6;
        p6 p6Var = this.f55789a;
        this.e.setTextColor(t6.w0(i11, p6Var));
        if (this.f55793n) {
            i10 = t6.W8;
        } else {
            i10 = t6.f21115n6;
        }
        int w02 = t6.w0(i10, p6Var);
        TextView textView = this.f55792f;
        textView.setTextColor(w02);
        if (this.f55793n) {
            shapeDrawable = t6.d0(i0.L(10.33f), t6.w0(t6.U8, p6Var));
        } else {
            shapeDrawable = null;
        }
        textView.setBackground(shapeDrawable);
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = t6.I.q();
        }
        this.f55790b.f31204b = q6;
    }
}
