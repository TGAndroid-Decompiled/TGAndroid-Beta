package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xw0 extends LinearLayout {
    public final TextView f45788a;
    public final TextView f45789b;
    public final FrameLayout f45790c;
    public final tw0 d;
    public final uw0 e;
    public boolean f45791f;
    public boolean h;
    public final PremiumPreviewFragment f45792n;

    public xw0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f45792n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45790c = frameLayout;
        int i13 = premiumPreviewFragment.f35899g0;
        if (i13 == 1) {
            i10 = 175;
        } else {
            i10 = 190;
        }
        addView(frameLayout, org.telegram.ui.Components.kb1.u(i10, i10, 1));
        boolean z10 = premiumPreviewFragment.f35900h0;
        if (i13 == 1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        tw0 tw0Var = new tw0(this, context, z10 ? 1 : 0, i11, context);
        this.d = tw0Var;
        frameLayout.addView(tw0Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f45788a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        if (i13 == 1) {
            i12 = 8;
        } else {
            i12 = 20;
        }
        addView(textView, org.telegram.ui.Components.kb1.t(-2, -2, 0.0f, 1, 16, i12, 16, 0));
        TextView textView2 = new TextView(context);
        this.f45789b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, org.telegram.ui.Components.kb1.t(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        uw0 uw0Var = new uw0(this, context);
        this.e = uw0Var;
        uw0Var.setOverScrollMode(2);
        uw0Var.setLayoutManager(new s4.c0());
        uw0Var.setAdapter(new ww0(this, context));
        uw0Var.setOnItemClickListener(new h(this, 26));
        final Path path = new Path();
        final float[] fArr = new float[8];
        uw0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                uw0 uw0Var2 = xw0.this.e;
                View pressedChildView = uw0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = uw0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = uw0Var2.getSelectorRect();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, AndroidUtilities.dp(12.0f));
                }
                if (b10 == uw0Var2.getAdapter().h() - 1) {
                    Arrays.fill(fArr2, 4, 8, AndroidUtilities.dp(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(uw0Var, org.telegram.ui.Components.kb1.o(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xw0.a():void");
    }

    public final void b() {
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        PremiumPreviewFragment premiumPreviewFragment = this.f45792n;
        int i14 = premiumPreviewFragment.f35899g0;
        TextView textView = this.f45788a;
        TextView textView2 = this.f45789b;
        if (i14 == 0) {
            if (premiumPreviewFragment.f35908p0) {
                i12 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i12 = R.string.TelegramPremium;
            }
            textView.setText(LocaleController.getString(i12));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.f35908p0) {
                i13 = R.string.TelegramPremiumSubtitle;
            } else {
                i13 = R.string.TelegramPremiumSubscribedSubtitle;
            }
            org.telegram.messenger.t.n(i13, textView2);
        } else if (i14 == 1) {
            if (premiumPreviewFragment.f35908p0) {
                i10 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i10 = R.string.TelegramBusiness;
            }
            textView.setText(LocaleController.getString(i10));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.f35908p0) {
                i11 = R.string.TelegramBusinessSubtitleTemp;
            } else {
                i11 = R.string.TelegramBusinessSubscribedSubtitleTemp;
            }
            org.telegram.messenger.t.n(i11, textView2);
        }
        textView2.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), fi.v3.a(textView2.getText(), textView2.getPaint()));
        int i15 = 0;
        if (!premiumPreviewFragment.f35908p0 && !BuildVars.IS_BILLING_UNAVAILABLE && premiumPreviewFragment.d.size() > 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z11 = this.f45791f;
        uw0 uw0Var = this.e;
        if (z11 && z10) {
            if (uw0Var.getVisibility() == 0 && z10 && this.h == z10) {
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                duration.addUpdateListener(new sw0(this, uw0Var, duration, 0));
                duration.addListener(new org.telegram.ui.Components.ml0(11, this, uw0Var));
                duration.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                duration.start();
            }
        } else {
            if (z10) {
                i15 = 8;
            }
            uw0Var.setVisibility(i15);
            this.f45791f = true;
        }
        this.h = !z10;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
