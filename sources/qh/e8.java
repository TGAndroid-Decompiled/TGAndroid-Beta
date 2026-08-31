package qh;

import android.text.SpannableString;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class e8 implements Runnable {
    public final int f45265a;
    public final int f45266b;
    public final Object f45267c;

    public e8(int i10, ArrayList arrayList) {
        this.f45265a = 0;
        this.f45266b = i10;
        this.f45267c = arrayList;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z4;
        int i10;
        int i11 = this.f45265a;
        int i12 = this.f45266b;
        Object obj = this.f45267c;
        switch (i11) {
            case 0:
                MessagesController.getInstance(i12).putUsers((ArrayList) obj, true);
                return;
            case 1:
                ca caVar = (ca) obj;
                int i13 = caVar.f45081c;
                caVar.m();
                caVar.U1 = false;
                File file = caVar.H1.O0;
                if (file != null) {
                    file.delete();
                    caVar.H1.O0 = null;
                }
                caVar.W(caVar.H1, true);
                CharSequence[] charSequenceArr = {caVar.Z0.getText()};
                if (MessagesController.getInstance(i13).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i13).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {caVar.H1.C0};
                if (MessagesController.getInstance(i13).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                s6 s6Var = caVar.H1;
                if (TextUtils.equals(s6Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                s6Var.f46064k = z4;
                caVar.H1.C0 = new SpannableString(caVar.Z0.getText());
                caVar.z();
                caVar.y();
                s6 s6Var2 = caVar.H1;
                if (s6Var2 != null && s6Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                caVar.L1 = i10;
                caVar.H1 = (s6) caVar.E1.get(i12);
                caVar.O(0, 1);
                caVar.N(0, 1);
                caVar.f45076a1.f45935b.V2.N(false);
                caVar.Z0.setText(caVar.H1.C0);
                return;
            case 2:
                ((uf.z) obj).m(i12);
                return;
            case 3:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i12).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i12).stepThis().dispose();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 4:
                f2.o0 o0Var = (f2.o0) obj;
                o0Var.getClass();
                try {
                    o0Var.f5902a.scrollBy(0, i12);
                    return;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    return;
                }
            default:
                wh.c0 c0Var = (wh.c0) obj;
                wh.f0 f0Var = c0Var.f49683f;
                if (c0Var.f49681c && f0Var.B != null && f0Var.f50174a != null) {
                    c0Var.d = true;
                    c0Var.f49679a.setPressed(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    wh.d0 d0Var = f0Var.B;
                    wh.a aVar = f0Var.f50174a;
                    wh.r3 r3Var = ((wh.j3) d0Var).f49811a;
                    r3Var.o3(false);
                    r3Var.f49979e3.d(new wh.o3(r3Var, aVar, i12), c0Var);
                    return;
                }
                return;
        }
    }

    public e8(Object obj, int i10, int i11) {
        this.f45265a = i11;
        this.f45267c = obj;
        this.f45266b = i10;
    }
}
