package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.am0;
public final class q3 extends FrameLayout {
    public final LinearLayout f48807a;
    public final Paint f48808b;
    public final TextView f48809c;
    public final TextView d;
    public final RectF e;
    public float f48810f;
    public float h;
    public final RectF f48811n;
    public float f48812r;
    public int f48813s;
    public final am0 v;
    public ValueAnimator f48814w;
    public final z3 f48815x;

    public q3(z3 z3Var, Context context) {
        super(context);
        this.f48815x = z3Var;
        Paint paint = new Paint(1);
        this.f48808b = paint;
        this.e = new RectF();
        this.f48811n = new RectF();
        this.f48812r = 1.0f;
        int i10 = org.telegram.ui.ActionBar.j6.f18017i6;
        b bVar = z3Var.f49143s;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, bVar));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(context);
        this.f48809c = textView;
        textView.setText(LocaleController.getString(R.string.AllViewers));
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, bVar));
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setText(LocaleController.getString(R.string.Contacts));
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, bVar));
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
        linearLayout.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        linearLayout.addView(textView, w7.a6.t(-2, -2, 0, 13, 0, 0, 0));
        linearLayout.addView(textView2, w7.a6.t(-2, -2, 0, 0, 0, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f48807a = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(26.0f), org.telegram.ui.ActionBar.j6.v0(i10, bVar)));
        linearLayout2.setOrientation(0);
        am0 am0Var = new am0(getContext());
        this.v = am0Var;
        am0Var.f21542r = true;
        am0Var.a(R.drawable.menu_views_reactions3, false);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(am0Var);
        imageView.setPadding(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f));
        linearLayout2.addView(imageView, w7.a6.n(26, 26));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.arrow_more);
        linearLayout2.addView(imageView2, w7.a6.n(16, 26));
        addView(linearLayout, w7.a6.c(-2.0f, -2));
        addView(linearLayout2, w7.a6.d(-2, -2.0f, 5, 13.0f, 6.0f, 13.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final q3 f48706b;

            {
                this.f48706b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z3 z3Var2 = this.f48706b.f48815x;
                        m3 m3Var = z3Var2.O;
                        if (m3Var.f48684b) {
                            m3Var.f48684b = false;
                            z3Var2.h(true);
                            z3.b(z3Var2);
                            return;
                        }
                        return;
                    case 1:
                        z3 z3Var3 = this.f48706b.f48815x;
                        m3 m3Var2 = z3Var3.O;
                        if (!m3Var2.f48684b) {
                            m3Var2.f48684b = true;
                            z3Var3.h(true);
                            z3.b(z3Var3);
                            return;
                        }
                        return;
                    default:
                        q3 q3Var = this.f48706b;
                        z3 z3Var4 = q3Var.f48815x;
                        p3 p3Var = new p3(q3Var, q3Var.getContext(), z3Var4.f49143s);
                        z3Var4.f49140f = p3Var;
                        LinearLayout linearLayout3 = q3Var.f48807a;
                        p3Var.f22473b = true;
                        p3Var.f22472a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final q3 f48706b;

            {
                this.f48706b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z3 z3Var2 = this.f48706b.f48815x;
                        m3 m3Var = z3Var2.O;
                        if (m3Var.f48684b) {
                            m3Var.f48684b = false;
                            z3Var2.h(true);
                            z3.b(z3Var2);
                            return;
                        }
                        return;
                    case 1:
                        z3 z3Var3 = this.f48706b.f48815x;
                        m3 m3Var2 = z3Var3.O;
                        if (!m3Var2.f48684b) {
                            m3Var2.f48684b = true;
                            z3Var3.h(true);
                            z3.b(z3Var3);
                            return;
                        }
                        return;
                    default:
                        q3 q3Var = this.f48706b;
                        z3 z3Var4 = q3Var.f48815x;
                        p3 p3Var = new p3(q3Var, q3Var.getContext(), z3Var4.f49143s);
                        z3Var4.f49140f = p3Var;
                        LinearLayout linearLayout3 = q3Var.f48807a;
                        p3Var.f22473b = true;
                        p3Var.f22472a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final q3 f48706b;

            {
                this.f48706b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        z3 z3Var2 = this.f48706b.f48815x;
                        m3 m3Var = z3Var2.O;
                        if (m3Var.f48684b) {
                            m3Var.f48684b = false;
                            z3Var2.h(true);
                            z3.b(z3Var2);
                            return;
                        }
                        return;
                    case 1:
                        z3 z3Var3 = this.f48706b.f48815x;
                        m3 m3Var2 = z3Var3.O;
                        if (!m3Var2.f48684b) {
                            m3Var2.f48684b = true;
                            z3Var3.h(true);
                            z3.b(z3Var3);
                            return;
                        }
                        return;
                    default:
                        q3 q3Var = this.f48706b;
                        z3 z3Var4 = q3Var.f48815x;
                        p3 p3Var = new p3(q3Var, q3Var.getContext(), z3Var4.f49143s);
                        z3Var4.f49140f = p3Var;
                        LinearLayout linearLayout3 = q3Var.f48807a;
                        p3Var.f22473b = true;
                        p3Var.f22472a.showAsDropDown(linearLayout3, 0, (-linearLayout3.getMeasuredHeight()) - AndroidUtilities.dp(8.0f));
                        return;
                }
            }
        });
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f48815x.T) {
            int i10 = this.f48813s;
            TextView textView = this.d;
            float f10 = 0.5f;
            TextView textView2 = this.f48809c;
            if (i10 == 0) {
                textView2.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 0.5f;
                f10 = 1.0f;
            } else {
                textView.getHitRect(AndroidUtilities.rectTmp2);
                f7 = 1.0f;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            RectF rectF = this.f48811n;
            rectF.set(rect);
            float f11 = this.f48812r;
            if (f11 != 1.0f) {
                f10 = AndroidUtilities.lerp(this.f48810f, f10, f11);
                f7 = AndroidUtilities.lerp(this.h, f7, this.f48812r);
                AndroidUtilities.lerp(this.e, rectF, this.f48812r, rectF);
            }
            textView2.setAlpha(f10);
            textView.setAlpha(f7);
            float height = rectF.height() / 2.0f;
            canvas.drawRoundRect(rectF, height, height, this.f48808b);
        }
        super.dispatchDraw(canvas);
    }
}
