package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zj0 extends org.telegram.ui.ActionBar.h5 {
    public final NotificationsCustomSettingsActivity f40817f;

    public zj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f40817f = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40817f;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f31665f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f31664c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f31662a.setAdapter(notificationsCustomSettingsActivity.f31663b);
        notificationsCustomSettingsActivity.f31663b.l();
        notificationsCustomSettingsActivity.f31662a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f31662a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f31664c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40817f;
        notificationsCustomSettingsActivity.f31665f = true;
        notificationsCustomSettingsActivity.f31664c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f40817f;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f31662a != null) {
                notificationsCustomSettingsActivity.f31664c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f31664c.b();
                notificationsCustomSettingsActivity.f31662a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f31662a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f31662a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
