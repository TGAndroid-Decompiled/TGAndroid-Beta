package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class l0 extends ViewOutlineProvider {
    public final int f52031a;
    public final n0 f52032b;

    public l0(n0 n0Var, int i10) {
        this.f52031a = i10;
        this.f52032b = n0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f52031a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                n0 n0Var = this.f52032b;
                outline.setRoundRect(Math.round(n0Var.f52053n - translationX), Math.round(n0Var.f52058r - translationY), Math.round(n0Var.f52060s - translationX), Math.round(n0Var.v - translationY), n0Var.f52061w);
                return;
            default:
                int height = view.getHeight();
                n0 n0Var2 = this.f52032b;
                int i10 = n0Var2.f52040b0;
                outline.setRoundRect(n0Var2.f52038a0, i10, view.getWidth() - n0Var2.f52038a0, view.getHeight() - n0Var2.f52042c0, ((height - i10) - n0Var2.f52042c0) / 2.0f);
                return;
        }
    }
}
