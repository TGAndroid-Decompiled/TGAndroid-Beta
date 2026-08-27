package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class uh1 extends org.telegram.ui.ActionBar.e5 {

    public final WallpapersListActivity f43232f;

    public uh1(WallpapersListActivity wallpapersListActivity) {
        this.f43232f = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f43232f;
        ai1 ai1Var = wallpapersListActivity.F;
        ai1Var.f36545n = null;
        ai1Var.E(null, true);
        wallpapersListActivity.H.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f43232f;
        wallpapersListActivity.D.setAdapter(wallpapersListActivity.E);
        wallpapersListActivity.D.invalidate();
        wallpapersListActivity.F.E(null, true);
        wallpapersListActivity.H.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f43232f;
        wallpapersListActivity.D.setAdapter(wallpapersListActivity.F);
        wallpapersListActivity.D.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f43232f.F.E(editText.getText().toString(), false);
    }
}
