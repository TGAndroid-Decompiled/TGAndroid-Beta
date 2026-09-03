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
    public org.telegram.ui.Components.n9 f40356a;
    public org.telegram.ui.Components.n9 f40357b;
    public Drawable f40358c;
    public Drawable d;
    public final Drawable e;
    public Paint f40359f;
    public RectF h;
    public final ViewGroup[] f40360n;
    public final zy f40361r;

    public yy(zy zyVar, Context context) {
        super(context);
        this.f40361r = zyVar;
        this.f40359f = new Paint(1);
        this.h = new RectF();
        this.f40360n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, k7.b6.e(-2, -2, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        v0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        f10.addView(v0Var, k7.b6.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        f10.addView(linearLayout, k7.b6.t(-2, -2, 17, 10, 0, 10, 0));
        zyVar.d = new ImageView(context);
        int i11 = zyVar.f40899w;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f40360n[i10] = (ViewGroup) zyVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40360n[i10], k7.b6.n(-1, -2));
                i10++;
            }
            linearLayout.addView(zyVar.d, k7.b6.q(218, 160, 17));
            zyVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f40360n[i10] = (ViewGroup) zyVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40360n[i10], k7.b6.n(160, -2));
                i10++;
            }
            linearLayout.addView(zyVar.d, k7.b6.q(160, 160, 17));
            zyVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.e = org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7);
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
        org.telegram.ui.Components.n9 n9Var = this.f40356a;
        if (n9Var != null) {
            n9Var.dispose();
            this.f40356a = null;
        }
        org.telegram.ui.Components.n9 n9Var2 = this.f40357b;
        if (n9Var2 != null) {
            n9Var2.dispose();
            this.f40357b = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
        Drawable drawable2 = this.f40358c;
        if (s02 != drawable2 && s02 != null) {
            if (org.telegram.ui.ActionBar.j6.sl != null) {
                this.d = drawable2;
                this.f40357b = this.f40356a;
            } else {
                org.telegram.ui.Components.n9 n9Var = this.f40356a;
                if (n9Var != null) {
                    n9Var.dispose();
                    this.f40356a = null;
                }
            }
            this.f40358c = s02;
        }
        zy zyVar = this.f40361r;
        float themeAnimationValue = zy.W(zyVar).getThemeAnimationValue();
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f40358c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && zy.X(zyVar) != null) {
                    drawable.setAlpha((int) (255.0f * themeAnimationValue));
                } else {
                    drawable.setAlpha(255);
                }
                if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.ec0)) {
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
                        this.f40356a = ((org.telegram.ui.Components.o9) drawable).c(canvas, this);
                    } else {
                        drawable.draw(canvas);
                    }
                }
                if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                    org.telegram.ui.Components.n9 n9Var2 = this.f40357b;
                    if (n9Var2 != null) {
                        n9Var2.dispose();
                        this.f40357b = null;
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
    public final void dispatchSetPressed(boolean z4) {
    }
}
