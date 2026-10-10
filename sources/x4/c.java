package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f50648a;

    public c(Drawable.ConstantState constantState) {
        this.f50648a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f50648a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f50648a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f50648a.newDrawable();
        dVar.f27132b = newDrawable;
        newDrawable.setCallback(dVar.f50650e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f50648a.newDrawable(resources);
        dVar.f27132b = newDrawable;
        newDrawable.setCallback(dVar.f50650e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f50648a.newDrawable(resources, theme);
        dVar.f27132b = newDrawable;
        newDrawable.setCallback(dVar.f50650e);
        return dVar;
    }
}
