package z4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class n extends Drawable.ConstantState {
    public final Drawable.ConstantState f59757a;

    public n(Drawable.ConstantState constantState) {
        this.f59757a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f59757a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f59757a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        o oVar = new o();
        oVar.f40801b = (VectorDrawable) this.f59757a.newDrawable();
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        o oVar = new o();
        oVar.f40801b = (VectorDrawable) this.f59757a.newDrawable(resources);
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o oVar = new o();
        oVar.f40801b = (VectorDrawable) this.f59757a.newDrawable(resources, theme);
        return oVar;
    }
}
