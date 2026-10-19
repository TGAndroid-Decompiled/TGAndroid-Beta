package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class k0 extends ViewOutlineProvider {
    public final int f52017a;
    public final m0 f52018b;

    public k0(m0 m0Var, int i10) {
        this.f52017a = i10;
        this.f52018b = m0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f52017a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                m0 m0Var = this.f52018b;
                outline.setRoundRect(Math.round(m0Var.f52042n - translationX), Math.round(m0Var.f52047r - translationY), Math.round(m0Var.f52049s - translationX), Math.round(m0Var.v - translationY), m0Var.f52050w);
                return;
            default:
                int height = view.getHeight();
                m0 m0Var2 = this.f52018b;
                int i10 = m0Var2.f52029b0;
                outline.setRoundRect(m0Var2.f52027a0, i10, view.getWidth() - m0Var2.f52027a0, view.getHeight() - m0Var2.f52031c0, ((height - i10) - m0Var2.f52031c0) / 2.0f);
                return;
        }
    }
}
