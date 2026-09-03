package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class si1 extends org.telegram.ui.ActionBar.h5 {
    public final WallpapersListActivity f38233f;

    public si1(WallpapersListActivity wallpapersListActivity) {
        this.f38233f = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f38233f;
        xi1 xi1Var = wallpapersListActivity.G;
        xi1Var.f39999n = null;
        xi1Var.E(null, true);
        wallpapersListActivity.I.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f38233f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.F);
        wallpapersListActivity.E.invalidate();
        wallpapersListActivity.G.E(null, true);
        wallpapersListActivity.I.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f38233f;
        wallpapersListActivity.E.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.E.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f38233f.G.E(editText.getText().toString(), false);
    }
}
