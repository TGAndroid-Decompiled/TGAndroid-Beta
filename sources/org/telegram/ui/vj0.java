package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vj0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f42224r;

    public vj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f42224r = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42224r;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33196f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33195c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33193a.setAdapter(notificationsCustomSettingsActivity.f33194b);
        notificationsCustomSettingsActivity.f33194b.l();
        notificationsCustomSettingsActivity.f33193a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33193a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33195c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42224r;
        notificationsCustomSettingsActivity.f33196f = true;
        notificationsCustomSettingsActivity.f33195c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f42224r;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33193a != null) {
                notificationsCustomSettingsActivity.f33195c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33195c.b();
                notificationsCustomSettingsActivity.f33193a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33193a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33193a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
