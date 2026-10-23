package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yj0 extends org.telegram.ui.ActionBar.k5 {
    public final NotificationsCustomSettingsActivity f43888r;

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f43888r = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43888r;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33510f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33509c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33507a.setAdapter(notificationsCustomSettingsActivity.f33508b);
        notificationsCustomSettingsActivity.f33508b.l();
        notificationsCustomSettingsActivity.f33507a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33507a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33509c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43888r;
        notificationsCustomSettingsActivity.f33510f = true;
        notificationsCustomSettingsActivity.f33509c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43888r;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33507a != null) {
                notificationsCustomSettingsActivity.f33509c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33509c.b();
                notificationsCustomSettingsActivity.f33507a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33507a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33507a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
