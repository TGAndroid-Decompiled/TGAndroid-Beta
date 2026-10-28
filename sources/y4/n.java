package y4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class n extends Drawable.ConstantState {
    public final Drawable.ConstantState f52094a;

    public n(Drawable.ConstantState constantState) {
        this.f52094a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f52094a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f52094a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        o oVar = new o();
        oVar.f27238b = (VectorDrawable) this.f52094a.newDrawable();
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        o oVar = new o();
        oVar.f27238b = (VectorDrawable) this.f52094a.newDrawable(resources);
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o oVar = new o();
        oVar.f27238b = (VectorDrawable) this.f52094a.newDrawable(resources, theme);
        return oVar;
    }
}
