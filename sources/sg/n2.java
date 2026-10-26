package sg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class n2 {
    public String f48373a;
    public String f48374b;
    public String f48375c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f48376f;
    public TLRPC.InputFile f48377g;
    public boolean h;
    public long f48378i;
    public TLRPC.StickerSet f48379j;
    public TLRPC.Document f48380k;
    public String f48381l;
    public Utilities.Callback2 f48382m;
    public Utilities.Callback f48383n;
    public boolean f48384o;
    public ArrayList f48385p;
    public ArrayList f48386q;
    public MessageObject f48387r;
    public VideoEditedInfo f48388s;
    public float f48389t;
    public float f48390u;

    public final void a() {
        ArrayList arrayList = this.f48386q;
        ArrayList arrayList2 = this.f48385p;
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
        if (this.f48382m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f48388s == null) {
            return f7 * this.f48390u;
        }
        return c3.h0.C(this.f48390u, 0.5f, this.f48389t * 0.5f, f7);
    }
}
