package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z81 implements View.OnClickListener {
    public final Context f43854a;

    public z81(Activity activity) {
        this.f43854a = activity;
    }

    @Override
    public final void onClick(View view) {
        af.g.s(this.f43854a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
