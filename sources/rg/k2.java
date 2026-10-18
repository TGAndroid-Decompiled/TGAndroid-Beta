package rg;

import com.google.android.gms.internal.play_billing.k3;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
public final class k2 {
    public String f45432a;
    public String f45433b;
    public String f45434c;
    public CharSequence d;
    public TLRPC.TL_inputStickerSetItem e;
    public TLRPC.TL_messageMediaDocument f45435f;
    public TLRPC.InputFile f45436g;
    public boolean h;
    public long f45437i;
    public TLRPC.StickerSet f45438j;
    public TLRPC.Document f45439k;
    public String f45440l;
    public Utilities.Callback2 f45441m;
    public Utilities.Callback f45442n;
    public boolean f45443o;
    public ArrayList f45444p;
    public ArrayList f45445q;
    public MessageObject f45446r;
    public VideoEditedInfo f45447s;
    public float f45448t;
    public float f45449u;

    public final void a() {
        ArrayList arrayList = this.f45445q;
        ArrayList arrayList2 = this.f45444p;
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
        if (this.f45441m == null) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        if (this.f45447s == null) {
            return f7 * this.f45449u;
        }
        return k3.A(this.f45449u, 0.5f, this.f45448t * 0.5f, f7);
    }
}
