package x4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class o extends Drawable.ConstantState {
    public final Drawable.ConstantState f48910a;

    public o(Drawable.ConstantState constantState) {
        this.f48910a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f48910a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f48910a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f48864a = (VectorDrawable) this.f48910a.newDrawable();
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f48864a = (VectorDrawable) this.f48910a.newDrawable(resources);
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f48864a = (VectorDrawable) this.f48910a.newDrawable(resources, theme);
        return pVar;
    }
}
