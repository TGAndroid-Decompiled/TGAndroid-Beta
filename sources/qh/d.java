package qh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class d extends ph.e {
    public final MediaController.PhotoEntry f41015b;
    public final SendMessagesHelper.SendingMediaInfo f41016c;

    public d(org.telegram.messenger.SendMessagesHelper.SendingMediaInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: qh.d.<init>(org.telegram.messenger.SendMessagesHelper$SendingMediaInfo):void");
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f40408a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
