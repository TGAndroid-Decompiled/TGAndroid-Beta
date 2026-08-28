package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uj0 extends org.telegram.ui.ActionBar.e5 {
    public final NotificationsCustomSettingsActivity f43264f;

    public uj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f43264f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43264f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f35547f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f35545c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f35543a.setAdapter(notificationsCustomSettingsActivity.f35544b);
        notificationsCustomSettingsActivity.f35544b.l();
        notificationsCustomSettingsActivity.f35543a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f35543a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f35545c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43264f;
        notificationsCustomSettingsActivity.f35547f = true;
        notificationsCustomSettingsActivity.f35545c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43264f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f35543a != null) {
                notificationsCustomSettingsActivity.f35545c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f35545c.b();
                notificationsCustomSettingsActivity.f35543a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f35543a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f35543a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
