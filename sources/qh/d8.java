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
public final class d8 implements Runnable {
    public final int f45245a;
    public final int f45246b;
    public final Object f45247c;

    public d8(int i10, ArrayList arrayList) {
        this.f45245a = 0;
        this.f45246b = i10;
        this.f45247c = arrayList;
    }

    @Override
    public final void run() {
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        boolean z4;
        int i10;
        int i11 = this.f45245a;
        int i12 = this.f45246b;
        Object obj = this.f45247c;
        switch (i11) {
            case 0:
                MessagesController.getInstance(i12).putUsers((ArrayList) obj, true);
                return;
            case 1:
                ba baVar = (ba) obj;
                int i13 = baVar.f45047c;
                baVar.m();
                baVar.U1 = false;
                File file = baVar.H1.O0;
                if (file != null) {
                    file.delete();
                    baVar.H1.O0 = null;
                }
                baVar.W(baVar.H1, true);
                CharSequence[] charSequenceArr = {baVar.Z0.getText()};
                if (MessagesController.getInstance(i13).storyEntitiesAllowed()) {
                    arrayList = MediaDataController.getInstance(i13).getEntities(charSequenceArr, true);
                } else {
                    arrayList = new ArrayList<>();
                }
                CharSequence[] charSequenceArr2 = {baVar.H1.C0};
                if (MessagesController.getInstance(i13).storyEntitiesAllowed()) {
                    arrayList2 = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
                } else {
                    arrayList2 = new ArrayList<>();
                }
                r6 r6Var = baVar.H1;
                if (TextUtils.equals(r6Var.C0, charSequenceArr[0]) && MediaDataController.entitiesEqual(arrayList, arrayList2)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                r6Var.f46015k = z4;
                baVar.H1.C0 = new SpannableString(baVar.Z0.getText());
                baVar.z();
                baVar.y();
                r6 r6Var2 = baVar.H1;
                if (r6Var2 != null && r6Var2.K) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                baVar.L1 = i10;
                baVar.H1 = (r6) baVar.E1.get(i12);
                baVar.O(0, 1);
                baVar.N(0, 1);
                baVar.f45042a1.f45914b.V2.N(false);
                baVar.Z0.setText(baVar.H1.C0);
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
                wh.f0 f0Var = c0Var.f49720f;
                if (c0Var.f49718c && f0Var.B != null && f0Var.f50211a != null) {
                    c0Var.d = true;
                    c0Var.f49716a.setPressed(false);
                    try {
                        c0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    wh.d0 d0Var = f0Var.B;
                    wh.a aVar = f0Var.f50211a;
                    wh.r3 r3Var = ((wh.j3) d0Var).f49848a;
                    r3Var.n3(false);
                    r3Var.f50016e3.d(new wh.o3(r3Var, aVar, i12), c0Var);
                    return;
                }
                return;
        }
    }

    public d8(Object obj, int i10, int i11) {
        this.f45245a = i11;
        this.f45247c = obj;
        this.f45246b = i10;
    }
}
