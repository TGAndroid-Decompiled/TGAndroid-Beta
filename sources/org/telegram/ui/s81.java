package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s81 implements View.OnClickListener {
    public final Context f38217a;

    public s81(Activity activity) {
        this.f38217a = activity;
    }

    @Override
    public final void onClick(View view) {
        af.g.s(this.f38217a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
