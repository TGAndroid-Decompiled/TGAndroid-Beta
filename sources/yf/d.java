package yf;

import bi.j0;
import java.io.File;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class d implements ls {
    public final int f59295a;
    public final String f59296b;
    public boolean f59297c;

    public d(String str, int i7) {
        this.f59295a = i7;
        this.f59296b = str;
        qs.f(i7).b(this, qs.U1);
        qs.f(i7).b(this, qs.V1);
        w7.G(i7).i0(false, 50331648, str, true);
    }

    public final void a() {
        int i7 = this.f59295a;
        qs.f(i7).n(this, qs.U1);
        qs.f(i7).n(this, qs.V1);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.U1) {
            String str = (String) objArr[0];
            if (!this.f59297c && str.equals(this.f59296b)) {
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
                ConnectionsManager.getInstance(this.f59295a).sendRequest(uploadringtone, new j0(this, 27));
            }
        }
    }
}
