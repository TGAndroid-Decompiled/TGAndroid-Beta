package rg;

import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class l2 {
    public String f45443a;
    public String f45444b;
    public String f45445c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45446f;
    public TLRPC.InputFile f45447g;
    public boolean h;
    public long f45448i;
    public TLRPC.StickerSet f45449j;
    public TLRPC.Document f45450k;
    public String f45451l;
    public Utilities.Callback2 f45452m;
    public Utilities.Callback f45453n;
    public boolean f45454o;
    public ArrayList f45455p;
    public ArrayList f45456q;
    public MessageObject f45457r;
    public VideoEditedInfo f45458s;
    public float f45459t;
    public float f45460u;

    public final void a() {
        ArrayList arrayList = this.f45456q;
        ArrayList arrayList2 = this.f45455p;
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
        if (this.f45452m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45458s == null) {
            return f7 * this.f45460u;
        }
        return k3.A(this.f45460u, 0.5f, this.f45459t * 0.5f, f7);
    }
}
