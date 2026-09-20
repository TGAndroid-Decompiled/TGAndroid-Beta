package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ye1 extends org.telegram.ui.Components.aw0 {
    public boolean f39897w0;

    @Override
    public final void onMeasure(int i10, int i11) {
        R();
        if (getKeyboardHeight() == 0 && !this.f39897w0) {
            int i12 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
            this.f22789f = i12;
            setPadding(0, 0, 0, i12);
        } else {
            this.f39897w0 = true;
            setPadding(0, 0, 0, 0);
        }
        super.onMeasure(i10, i11);
    }
}
