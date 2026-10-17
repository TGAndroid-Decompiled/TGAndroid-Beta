package wf;

import ai.h;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d implements NotificationCenter.NotificationCenterDelegate {
    public final int f48960a;
    public final String f48961b;
    public boolean f48962c;

    public d(String str, int i10) {
        this.f48960a = i10;
        this.f48961b = str;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
        FileLoader.getInstance(i10).uploadFile(str, false, true, 50331648);
    }

    public final void a() {
        int i10 = this.f48960a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            if (!this.f48962c && str.equals(this.f48961b)) {
                TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
                TL_account.uploadRingtone uploadringtone = new TL_account.uploadRingtone();
                uploadringtone.file = inputFile;
                uploadringtone.file_name = inputFile.name;
                String fileExtension = FileLoader.getFileExtension(new File(inputFile.name));
                uploadringtone.mime_type = fileExtension;
                if ("ogg".equals(fileExtension)) {
                    uploadringtone.mime_type = "audio/ogg";
                } else {
                    uploadringtone.mime_type = "audio/mpeg";
                }
                ConnectionsManager.getInstance(this.f48960a).sendRequest(uploadringtone, new h(this, 29));
            }
        }
    }
}
