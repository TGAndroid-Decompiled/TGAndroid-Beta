package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rj0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f42125f;

    public rj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f42125f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42125f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f35614f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f35612c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f35610a.setAdapter(notificationsCustomSettingsActivity.f35611b);
        notificationsCustomSettingsActivity.f35611b.l();
        notificationsCustomSettingsActivity.f35610a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f35610a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f35612c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42125f;
        notificationsCustomSettingsActivity.f35614f = true;
        notificationsCustomSettingsActivity.f35612c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42125f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f35610a != null) {
                notificationsCustomSettingsActivity.f35612c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f35612c.b();
                notificationsCustomSettingsActivity.f35610a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f35610a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f35610a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
