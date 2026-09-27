package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ui1 extends org.telegram.ui.ActionBar.g5 {
    public final WallpapersListActivity f38266f;

    public ui1(WallpapersListActivity wallpapersListActivity) {
        this.f38266f = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f38266f;
        zi1 zi1Var = wallpapersListActivity.H;
        zi1Var.f40538n = null;
        zi1Var.E(null, true);
        wallpapersListActivity.J.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f38266f;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.F.invalidate();
        wallpapersListActivity.H.E(null, true);
        wallpapersListActivity.J.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f38266f;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
        wallpapersListActivity.F.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f38266f.H.E(editText.getText().toString(), false);
    }
}
