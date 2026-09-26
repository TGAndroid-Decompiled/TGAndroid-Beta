package org.telegram.ui;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class v51 extends ViewOutlineProvider {
    public final Rect f38647a = new Rect();
    public final Integer f38648b;
    public final a71 f38649c;

    public v51(a71 a71Var, Integer num) {
        this.f38649c = a71Var;
        this.f38648b = num;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        float intValue;
        Integer num = this.f38648b;
        if (num == null) {
            intValue = view.getWidth() / 2.0f;
        } else {
            intValue = num.intValue();
        }
        float dp = intValue + AndroidUtilities.dp(20.0f);
        float width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        float height = (view.getHeight() - view.getPaddingBottom()) - view.getPaddingTop();
        a71 a71Var = this.f38649c;
        boolean n10 = a71Var.n();
        Rect rect = this.f38647a;
        if (n10) {
            int paddingLeft = (int) ((dp - (a71Var.f32010a1 * dp)) + view.getPaddingLeft());
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, a71Var.f32013b1, height, view.getPaddingTop());
            rect.set(paddingLeft, (int) com.google.android.gms.internal.vision.e2.z(1.0f, a71Var.f32013b1, AndroidUtilities.dp(a71Var.f32018d1), z10), (int) (((width - dp) * a71Var.f32010a1) + view.getPaddingLeft() + dp), (int) com.google.android.gms.internal.vision.e2.z(1.0f, a71Var.f32013b1, AndroidUtilities.dp(a71Var.f32018d1), view.getPaddingTop() + height));
        } else {
            rect.set((int) ((dp - (a71Var.f32010a1 * dp)) + view.getPaddingLeft()), view.getPaddingTop(), (int) (((width - dp) * a71Var.f32010a1) + view.getPaddingLeft() + dp), (int) ((height * a71Var.f32013b1) + view.getPaddingTop()));
        }
        outline.setRoundRect(rect, AndroidUtilities.dp(12.0f));
    }
}
