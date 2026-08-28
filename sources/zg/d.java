package zg;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
public final class d extends yg.e {
    public final MediaController.PhotoEntry f50830b;
    public final SendMessagesHelper.SendingMediaInfo f50831c;

    public d(org.telegram.messenger.SendMessagesHelper.SendingMediaInfo r10) {
        throw new UnsupportedOperationException("Method not decompiled: zg.d.<init>(org.telegram.messenger.SendMessagesHelper$SendingMediaInfo):void");
    }

    @Override
    public final void c(Canvas canvas, int i9, int i10) {
        ImageReceiver imageReceiver = this.f50222a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i9, i10);
        imageReceiver.draw(canvas);
    }
}
