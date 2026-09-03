package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vy implements org.telegram.ui.Components.kl0 {
    public final Rect f39219a = new Rect();
    public final zy f39220b;

    public vy(zy zyVar) {
        this.f39220b = zyVar;
    }

    @Override
    public final boolean mo17c(float f10, float f11, int i10, View view) {
        zy zyVar = this.f39220b;
        if (zyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
            Rect rect = this.f39219a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new uy(this, i10, 0));
                zyVar.showDialog(alertDialog$Builder.f19478a);
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
