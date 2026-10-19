package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tj0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f41685r;

    public tj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f41685r = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41685r;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33202f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33201c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33199a.setAdapter(notificationsCustomSettingsActivity.f33200b);
        notificationsCustomSettingsActivity.f33200b.l();
        notificationsCustomSettingsActivity.f33199a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33199a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33201c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41685r;
        notificationsCustomSettingsActivity.f33202f = true;
        notificationsCustomSettingsActivity.f33201c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41685r;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33199a != null) {
                notificationsCustomSettingsActivity.f33201c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33201c.b();
                notificationsCustomSettingsActivity.f33199a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33199a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33199a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
