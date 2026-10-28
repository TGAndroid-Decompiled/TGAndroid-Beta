package sg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class m2 {
    public String f48399a;
    public String f48400b;
    public String f48401c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f48402f;
    public TLRPC.InputFile f48403g;
    public boolean h;
    public long f48404i;
    public TLRPC.StickerSet f48405j;
    public TLRPC.Document f48406k;
    public String f48407l;
    public Utilities.Callback2 f48408m;
    public Utilities.Callback f48409n;
    public boolean f48410o;
    public ArrayList f48411p;
    public ArrayList f48412q;
    public MessageObject f48413r;
    public VideoEditedInfo f48414s;
    public float f48415t;
    public float f48416u;

    public final void a() {
        ArrayList arrayList = this.f48412q;
        ArrayList arrayList2 = this.f48411p;
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
        if (this.f48408m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f48414s == null) {
            return f7 * this.f48416u;
        }
        return c3.h0.C(this.f48416u, 0.5f, this.f48415t * 0.5f, f7);
    }
}
