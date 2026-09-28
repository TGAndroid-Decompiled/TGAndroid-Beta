package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f41736a;
    public String f41737b;
    public String f41738c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41739f;
    public TLRPC.InputFile f41740g;
    public boolean h;
    public long f41741i;
    public TLRPC.StickerSet f41742j;
    public TLRPC.Document f41743k;
    public String f41744l;
    public Utilities.Callback2 f41745m;
    public Utilities.Callback f41746n;
    public boolean f41747o;
    public ArrayList f41748p;
    public ArrayList f41749q;
    public MessageObject f41750r;
    public VideoEditedInfo f41751s;
    public float f41752t;
    public float f41753u;

    public final void a() {
        ArrayList arrayList = this.f41749q;
        ArrayList arrayList2 = this.f41748p;
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
        if (this.f41745m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41751s == null) {
            return f7 * this.f41753u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41753u, 0.5f, this.f41752t * 0.5f, f7);
    }
}
