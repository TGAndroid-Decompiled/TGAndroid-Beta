package org.telegram.ui;

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
public final class us0 extends LinearLayout {
    public final TextView f50410a;
    public final TextView f50411b;
    public final FrameLayout f50412c;
    public final bi.qd d;
    public final br0 f50413e;
    public boolean f50414f;
    public boolean h;
    public final PremiumPreviewFragment f50415n;

    public us0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.f50415n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50412c = frameLayout;
        int i12 = premiumPreviewFragment.f41616g0;
        if (i12 == 1) {
            i7 = 175;
        } else {
            i7 = 190;
        }
        addView(frameLayout, c8.ha.r(i7, i7, 1));
        boolean z9 = premiumPreviewFragment.f41617h0;
        if (i12 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        bi.qd qdVar = new bi.qd(this, context, z9 ? 1 : 0, i10, context);
        this.d = qdVar;
        frameLayout.addView(qdVar, c8.ha.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f50410a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        if (i12 == 1) {
            i11 = 8;
        } else {
            i11 = 20;
        }
        addView(textView, c8.ha.q(-2, -2, 0.0f, 1, 16, i11, 16, 0));
        TextView textView2 = new TextView(context);
        this.f50411b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, c8.ha.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        br0 br0Var = new br0(this, context);
        this.f50413e = br0Var;
        br0Var.setOverScrollMode(2);
        br0Var.setLayoutManager(new v4.b0());
        br0Var.setAdapter(new ts0(this, context));
        br0Var.setOnItemClickListener(new h(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        br0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                br0 br0Var2 = us0.this.f50413e;
                View pressedChildView = br0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = br0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = br0Var2.getSelectorRect();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, org.telegram.messenger.g0.L(12.0f));
                }
                if (b10 == br0Var2.getAdapter().b() - 1) {
                    Arrays.fill(fArr2, 4, 8, org.telegram.messenger.g0.L(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(br0Var, c8.ha.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.us0.a():void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.us0.b():void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
