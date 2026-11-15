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
    public final int f51347a = 0;
    public int f51348b;
    public boolean f51349c;
    public Object d;
    public final Object f51350e;
    public Object f51351f;
    public Object h;

    public t4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f51348b = org.telegram.messenger.g0.L(64.0f);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.d = i9Var;
        i9Var.setAspectFit(true);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
        addView(i9Var, c8.ja.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.f51350e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    public void a(int i7) {
        TextView textView = (TextView) this.d;
        this.f51348b = i7;
        ((sg.m) this.f51350e).f56708c = i7;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    textView.setText(org.telegram.messenger.hd.M0(2131747667, null).toUpperCase());
                }
            } else {
                textView.setText(org.telegram.messenger.hd.M0(2131747666, null).toUpperCase());
            }
        } else {
            textView.setText(org.telegram.messenger.hd.M0(2131747664, null).toUpperCase());
        }
        b();
    }

    public void b() {
        sg.q qVar = (sg.q) this.h;
        this.f51349c = true;
        sg.m mVar = (sg.m) this.f51350e;
        mVar.d = i0.a.o(mVar.f56709e.f56747q1, 255);
        mVar.a();
        mVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f51351f;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i7 = this.f51348b;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(qVar.f56747q1)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(qVar.f56747q1)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(qVar.f56747q1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.f51349c = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.s80 s80Var;
        int i7 = this.f51347a;
        float f10 = 1.0f;
        Object obj = this.f51350e;
        switch (i7) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f51349c) {
                    Drawable t6 = ((org.telegram.ui.Components.i9) this.d).getImageReceiver().t();
                    if ((t6 instanceof org.telegram.ui.Components.t5) && ((org.telegram.ui.Components.t5) t6).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f32657c) {
                                s80Var = radialProgress2.f32662j;
                            } else {
                                s80Var = radialProgress2.f32661i;
                            }
                            if (s80Var.f39235w < 1.0f) {
                                radialProgress2.p(true, 1.0f);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f51351f = ofFloat;
                            ofFloat.addListener(new ki.s3(this, 17));
                            ((ValueAnimator) this.f51351f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final t4 f51097b;

                                {
                                    this.f51097b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f51097b.invalidate();
                                            return;
                                        default:
                                            this.f51097b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f51351f).setDuration(250L);
                            ((ValueAnimator) this.f51351f).start();
                        } else {
                            this.f51349c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final t4 f51097b;

                            {
                                this.f51097b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f51097b.invalidate();
                                        return;
                                    default:
                                        this.f51097b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f51351f;
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
                t71 t71Var = (t71) this.h;
                s61 s61Var = t71Var.f51408a;
                if (this.f51349c) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.j6.t(this, t71Var.f51477z0, s61Var);
                    Paint d = s61Var.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f51351f);
                    j71 j71Var = t71Var.f51477z0;
                    if (j71Var != null && (j71Var.getBackground() instanceof org.telegram.ui.Components.ra0) && t71Var.n1 < 0.0f) {
                        f10 = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f10));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (t71Var.O1) {
                        float f11 = t71Var.f51453p1;
                        if (f11 > 0.0f) {
                            canvas.drawColor(i0.a.o(-16777216, (int) (f11 * 255.0f * t71Var.f51455q1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f51348b != getHeight()) {
                        int height = getHeight();
                        this.f51348b = height;
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
        switch (this.f51347a) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i13 = this.f51348b;
                ((RadialProgress2) this.f51350e).r(width - i13, height - i13, width + i13, height + i13);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f51347a) {
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
        addView(textView, c8.ja.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        View mVar = new sg.m(qVar, context);
        this.f51350e = mVar;
        addView(mVar, c8.ja.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f51351f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(org.telegram.messenger.hd.M0(2131751354, null), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(org.telegram.messenger.g0.o());
        editTextBoldCursor.addTextChangedListener(new bi.v(this));
        editTextBoldCursor.setOnFocusChangeListener(new ch.c0(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.j2(4));
        addView(editTextBoldCursor, c8.ja.e(72, 36, 85));
    }

    public t4(t71 t71Var, Context context, boolean z10) {
        super(context);
        this.h = t71Var;
        this.f51349c = z10;
        Paint paint = new Paint(3);
        this.f51350e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.4f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.65f);
        this.f51351f = new ColorMatrixColorFilter(colorMatrix);
    }
}
