package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uy implements org.telegram.ui.Components.ml0 {
    public final Rect f42063a = new Rect();
    public final yy f42064b;

    public uy(yy yyVar) {
        this.f42064b = yyVar;
    }

    @Override
    public final boolean mo17c(float f10, float f11, int i10, View view) {
        yy yyVar = this.f42064b;
        if (yyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f42063a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new ty(this, i10, 0));
                yyVar.showDialog(alertDialog$Builder.f21166a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void p(float f10) {
    }
}
