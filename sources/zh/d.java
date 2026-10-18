package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import yh.t3;
public final class d {
    public static final d[] f51658f = new d[4];
    public final int f51659a;
    public TLRPC.TL_shareThemeBackdrops f51660b;
    public boolean f51661c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public d(int i10) {
        this.f51659a = i10;
        String string = MessagesController.getMainSettings(i10).getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.f51660b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void a(Runnable runnable) {
        int i10;
        if (this.d) {
            runnable.run();
            return;
        }
        this.e.add(runnable);
        if (this.f51661c) {
            return;
        }
        this.f51661c = true;
        TLRPC.TL_messages_getShareThemeBackdrops tL_messages_getShareThemeBackdrops = new TLRPC.TL_messages_getShareThemeBackdrops();
        TLRPC.TL_shareThemeBackdrops tL_shareThemeBackdrops = this.f51660b;
        if (tL_shareThemeBackdrops != null) {
            i10 = tL_shareThemeBackdrops.hash;
        } else {
            i10 = 0;
        }
        tL_messages_getShareThemeBackdrops.hash = i10;
        ConnectionsManager.getInstance(this.f51659a).sendRequestTyped(tL_messages_getShareThemeBackdrops, new Object(), new t3(this, 2));
    }
}
