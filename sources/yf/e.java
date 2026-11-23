package yf;

import java.io.File;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e implements fs {
    public final int f61326a;
    public final String f61327b;
    public boolean f61328c;

    public e(String str, int i7) {
        this.f61326a = i7;
        this.f61327b = str;
        ks.f(i7).b(this, ks.U1);
        ks.f(i7).b(this, ks.V1);
        w7.G(i7).h0(false, 50331648, str, true);
    }

    public final void a() {
        int i7 = this.f61326a;
        ks.f(i7).n(this, ks.U1);
        ks.f(i7).n(this, ks.V1);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.U1) {
            String str = (String) objArr[0];
            if (!this.f61328c && str.equals(this.f61327b)) {
                TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
                TL_account.uploadRingtone uploadringtone = new TL_account.uploadRingtone();
                uploadringtone.file = inputFile;
                uploadringtone.file_name = inputFile.name;
                String D = w7.D(new File(inputFile.name));
                uploadringtone.mime_type = D;
                if ("ogg".equals(D)) {
                    uploadringtone.mime_type = "audio/ogg";
                } else {
                    uploadringtone.mime_type = "audio/mpeg";
                }
                ConnectionsManager.getInstance(this.f61326a).sendRequest(uploadringtone, new d(this, 0));
            }
        }
    }
}
