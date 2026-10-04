package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class o extends Drawable.ConstantState {
    public final Drawable.ConstantState f49370a;

    public o(Drawable.ConstantState constantState) {
        this.f49370a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f49370a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f49370a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f49324a = (VectorDrawable) this.f49370a.newDrawable();
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f49324a = (VectorDrawable) this.f49370a.newDrawable(resources);
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f49324a = (VectorDrawable) this.f49370a.newDrawable(resources, theme);
        return pVar;
    }
}
