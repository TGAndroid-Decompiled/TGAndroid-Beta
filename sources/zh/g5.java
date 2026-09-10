package zh;

import bi.r9;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class g5 implements Utilities.Callback {
    public final int f48450a;
    public final h5 f48451b;

    public g5(h5 h5Var, int i10) {
        this.f48450a = i10;
        this.f48451b = h5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f48450a) {
            case 0:
                h5 h5Var = this.f48451b;
                r9 r9Var = h5Var.f48473c;
                r9Var.f3566c0 = (TLRPC.Document) obj;
                TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
                tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(r9Var.f3566c0);
                h5Var.c(tL_inputFileStoryDocument);
                return;
            default:
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                h5 h5Var2 = this.f48451b;
                h5Var2.F = videoEditedInfo;
                h5Var2.E.videoEditedInfo = videoEditedInfo;
                h5Var2.f48480y = videoEditedInfo.estimatedDuration / 1000;
                if (videoEditedInfo.needConvert()) {
                    MediaController.getInstance().scheduleVideoConvert(h5Var2.E, false, false, false);
                    return;
                } else if (new File(h5Var2.E.videoEditedInfo.originalPath).renameTo(new File(h5Var2.e))) {
                    FileLoader.getInstance(h5Var2.M.f48499a).uploadFile(h5Var2.e, false, false, 33554432);
                    return;
                } else {
                    return;
                }
        }
    }
}
