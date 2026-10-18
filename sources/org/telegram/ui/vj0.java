package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vj0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f42241r;

    public vj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f42241r = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42241r;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33203f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33202c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33200a.setAdapter(notificationsCustomSettingsActivity.f33201b);
        notificationsCustomSettingsActivity.f33201b.l();
        notificationsCustomSettingsActivity.f33200a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33200a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33202c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42241r;
        notificationsCustomSettingsActivity.f33203f = true;
        notificationsCustomSettingsActivity.f33202c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42241r;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33200a != null) {
                notificationsCustomSettingsActivity.f33202c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33202c.b();
                notificationsCustomSettingsActivity.f33200a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33200a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33200a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
