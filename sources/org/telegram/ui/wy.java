package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wy implements org.telegram.ui.Components.dl0 {
    public final Rect f39125a = new Rect();
    public final az f39126b;

    public wy(az azVar) {
        this.f39126b = azVar;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        az azVar = this.f39126b;
        if (azVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f39125a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(azVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new vy(this, i10, 0));
                azVar.showDialog(alertDialog$Builder.f18409a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g() {
    }

    @Override
    public final void q(float f7) {
    }
}
