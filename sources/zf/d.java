package zf;

import ci.d0;
import java.io.File;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d implements cs {
    public final int f60458a;
    public final String f60459b;
    public boolean f60460c;

    public d(String str, int i3) {
        this.f60458a = i3;
        this.f60459b = str;
        hs.f(i3).b(this, hs.U1);
        hs.f(i3).b(this, hs.V1);
        w7.G(i3).i0(false, 50331648, str, true);
    }

    public final void a() {
        int i3 = this.f60458a;
        hs.f(i3).n(this, hs.U1);
        hs.f(i3).n(this, hs.V1);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.U1) {
            String str = (String) objArr[0];
            if (!this.f60460c && str.equals(this.f60459b)) {
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
                ConnectionsManager.getInstance(this.f60458a).sendRequest(uploadringtone, new d0(this, 27));
            }
        }
    }
}
