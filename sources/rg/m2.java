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
    public String f45924a;
    public String f45925b;
    public String f45926c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45927f;
    public TLRPC.InputFile f45928g;
    public boolean h;
    public long f45929i;
    public TLRPC.StickerSet f45930j;
    public TLRPC.Document f45931k;
    public String f45932l;
    public Utilities.Callback2 f45933m;
    public Utilities.Callback f45934n;
    public boolean f45935o;
    public ArrayList f45936p;
    public ArrayList f45937q;
    public MessageObject f45938r;
    public VideoEditedInfo f45939s;
    public float f45940t;
    public float f45941u;

    public final void a() {
        ArrayList arrayList = this.f45937q;
        ArrayList arrayList2 = this.f45936p;
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
        if (this.f45933m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45939s == null) {
            return f7 * this.f45941u;
        }
        return k3.A(this.f45941u, 0.5f, this.f45940t * 0.5f, f7);
    }
}
