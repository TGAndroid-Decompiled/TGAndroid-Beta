package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class td1 extends org.telegram.ui.Components.vw0 {
    public boolean f43809l0;

    @Override
    public final void onMeasure(int i10, int i11) {
        Q();
        if (getKeyboardHeight() == 0 && !this.f43809l0) {
            int i12 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            this.f34280f = i12;
            setPadding(0, 0, 0, i12);
        } else {
            this.f43809l0 = true;
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i10, i11);
    }
}
