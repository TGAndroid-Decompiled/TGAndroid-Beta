package qh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class h0 extends ViewOutlineProvider {
    public final int f45640a;
    public final i0 f45641b;

    public h0(i0 i0Var, int i10) {
        this.f45640a = i10;
        this.f45641b = i0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f45640a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                i0 i0Var = this.f45641b;
                outline.setRoundRect(Math.round(i0Var.f45658n - translationX), Math.round(i0Var.f45663r - translationY), Math.round(i0Var.f45665s - translationX), Math.round(i0Var.f45666w - translationY), i0Var.f45667x);
                return;
            default:
                int height = view.getHeight();
                i0 i0Var2 = this.f45641b;
                int i10 = i0Var2.f45645b0;
                outline.setRoundRect(i0Var2.f45643a0, i10, view.getWidth() - i0Var2.f45643a0, view.getHeight() - i0Var2.f45647c0, ((height - i10) - i0Var2.f45647c0) / 2.0f);
                return;
        }
    }
}
