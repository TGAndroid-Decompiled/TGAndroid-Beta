package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class w9 extends TextView {
    public final int f44572a = 0;
    public final Paint f44573b;
    public Path f44574c;
    public Object d;
    public final Object e;

    public w9(org.telegram.ui.Components.po0 po0Var, Context context) {
        super(context);
        this.e = po0Var;
        this.f44574c = new Path();
        this.d = new RectF();
        this.f44573b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f44572a) {
            case 1:
                int o12 = org.telegram.ui.ActionBar.y6.o1(0.15f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23561o6, ((org.telegram.ui.Components.po0) this.e).f31685c));
                Paint paint = this.f44573b;
                paint.setColor(o12);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f44574c;
                Paint paint2 = bh.y0.V;
                bh.y0.h(rectF, AndroidUtilities.rectTmp, path);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f44572a) {
            case 0:
                org.telegram.ui.Components.t90 t90Var = (org.telegram.ui.Components.t90) this.f44574c;
                if (t90Var != null) {
                    canvas.drawPath(t90Var, this.f44573b);
                }
                if (((org.telegram.ui.Components.x90) this.e).f(canvas)) {
                    invalidate();
                }
                super.onDraw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f44572a) {
            case 1:
                org.telegram.ui.Components.po0 po0Var = (org.telegram.ui.Components.po0) this.e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < po0Var.getChildCount(); i15++) {
                    width = Math.min(width, po0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, po0Var.getChildAt(i15).getRight());
                }
                setPivotX((width + i14) / 2.0f);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f7;
        switch (this.f44572a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.y61[] y61VarArr = (org.telegram.ui.Components.y61[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.y61.class);
                    if (y61VarArr != null && y61VarArr.length > 0) {
                        org.telegram.ui.Components.t90 t90Var = new org.telegram.ui.Components.t90(0);
                        this.f44574c = t90Var;
                        t90Var.f32913n = false;
                        for (int i14 = 0; i14 < y61VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(y61VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(y61VarArr[i14]);
                            ((org.telegram.ui.Components.t90) this.f44574c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.t90 t90Var2 = (org.telegram.ui.Components.t90) this.f44574c;
                            if (i12 != 0) {
                                if (i12 > 0) {
                                    f7 = 5.0f;
                                } else {
                                    f7 = -2.0f;
                                }
                                i13 = AndroidUtilities.dp(f7) + i12;
                            } else {
                                i13 = 0;
                            }
                            t90Var2.f32914o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.t90) this.f44574c);
                        }
                        ((org.telegram.ui.Components.t90) this.f44574c).f32913n = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f44572a) {
            case 0:
                org.telegram.ui.Components.x90 x90Var = (org.telegram.ui.Components.x90) this.e;
                Layout layout = getLayout();
                float f7 = 0;
                int x9 = (int) (motionEvent.getX() - f7);
                int y3 = (int) (motionEvent.getY() - f7);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y3);
                    float f10 = x9;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && y3 >= 0 && y3 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            x90Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = ba0Var;
                                ba0Var.d(771751935);
                                x90Var.a((org.telegram.ui.Components.ba0) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.ba0) this.d).f26780i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.ba0) this.d).f26780i);
                                org.telegram.ui.Components.t90 b10 = ((org.telegram.ui.Components.ba0) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.ba0 ba0Var2 = (org.telegram.ui.Components.ba0) this.d;
                                if (ba0Var2 != null) {
                                    CharacterStyle characterStyle = ba0Var2.f26780i;
                                    ClickableSpan clickableSpan = clickableSpanArr[0];
                                    if (characterStyle == clickableSpan) {
                                        clickableSpan.onClick(this);
                                    }
                                }
                                this.d = null;
                                return true;
                            }
                        }
                    }
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    x90Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public w9(Context context, Paint paint) {
        super(context);
        this.f44573b = paint;
        this.e = new org.telegram.ui.Components.x90(this);
    }
}
