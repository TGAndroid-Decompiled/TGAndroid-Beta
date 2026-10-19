package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class n extends Drawable.ConstantState {
    public final Drawable.ConstantState f49276a;

    public n(Drawable.ConstantState constantState) {
        this.f49276a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f49276a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f49276a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        o oVar = new o();
        oVar.f25011b = (VectorDrawable) this.f49276a.newDrawable();
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        o oVar = new o();
        oVar.f25011b = (VectorDrawable) this.f49276a.newDrawable(resources);
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o oVar = new o();
        oVar.f25011b = (VectorDrawable) this.f49276a.newDrawable(resources, theme);
        return oVar;
    }
}
