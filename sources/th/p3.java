package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.bl0;
public final class p3 extends FrameLayout {
    public final LinearLayout f49358a;
    public final Paint f49359b;
    public final TextView f49360c;
    public final TextView d;
    public final RectF e;
    public float f49361f;
    public float h;
    public final RectF f49362n;
    public float f49363r;
    public int f49364s;
    public final bl0 f49365w;
    public ValueAnimator f49366x;
    public final y3 f49367y;

    public p3(y3 y3Var, Context context) {
        super(context);
        this.f49367y = y3Var;
        Paint paint = new Paint(1);
        this.f49359b = paint;
        this.e = new RectF();
        this.f49362n = new RectF();
        this.f49363r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.t6.f21020i6;
        b bVar = y3Var.f49676s;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f49360c = textView;
        textView.setText(cd.L0(2131754286, null));
        int i11 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.V(textView, i11, bVar);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(cd.L0(2131751780, null));
        org.telegram.ui.ActionBar.a7.V(textView2, i11, bVar);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(4.0f));
        linearLayout.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f));
        linearLayout.addView(textView, w7.b6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.b6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f49358a = linearLayout2;
        linearLayout2.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(26.0f), org.telegram.ui.ActionBar.t6.w0(i10, bVar));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        linearLayout2.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(linearLayout2, d02, N, null, bVar);
        linearLayout2.setOrientation(0);
        bl0 bl0Var = new bl0(getContext());
        this.f49365w = bl0Var;
        bl0Var.f24831r = true;
        bl0Var.a(2131231917, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(bl0Var);
        imageView.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
        linearLayout2.addView(imageView, w7.b6.o(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(2131230871);
        linearLayout2.addView(imageView2, w7.b6.o(16, 26));
        addView(linearLayout, w7.b6.c(-2.0f, -2));
        addView(linearLayout2, w7.b6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final p3 f49239b;

            {
                this.f49239b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y3 y3Var2 = this.f49239b.f49367y;
                        l3 l3Var = y3Var2.O;
                        if (l3Var.f49168b) {
                            l3Var.f49168b = false;
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            return;
                        }
                        return;
                    case 1:
                        y3 y3Var3 = this.f49239b.f49367y;
                        l3 l3Var2 = y3Var3.O;
                        if (!l3Var2.f49168b) {
                            l3Var2.f49168b = true;
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            return;
                        }
                        return;
                    default:
                        p3 p3Var = this.f49239b;
                        y3 y3Var4 = p3Var.f49367y;
                        o3 o3Var = new o3(p3Var, p3Var.getContext(), y3Var4.f49676s);
                        y3Var4.f49673f = o3Var;
                        LinearLayout linearLayout3 = p3Var.f49358a;
                        o3Var.f10472a = true;
                        ((org.telegram.ui.ActionBar.k1) o3Var.f10473b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.i0.L(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final p3 f49239b;

            {
                this.f49239b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y3 y3Var2 = this.f49239b.f49367y;
                        l3 l3Var = y3Var2.O;
                        if (l3Var.f49168b) {
                            l3Var.f49168b = false;
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            return;
                        }
                        return;
                    case 1:
                        y3 y3Var3 = this.f49239b.f49367y;
                        l3 l3Var2 = y3Var3.O;
                        if (!l3Var2.f49168b) {
                            l3Var2.f49168b = true;
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            return;
                        }
                        return;
                    default:
                        p3 p3Var = this.f49239b;
                        y3 y3Var4 = p3Var.f49367y;
                        o3 o3Var = new o3(p3Var, p3Var.getContext(), y3Var4.f49676s);
                        y3Var4.f49673f = o3Var;
                        LinearLayout linearLayout3 = p3Var.f49358a;
                        o3Var.f10472a = true;
                        ((org.telegram.ui.ActionBar.k1) o3Var.f10473b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.i0.L(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final p3 f49239b;

            {
                this.f49239b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        y3 y3Var2 = this.f49239b.f49367y;
                        l3 l3Var = y3Var2.O;
                        if (l3Var.f49168b) {
                            l3Var.f49168b = false;
                            y3Var2.h(true);
                            y3.b(y3Var2);
                            return;
                        }
                        return;
                    case 1:
                        y3 y3Var3 = this.f49239b.f49367y;
                        l3 l3Var2 = y3Var3.O;
                        if (!l3Var2.f49168b) {
                            l3Var2.f49168b = true;
                            y3Var3.h(true);
                            y3.b(y3Var3);
                            return;
                        }
                        return;
                    default:
                        p3 p3Var = this.f49239b;
                        y3 y3Var4 = p3Var.f49367y;
                        o3 o3Var = new o3(p3Var, p3Var.getContext(), y3Var4.f49676s);
                        y3Var4.f49673f = o3Var;
                        LinearLayout linearLayout3 = p3Var.f49358a;
                        o3Var.f10472a = true;
                        ((org.telegram.ui.ActionBar.k1) o3Var.f10473b).showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - org.telegram.messenger.i0.L(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f49367y.T) {
            int i10 = this.f49364s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f49360c;
            if (i10 == 0) {
                textView2.getHitRect(org.telegram.messenger.i0.Q);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(org.telegram.messenger.i0.Q);
                f7 = 1.0f;
            }
            Rect rect = org.telegram.messenger.i0.Q;
            RectF rectF = this.f49362n;
            rectF.set(rect);
            float f11 = this.f49363r;
            if (f11 != 1.0f) {
                f10 = org.telegram.messenger.i0.T1(this.f49361f, f10, f11);
                f7 = org.telegram.messenger.i0.T1(this.h, f7, this.f49363r);
                org.telegram.messenger.i0.Z1(this.e, rectF, this.f49363r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f49359b);
        }
        super.dispatchDraw(canvas);
    }
}
