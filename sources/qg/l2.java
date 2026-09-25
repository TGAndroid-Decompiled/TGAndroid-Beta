package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f41737a;
    public String f41738b;
    public String f41739c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41740f;
    public TLRPC.InputFile f41741g;
    public boolean h;
    public long f41742i;
    public TLRPC.StickerSet f41743j;
    public TLRPC.Document f41744k;
    public String f41745l;
    public Utilities.Callback2 f41746m;
    public Utilities.Callback f41747n;
    public boolean f41748o;
    public ArrayList f41749p;
    public ArrayList f41750q;
    public MessageObject f41751r;
    public VideoEditedInfo f41752s;
    public float f41753t;
    public float f41754u;

    public final void a() {
        ArrayList arrayList = this.f41750q;
        ArrayList arrayList2 = this.f41749p;
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
        if (this.f41746m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41752s == null) {
            return f7 * this.f41754u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41754u, 0.5f, this.f41753t * 0.5f, f7);
    }
}
