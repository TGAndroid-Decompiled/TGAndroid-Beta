package zh;

import android.util.LongSparseArray;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u0 {
    public static final u0[] d = new u0[4];
    public final int f52152a;
    public final LongSparseArray f52153b = new LongSparseArray();
    public boolean f52154c;

    public u0(int i10) {
        this.f52152a = i10;
    }

    public static byte[] b(TLObject tLObject) {
        try {
            SerializedData serializedData = new SerializedData(tLObject.getObjectSize());
            tLObject.serializeToStream(serializedData);
            byte[] byteArray = serializedData.toByteArray();
            serializedData.cleanup();
            return byteArray;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void a(long j10, TLRPC.ShareTheme shareTheme) {
        this.f52153b.put(j10, shareTheme);
        int i10 = this.f52152a;
        if (j10 == UserConfig.getInstance(i10).getClientUserId()) {
            this.f52154c = true;
            byte[] b10 = b(shareTheme);
            if (b10 != null) {
                MessagesController.getMainSettings(i10).edit().putString("qrShareTheme", Utilities.bytesToHex(b10)).apply();
            }
        }
    }
}
