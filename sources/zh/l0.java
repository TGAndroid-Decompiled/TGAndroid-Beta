package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class l0 extends ViewOutlineProvider {
    public final int f52035a;
    public final n0 f52036b;

    public l0(n0 n0Var, int i10) {
        this.f52035a = i10;
        this.f52036b = n0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f52035a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                n0 n0Var = this.f52036b;
                outline.setRoundRect(Math.round(n0Var.f52057n - translationX), Math.round(n0Var.f52062r - translationY), Math.round(n0Var.f52064s - translationX), Math.round(n0Var.v - translationY), n0Var.f52065w);
                return;
            default:
                int height = view.getHeight();
                n0 n0Var2 = this.f52036b;
                int i10 = n0Var2.f52044b0;
                outline.setRoundRect(n0Var2.f52042a0, i10, view.getWidth() - n0Var2.f52042a0, view.getHeight() - n0Var2.f52046c0, ((height - i10) - n0Var2.f52046c0) / 2.0f);
                return;
        }
    }
}
