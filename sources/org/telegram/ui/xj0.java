package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xj0 extends org.telegram.ui.ActionBar.k5 {
    public final NotificationsCustomSettingsActivity f43630r;

    public xj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f43630r = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43630r;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33512f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33511c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33509a.setAdapter(notificationsCustomSettingsActivity.f33510b);
        notificationsCustomSettingsActivity.f33510b.l();
        notificationsCustomSettingsActivity.f33509a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33509a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33511c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43630r;
        notificationsCustomSettingsActivity.f33512f = true;
        notificationsCustomSettingsActivity.f33511c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43630r;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33509a != null) {
                notificationsCustomSettingsActivity.f33511c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33511c.b();
                notificationsCustomSettingsActivity.f33509a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33509a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33509a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
