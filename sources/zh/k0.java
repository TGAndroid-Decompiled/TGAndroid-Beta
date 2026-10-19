package zh;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class k0 extends ViewOutlineProvider {
    public final int f52015a;
    public final m0 f52016b;

    public k0(m0 m0Var, int i10) {
        this.f52015a = i10;
        this.f52016b = m0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        switch (this.f52015a) {
            case 0:
                float translationY = view.getTranslationY() + view.getTop();
                float translationX = view.getTranslationX() + view.getLeft();
                m0 m0Var = this.f52016b;
                outline.setRoundRect(Math.round(m0Var.f52040n - translationX), Math.round(m0Var.f52045r - translationY), Math.round(m0Var.f52047s - translationX), Math.round(m0Var.v - translationY), m0Var.f52048w);
                return;
            default:
                int height = view.getHeight();
                m0 m0Var2 = this.f52016b;
                int i10 = m0Var2.f52027b0;
                outline.setRoundRect(m0Var2.f52025a0, i10, view.getWidth() - m0Var2.f52025a0, view.getHeight() - m0Var2.f52029c0, ((height - i10) - m0Var2.f52029c0) / 2.0f);
                return;
        }
    }
}
