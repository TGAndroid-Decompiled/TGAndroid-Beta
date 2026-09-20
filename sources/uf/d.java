package uf;

import ai.m8;
import java.io.File;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d implements NotificationCenter.NotificationCenterDelegate {
    public final int f44001a;
    public final String f44002b;
    public boolean f44003c;

    public d(String str, int i10) {
        this.f44001a = i10;
        this.f44002b = str;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileUploadFailed);
        FileLoader.getInstance(i10).uploadFile(str, false, true, 50331648);
    }

    public final void a() {
        int i10 = this.f44001a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            if (!this.f44003c && str.equals(this.f44002b)) {
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
                ConnectionsManager.getInstance(this.f44001a).sendRequest(uploadringtone, new m8(this, 23));
            }
        }
    }
}
