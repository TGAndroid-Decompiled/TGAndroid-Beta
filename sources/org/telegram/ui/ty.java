package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ty implements org.telegram.ui.Components.ll0 {
    public final Rect f38776a = new Rect();
    public final xy f38777b;

    public ty(xy xyVar) {
        this.f38777b = xyVar;
    }

    @Override
    public final boolean mo18c(float f10, float f11, int i10, View view) {
        xy xyVar = this.f38777b;
        if (xyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f38776a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new sy(this, i10, 0));
                xyVar.showDialog(alertDialog$Builder.f19503a);
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
