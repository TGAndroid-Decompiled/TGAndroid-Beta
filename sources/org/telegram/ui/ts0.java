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
public final class ts0 extends LinearLayout {
    public final TextView f50104a;
    public final TextView f50105b;
    public final FrameLayout f50106c;
    public final bi.qd d;
    public final ar0 f50107e;
    public boolean f50108f;
    public boolean h;
    public final PremiumPreviewFragment f50109n;

    public ts0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.f50109n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f50106c = frameLayout;
        int i12 = premiumPreviewFragment.f41588g0;
        if (i12 == 1) {
            i7 = 175;
        } else {
            i7 = 190;
        }
        addView(frameLayout, c8.ha.r(i7, i7, 1));
        boolean z9 = premiumPreviewFragment.f41589h0;
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
        this.f50104a = textView;
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
        this.f50105b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, c8.ha.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        ar0 ar0Var = new ar0(this, context);
        this.f50107e = ar0Var;
        ar0Var.setOverScrollMode(2);
        ar0Var.setLayoutManager(new v4.b0());
        ar0Var.setAdapter(new ss0(this, context));
        ar0Var.setOnItemClickListener(new h(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        ar0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                ar0 ar0Var2 = ts0.this.f50107e;
                View pressedChildView = ar0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = ar0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = ar0Var2.getSelectorRect();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, org.telegram.messenger.g0.L(12.0f));
                }
                if (b10 == ar0Var2.getAdapter().b() - 1) {
                    Arrays.fill(fArr2, 4, 8, org.telegram.messenger.g0.L(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(ar0Var, c8.ha.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ts0.a():void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ts0.b():void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
