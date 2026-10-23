package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f49684a;

    public c(Drawable.ConstantState constantState) {
        this.f49684a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f49684a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f49684a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f49684a.newDrawable();
        dVar.f24829b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f49684a.newDrawable(resources);
        dVar.f24829b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f49684a.newDrawable(resources, theme);
        dVar.f24829b = newDrawable;
        newDrawable.setCallback(dVar.e);
        return dVar;
    }
}
