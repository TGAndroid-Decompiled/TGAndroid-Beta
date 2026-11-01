package qh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f45651a;
    public final i0 f45652b;

    public h0(i0 i0Var, int i10) {
        this.f45651a = i10;
        this.f45652b = i0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f45651a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                i0 i0Var = this.f45652b;
                outline.setRoundRect(Math.round(i0Var.f45669n - translationX), Math.round(i0Var.f45674r - translationY), Math.round(i0Var.f45676s - translationX), Math.round(i0Var.f45677w - translationY), i0Var.f45678x);
                return;
            default:
                int height = view.getHeight();
                i0 i0Var2 = this.f45652b;
                int i10 = i0Var2.f45656b0;
                outline.setRoundRect(i0Var2.f45654a0, i10, view.getWidth() - i0Var2.f45654a0, view.getHeight() - i0Var2.f45658c0, ((height - i10) - i0Var2.f45658c0) / 2.0f);
                return;
        }
    }
}
