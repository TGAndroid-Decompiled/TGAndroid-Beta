package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tj0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f41694r;

    public tj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f41694r = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41694r;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33212f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33211c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33209a.setAdapter(notificationsCustomSettingsActivity.f33210b);
        notificationsCustomSettingsActivity.f33210b.l();
        notificationsCustomSettingsActivity.f33209a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33209a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33211c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41694r;
        notificationsCustomSettingsActivity.f33212f = true;
        notificationsCustomSettingsActivity.f33211c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41694r;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33209a != null) {
                notificationsCustomSettingsActivity.f33211c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33211c.b();
                notificationsCustomSettingsActivity.f33209a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33209a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33209a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
