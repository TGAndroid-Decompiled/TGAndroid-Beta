package ph;

import java.io.File;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.VideoEncodingService;
import org.telegram.tgnet.TLRPC;
public final class k0 implements NotificationCenter.NotificationCenterDelegate {
    public final int f41836a;
    public final File f41837b;
    public MessageObject f41838c;
    public final i0 d;
    public final j0 e;
    public final h0 f41839f;

    public k0(int i10, u6 u6Var, File file, i0 i0Var, j0 j0Var, h0 h0Var) {
        this.f41836a = i10;
        this.f41837b = file;
        this.d = i0Var;
        this.e = j0Var;
        this.f41839f = h0Var;
        if (this.f41838c != null) {
            return;
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.filePreparingFailed);
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19205id = 1;
        tL_message.attachPath = file.getAbsolutePath();
        this.f41838c = new MessageObject(i10, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
        u6Var.s(new org.telegram.ui.web.y0(this, 5));
    }

    public final void a(boolean z4) {
        if (this.f41838c == null) {
            return;
        }
        int i10 = this.f41836a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        if (z4) {
            MediaController.getInstance().cancelVideoConvert(this.f41838c);
        }
        this.f41838c = null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            MessageObject messageObject = (MessageObject) objArr[0];
        } else if (i10 == NotificationCenter.fileNewChunkAvailable) {
            if (((MessageObject) objArr[0]) == this.f41838c) {
                String str = (String) objArr[1];
                ((Long) objArr[2]).getClass();
                long longValue = ((Long) objArr[3]).longValue();
                Float f10 = (Float) objArr[4];
                f10.getClass();
                this.e.run(f10);
                if (longValue > 0) {
                    this.d.run();
                    VideoEncodingService.stop();
                    a(false);
                }
            }
        } else if (i10 == NotificationCenter.filePreparingFailed && ((MessageObject) objArr[0]) == this.f41838c) {
            a(false);
            try {
                File file = this.f41837b;
                if (file != null) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
            this.f41839f.run();
        }
    }
}
