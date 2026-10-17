package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class l0 extends ViewOutlineProvider {
    public final int f52043a;
    public final m0 f52044b;

    public l0(m0 m0Var, int i10) {
        this.f52043a = i10;
        this.f52044b = m0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f52043a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                m0 m0Var = this.f52044b;
                outline.setRoundRect(Math.round(m0Var.f52062n - translationX), Math.round(m0Var.f52063r - translationY), Math.round(m0Var.f52064s - translationX), Math.round(m0Var.v - translationY), m0Var.f52065w);
                return;
            default:
                int height = view.getHeight();
                m0 m0Var2 = this.f52044b;
                int i10 = m0Var2.U;
                outline.setRoundRect(m0Var2.T, i10, view.getWidth() - m0Var2.T, view.getHeight() - m0Var2.V, ((height - i10) - m0Var2.V) / 2.0f);
                return;
        }
    }
}
