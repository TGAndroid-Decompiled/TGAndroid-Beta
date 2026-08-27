package zf;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;

public final class l2 {

    public String f50546a;

    public String f50547b;

    public String f50548c;
    public CharSequence d;

    public TLRPC.TL_inputStickerSetItem f50549e;

    public TLRPC.TL_messageMediaDocument f50550f;

    public TLRPC.InputFile f50551g;
    public boolean h;

    public long f50552i;

    public TLRPC.StickerSet f50553j;

    public TLRPC.Document f50554k;

    public String f50555l;

    public Utilities.Callback2 f50556m;

    public Utilities.Callback f50557n;

    public boolean f50558o;

    public ArrayList f50559p;

    public ArrayList f50560q;

    public MessageObject f50561r;

    public VideoEditedInfo f50562s;

    public float f50563t;

    public float f50564u;

    public final void a() {
        ArrayList arrayList = this.f50560q;
        ArrayList arrayList2 = this.f50559p;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            try {
                ((File) obj).delete();
            } catch (Exception e9) {
                FileLog.e(e9);
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
        float f10 = this.f50556m == null ? 0.9f : 1.0f;
        if (this.f50562s == null) {
            return f10 * this.f50564u;
        }
        return com.google.android.recaptcha.internal.a.B(this.f50564u, 0.5f, this.f50563t * 0.5f, f10);
    }
}
