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
public final class qw0 extends LinearLayout {
    public final TextView f40707a;
    public final TextView f40708b;
    public final FrameLayout f40709c;
    public final mw0 d;
    public final nw0 f40710e;
    public boolean f40711f;
    public boolean h;
    public final PremiumPreviewFragment f40712n;

    public qw0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        this.f40712n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40709c = frameLayout;
        int i13 = premiumPreviewFragment.f34486d0;
        if (i13 == 1) {
            i10 = 175;
        } else {
            i10 = 190;
        }
        addView(frameLayout, k7.c6.q(i10, i10, 1));
        boolean z4 = premiumPreviewFragment.f34488e0;
        if (i13 == 1) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        mw0 mw0Var = new mw0(this, context, z4 ? 1 : 0, i11, context);
        this.d = mw0Var;
        frameLayout.addView(mw0Var, k7.c6.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f40707a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        if (i13 == 1) {
            i12 = 8;
        } else {
            i12 = 20;
        }
        addView(textView, k7.c6.p(-2, -2, 0.0f, 1, 16, i12, 16, 0));
        TextView textView2 = new TextView(context);
        this.f40708b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, k7.c6.p(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        nw0 nw0Var = new nw0(this, context);
        this.f40710e = nw0Var;
        nw0Var.setOverScrollMode(2);
        nw0Var.setLayoutManager(new f2.j0());
        nw0Var.setAdapter(new pw0(this, context));
        nw0Var.setOnItemClickListener(new j(this, 24));
        final Path path = new Path();
        final float[] fArr = new float[8];
        nw0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                nw0 nw0Var2 = qw0.this.f40710e;
                View pressedChildView = nw0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = nw0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = nw0Var2.getSelectorRect();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, AndroidUtilities.dp(12.0f));
                }
                if (b10 == nw0Var2.getAdapter().h() - 1) {
                    Arrays.fill(fArr2, 4, 8, AndroidUtilities.dp(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(nw0Var, k7.c6.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qw0.a():void");
    }

    public final void b() {
        int i10;
        int i11;
        boolean z4;
        int i12;
        int i13;
        PremiumPreviewFragment premiumPreviewFragment = this.f40712n;
        int i14 = premiumPreviewFragment.f34486d0;
        TextView textView = this.f40707a;
        TextView textView2 = this.f40708b;
        if (i14 == 0) {
            if (premiumPreviewFragment.m0) {
                i12 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i12 = R.string.TelegramPremium;
            }
            textView.setText(LocaleController.getString(i12));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.m0) {
                i13 = R.string.TelegramPremiumSubtitle;
            } else {
                i13 = R.string.TelegramPremiumSubscribedSubtitle;
            }
            org.telegram.messenger.y3.q(i13, textView2);
        } else if (i14 == 1) {
            if (premiumPreviewFragment.m0) {
                i10 = R.string.TelegramPremiumSubscribedTitle;
            } else {
                i10 = R.string.TelegramBusiness;
            }
            textView.setText(LocaleController.getString(i10));
            if (!premiumPreviewFragment.getUserConfig().isPremium() && !premiumPreviewFragment.m0) {
                i11 = R.string.TelegramBusinessSubtitleTemp;
            } else {
                i11 = R.string.TelegramBusinessSubscribedSubtitleTemp;
            }
            org.telegram.messenger.y3.q(i11, textView2);
        }
        textView2.getLayoutParams().width = Math.min(AndroidUtilities.displaySize.x - AndroidUtilities.dp(42.0f), qh.f3.a(textView2.getText(), textView2.getPaint()));
        int i15 = 0;
        if (!premiumPreviewFragment.m0 && !BuildVars.IS_BILLING_UNAVAILABLE && premiumPreviewFragment.d.size() > 1) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean z10 = this.f40711f;
        nw0 nw0Var = this.f40710e;
        if (z10 && z4) {
            if (nw0Var.getVisibility() == 0 && z4 && this.h == z4) {
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                duration.addUpdateListener(new lw0(this, nw0Var, duration, 0));
                duration.addListener(new org.telegram.ui.Components.fx0(7, this, nw0Var));
                duration.setInterpolator(org.telegram.ui.Components.pr.f30183f);
                duration.start();
            }
        } else {
            if (z4) {
                i15 = 8;
            }
            nw0Var.setVisibility(i15);
            this.f40711f = true;
        }
        this.h = !z4;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
