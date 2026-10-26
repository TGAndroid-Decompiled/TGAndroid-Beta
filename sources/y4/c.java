package y4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f51991a;

    public c(Drawable.ConstantState constantState) {
        this.f51991a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f51991a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f51991a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f51991a.newDrawable();
        dVar.f27245b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f51991a.newDrawable(resources);
        dVar.f27245b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f51991a.newDrawable(resources, theme);
        dVar.f27245b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }
}
