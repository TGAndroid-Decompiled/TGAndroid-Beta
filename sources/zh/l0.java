package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class l0 extends ViewOutlineProvider {
    public final int f52497a;
    public final n0 f52498b;

    public l0(n0 n0Var, int i10) {
        this.f52497a = i10;
        this.f52498b = n0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f52497a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                n0 n0Var = this.f52498b;
                outline.setRoundRect(Math.round(n0Var.f52519n - translationX), Math.round(n0Var.f52524r - translationY), Math.round(n0Var.f52526s - translationX), Math.round(n0Var.v - translationY), n0Var.f52527w);
                return;
            default:
                int height = view.getHeight();
                n0 n0Var2 = this.f52498b;
                int i10 = n0Var2.f52506b0;
                outline.setRoundRect(n0Var2.f52504a0, i10, view.getWidth() - n0Var2.f52504a0, view.getHeight() - n0Var2.f52508c0, ((height - i10) - n0Var2.f52508c0) / 2.0f);
                return;
        }
    }
}
