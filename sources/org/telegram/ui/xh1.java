package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xh1 extends org.telegram.ui.ActionBar.e5 {
    public final WallpapersListActivity f44597f;

    public xh1(WallpapersListActivity wallpapersListActivity) {
        this.f44597f = wallpapersListActivity;
    }

    @Override
    public final void k() {
        WallpapersListActivity wallpapersListActivity = this.f44597f;
        ci1 ci1Var = wallpapersListActivity.F;
        ci1Var.f37146n = null;
        ci1Var.E(null, true);
        wallpapersListActivity.H.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void m() {
        WallpapersListActivity wallpapersListActivity = this.f44597f;
        wallpapersListActivity.D.setAdapter(wallpapersListActivity.E);
        wallpapersListActivity.D.invalidate();
        wallpapersListActivity.F.E(null, true);
        wallpapersListActivity.H.setSearchFieldCaption(null);
        k();
    }

    @Override
    public final void n() {
        WallpapersListActivity wallpapersListActivity = this.f44597f;
        wallpapersListActivity.D.setAdapter(wallpapersListActivity.F);
        wallpapersListActivity.D.invalidate();
    }

    @Override
    public final void q(EditText editText) {
        this.f44597f.F.E(editText.getText().toString(), false);
    }
}
