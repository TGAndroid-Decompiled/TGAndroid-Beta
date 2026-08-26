package org.telegram.ui.web;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.MultiContactsSelectorBottomSheet;
import org.telegram.ui.TopicsFragment;

public final class BotWebViewContainer$$ExternalSyntheticLambda11 implements MultiContactsSelectorBottomSheet.SelectorListener, DialogsActivity.DialogsActivityDelegate {
    public final BotWebViewContainer f$0;
    public final boolean[] f$1;
    public final String f$2;
    public final TL_keyboard.TL_buttonTypeRequestPeer f$3;

    public BotWebViewContainer$$ExternalSyntheticLambda11(BotWebViewContainer botWebViewContainer, boolean[] zArr, String str, TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer) {
        this.f$0 = botWebViewContainer;
        this.f$1 = zArr;
        this.f$2 = str;
        this.f$3 = tL_buttonTypeRequestPeer;
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        return this.f$0.lambda$onEventReceived$56(this.f$1, this.f$2, this.f$3, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void onUserSelected(List list) {
        this.f$0.lambda$onEventReceived$53(this.f$1, this.f$2, this.f$3, list);
    }
}
