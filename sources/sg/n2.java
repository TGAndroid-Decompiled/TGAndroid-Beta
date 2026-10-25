package sg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class n2 {
    public String f48370a;
    public String f48371b;
    public String f48372c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f48373f;
    public TLRPC.InputFile f48374g;
    public boolean h;
    public long f48375i;
    public TLRPC.StickerSet f48376j;
    public TLRPC.Document f48377k;
    public String f48378l;
    public Utilities.Callback2 f48379m;
    public Utilities.Callback f48380n;
    public boolean f48381o;
    public ArrayList f48382p;
    public ArrayList f48383q;
    public MessageObject f48384r;
    public VideoEditedInfo f48385s;
    public float f48386t;
    public float f48387u;

    public final void a() {
        ArrayList arrayList = this.f48383q;
        ArrayList arrayList2 = this.f48382p;
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        arrayList.clear();
    }

    public final float b() {
        float f7;
        if (this.f48379m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f48385s == null) {
            return f7 * this.f48387u;
        }
        return c3.h0.C(this.f48387u, 0.5f, this.f48386t * 0.5f, f7);
    }
}
