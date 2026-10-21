package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tj0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f41691r;

    public tj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f41691r = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41691r;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33209f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33208c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33206a.setAdapter(notificationsCustomSettingsActivity.f33207b);
        notificationsCustomSettingsActivity.f33207b.l();
        notificationsCustomSettingsActivity.f33206a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33206a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33208c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41691r;
        notificationsCustomSettingsActivity.f33209f = true;
        notificationsCustomSettingsActivity.f33208c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41691r;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33206a != null) {
                notificationsCustomSettingsActivity.f33208c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33208c.b();
                notificationsCustomSettingsActivity.f33206a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33206a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33206a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
