package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wi1 extends org.telegram.ui.ActionBar.f5 {
    public final WallpapersListActivity f42510f;

    public wi1(WallpapersListActivity wallpapersListActivity) {
        this.f42510f = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f42510f;
        bj1 bj1Var = wallpapersListActivity.H;
        bj1Var.f35132n = null;
        bj1Var.E(null, true);
        wallpapersListActivity.J.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f42510f;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.F.invalidate();
        wallpapersListActivity.H.E(null, true);
        wallpapersListActivity.J.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f42510f;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
        wallpapersListActivity.F.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f42510f.H.E(editText.getText().toString(), false);
    }
}
