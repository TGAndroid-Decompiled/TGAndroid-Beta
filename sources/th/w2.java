package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.gr;
public final class w2 extends FrameLayout {
    public final ag.d2 f49574a;
    public final og.c f49575b;
    public final TextView[] f49576c;
    public gi0 d;
    public final y2 e;
    public Paint f49577f;
    public float h;
    public boolean f49578n;
    public boolean f49579r;
    public ValueAnimator f49580s;

    public w2(Context context, y2 y2Var) {
        super(context);
        this.f49576c = new TextView[2];
        this.e = y2Var;
        ag.d2 d2Var = new ag.d2(this, context, 11);
        this.f49574a = d2Var;
        d2Var.setRoundRadius(org.telegram.messenger.i0.L(16.0f));
        addView(d2Var, w7.b6.d(32, 32.0f, 0, 12.0f, 2.0f, 0.0f, 0.0f));
        setClipChildren(false);
        og.c cVar = new og.c(context, 5);
        this.f49575b = cVar;
        cVar.setTextSize(14);
        cVar.setTypeface(org.telegram.messenger.i0.o());
        cVar.setMaxLines(1);
        cVar.setEllipsizeByGradient(org.telegram.messenger.i0.L(4.0f));
        cVar.setPivotX(0.0f);
        at.i(cVar);
        addView(cVar, w7.b6.d(-2, -2.0f, 0, 54.0f, 0.0f, 86.0f, 0.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            this.f49576c[i10] = new TextView(context);
            this.f49576c[i10].setTextSize(1, 12.0f);
            this.f49576c[i10].setMaxLines(1);
            this.f49576c[i10].setSingleLine(true);
            this.f49576c[i10].setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f49576c[i10].setTextColor(-1);
            this.f49576c[i10].setPadding(org.telegram.messenger.i0.L(3.0f), 0, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(1.0f));
            addView(this.f49576c[i10], w7.b6.d(-2, -2.0f, 0, 51.0f, 18.0f, 83.0f, 0.0f));
        }
        this.f49575b.setTextColor(-1);
    }

    public final void b(float f7, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        float f10;
        boolean z12;
        float i10;
        d5 d5Var;
        y2 y2Var = this.e;
        if ((y2Var != null && y2Var.f49676b != null) || this.h != 0.0f) {
            if (y2Var != null && (d5Var = y2Var.f49676b) != null && !d5Var.I) {
                this.h = 1.0f;
                f10 = d5Var.h;
                if (!this.f49578n) {
                    this.f49578n = true;
                }
                z11 = false;
            } else {
                if (this.f49578n) {
                    this.f49578n = false;
                    if (this.d.f26444f < 0.2f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.f49579r = z12;
                }
                if (!this.f49579r) {
                    this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.i0.f16173r) / 300.0f), 1.0f, 0.0f);
                }
                z11 = true;
                f10 = 1.0f;
            }
            gi0 gi0Var = this.d;
            ag.d2 d2Var = this.f49574a;
            if (gi0Var == null) {
                gi0 gi0Var2 = new gi0(d2Var);
                this.d = gi0Var2;
                gi0Var2.d(null, true, false);
            }
            this.d.f26454q = 0;
            ImageReceiver imageReceiver = d2Var.getImageReceiver();
            float z13 = sc.e.z(1.0f, this.h, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(3.0f));
            this.d.f((int) (rectF.left - z13), (int) (rectF.top - z13), (int) (rectF.right + z13), (int) (rectF.bottom + z13));
            gi0 gi0Var3 = this.d;
            if (z11) {
                i10 = 1.0f;
            } else {
                i10 = Utilities.i(f10, 1.0f, 0.0f);
            }
            gi0Var3.e(true, i10);
            if (this.f49579r && z11 && this.d.f26444f >= 0.9f) {
                this.h = Utilities.i(this.h - ((1000.0f / org.telegram.messenger.i0.f16173r) / 300.0f), 1.0f, 0.0f);
            }
            if (z10) {
                if (f7 != 1.0f) {
                    Paint t10 = w5.t(imageReceiver, false);
                    t10.setAlpha((int) (this.h * 255.0f));
                    gi0 gi0Var4 = this.d;
                    gi0Var4.f26457t = t10;
                    gi0Var4.a(canvas);
                }
                if (this.f49577f == null) {
                    Paint paint = new Paint(1);
                    this.f49577f = paint;
                    paint.setColor(-1);
                    this.f49577f.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
                    this.f49577f.setStyle(Paint.Style.STROKE);
                    this.f49577f.setStrokeCap(Paint.Cap.ROUND);
                }
                this.f49577f.setAlpha((int) (255.0f * f7 * this.h));
                gi0 gi0Var5 = this.d;
                gi0Var5.f26457t = this.f49577f;
                gi0Var5.a(canvas);
            }
        }
    }

    public final void c(CharSequence charSequence, boolean z10) {
        ValueAnimator valueAnimator = this.f49580s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49580s = null;
        }
        TextView[] textViewArr = this.f49576c;
        if (z10) {
            textViewArr[1].setOnClickListener(null);
            textViewArr[1].setText(textViewArr[0].getText());
            textViewArr[1].setVisibility(0);
            textViewArr[1].setAlpha(1.0f);
            textViewArr[1].setTranslationY(0.0f);
            textViewArr[0].setText(charSequence);
            textViewArr[0].setVisibility(0);
            textViewArr[0].setAlpha(0.0f);
            textViewArr[0].setTranslationY(-org.telegram.messenger.i0.L(4.0f));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f49580s = ofFloat;
            ofFloat.addUpdateListener(new qh.e0(this, 17));
            this.f49580s.addListener(new sg.r(this, 7));
            this.f49580s.setInterpolator(gr.h);
            this.f49580s.setDuration(340L);
            this.f49580s.start();
            return;
        }
        textViewArr[0].setVisibility(0);
        textViewArr[0].setAlpha(1.0f);
        textViewArr[0].setText(charSequence);
        textViewArr[1].setVisibility(8);
        textViewArr[1].setAlpha(0.0f);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setOnSubtitleClick(View.OnClickListener onClickListener) {
        boolean z10;
        org.telegram.ui.Cells.y h02;
        TextView[] textViewArr = this.f49576c;
        textViewArr[0].setOnClickListener(onClickListener);
        TextView textView = textViewArr[0];
        if (onClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        textView.setClickable(z10);
        TextView textView2 = textViewArr[0];
        if (onClickListener == null) {
            h02 = null;
        } else {
            h02 = org.telegram.ui.ActionBar.t6.h0(822083583, 7, -1);
        }
        textView2.setBackground(h02);
    }

    public void setSubtitle(CharSequence charSequence) {
        c(charSequence, false);
    }
}
