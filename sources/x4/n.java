package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class n extends Drawable.ConstantState {
    public final Drawable.ConstantState f49277a;

    public n(Drawable.ConstantState constantState) {
        this.f49277a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f49277a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f49277a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        o oVar = new o();
        oVar.f25027b = (VectorDrawable) this.f49277a.newDrawable();
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        o oVar = new o();
        oVar.f25027b = (VectorDrawable) this.f49277a.newDrawable(resources);
        return oVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        o oVar = new o();
        oVar.f25027b = (VectorDrawable) this.f49277a.newDrawable(resources, theme);
        return oVar;
    }
}
