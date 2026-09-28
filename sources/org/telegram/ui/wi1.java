package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wi1 extends org.telegram.ui.ActionBar.e5 {
    public final WallpapersListActivity f39376f;

    public wi1(WallpapersListActivity wallpapersListActivity) {
        this.f39376f = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f39376f;
        bj1 bj1Var = wallpapersListActivity.J;
        bj1Var.f32439n = null;
        bj1Var.E(null, true);
        wallpapersListActivity.L.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f39376f;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.I);
        wallpapersListActivity.H.invalidate();
        wallpapersListActivity.J.E(null, true);
        wallpapersListActivity.L.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f39376f;
        wallpapersListActivity.H.setAdapter(wallpapersListActivity.J);
        wallpapersListActivity.H.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f39376f.J.E(editText.getText().toString(), false);
    }
}
