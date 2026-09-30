package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f41738a;
    public String f41739b;
    public String f41740c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41741f;
    public TLRPC.InputFile f41742g;
    public boolean h;
    public long f41743i;
    public TLRPC.StickerSet f41744j;
    public TLRPC.Document f41745k;
    public String f41746l;
    public Utilities.Callback2 f41747m;
    public Utilities.Callback f41748n;
    public boolean f41749o;
    public ArrayList f41750p;
    public ArrayList f41751q;
    public MessageObject f41752r;
    public VideoEditedInfo f41753s;
    public float f41754t;
    public float f41755u;

    public final void a() {
        ArrayList arrayList = this.f41751q;
        ArrayList arrayList2 = this.f41750p;
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
        if (this.f41747m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41753s == null) {
            return f7 * this.f41755u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41755u, 0.5f, this.f41754t * 0.5f, f7);
    }
}
