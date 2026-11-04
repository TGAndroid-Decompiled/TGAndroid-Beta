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
public final class v4 extends FrameLayout {
    public final int f50374a = 0;
    public int f50375b;
    public boolean f50376c;
    public Object d;
    public final Object f50377e;
    public Object f50378f;
    public Object h;

    public v4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f50375b = org.telegram.messenger.g0.L(64.0f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.d = k9Var;
        k9Var.setAspectFit(true);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(12.0f));
        addView(k9Var, b8.mf.c(-1.0f, -1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.f50377e = radialProgress2;
        radialProgress2.E = 0.0f;
        radialProgress2.setIcon(10, false, false);
        radialProgress2.setColors(1107296256, 1107296256, -1, -1);
    }

    public void a(int i3) {
        TextView textView = (TextView) this.d;
        this.f50375b = i3;
        ((tg.m) this.f50377e).f55250c = i3;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    textView.setText(org.telegram.messenger.bd.M0(2131747675, null).toUpperCase());
                }
            } else {
                textView.setText(org.telegram.messenger.bd.M0(2131747674, null).toUpperCase());
            }
        } else {
            textView.setText(org.telegram.messenger.bd.M0(2131747672, null).toUpperCase());
        }
        b();
    }

    public void b() {
        tg.q qVar = (tg.q) this.h;
        this.f50376c = true;
        tg.m mVar = (tg.m) this.f50377e;
        mVar.d = i0.a.o(mVar.f55251e.f55288n1, 255);
        mVar.a();
        mVar.invalidate();
        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.f50378f;
        int selectionStart = editTextBoldCursor.getSelectionStart();
        int selectionEnd = editTextBoldCursor.getSelectionEnd();
        int i3 = this.f50375b;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    editTextBoldCursor.setText(String.valueOf(Color.blue(qVar.f55288n1)));
                }
            } else {
                editTextBoldCursor.setText(String.valueOf(Color.green(qVar.f55288n1)));
            }
        } else {
            editTextBoldCursor.setText(String.valueOf(Color.red(qVar.f55288n1)));
        }
        editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        this.f50376c = false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.m80 m80Var;
        int i3 = this.f50374a;
        float f10 = 1.0f;
        Object obj = this.f50377e;
        switch (i3) {
            case 0:
                RadialProgress2 radialProgress2 = (RadialProgress2) obj;
                super.dispatchDraw(canvas);
                if (this.f50376c) {
                    Drawable t10 = ((org.telegram.ui.Components.k9) this.d).getImageReceiver().t();
                    if ((t10 instanceof org.telegram.ui.Components.t5) && ((org.telegram.ui.Components.t5) t10).d[4] > 0) {
                        ValueAnimator valueAnimator = (ValueAnimator) this.h;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            if (radialProgress2.f31550c) {
                                m80Var = radialProgress2.f31555j;
                            } else {
                                m80Var = radialProgress2.f31554i;
                            }
                            if (m80Var.f36088w < 1.0f) {
                                radialProgress2.p(true, 1.0f);
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) ((ValueAnimator) this.h).getAnimatedValue()).floatValue(), 0.0f);
                            this.f50378f = ofFloat;
                            ofFloat.addListener(new ii.v3(this, 17));
                            ((ValueAnimator) this.f50378f).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                                public final v4 f49972b;

                                {
                                    this.f49972b = this;
                                }

                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    switch (r2) {
                                        case 0:
                                            this.f49972b.invalidate();
                                            return;
                                        default:
                                            this.f49972b.invalidate();
                                            return;
                                    }
                                }
                            });
                            ((ValueAnimator) this.f50378f).setDuration(250L);
                            ((ValueAnimator) this.f50378f).start();
                        } else {
                            this.f50376c = false;
                        }
                    } else if (((ValueAnimator) this.h) == null) {
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        this.h = ofFloat2;
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                            public final v4 f49972b;

                            {
                                this.f49972b = this;
                            }

                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                switch (r2) {
                                    case 0:
                                        this.f49972b.invalidate();
                                        return;
                                    default:
                                        this.f49972b.invalidate();
                                        return;
                                }
                            }
                        });
                        ((ValueAnimator) this.h).setStartDelay(250L);
                        ((ValueAnimator) this.h).setDuration(250L);
                        ((ValueAnimator) this.h).start();
                    }
                    ValueAnimator valueAnimator2 = (ValueAnimator) this.f50378f;
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
                l71 l71Var = (l71) this.h;
                l61 l61Var = l71Var.f47141a;
                if (this.f50376c) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    org.telegram.ui.ActionBar.k6.t(this, l71Var.f47210z0, l61Var);
                    Paint d = l61Var.d("paintChatActionBackground");
                    ColorFilter colorFilter = d.getColorFilter();
                    d.setColorFilter((ColorMatrixColorFilter) this.f50378f);
                    b71 b71Var = l71Var.f47210z0;
                    if (b71Var != null && (b71Var.getBackground() instanceof org.telegram.ui.Components.la0) && l71Var.f47182n1 < 0.0f) {
                        f10 = 0.33f;
                    }
                    int alpha = d.getAlpha();
                    d.setAlpha((int) (alpha * f10));
                    canvas.drawRect(rectF, d);
                    d.setAlpha(alpha);
                    d.setColorFilter(colorFilter);
                    if (l71Var.O1) {
                        float f11 = l71Var.f47186p1;
                        if (f11 > 0.0f) {
                            canvas.drawColor(i0.a.o(-16777216, (int) (f11 * 255.0f * l71Var.f47188q1)));
                        }
                    }
                    canvas.save();
                    if (((LinearGradient) this.d) == null || this.f50375b != getHeight()) {
                        int height = getHeight();
                        this.f50375b = height;
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
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f50374a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                int width = getWidth() / 2;
                int height = getHeight() / 2;
                int i13 = this.f50375b;
                ((RadialProgress2) this.f50377e).r(width - i13, height - i13, width + i13, height + i13);
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f50374a) {
            case 1:
                super.onMeasure(i3, i10);
                for (int i11 = 0; i11 < getChildCount(); i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getMeasuredWidth() > org.telegram.messenger.g0.L(420.0f)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(420.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    }
                }
                return;
            case 2:
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), 1073741824));
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    public v4(tg.q qVar, Context context) {
        super(context);
        this.h = qVar;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1711276033);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, b8.mf.d(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
        View mVar = new tg.m(qVar, context);
        this.f50377e = mVar;
        addView(mVar, b8.mf.d(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f50378f = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(10.0f), 436207615));
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setGravity(17);
        editTextBoldCursor.setSingleLine();
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setImeActionLabel(org.telegram.messenger.bd.M0(2131751355, null), 6);
        editTextBoldCursor.setInputType(2);
        editTextBoldCursor.setTypeface(org.telegram.messenger.g0.o());
        editTextBoldCursor.addTextChangedListener(new ai.a0(this));
        editTextBoldCursor.setOnFocusChangeListener(new ci.m(this, 6));
        editTextBoldCursor.setOnEditorActionListener(new org.telegram.ui.Components.i2(4));
        addView(editTextBoldCursor, b8.mf.e(72, 36, 85));
    }

    public v4(l71 l71Var, Context context, boolean z10) {
        super(context);
        this.h = l71Var;
        this.f50376c = z10;
        Paint paint = new Paint(3);
        this.f50377e = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ColorMatrix colorMatrix = new ColorMatrix();
        org.telegram.messenger.g0.i(colorMatrix, 0.4f);
        org.telegram.messenger.g0.n2(colorMatrix, 0.65f);
        this.f50378f = new ColorMatrixColorFilter(colorMatrix);
    }
}
