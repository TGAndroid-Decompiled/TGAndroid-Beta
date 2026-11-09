package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgress2;
public final class t4 extends FrameLayout {
    public final int f50065a = 0;
    public int f50066b;
    public boolean f50067c;
    public Object d;
    public final Object f50068e;
    public Object f50069f;
    public Object h;

    public t4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f50066b = org.telegram.messenger.g0.L(64.0f);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.setAspectFit(true);
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
        addView(l9Var, c8.ha.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.f50068e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    public void a(int i7) {
        TextView textView = (TextView) this.d;
        this.f50066b = i7;
        ((sg.m) this.f50068e).f55152c = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    textView.setText(org.telegram.messenger.id.M0(2131747667, null).toUpperCase());
                }
            } else {
                textView.setText(org.telegram.messenger.id.M0(2131747666, null).toUpperCase());
            }
        } else {
            textView.setText(org.telegram.messenger.id.M0(2131747664, null).toUpperCase());
        }
        b();
    }

    public void b() {
        sg.q qVar = (sg.q) this.h;
        this.f50067c = true;
        sg.m mVar = (sg.m) this.f50068e;
        mVar.d = i0.a.o(mVar.f55153e.f55195m1, 255);
        mVar.a();
        mVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f50069f;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i7 = this.f50066b;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(qVar.f55195m1)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(qVar.f55195m1)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(qVar.f55195m1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.f50067c = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.q80 q80Var;
        int i7 = this.f50065a;
        float f10 = 1.0f;
        Object obj = this.f50068e;
        switch (i7) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f50067c) {
                    Drawable t6 = ((org.telegram.ui.Components.l9) this.d).getImageReceiver().t();
                    if ((t6 instanceof org.telegram.ui.Components.v5) && ((org.telegram.ui.Components.v5) t6).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f31483c) {
                                q80Var = radialProgress2.f31488j;
                            } else {
                                q80Var = radialProgress2.f31487i;
                            }
                            if (q80Var.f37258w < 1.0f) {
                                radialProgress2.p(true, 1.0f);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f50069f = ofFloat;
                            ofFloat.addListener(new m.a(this, 16));
                            ((ValueAnimator) this.f50069f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final t4 f49754b;

                                {
                                    this.f49754b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f49754b.invalidate();
                                            return;
                                        default:
                                            this.f49754b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f50069f).setDuration(250L);
                            ((ValueAnimator) this.f50069f).start();
                        } else {
                            this.f50067c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final t4 f49754b;

                            {
                                this.f49754b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f49754b.invalidate();
                                        return;
                                    default:
                                        this.f49754b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f50069f;
                    if (valueAnimator2 != null) {
                        radialProgress2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                        return;
                    }
                    ValueAnimator valueAnimator3 = (ValueAnimator) this.h;
                    if (valueAnimator3 != null) {
                        radialProgress2.E = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                        radialProgress2.draw(canvas);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Paint paint = (Paint) obj;
                w71 w71Var = (w71) this.h;
                x61 x61Var = w71Var.f50902a;
                if (this.f50067c) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.l6.t(this, w71Var.f50968y0, x61Var);
                    Paint d = x61Var.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f50069f);
                    m71 m71Var = w71Var.f50968y0;
                    if (m71Var != null && (m71Var.getBackground() instanceof org.telegram.ui.Components.ra0) && w71Var.f50940m1 < 0.0f) {
                        f10 = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f10));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (w71Var.N1) {
                        float f11 = w71Var.f50944o1;
                        if (f11 > 0.0f) {
                            canvas.drawColor(i0.a.o(-16777216, (int) (f11 * 255.0f * w71Var.f50946p1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f50066b != getHeight()) {
                        int height = getHeight();
                        this.f50066b = height;
                        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                        this.d = linearGradient;
                        paint.setShader(linearGradient);
                    }
                    canvas.drawRect(rectF, paint);
                    canvas.restore();
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f50065a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i13 = this.f50066b;
                ((RadialProgress2) this.f50068e).r(width - i13, height - i13, width + i13, height + i13);
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f50065a) {
            case 1:
                super.onMeasure(i7, i10);
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getMeasuredWidth() > org.telegram.messenger.g0.L(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    }
                }
                return;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    public t4(sg.q qVar, Context context) {
        super(context);
        this.h = qVar;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        View mVar = new sg.m(qVar, context);
        this.f50068e = mVar;
        addView(mVar, c8.ha.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f50069f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(org.telegram.messenger.id.M0(2131751354, null), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(org.telegram.messenger.g0.o());
        editTextBoldCursor.addTextChangedListener(new fi.h7(this));
        editTextBoldCursor.setOnFocusChangeListener(new bi.n(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.l2(4));
        addView(editTextBoldCursor, c8.ha.e(72, 36, 85));
    }

    public t4(w71 w71Var, Context context, boolean z9) {
        super(context);
        this.h = w71Var;
        this.f50067c = z9;
        Paint paint = new Paint(3);
        this.f50068e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.4f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.65f);
        this.f50069f = new ColorMatrixColorFilter(colorMatrix);
    }
}
