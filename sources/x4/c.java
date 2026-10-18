package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f49232a;

    public c(Drawable.ConstantState constantState) {
        this.f49232a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f49232a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f49232a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f49232a.newDrawable();
        dVar.f25027b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f49232a.newDrawable(resources);
        dVar.f25027b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f49232a.newDrawable(resources, theme);
        dVar.f25027b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }
}
