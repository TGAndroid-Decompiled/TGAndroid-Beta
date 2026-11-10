package yf;

import bi.j0;
import java.io.File;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class e implements ls {
    public final int f59425a;
    public final String f59426b;
    public boolean f59427c;

    public e(String str, int i7) {
        this.f59425a = i7;
        this.f59426b = str;
        qs.f(i7).b(this, qs.U1);
        qs.f(i7).b(this, qs.V1);
        w7.G(i7).h0(false, 50331648, str, true);
    }

    public final void a() {
        int i7 = this.f59425a;
        qs.f(i7).n(this, qs.U1);
        qs.f(i7).n(this, qs.V1);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.U1) {
            String str = (String) objArr[0];
            if (!this.f59427c && str.equals(this.f59426b)) {
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
                ConnectionsManager.getInstance(this.f59425a).sendRequest(uploadringtone, new j0(this, 27));
            }
        }
    }
}
