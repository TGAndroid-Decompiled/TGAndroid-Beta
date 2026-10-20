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
        notificationsCustomSettingsActivity.f33208f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33207c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33205a.setAdapter(notificationsCustomSettingsActivity.f33206b);
        notificationsCustomSettingsActivity.f33206b.l();
        notificationsCustomSettingsActivity.f33205a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33205a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33207c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41691r;
        notificationsCustomSettingsActivity.f33208f = true;
        notificationsCustomSettingsActivity.f33207c.setShowAtCenter(true);
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
            if (notificationsCustomSettingsActivity.f33205a != null) {
                notificationsCustomSettingsActivity.f33207c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33207c.b();
                notificationsCustomSettingsActivity.f33205a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33205a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33205a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
