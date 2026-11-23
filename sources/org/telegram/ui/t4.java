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
    public final int f52235a = 0;
    public int f52236b;
    public boolean f52237c;
    public Object d;
    public final Object f52238e;
    public Object f52239f;
    public Object h;

    public t4(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f52236b = org.telegram.messenger.g0.L(64.0f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.d = p9Var;
        p9Var.setAspectFit(true);
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
        addView(p9Var, c8.na.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, i6Var);
        this.f52238e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    public void a(int i7) {
        TextView textView = (TextView) this.d;
        this.f52236b = i7;
        ((sg.m) this.f52238e).f57403c = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    textView.setText(org.telegram.messenger.gd.N0(2131747473, null).toUpperCase());
                }
            } else {
                textView.setText(org.telegram.messenger.gd.N0(2131747472, null).toUpperCase());
            }
        } else {
            textView.setText(org.telegram.messenger.gd.N0(2131747470, null).toUpperCase());
        }
        b();
    }

    public void b() {
        sg.q qVar = (sg.q) this.h;
        this.f52237c = true;
        sg.m mVar = (sg.m) this.f52238e;
        mVar.d = i0.a.o(mVar.f57404e.f57441q1, 255);
        mVar.a();
        mVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f52239f;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i7 = this.f52236b;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(qVar.f57441q1)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(qVar.f57441q1)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(qVar.f57441q1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.f52237c = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.c90 c90Var;
        int i7 = this.f52235a;
        float f10 = 1.0f;
        Object obj = this.f52238e;
        switch (i7) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f52237c) {
                    Drawable t6 = ((org.telegram.ui.Components.p9) this.d).getImageReceiver().t();
                    if ((t6 instanceof org.telegram.ui.Components.b6) && ((org.telegram.ui.Components.b6) t6).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f33154c) {
                                c90Var = radialProgress2.f33159j;
                            } else {
                                c90Var = radialProgress2.f33158i;
                            }
                            if (c90Var.f33991w < 1.0f) {
                                radialProgress2.p(true, 1.0f);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f52239f = ofFloat;
                            ofFloat.addListener(new ki.n3(this, 17));
                            ((ValueAnimator) this.f52239f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final t4 f51967b;

                                {
                                    this.f51967b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f51967b.invalidate();
                                            return;
                                        default:
                                            this.f51967b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f52239f).setDuration(250L);
                            ((ValueAnimator) this.f52239f).start();
                        } else {
                            this.f52237c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final t4 f51967b;

                            {
                                this.f51967b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f51967b.invalidate();
                                        return;
                                    default:
                                        this.f51967b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f52239f;
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
                v71 v71Var = (v71) this.h;
                u61 u61Var = v71Var.f52845a;
                if (this.f52237c) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.n6.t(this, v71Var.f52914z0, u61Var);
                    Paint e10 = u61Var.e("paintChatActionBackground");
                    ColorFilter colorFilter = e10.getColorFilter();
                    e10.setColorFilter((ColorMatrixColorFilter) this.f52239f);
                    l71 l71Var = v71Var.f52914z0;
                    if (l71Var != null && (l71Var.getBackground() instanceof org.telegram.ui.Components.za0) && v71Var.n1 < 0.0f) {
                        f10 = 0.33f;
                    }
                    int alpha = e10.getAlpha();
                    e10.setAlpha((int) (alpha * f10));
                    canvas.drawRect(rectF, e10);
                    e10.setAlpha(alpha);
                    e10.setColorFilter(colorFilter);
                    if (v71Var.O1) {
                        float f11 = v71Var.f52890p1;
                        if (f11 > 0.0f) {
                            canvas.drawColor(i0.a.o(-16777216, (int) (f11 * 255.0f * v71Var.f52892q1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f52236b != getHeight()) {
                        int height = getHeight();
                        this.f52236b = height;
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
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f52235a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i13 = this.f52236b;
                ((RadialProgress2) this.f52238e).r(width - i13, height - i13, width + i13, height + i13);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f52235a) {
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
        addView(textView, c8.na.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        View mVar = new sg.m(qVar, context);
        this.f52238e = mVar;
        addView(mVar, c8.na.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f52239f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(org.telegram.messenger.gd.N0(2131751342, null), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(org.telegram.messenger.g0.o());
        editTextBoldCursor.addTextChangedListener(new bi.v(this));
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 5));
        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.s2(4));
        addView(editTextBoldCursor, c8.na.e(72, 36, 85));
    }

    public t4(v71 v71Var, Context context, boolean z10) {
        super(context);
        this.h = v71Var;
        this.f52237c = z10;
        Paint paint = new Paint(3);
        this.f52238e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.4f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.65f);
        this.f52239f = new ColorMatrixColorFilter(colorMatrix);
    }
}
