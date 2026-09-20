package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zy implements org.telegram.ui.Components.ml0 {
    public final Rect f40629a = new Rect();
    public final dz f40630b;

    public zy(dz dzVar) {
        this.f40630b = dzVar;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        dz dzVar = this.f40630b;
        if (dzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            Rect rect = this.f40629a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(dzVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new yy(this, i10, 0));
                dzVar.showDialog(alertDialog$Builder.f18654a);
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
