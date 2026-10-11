package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xy implements org.telegram.ui.Components.jm0 {
    public final Rect f44200a = new Rect();
    public final bz f44201b;

    public xy(bz bzVar) {
        this.f44201b = bzVar;
    }

    @Override
    public final boolean mo17c(float f7, float f10, int i10, View view) {
        bz bzVar = this.f44201b;
        if (bzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f44200a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bzVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new wy(this, i10, 0));
                bzVar.showDialog(alertDialog$Builder.f20368a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void q(float f7) {
    }
}
