package ug;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bq;
public class b extends EditTextBoldCursor {
    public final Canvas H1;
    public final TextPaint I1;
    public final Paint J1;
    public Bitmap K1;
    public boolean L1;
    public int M1;
    public float N1;
    public int O1;
    public final bq P1;
    public RectF[] Q1;
    public RectF R1;
    public boolean S1;
    public float T1;

    public b(Context context) {
        super(context);
        this.H1 = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.I1 = textPaint;
        this.J1 = new Paint(1);
        this.P1 = new bq();
        this.M1 = 0;
        setInputType(getInputType() | 655360);
        this.L1 = true;
        this.S1 = true;
        setFrameRoundRadius(org.telegram.messenger.g0.L(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f10) {
        if (Math.abs(this.T1 - f10) > 0.1f) {
            this.T1 = f10;
            this.J1.setPathEffect(new CornerPathEffect(f10));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        int i3 = 0;
        if (this.K1 != null && this.M1 != 0) {
            boolean z11 = this.L1;
            TextPaint textPaint = this.I1;
            if (z11) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                Editable text = getText();
                Bitmap bitmap = this.K1;
                Canvas canvas2 = this.H1;
                canvas2.setBitmap(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                float f10 = this.N1;
                if (f10 <= 0.0f) {
                    f10 = (float) Math.ceil(getTextSize() / 11.5f);
                }
                textPaint.setStrokeWidth(f10);
                textPaint.setColor(this.M1);
                textPaint.setTextSize(getTextSize());
                textPaint.setTypeface(getTypeface());
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                if (getLayout() != null) {
                    alignment = getLayout().getAlignment();
                }
                StaticLayout staticLayout = new StaticLayout(text, textPaint, measuredWidth, alignment, 1.0f, 0.0f, true);
                canvas2.save();
                canvas2.translate(getPaddingLeft(), ((((measuredHeight - getPaddingTop()) - getPaddingBottom()) - staticLayout.getHeight()) / 2.0f) + getPaddingTop());
                staticLayout.draw(canvas2);
                canvas2.restore();
                this.L1 = false;
            }
            canvas.drawBitmap(this.K1, 0.0f, 0.0f, textPaint);
        }
        if (this.O1 != 0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            int i10 = this.O1;
            Paint paint = this.J1;
            paint.setColor(i10);
            Layout layout = getLayout();
            if (layout == null) {
                super.onDraw(canvas);
                return;
            }
            RectF[] rectFArr = this.Q1;
            if (rectFArr == null || rectFArr.length != layout.getLineCount()) {
                this.Q1 = new RectF[layout.getLineCount()];
                this.S1 = true;
            }
            if (this.S1) {
                this.S1 = false;
                for (int i11 = 0; i11 < layout.getLineCount(); i11++) {
                    RectF[] rectFArr2 = this.Q1;
                    if (rectFArr2[i11] == null) {
                        rectFArr2[i11] = new RectF();
                    }
                    this.Q1[i11].set(layout.getLineLeft(i11), layout.getLineTop(i11), layout.getLineRight(i11), layout.getLineBottom(i11));
                    if (this.Q1[i11].width() > org.telegram.messenger.g0.L(1.0f)) {
                        this.Q1[i11].inset((-getTextSize()) / 3.0f, 0.0f);
                        RectF rectF = this.Q1[i11];
                        rectF.top = org.telegram.messenger.g0.N(1.2f) + rectF.top;
                        RectF rectF2 = this.Q1[i11];
                        rectF2.bottom = org.telegram.messenger.g0.N(1.0f) + rectF2.bottom;
                        this.Q1[i11].left = Math.max(-getPaddingLeft(), this.Q1[i11].left);
                        this.Q1[i11].right = Math.min(getWidth() - getPaddingLeft(), this.Q1[i11].right);
                    } else {
                        RectF rectF3 = this.Q1[i11];
                        rectF3.left = rectF3.right;
                    }
                    if (i11 > 0) {
                        int i12 = i11 - 1;
                        if (this.Q1[i12].width() > 0.0f) {
                            RectF[] rectFArr3 = this.Q1;
                            rectFArr3[i12].bottom = rectFArr3[i11].top;
                        }
                    }
                }
                if (this.R1 == null) {
                    this.R1 = new RectF();
                }
                this.R1.left = getMeasuredWidth();
                this.R1.top = getMeasuredHeight();
                RectF rectF4 = this.R1;
                rectF4.bottom = 0.0f;
                rectF4.right = 0.0f;
                for (int i13 = 0; i13 < this.Q1.length; i13++) {
                    RectF rectF5 = this.R1;
                    rectF5.left = Math.min(rectF5.left, getPaddingLeft() + this.Q1[i13].left);
                    RectF rectF6 = this.R1;
                    rectF6.top = Math.min(rectF6.top, getPaddingTop() + this.Q1[i13].top);
                    RectF rectF7 = this.R1;
                    rectF7.right = Math.max(rectF7.right, getPaddingLeft() + this.Q1[i13].right);
                    RectF rectF8 = this.R1;
                    rectF8.bottom = Math.max(rectF8.bottom, getPaddingTop() + this.Q1[i13].bottom);
                }
                RectF rectF9 = this.R1;
                RectF rectF10 = this.R1;
                rectF9.right = getMeasuredWidth() - rectF10.right;
                rectF10.bottom = getMeasuredHeight() - this.R1.bottom;
            }
            bq bqVar = this.P1;
            bqVar.rewind();
            float textSize = getTextSize() / 3.0f;
            float f11 = 1.5f * textSize;
            int i14 = 1;
            while (true) {
                RectF[] rectFArr4 = this.Q1;
                if (i14 >= rectFArr4.length) {
                    break;
                }
                RectF rectF11 = rectFArr4[i14 - 1];
                RectF rectF12 = rectFArr4[i14];
                if (rectF11.width() >= org.telegram.messenger.g0.L(1.0f) && rectF12.width() >= org.telegram.messenger.g0.L(1.0f)) {
                    if (Math.abs(rectF11.left - rectF12.left) < f11) {
                        float min = Math.min(rectF12.left, rectF11.left);
                        rectF11.left = min;
                        rectF12.left = min;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (Math.abs(rectF11.right - rectF12.right) < f11) {
                        float max = Math.max(rectF12.right, rectF11.right);
                        rectF11.right = max;
                        rectF12.right = max;
                        z10 = true;
                    }
                    if (z10) {
                        for (int i15 = i14; i15 >= 1; i15--) {
                            RectF[] rectFArr5 = this.Q1;
                            RectF rectF13 = rectFArr5[i15 - 1];
                            RectF rectF14 = rectFArr5[i15];
                            if (rectF13.width() >= org.telegram.messenger.g0.L(1.0f) && rectF14.width() >= org.telegram.messenger.g0.L(1.0f)) {
                                if (Math.abs(rectF13.left - rectF14.left) < f11) {
                                    float min2 = Math.min(rectF14.left, rectF13.left);
                                    rectF13.left = min2;
                                    rectF14.left = min2;
                                }
                                if (Math.abs(rectF13.right - rectF14.right) < f11) {
                                    float max2 = Math.max(rectF14.right, rectF13.right);
                                    rectF13.right = max2;
                                    rectF14.right = max2;
                                }
                            }
                        }
                    }
                }
                i14++;
            }
            while (true) {
                RectF[] rectFArr6 = this.Q1;
                if (i3 >= rectFArr6.length) {
                    break;
                }
                if (rectFArr6[i3].width() != 0.0f) {
                    bqVar.addRect(this.Q1[i3], Path.Direction.CW);
                }
                i3++;
            }
            bqVar.a();
            setFrameRoundRadius(textSize);
            canvas.drawPath(bqVar, paint);
            canvas.restore();
        } else {
            this.R1 = null;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (i3 > 0 && i10 > 0) {
            this.L1 = true;
            this.S1 = true;
            Bitmap bitmap = this.K1;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.K1 = Bitmap.createBitmap(i3, i10, Bitmap.Config.ARGB_8888);
            return;
        }
        this.K1 = null;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        super.onTextChanged(charSequence, i3, i10, i11);
        this.L1 = true;
        this.S1 = true;
    }

    public void setFrameColor(int i3) {
        int i10 = this.O1;
        if (i10 == 0 && i3 != 0) {
            setPadding(org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(7.0f));
            setCursorColor(-1);
        } else if (i10 != 0 && i3 == 0) {
            setPadding(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
            setCursorColor(-1);
        }
        this.O1 = i3;
        if (i3 != 0) {
            float B = org.telegram.messenger.g0.B(i3);
            if (B == 0.0f) {
                B = Color.red(this.O1) / 255.0f;
            }
            if (B > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.S1 = true;
        }
        this.L1 = true;
        invalidate();
    }

    @Override
    public void setGravity(int i3) {
        super.setGravity(i3);
        this.L1 = true;
        this.S1 = true;
        invalidate();
    }

    public void setStrokeColor(int i3) {
        this.M1 = i3;
        this.L1 = true;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.N1 = f10;
        this.L1 = true;
        invalidate();
    }
}
