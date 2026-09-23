package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zy extends FrameLayout {
    public org.telegram.ui.Components.u9 f40274a;
    public org.telegram.ui.Components.u9 f40275b;
    public Drawable f40276c;
    public Drawable d;
    public final Drawable e;
    public Paint f40277f;
    public RectF h;
    public final ViewGroup[] f40278n;
    public final az f40279r;

    public zy(az azVar, Context context) {
        super(context);
        this.f40279r = azVar;
        this.f40277f = new Paint(1);
        this.h = new RectF();
        this.f40278n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout f7 = org.telegram.messenger.ul.f(context, 1);
        addView(f7, w7.x5.e(-2, -2, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        w0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        f7.addView(w0Var, w7.x5.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        f7.addView(linearLayout, w7.x5.t(-2, -2, 17, 10, 0, 10, 0));
        azVar.d = new ImageView(context);
        int i11 = azVar.f31908w;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f40278n[i10] = (ViewGroup) azVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40278n[i10], w7.x5.n(-1, -2));
                i10++;
            }
            linearLayout.addView(azVar.d, w7.x5.q(218, 160, 17));
            azVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f40278n[i10] = (ViewGroup) azVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40278n[i10], w7.x5.n(160, -2));
                i10++;
            }
            linearLayout.addView(azVar.d, w7.x5.q(160, 160, 17));
            azVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.e = org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f18753b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zy.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.u9 u9Var = this.f40274a;
        if (u9Var != null) {
            u9Var.dispose();
            this.f40274a = null;
        }
        org.telegram.ui.Components.u9 u9Var2 = this.f40275b;
        if (u9Var2 != null) {
            u9Var2.dispose();
            this.f40275b = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zy.onDraw(android.graphics.Canvas):void");
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
