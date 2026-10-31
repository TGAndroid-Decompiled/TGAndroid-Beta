package qh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.vp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class e {
    public static final e[] f45595f = new e[4];
    public final int f45596a;
    public TLRPC.TL_shareThemeBackdrops f45597b;
    public boolean f45598c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public e(int i10) {
        this.f45596a = i10;
        String string = vp.r1(i10).f7.getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.f45597b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }
}
