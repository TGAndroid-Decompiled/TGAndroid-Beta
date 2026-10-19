package sh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class d extends rh.e {
    public final MediaController.PhotoEntry f46534b;
    public final SendMessagesHelper.SendingMediaInfo f46535c;

    public d(org.telegram.messenger.SendMessagesHelper.SendingMediaInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: sh.d.<init>(org.telegram.messenger.SendMessagesHelper$SendingMediaInfo):void");
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f45747a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}
