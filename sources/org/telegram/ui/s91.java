package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s91 implements View.OnClickListener {
    public final Context f40011a;

    public s91(Activity activity) {
        this.f40011a = activity;
    }

    @Override
    public final void onClick(View view) {
        pf.d.s(this.f40011a, LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
    }
}
