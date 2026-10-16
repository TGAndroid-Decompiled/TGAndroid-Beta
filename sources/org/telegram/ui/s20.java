package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class s20 extends LinearLayout {
    public final int f39664a = 0;
    public final Object f39665b;
    public final View f39666c;
    public final Object d;
    public final Object e;

    public s20(Context context, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.mm0 mm0Var) {
        super(context);
        this.d = new Paint(1);
        this.e = new org.telegram.ui.Components.g6(this);
        this.f39665b = c6Var;
        this.f39666c = mm0Var;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f39664a) {
            case 1:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.e;
                super.dispatchDraw(canvas);
                Paint paint = (Paint) this.d;
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, (org.telegram.ui.ActionBar.c6) this.f39665b));
                org.telegram.ui.Components.mm0 mm0Var = (org.telegram.ui.Components.mm0) this.f39666c;
                float f7 = 1.0f;
                if (mm0Var != null) {
                    if (!mm0Var.canScrollVertically(1)) {
                        f7 = 0.0f;
                    }
                    paint.setAlpha((int) (g6Var.d(f7, false) * 255.0f));
                } else {
                    paint.setAlpha((int) (g6Var.d(1.0f, false) * 255.0f));
                }
                canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.getShadowHeight(), paint);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    public s20(Context context) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        addView(frameLayout, w7.z5.q(-1, -2, 1));
        frameLayout.setClipChildren(false);
        setClipChildren(false);
        TextView textView = new TextView(context);
        this.f39665b = textView;
        textView.setTextSize(1, 22.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        addView(textView, w7.z5.p(-2, -2, 0.0f, 1, 16, 20, 16, 0));
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(context, null);
        this.f39666c = da0Var;
        da0Var.setTextSize(1, 14.0f);
        da0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        da0Var.setGravity(1);
        addView(da0Var, w7.z5.p(-1, -2, 0.0f, 1, 24, 7, 24, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.e = frameLayout2;
        addView(frameLayout2, w7.z5.q(-1, -2, 1));
        frameLayout2.setClipChildren(false);
    }

    public s20(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        zh.r6 r6Var = new zh.r6(context, 70, 0);
        frameLayout.addView(r6Var, w7.z5.d(-1.0f, -1));
        tg.n nVar = new tg.n(context, 1, 2);
        this.f39666c = nVar;
        tg.g gVar = nVar.f45740b;
        gVar.f45724z = org.telegram.ui.ActionBar.g6.fk;
        gVar.A = org.telegram.ui.ActionBar.g6.gk;
        gVar.b();
        nVar.setStarParticlesView(r6Var);
        frameLayout.addView(nVar, w7.z5.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
        nVar.setPaused(false);
        zh.d7 d7Var = new zh.d7(context, i10, c6Var);
        this.d = d7Var;
        w7.b6.a(d7Var);
        d7Var.setOnClickListener(new ji.o4(this, 28));
        frameLayout.addView(d7Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 53));
        addView(frameLayout, w7.z5.d(150.0f, -1));
        TextView textView = new TextView(context);
        this.f39665b = textView;
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView.setGravity(17);
        addView(textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        textView2.setGravity(17);
        addView(textView2, w7.z5.t(-2, -2, 1, 0, 9, 0, 18));
    }
}
