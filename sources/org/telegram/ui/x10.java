package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class x10 extends FrameLayout {
    public final FiltersSetupActivity B;
    public final org.telegram.ui.ActionBar.k5 f39817a;
    public final TextView f39818b;
    public final ImageView f39819c;
    public int d;
    public int e;
    public final View f39820f;
    public final ImageView h;
    public final org.telegram.ui.Components.l30 f39821n;
    public boolean f39822r;
    public final org.telegram.ui.Components.j90 f39823s;
    public boolean v;
    public float f39824w;
    public MessagesController.DialogFilter f39825x;
    public ValueAnimator f39826y;

    public x10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i13;
        float f10;
        float f11;
        int i14;
        int i15;
        float f12;
        float f13;
        int i16;
        float f14;
        float f15;
        int i17;
        this.B = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.f39822r = false;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f39819c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i18 = org.telegram.ui.ActionBar.j6.Uh;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, k7.b6.d(48, 48.0f, i10 | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f39820f = view;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(view, k7.b6.d(20, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f39817a = k5Var;
        k5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        k5Var.setTextSize(16);
        k5Var.setMaxLines(1);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        k5Var.setGravity(i12 | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i18, false), mode));
        k5Var.i(drawable);
        int i19 = org.telegram.ui.ActionBar.j6.Oh;
        f6Var = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity).resourceProvider;
        k5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i19, f6Var));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 48;
        if (z4) {
            f10 = 80.0f;
        } else {
            f10 = 64.0f;
        }
        if (z4) {
            f11 = 64.0f;
        } else {
            f11 = 80.0f;
        }
        addView(k5Var, k7.b6.d(-1, -2.0f, i20, f10, 10.0f, f11, 0.0f));
        TextView textView = new TextView(context);
        this.f39818b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20273z6, false));
        textView.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView.setGravity(i14);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i21 = i15 | 48;
        if (z10) {
            f12 = 80.0f;
        } else {
            f12 = 64.0f;
        }
        if (z10) {
            f13 = 64.0f;
        } else {
            f13 = 80.0f;
        }
        addView(textView, k7.b6.d(-2, -2.0f, i21, f12, 35.0f, f13, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.j90 j90Var = new org.telegram.ui.Components.j90();
        this.f39823s = j90Var;
        j90Var.C = true;
        j90Var.f25920t = 2.0f;
        int i22 = org.telegram.ui.ActionBar.j6.f19971i6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
        j90Var.f(org.telegram.ui.ActionBar.j6.l1(0.4f, w03), org.telegram.ui.ActionBar.j6.l1(1.0f, w03), org.telegram.ui.ActionBar.j6.l1(0.9f, w03), org.telegram.ui.ActionBar.j6.l1(1.7f, w03));
        int dp = AndroidUtilities.dp(1.0f);
        j90Var.f25922w.setStrokeWidth(dp);
        j90Var.j(40.0f);
        org.telegram.ui.Components.l30 l30Var = new org.telegram.ui.Components.l30(this, context, dp, 1);
        this.f39821n = l30Var;
        j90Var.setCallback(l30Var);
        l30Var.setFocusable(false);
        l30Var.setScaleType(scaleType);
        l30Var.setBackground(org.telegram.ui.ActionBar.j6.f0(w03, 1, -1));
        l30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i18, false), mode));
        l30Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        l30Var.setVisibility(8);
        l30Var.setImageResource(R.drawable.msg_link_folder);
        l30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i18, false), mode));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        int i23 = i16 | 16;
        if (z11) {
            f14 = 52.0f;
        } else {
            f14 = 6.0f;
        }
        if (z11) {
            f15 = 6.0f;
        } else {
            f15 = 52.0f;
        }
        addView(l30Var, k7.b6.d(40, 40.0f, i23, f14, 0.0f, f15, 0.0f));
        l30Var.setOnClickListener(new a(this, 26));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i22, false), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i18, false), mode));
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView2, k7.b6.d(40, 40.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.f39825x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.v) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(62.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20000k0);
        }
        MessagesController.DialogFilter dialogFilter = this.f39825x;
        if (dialogFilter != null) {
            boolean z4 = dialogFilter.locked;
            if (z4) {
                float f10 = this.f39824w;
                if (f10 != 1.0f) {
                    this.f39824w = f10 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z4) {
                float f11 = this.f39824w;
                if (f11 != 0.0f) {
                    this.f39824w = f11 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float clamp = Utilities.clamp(this.f39824w, 1.0f, 0.0f);
        this.f39824w = clamp;
        org.telegram.ui.ActionBar.k5 k5Var = this.f39817a;
        k5Var.setRightDrawableScale(clamp);
        k5Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f39819c.setOnTouchListener(onTouchListener);
    }
}
