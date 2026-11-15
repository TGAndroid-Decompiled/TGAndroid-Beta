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
public final class rs0 extends LinearLayout {
    public final TextView f51011a;
    public final TextView f51012b;
    public final FrameLayout f51013c;
    public final di.xb d;
    public final zq0 f51014e;
    public boolean f51015f;
    public boolean h;
    public final PremiumPreviewFragment f51016n;

    public rs0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        this.f51016n = premiumPreviewFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f51013c = frameLayout;
        int i12 = premiumPreviewFragment.f42987h0;
        if (i12 == 1) {
            i7 = 175;
        } else {
            i7 = 190;
        }
        addView(frameLayout, c8.ja.r(i7, i7, 1));
        boolean z10 = premiumPreviewFragment.f42988i0;
        if (i12 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        di.xb xbVar = new di.xb(this, context, z10 ? 1 : 0, i10, context);
        this.d = xbVar;
        frameLayout.addView(xbVar, c8.ja.c(-1.0f, -1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f51011a = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        if (i12 == 1) {
            i11 = 8;
        } else {
            i11 = 20;
        }
        addView(textView, c8.ja.q(-2, -2, 0.0f, 1, 16, i11, 16, 0));
        TextView textView2 = new TextView(context);
        this.f51012b = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView2.setGravity(1);
        addView(textView2, c8.ja.q(-1, -2, 0.0f, 1, 16, 7, 16, 0));
        zq0 zq0Var = new zq0(this, context);
        this.f51014e = zq0Var;
        zq0Var.setOverScrollMode(2);
        zq0Var.setLayoutManager(new v4.b0());
        zq0Var.setAdapter(new qs0(this, context));
        zq0Var.setOnItemClickListener(new h(this, 25));
        final Path path = new Path();
        final float[] fArr = new float[8];
        zq0Var.setSelectorTransformer(new q0.a() {
            @Override
            public final void accept(Object obj) {
                int b10;
                Canvas canvas = (Canvas) obj;
                zq0 zq0Var2 = rs0.this.f51014e;
                View pressedChildView = zq0Var2.getPressedChildView();
                if (pressedChildView == null) {
                    b10 = -1;
                } else {
                    b10 = zq0Var2.T(pressedChildView).b();
                }
                Path path2 = path;
                path2.rewind();
                Rect selectorRect = zq0Var2.getSelectorRect();
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(selectorRect.left, selectorRect.top, selectorRect.right, selectorRect.bottom);
                float[] fArr2 = fArr;
                Arrays.fill(fArr2, 0.0f);
                if (b10 == 0) {
                    Arrays.fill(fArr2, 0, 4, org.telegram.messenger.g0.L(12.0f));
                }
                if (b10 == zq0Var2.getAdapter().b() - 1) {
                    Arrays.fill(fArr2, 4, 8, org.telegram.messenger.g0.L(12.0f));
                }
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
                canvas.clipPath(path2);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        addView(zq0Var, c8.ja.k(12.0f, 16.0f, 12.0f, 4.0f, -1, -2));
        a();
        b();
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rs0.a():void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rs0.b():void");
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
