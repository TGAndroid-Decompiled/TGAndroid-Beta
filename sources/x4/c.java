package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f50602a;

    public c(Drawable.ConstantState constantState) {
        this.f50602a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f50602a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f50602a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f50602a.newDrawable();
        dVar.f27116b = newDrawable;
        newDrawable.setCallback(dVar.f50604e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f50602a.newDrawable(resources);
        dVar.f27116b = newDrawable;
        newDrawable.setCallback(dVar.f50604e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f50602a.newDrawable(resources, theme);
        dVar.f27116b = newDrawable;
        newDrawable.setCallback(dVar.f50604e);
        return dVar;
    }
}
