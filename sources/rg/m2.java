package rg;

import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class m2 {
    public String f45923a;
    public String f45924b;
    public String f45925c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45926f;
    public TLRPC.InputFile f45927g;
    public boolean h;
    public long f45928i;
    public TLRPC.StickerSet f45929j;
    public TLRPC.Document f45930k;
    public String f45931l;
    public Utilities.Callback2 f45932m;
    public Utilities.Callback f45933n;
    public boolean f45934o;
    public ArrayList f45935p;
    public ArrayList f45936q;
    public MessageObject f45937r;
    public VideoEditedInfo f45938s;
    public float f45939t;
    public float f45940u;

    public final void a() {
        ArrayList arrayList = this.f45936q;
        ArrayList arrayList2 = this.f45935p;
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
        if (this.f45932m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45938s == null) {
            return f7 * this.f45940u;
        }
        return k3.A(this.f45940u, 0.5f, this.f45939t * 0.5f, f7);
    }
}
