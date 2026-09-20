package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f41750a;
    public String f41751b;
    public String f41752c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41753f;
    public TLRPC.InputFile f41754g;
    public boolean h;
    public long f41755i;
    public TLRPC.StickerSet f41756j;
    public TLRPC.Document f41757k;
    public String f41758l;
    public Utilities.Callback2 f41759m;
    public Utilities.Callback f41760n;
    public boolean f41761o;
    public ArrayList f41762p;
    public ArrayList f41763q;
    public MessageObject f41764r;
    public VideoEditedInfo f41765s;
    public float f41766t;
    public float f41767u;

    public final void a() {
        ArrayList arrayList = this.f41763q;
        ArrayList arrayList2 = this.f41762p;
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
        if (this.f41759m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41765s == null) {
            return f7 * this.f41767u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41767u, 0.5f, this.f41766t * 0.5f, f7);
    }
}
