package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tj0 extends org.telegram.ui.ActionBar.g5 {
    public final NotificationsCustomSettingsActivity f41695r;

    public tj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity) {
        this.f41695r = notificationsCustomSettingsActivity;
    }

    @Override
    public final void m() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41695r;
        notificationsCustomSettingsActivity.d.F(null);
        notificationsCustomSettingsActivity.f33213f = false;
        notificationsCustomSettingsActivity.getClass();
        notificationsCustomSettingsActivity.f33212c.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        notificationsCustomSettingsActivity.f33210a.setAdapter(notificationsCustomSettingsActivity.f33211b);
        notificationsCustomSettingsActivity.f33211b.l();
        notificationsCustomSettingsActivity.f33210a.setFastScrollVisible(true);
        notificationsCustomSettingsActivity.f33210a.setVerticalScrollBarEnabled(false);
        notificationsCustomSettingsActivity.f33212c.setShowAtCenter(false);
    }

    @Override
    public final void n() {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41695r;
        notificationsCustomSettingsActivity.f33213f = true;
        notificationsCustomSettingsActivity.f33212c.setShowAtCenter(true);
    }

    @Override
    public final void q(EditText editText) {
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41695r;
        if (notificationsCustomSettingsActivity.d == null) {
            return;
        }
        String obj = editText.getText().toString();
        if (obj.length() != 0) {
            notificationsCustomSettingsActivity.getClass();
            if (notificationsCustomSettingsActivity.f33210a != null) {
                notificationsCustomSettingsActivity.f33212c.setText(LocaleController.getString("NoResult", R.string.NoResult));
                notificationsCustomSettingsActivity.f33212c.b();
                notificationsCustomSettingsActivity.f33210a.setAdapter(notificationsCustomSettingsActivity.d);
                notificationsCustomSettingsActivity.d.l();
                notificationsCustomSettingsActivity.f33210a.setFastScrollVisible(false);
                notificationsCustomSettingsActivity.f33210a.setVerticalScrollBarEnabled(true);
            }
        }
        notificationsCustomSettingsActivity.d.F(obj);
    }
}
