package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f47846a;

    public c(Drawable.ConstantState constantState) {
        this.f47846a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f47846a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f47846a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f47846a.newDrawable();
        dVar.f24769b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f47846a.newDrawable(resources);
        dVar.f24769b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f47846a.newDrawable(resources, theme);
        dVar.f24769b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }
}
