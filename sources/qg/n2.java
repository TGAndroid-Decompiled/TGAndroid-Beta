package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class n2 {
    public String f41480a;
    public String f41481b;
    public String f41482c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41483f;
    public TLRPC.InputFile f41484g;
    public boolean h;
    public long f41485i;
    public TLRPC.StickerSet f41486j;
    public TLRPC.Document f41487k;
    public String f41488l;
    public Utilities.Callback2 f41489m;
    public Utilities.Callback f41490n;
    public boolean f41491o;
    public ArrayList f41492p;
    public ArrayList f41493q;
    public MessageObject f41494r;
    public VideoEditedInfo f41495s;
    public float f41496t;
    public float f41497u;

    public final void a() {
        ArrayList arrayList = this.f41493q;
        ArrayList arrayList2 = this.f41492p;
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
        if (this.f41489m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41495s == null) {
            return f7 * this.f41497u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41497u, 0.5f, this.f41496t * 0.5f, f7);
    }
}
