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
public final class s9 extends TextView {
    public final int f37627a = 0;
    public final Paint f37628b;
    public Path f37629c;
    public Object d;
    public final Object e;

    public s9(org.telegram.ui.Components.un0 un0Var, Context context) {
        super(context);
        this.e = un0Var;
        this.f37629c = new Path();
        this.d = new RectF();
        this.f37628b = new Paint();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37627a) {
            case 1:
                int l1 = org.telegram.ui.ActionBar.h6.l1(0.15f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19260o6, ((org.telegram.ui.Components.un0) this.e).f28842c));
                Paint paint = this.f37628b;
                paint.setColor(l1);
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                Path path = this.f37629c;
                Paint paint2 = zg.p0.V;
                zg.p0.h(rectF, AndroidUtilities.rectTmp, path);
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
        switch (this.f37627a) {
            case 0:
                org.telegram.ui.Components.h90 h90Var = (org.telegram.ui.Components.h90) this.f37629c;
                if (h90Var != null) {
                    canvas.drawPath(h90Var, this.f37628b);
                }
                if (((org.telegram.ui.Components.k90) this.e).f(canvas)) {
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
        switch (this.f37627a) {
            case 1:
                org.telegram.ui.Components.un0 un0Var = (org.telegram.ui.Components.un0) this.e;
                super.onLayout(z10, i10, i11, i12, i13);
                int width = getWidth();
                int i14 = 0;
                for (int i15 = 0; i15 < un0Var.getChildCount(); i15++) {
                    width = Math.min(width, un0Var.getChildAt(i15).getLeft());
                    i14 = Math.max(i14, un0Var.getChildAt(i15).getRight());
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
        switch (this.f37627a) {
            case 0:
                super.onMeasure(i10, i11);
                if (getText() instanceof Spanned) {
                    Spanned spanned = (Spanned) getText();
                    org.telegram.ui.Components.z51[] z51VarArr = (org.telegram.ui.Components.z51[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.z51.class);
                    if (z51VarArr != null && z51VarArr.length > 0) {
                        org.telegram.ui.Components.h90 h90Var = new org.telegram.ui.Components.h90(0);
                        this.f37629c = h90Var;
                        h90Var.f24700n = false;
                        for (int i14 = 0; i14 < z51VarArr.length; i14++) {
                            int spanStart = spanned.getSpanStart(z51VarArr[i14]);
                            int spanEnd = spanned.getSpanEnd(z51VarArr[i14]);
                            ((org.telegram.ui.Components.h90) this.f37629c).d(getLayout(), spanStart, 0.0f);
                            if (getText() != null) {
                                i12 = getPaint().baselineShift;
                            } else {
                                i12 = 0;
                            }
                            org.telegram.ui.Components.h90 h90Var2 = (org.telegram.ui.Components.h90) this.f37629c;
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
                            h90Var2.f24701o = i13;
                            getLayout().getSelectionPath(spanStart, spanEnd, (org.telegram.ui.Components.h90) this.f37629c);
                        }
                        ((org.telegram.ui.Components.h90) this.f37629c).f24700n = true;
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
        switch (this.f37627a) {
            case 0:
                org.telegram.ui.Components.k90 k90Var = (org.telegram.ui.Components.k90) this.e;
                Layout layout = getLayout();
                float f7 = 0;
                int x10 = (int) (motionEvent.getX() - f7);
                int y3 = (int) (motionEvent.getY() - f7);
                if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                    int lineForVertical = layout.getLineForVertical(y3);
                    float f10 = x10;
                    int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f10);
                    float lineLeft = layout.getLineLeft(lineForVertical);
                    if (lineLeft <= f10 && layout.getLineWidth(lineForVertical) + lineLeft >= f10 && y3 >= 0 && y3 <= layout.getHeight()) {
                        Spannable spannable = (Spannable) layout.getText();
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                        if (clickableSpanArr.length != 0) {
                            k90Var.d(true);
                            if (motionEvent.getAction() == 0) {
                                org.telegram.ui.Components.o90 o90Var = new org.telegram.ui.Components.o90(clickableSpanArr[0], null, motionEvent.getX(), motionEvent.getY(), 0);
                                this.d = o90Var;
                                o90Var.d(771751935);
                                k90Var.a((org.telegram.ui.Components.o90) this.d, null);
                                int spanStart = spannable.getSpanStart(((org.telegram.ui.Components.o90) this.d).f26971i);
                                int spanEnd = spannable.getSpanEnd(((org.telegram.ui.Components.o90) this.d).f26971i);
                                org.telegram.ui.Components.h90 b10 = ((org.telegram.ui.Components.o90) this.d).b();
                                b10.d(layout, spanStart, f7);
                                layout.getSelectionPath(spanStart, spanEnd, b10);
                                return true;
                            } else if (motionEvent.getAction() != 1) {
                                return true;
                            } else {
                                org.telegram.ui.Components.o90 o90Var2 = (org.telegram.ui.Components.o90) this.d;
                                if (o90Var2 != null) {
                                    CharacterStyle characterStyle = o90Var2.f26971i;
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
                    k90Var.d(true);
                    this.d = null;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public s9(Context context, Paint paint) {
        super(context);
        this.f37628b = paint;
        this.e = new org.telegram.ui.Components.k90(this);
    }
}
