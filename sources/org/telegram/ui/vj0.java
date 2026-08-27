package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class vj0 extends org.telegram.ui.ActionBar.e5 {

    public final NotificationsCustomSettingsActivity f43479f;

    public vj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f43479f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43479f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f35550f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f35548c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f35546a.setAdapter(notificationsCustomSettingsActivity.f35547b);
        notificationsCustomSettingsActivity.f35547b.l();
        notificationsCustomSettingsActivity.f35546a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f35546a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f35548c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43479f;
        notificationsCustomSettingsActivity.f35550f = true;
        notificationsCustomSettingsActivity.f35548c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43479f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String string = editText.getText().toString();
        if (string.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f35546a != null) {
                notificationsCustomSettingsActivity.f35548c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f35548c.b();
                notificationsCustomSettingsActivity.f35546a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f35546a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f35546a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(string);
    }
}
