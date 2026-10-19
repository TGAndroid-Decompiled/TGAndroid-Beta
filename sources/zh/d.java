package zh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class d {
    public static final d[] f51956f = new d[4];
    public final int f51957a;
    public TLRPC.TL_shareThemeBackdrops f51958b;
    public boolean f51959c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public d(int i10) {
        this.f51957a = i10;
        String string = MessagesController.getMainSettings(i10).getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.f51958b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}
