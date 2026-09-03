package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ti1 extends org.telegram.ui.ActionBar.i5 {
    public final WallpapersListActivity f41580f;

    public ti1(WallpapersListActivity wallpapersListActivity) {
        this.f41580f = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f41580f;
        yi1 yi1Var = wallpapersListActivity.G;
        yi1Var.f43636n = null;
        yi1Var.E(null, true);
        wallpapersListActivity.I.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f41580f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.F);
        wallpapersListActivity.E.invalidate();
        wallpapersListActivity.G.E(null, true);
        wallpapersListActivity.I.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f41580f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.E.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f41580f.G.E(editText.getText().toString(), false);
    }
}
