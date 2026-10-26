package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh1 extends org.telegram.ui.ActionBar.s0 {
    public final WallpapersListActivity f46303a;

    public zh1(WallpapersListActivity wallpapersListActivity) {
        this.f46303a = wallpapersListActivity;
    }

    @Override
    public final void f() {
        WallpapersListActivity wallpapersListActivity = this.f46303a;
        ei1 ei1Var = wallpapersListActivity.H;
        ei1Var.f39119n = null;
        ei1Var.E(null, true);
        wallpapersListActivity.J.setSearchFieldHint(LocaleController.getString(R.string.SearchBackgrounds));
    }

    @Override
    public final void h() {
        WallpapersListActivity wallpapersListActivity = this.f46303a;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.G);
        wallpapersListActivity.F.invalidate();
        wallpapersListActivity.H.E(null, true);
        wallpapersListActivity.J.setSearchFieldCaption(null);
        f();
    }

    @Override
    public final void i() {
        WallpapersListActivity wallpapersListActivity = this.f46303a;
        wallpapersListActivity.F.setAdapter(wallpapersListActivity.H);
        wallpapersListActivity.F.invalidate();
    }

    @Override
    public final void l(EditText editText) {
        this.f46303a.H.E(editText.getText().toString(), false);
    }
}
