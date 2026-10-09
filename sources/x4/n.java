package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class n extends Drawable.ConstantState {
    public final Drawable.ConstantState f50652a;

    public n(Drawable.ConstantState constantState) {
        this.f50652a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f50652a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f50652a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        o oVar = new o();
        oVar.f27116b = (VectorDrawable) this.f50652a.newDrawable();
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        o oVar = new o();
        oVar.f27116b = (VectorDrawable) this.f50652a.newDrawable(resources);
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o oVar = new o();
        oVar.f27116b = (VectorDrawable) this.f50652a.newDrawable(resources, theme);
        return oVar;
    }
}
