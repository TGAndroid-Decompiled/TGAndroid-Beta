package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t81 implements View.OnClickListener {
    public final Context f41528a;

    public t81(Activity activity) {
        this.f41528a = activity;
    }

    @Override
    public final void onClick(View view) {
        af.g.s(this.f41528a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
