package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yy extends FrameLayout {
    public org.telegram.ui.Components.u9 f40279a;
    public org.telegram.ui.Components.u9 f40280b;
    public Drawable f40281c;
    public Drawable d;
    public final Drawable e;
    public Paint f40282f;
    public RectF h;
    public final ViewGroup[] f40283n;
    public final zy f40284r;

    public yy(zy zyVar, Context context) {
        super(context);
        this.f40284r = zyVar;
        this.f40282f = new Paint(1);
        this.h = new RectF();
        this.f40283n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        addView(f7, w7.y5.e(-2, -2, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        w0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        f7.addView(w0Var, w7.y5.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        f7.addView(linearLayout, w7.y5.t(-2, -2, 17, 10, 0, 10, 0));
        zyVar.d = new ImageView(context);
        int i11 = zyVar.f40602w;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f40283n[i10] = (ViewGroup) zyVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40283n[i10], w7.y5.n(-1, -2));
                i10++;
            }
            linearLayout.addView(zyVar.d, w7.y5.q(218, 160, 17));
            zyVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f40283n[i10] = (ViewGroup) zyVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40283n[i10], w7.y5.n(160, -2));
                i10++;
            }
            linearLayout.addView(zyVar.d, w7.y5.q(160, 160, 17));
            zyVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.e = org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19024b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yy.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u9 u9Var = this.f40279a;
        if (u9Var != null) {
            u9Var.dispose();
            this.f40279a = null;
        }
        org.telegram.ui.Components.u9 u9Var2 = this.f40280b;
        if (u9Var2 != null) {
            u9Var2.dispose();
            this.f40280b = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable s02 = org.telegram.ui.ActionBar.h6.s0();
        Drawable drawable2 = this.f40281c;
        if (s02 != drawable2 && s02 != null) {
            if (org.telegram.ui.ActionBar.h6.sl != null) {
                this.d = drawable2;
                this.f40280b = this.f40279a;
            } else {
                org.telegram.ui.Components.u9 u9Var = this.f40279a;
                if (u9Var != null) {
                    u9Var.dispose();
                    this.f40279a = null;
                }
            }
            this.f40281c = s02;
        }
        zy zyVar = this.f40284r;
        float themeAnimationValue = zy.W(zyVar).getThemeAnimationValue();
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f40281c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && zy.X(zyVar) != null) {
                    drawable.setAlpha((int) (255.0f * themeAnimationValue));
                } else {
                    drawable.setAlpha(255);
                }
                if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.mc0)) {
                    if (drawable instanceof BitmapDrawable) {
                        if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f7 = 2.0f / AndroidUtilities.density;
                            canvas.scale(f7, f7);
                            drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i11 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                        }
                        drawable.draw(canvas);
                        canvas.restore();
                    }
                } else {
                    drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    if (drawable instanceof org.telegram.ui.Components.v9) {
                        this.f40279a = ((org.telegram.ui.Components.v9) drawable).c(canvas, this);
                    } else {
                        drawable.draw(canvas);
                    }
                }
                if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                    org.telegram.ui.Components.u9 u9Var2 = this.f40280b;
                    if (u9Var2 != null) {
                        u9Var2.dispose();
                        this.f40280b = null;
                    }
                    this.d = null;
                    invalidate();
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.e;
        drawable3.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable3.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(264.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
