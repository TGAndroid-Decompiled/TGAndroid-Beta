package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class l0 extends ViewOutlineProvider {
    public final int f52034a;
    public final n0 f52035b;

    public l0(n0 n0Var, int i10) {
        this.f52034a = i10;
        this.f52035b = n0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f52034a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                n0 n0Var = this.f52035b;
                outline.setRoundRect(Math.round(n0Var.f52056n - translationX), Math.round(n0Var.f52061r - translationY), Math.round(n0Var.f52063s - translationX), Math.round(n0Var.v - translationY), n0Var.f52064w);
                return;
            default:
                int height = view.getHeight();
                n0 n0Var2 = this.f52035b;
                int i10 = n0Var2.f52043b0;
                outline.setRoundRect(n0Var2.f52041a0, i10, view.getWidth() - n0Var2.f52041a0, view.getHeight() - n0Var2.f52045c0, ((height - i10) - n0Var2.f52045c0) / 2.0f);
                return;
        }
    }
}
