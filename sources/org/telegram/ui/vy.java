package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vy implements org.telegram.ui.Components.nl0 {
    public final Rect f38848a = new Rect();
    public final zy f38849b;

    public vy(zy zyVar) {
        this.f38849b = zyVar;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        zy zyVar = this.f38849b;
        if (zyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f38848a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new uy(this, i10, 0));
                zyVar.showDialog(alertDialog$Builder.f18662a);
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
