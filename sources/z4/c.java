package z4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f59707a;

    public c(Drawable.ConstantState constantState) {
        this.f59707a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f59707a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f59707a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f59707a.newDrawable();
        dVar.f40801b = newDrawable;
        newDrawable.setCallback(dVar.f59709e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f59707a.newDrawable(resources);
        dVar.f40801b = newDrawable;
        newDrawable.setCallback(dVar.f59709e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f59707a.newDrawable(resources, theme);
        dVar.f40801b = newDrawable;
        newDrawable.setCallback(dVar.f59709e);
        return dVar;
    }
}
