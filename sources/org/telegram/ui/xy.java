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
public final class xy extends FrameLayout {
    public org.telegram.ui.Components.n9 f43496a;
    public org.telegram.ui.Components.n9 f43497b;
    public Drawable f43498c;
    public Drawable d;
    public final Drawable f43499e;
    public Paint f43500f;
    public RectF h;
    public final ViewGroup[] f43501n;
    public final yy f43502r;

    public xy(yy yyVar, Context context) {
        super(context);
        this.f43502r = yyVar;
        this.f43500f = new Paint(1);
        this.h = new RectF();
        this.f43501n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, k7.c6.e(-2, -2, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        v0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        f10.addView(v0Var, k7.c6.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        f10.addView(linearLayout, k7.c6.t(-2, -2, 17, 10, 0, 10, 0));
        yyVar.d = new ImageView(context);
        int i11 = yyVar.f43738w;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f43501n[i10] = (ViewGroup) yyVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f43501n[i10], k7.c6.n(-1, -2));
                i10++;
            }
            linearLayout.addView(yyVar.d, k7.c6.q(218, 160, 17));
            yyVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f43501n[i10] = (ViewGroup) yyVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f43501n[i10], k7.c6.n(160, -2));
                i10++;
            }
            linearLayout.addView(yyVar.d, k7.c6.q(160, 160, 17));
            yyVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.f43499e = org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xy.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n9 n9Var = this.f43496a;
        if (n9Var != null) {
            n9Var.dispose();
            this.f43496a = null;
        }
        org.telegram.ui.Components.n9 n9Var2 = this.f43497b;
        if (n9Var2 != null) {
            n9Var2.dispose();
            this.f43497b = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable s02 = org.telegram.ui.ActionBar.k6.s0();
        Drawable drawable2 = this.f43498c;
        if (s02 != drawable2 && s02 != null) {
            if (org.telegram.ui.ActionBar.k6.sl != null) {
                this.d = drawable2;
                this.f43497b = this.f43496a;
            } else {
                org.telegram.ui.Components.n9 n9Var = this.f43496a;
                if (n9Var != null) {
                    n9Var.dispose();
                    this.f43496a = null;
                }
            }
            this.f43498c = s02;
        }
        yy yyVar = this.f43502r;
        float themeAnimationValue = yy.W(yyVar).getThemeAnimationValue();
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f43498c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && yy.X(yyVar) != null) {
                    drawable.setAlpha((int) (255.0f * themeAnimationValue));
                } else {
                    drawable.setAlpha(255);
                }
                if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.fc0)) {
                    if (drawable instanceof BitmapDrawable) {
                        if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f10 = 2.0f / AndroidUtilities.density;
                            canvas.scale(f10, f10);
                            drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
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
                    if (drawable instanceof org.telegram.ui.Components.o9) {
                        this.f43496a = ((org.telegram.ui.Components.o9) drawable).c(canvas, this);
                    } else {
                        drawable.draw(canvas);
                    }
                }
                if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                    org.telegram.ui.Components.n9 n9Var2 = this.f43497b;
                    if (n9Var2 != null) {
                        n9Var2.dispose();
                        this.f43497b = null;
                    }
                    this.d = null;
                    invalidate();
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.f43499e;
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
    public final void dispatchSetPressed(boolean z4) {
    }
}
