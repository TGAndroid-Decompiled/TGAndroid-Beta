package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f41735a;
    public String f41736b;
    public String f41737c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41738f;
    public TLRPC.InputFile f41739g;
    public boolean h;
    public long f41740i;
    public TLRPC.StickerSet f41741j;
    public TLRPC.Document f41742k;
    public String f41743l;
    public Utilities.Callback2 f41744m;
    public Utilities.Callback f41745n;
    public boolean f41746o;
    public ArrayList f41747p;
    public ArrayList f41748q;
    public MessageObject f41749r;
    public VideoEditedInfo f41750s;
    public float f41751t;
    public float f41752u;

    public final void a() {
        ArrayList arrayList = this.f41748q;
        ArrayList arrayList2 = this.f41747p;
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
        if (this.f41744m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41750s == null) {
            return f7 * this.f41752u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41752u, 0.5f, this.f41751t * 0.5f, f7);
    }
}
