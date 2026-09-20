package rh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class d extends qh.e {
    public final MediaController.PhotoEntry f42889b;
    public final SendMessagesHelper.SendingMediaInfo f42890c;

    public d(org.telegram.messenger.SendMessagesHelper.SendingMediaInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: rh.d.<init>(org.telegram.messenger.SendMessagesHelper$SendingMediaInfo):void");
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f42064a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
