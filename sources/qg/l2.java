package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f41722a;
    public String f41723b;
    public String f41724c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41725f;
    public TLRPC.InputFile f41726g;
    public boolean h;
    public long f41727i;
    public TLRPC.StickerSet f41728j;
    public TLRPC.Document f41729k;
    public String f41730l;
    public Utilities.Callback2 f41731m;
    public Utilities.Callback f41732n;
    public boolean f41733o;
    public ArrayList f41734p;
    public ArrayList f41735q;
    public MessageObject f41736r;
    public VideoEditedInfo f41737s;
    public float f41738t;
    public float f41739u;

    public final void a() {
        ArrayList arrayList = this.f41735q;
        ArrayList arrayList2 = this.f41734p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            try {
                ((File) obj2).delete();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f7;
        if (this.f41731m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41737s == null) {
            return f7 * this.f41739u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41739u, 0.5f, this.f41738t * 0.5f, f7);
    }
}
