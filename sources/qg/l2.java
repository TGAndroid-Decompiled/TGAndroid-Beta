package qg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f41775a;
    public String f41776b;
    public String f41777c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f41778f;
    public TLRPC.InputFile f41779g;
    public boolean h;
    public long f41780i;
    public TLRPC.StickerSet f41781j;
    public TLRPC.Document f41782k;
    public String f41783l;
    public Utilities.Callback2 f41784m;
    public Utilities.Callback f41785n;
    public boolean f41786o;
    public ArrayList f41787p;
    public ArrayList f41788q;
    public MessageObject f41789r;
    public VideoEditedInfo f41790s;
    public float f41791t;
    public float f41792u;

    public final void a() {
        ArrayList arrayList = this.f41788q;
        ArrayList arrayList2 = this.f41787p;
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
        if (this.f41784m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f41790s == null) {
            return f7 * this.f41792u;
        }
        return com.google.android.gms.internal.vision.e2.B(this.f41792u, 0.5f, this.f41791t * 0.5f, f7);
    }
}
