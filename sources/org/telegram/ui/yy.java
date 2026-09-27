package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yy implements org.telegram.ui.Components.pl0 {
    public final Rect f40352a = new Rect();
    public final cz f40353b;

    public yy(cz czVar) {
        this.f40353b = czVar;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        cz czVar = this.f40353b;
        if (czVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f40352a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(czVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new xy(this, i10, 0));
                czVar.showDialog(alertDialog$Builder.f18655a);
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
