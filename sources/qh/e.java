package qh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.wp;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
public final class e {
    public static final e[] f45606f = new e[4];
    public final int f45607a;
    public TLRPC.TL_shareThemeBackdrops f45608b;
    public boolean f45609c;
    public boolean d;
    public final ArrayList e = new ArrayList();

    public e(int i10) {
        this.f45607a = i10;
        String string = wp.r1(i10).f7.getString("qrBackdrops", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                SerializedData serializedData = new SerializedData(Utilities.v(string));
                TLRPC.ShareThemeBackdrops TLdeserialize = TLRPC.ShareThemeBackdrops.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                if (TLdeserialize instanceof TLRPC.TL_shareThemeBackdrops) {
                    this.f45608b = (TLRPC.TL_shareThemeBackdrops) TLdeserialize;
                }
                serializedData.cleanup();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
    }
}
