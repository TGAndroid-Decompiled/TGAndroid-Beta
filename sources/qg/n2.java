package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class n2 {
    public String f41432a;
    public String f41433b;
    public String f41434c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41435f;
    public TLRPC.InputFile f41436g;
    public boolean h;
    public long f41437i;
    public TLRPC.StickerSet f41438j;
    public TLRPC.Document f41439k;
    public String f41440l;
    public Utilities.Callback2 f41441m;
    public Utilities.Callback f41442n;
    public boolean f41443o;
    public ArrayList f41444p;
    public ArrayList f41445q;
    public MessageObject f41446r;
    public VideoEditedInfo f41447s;
    public float f41448t;
    public float f41449u;

    public final void a() {
        ArrayList arrayList = this.f41445q;
        ArrayList arrayList2 = this.f41444p;
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
        if (this.f41441m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41447s == null) {
            return f7 * this.f41449u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41449u, 0.5f, this.f41448t * 0.5f, f7);
    }
}
