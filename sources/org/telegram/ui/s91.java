package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s91 implements View.OnClickListener {
    public final Context f39735a;

    public s91(Activity activity) {
        this.f39735a = activity;
    }

    @Override
    public final void onClick(View view) {
        pf.d.r(this.f39735a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
